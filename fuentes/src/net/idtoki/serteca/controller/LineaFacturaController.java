package net.idtoki.serteca.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

import net.idtoki.serteca.group.FacturasGroupBean;
import net.idtoki.serteca.group.LineaFacturaGroupBean;
import net.idtoki.serteca.helper.FacturasHelper;
import net.idtoki.serteca.helper.LineaFacturaHelper;
import net.idtoki.serteca.manager.FacturasManager;
import net.idtoki.serteca.manager.LineaFacturaManager;
import net.idtoki.serteca.model.FacturasPeer;
import net.idtoki.serteca.model.LineaFactura;
import net.idtoki.serteca.model.LineaFacturaPeer;
import net.zylk.tools.ajax.AjaxUtils;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;
import net.zylk.tools.pdf.PdfUtils;
import net.zylk.tools.xml.XmlUtils;
import net.zylk.torque.TorqueUtils;
import net.zylk.web.WebUtils;

import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed Feb 01 12:46:43 CET 2006]
 *
 *  You should add additional methods to this class to meet the
 *  application requirements.  This class will only be generated as
 *  long as it does not already exist in the output directory.
 */
public class LineaFacturaController
    extends net.idtoki.serteca.controller.BaseLineaFacturaController
{
 private static final Logger logger = Logger.getLogger("net.idtoki.serteca.controller.LineaFacturaController");
 private TransformerFactory tFactory = TransformerFactory.newInstance();
 private Transformer lineas_factura_transformer = null; 
 private Transformer lineas_facturas_transformer = null;  

 public void init(ServletConfig config)
 {
	  super.init();
	  ResourceBundle resource = ResourceBundle.getBundle("net/idtoki/serteca/app/config/app-config");
	  File lineaFactura = new File(resource.getString("app.xsl.templates.dir")+"/PdfLineaFactura.xslt");
	  Source xslSource = new StreamSource(lineaFactura);
	  File lineaFacturas = new File(resource.getString("app.xsl.templates.dir")+"/PdfListaLineaFactura.xslt");
	  Source xslSourceT = new StreamSource(lineaFacturas);	  
	  try{
		  lineas_factura_transformer = tFactory.newTransformer(xslSource);
		  lineas_facturas_transformer = tFactory.newTransformer(xslSourceT);		  
	  }catch (Exception e){
	    e.printStackTrace();
	  } 
 }
 public void serviceAddLineaFactura(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 try
	 {
		 LineaFactura lf = LineaFacturaHelper.createObj(request);
		 LineaFacturaGroupBean lfgb = new LineaFacturaGroupBean();
		 lfgb.setElemento(lf);
		 lfgb.save();
	 }
	 catch(TorqueException te)
	 {
		 response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	 }
 } 
 
 public StringBuffer replaceStringBuffer (StringBuffer strBA, String strOrigen, String strDestino) 
 {
	 return new StringBuffer(strBA.toString().replaceAll(strOrigen,strDestino));
 } 
 
 private Criteria ordenacion(Criteria c,String CampoOrdenacion,String OrdenOrdenacion) 
 { 
 	if((OrdenOrdenacion != null )&& (OrdenOrdenacion.compareTo("ASC")==0))
 		if ((CampoOrdenacion != null)) //&& (CampoOrdenacion.compareTo("nombre")==0))
 		{
 			//c.clear();
 			c.addAscendingOrderByColumn(CampoOrdenacion.toString());
 		}
 	if  ((OrdenOrdenacion != null) && (OrdenOrdenacion.compareTo("DESC")==0))
 		if ((CampoOrdenacion != null)) //&& (CampoOrdenacion.compareTo("nombre")==0))
 			{
 			//c.clear();
 			c.addDescendingOrderByColumn(CampoOrdenacion.toString());
 		}
 	return c;
 }

 private Criteria criteriaLineaFacturaTableContent(HttpServletRequest request,Criteria c) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 String param =  WebUtils.getStringParam(request, new FacturasHelper().getIdName());
	 if(param != null)
		 TorqueUtils.addEqualCriteria(c,LineaFacturaPeer.FACTURA_ID,param);			 
 	  String paramSortCol =  WebUtils.getStringParam(request, "sort_col");
 	  String paramSortDir =  WebUtils.getStringParam(request, "sort_dir");
 	  //System.out.println("----query:"+paramQuery+"----col:"+paramSortCol+"----dir:"+paramSortDir+"----filtro:"+paramFiltro);
 	  c = ordenacion(c,paramSortCol,paramSortDir);
 	  
 	  return c;
 } 
 
 public void  serviceLineaFacturaTableContent(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 int numElemPedidosBD = 40;
	 int gap = 0;//gap = viewedRows - numElemVisiblesUltPag	  
	 DinamicGridBean dgb = WebUtils.getDinamicGridBeanParam(request,numElemPedidosBD,gap);
	 Criteria c =LineaFacturaManager.buildSearchCriteria(dgb);
	 c =criteriaLineaFacturaTableContent(request,c);
 
	 LineaFacturaGroupBean cgb = LineaFacturaManager.getLineaFacturas(c);
	 dgb.setTotalSize(cgb.getTotalSize());
	  
	 String[] methodos= new String[] {
			 LineaFacturaHelper.FACTURA_ID_GET_METHOD_NAME+"LineaFacturaParsed",
			 LineaFacturaHelper.DESCRIPCION_GET_METHOD_NAME+"LineaFacturaParsed",
			 LineaFacturaHelper.IMPORTE_GET_METHOD_NAME+"LineaFacturaParsed",
			 LineaFacturaHelper.UNIDADES_GET_METHOD_NAME+"LineaFacturaParsed",
			 LineaFacturaHelper.DTO_GET_METHOD_NAME+"LineaFacturaParsed",
			 "getImporteTotalConDtoLineaFactura",
			 "getEditLineaFactura",
			 "getDeleteLineaFactura"			 
			 };
	  
	 xmlResponseService(response,AjaxUtils.buildXmlAjaxResponseTableContentFromListObj(
			  										cgb.getAlmacen(),
			  										methodos,
			  										LineaFacturaHelper.ID_GET_METHOD_NAME, dgb,"ISO-8859-1")); 
 } 
 
 protected StringBuffer updateFacturaIdResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
	return new StringBuffer(LineaFacturaManager.getLineaFactura(
		Integer.parseInt(a.get(0).toString())).getFacturaIdLineaFacturaParsed());
 } 
 
 protected StringBuffer updateDescripcionResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
	return new StringBuffer(LineaFacturaManager.getLineaFactura(
		Integer.parseInt(a.get(0).toString())).getDescripcionLineaFacturaParsed());
 } 
 
 protected StringBuffer updateImporteResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
	return new StringBuffer(LineaFacturaManager.getLineaFactura(
		Integer.parseInt(a.get(0).toString())).getImporteLineaFacturaParsed());
 } 
 
 protected StringBuffer updateUnidadesResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
	return new StringBuffer(LineaFacturaManager.getLineaFactura(
		Integer.parseInt(a.get(0).toString())).getUnidadesLineaFacturaParsed());
 } 
 
 protected StringBuffer updateDtoResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
	return new StringBuffer(LineaFacturaManager.getLineaFactura(
		Integer.parseInt(a.get(0).toString())).getDtoLineaFacturaParsed());
 } 
 
 protected String updateDtoRequestCallBack(String value)
 {
	 String dto="0";
	 if (value.compareTo("")!=0)
		 dto=value;
  return dto;
  }
 
 public void serviceDeleteLineaFactura(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 int idBorrar=-1;
	 idBorrar=WebUtils.getintParam(request, "borrarId");
	 if (idBorrar!=-1)
		 if (LineaFacturaManager.borraLineaFactura(idBorrar))
			 WebUtils.writeXmlResponse(response,XmlUtils.buildXmlOKResponse("ISO-8859-1"));
		 else
			 WebUtils.writeXmlResponse(response,XmlUtils.buildXmlNotOKResponse("ISO-8859-1"));			 
 }  
 
 public void serviceLineaFacturaElement(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
  StringBuffer cadena=null;
  Criteria c= new Criteria();
  int claveId=-1;
  claveId=WebUtils.getintParam(request, "lineasfactura.ID");
  if (claveId!=-1)
  {
	  c.add(LineaFacturaPeer.ID, claveId);
  }
  c.addAscendingOrderByColumn(LineaFacturaPeer.ID);
  LineaFacturaGroupBean trgb = LineaFacturaManager.getLineaFacturas(c);
  
  if (trgb.getTotalSize()!=0)
  {
	  String [] parametros={
			  	LineaFacturaHelper.ID_GET_METHOD_NAME,
				 LineaFacturaHelper.FACTURA_ID_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.OBSERVACION_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.DESCRIPCION_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.IMPORTE_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.UNIDADES_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.DTO_GET_METHOD_NAME+"LineaFacturaParsed",
				 "getImporteTotalConDtoLineaFactura"
	  			};
	  cadena=trgb.buildXml(parametros,null,"ISO-8859-1");
  }
  xmlResponseService(response, cadena);
 }   
 
 public void serviceLineaFacturaFactura(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  String cadena=null;
  Criteria c= new Criteria();
  int claveId=-1;
  claveId=WebUtils.getintParam(request, "Facturas.ID");
  if (claveId!=-1)
  {
	  c.add(FacturasPeer.ID, claveId);
  }
  c.addAscendingOrderByColumn(FacturasPeer.ID);
  FacturasGroupBean trgb = FacturasManager.getFacturass(c);
  
  if (trgb.getTotalSize()!=0)
  {
	  cadena = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>";
  	  cadena = cadena + "<result><Lineas_Factura.FACTURA_ID>" + trgb.getFacturas(0).getId() + "-" + trgb.getFacturas(0).getReparacionIdFacturasParsed() + "</Lineas_Factura.FACTURA_ID></result>";
  }
  
  xmlResponseService(response, new StringBuffer(cadena));
 } 
 
 public void serviceGetLineaFacturaDetalleXml (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 String[] getMethodos= new String[] {
			  	LineaFacturaHelper.ID_GET_METHOD_NAME,
				 LineaFacturaHelper.FACTURA_ID_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.OBSERVACION_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.DESCRIPCION_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.IMPORTE_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.UNIDADES_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.DTO_GET_METHOD_NAME+"LineaFacturaParsed",
				 "getImporteTotalConDtoLineaFactura"
			 };
	  
	 
	 LineaFacturaGroupBean tgb = new LineaFacturaGroupBean();
	 try
	{
		tgb.setElemento(LineaFacturaHelper.getLineaFactura(request));
	} catch (TorqueException e)
	{
		logger.severe(e.getMessage());
	}
	 xmlResponseService(response,tgb.buildXml(getMethodos, null,"ISO-8859-1"));
 }
 
 public void serviceGetLineaFacturaDetallePdf(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
	 String[] getMethodos= new String[] {
			  	LineaFacturaHelper.ID_GET_METHOD_NAME,
				 LineaFacturaHelper.FACTURA_ID_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.OBSERVACION_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.IMPORTE_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.UNIDADES_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.DTO_GET_METHOD_NAME+"LineaFacturaParsed",
				 LineaFacturaHelper.DESCRIPCION_GET_METHOD_NAME+"LineaFacturaParsed",
				 "getImporteTotalConDtoLineaFactura"
			 };
	  
	 
	 LineaFacturaGroupBean tgb = new LineaFacturaGroupBean();
	 try
	{
		tgb.setElemento(LineaFacturaHelper.getLineaFactura(request));
	} catch (TorqueException e)
	{
		logger.severe(e.getMessage());
	}
	
	 byte[] content =  PdfUtils.getBytes(replaceStringBuffer(tgb.buildXml(getMethodos, null,"ISO-8859-1"),"n/a"," "), lineas_factura_transformer,"ISO-8859-1");
	   response.addHeader("content-disposition","attachment;filename=lineaFacturaDetalle.pdf");
	   response.setContentType("application/pdf");
	   response.setHeader("Cache-Control", "");//para que funcione en IE
	   response.setContentLength(content.length);
	   response.getOutputStream().write(content);
	   response.getOutputStream().flush();  
	   response.getOutputStream().close();
	
 } 
 
 public void serviceLineaFacturaTableContentPdf(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
	 utf8RequestService(request);
  Criteria c= new Criteria();
  String paramQuery =  WebUtils.getStringParam(request, "query");
  if ((paramQuery != null)&& (paramQuery.compareTo("")!=0) )
	  c = LineaFacturaManager.buildSearchCriteria(paramQuery);    
  c =criteriaLineaFacturaTableContent(request,c);	   
  LineaFacturaGroupBean tgb = LineaFacturaManager.getLineaFacturas(c);
  
  String[] methodos= new String[] {	
			 LineaFacturaHelper.FACTURA_ID_GET_METHOD_NAME+"LineaFacturaParsed",
			 LineaFacturaHelper.IMPORTE_GET_METHOD_NAME+"LineaFacturaParsed",
			 LineaFacturaHelper.UNIDADES_GET_METHOD_NAME+"LineaFacturaParsed",
			 LineaFacturaHelper.DTO_GET_METHOD_NAME+"LineaFacturaParsed",
			 LineaFacturaHelper.DESCRIPCION_GET_METHOD_NAME+"LineaFacturaParsed",
			 "getImporteTotalConDtoLineaFactura"
			};
  
	 byte[] content =  PdfUtils.getBytes(replaceStringBuffer(tgb.buildXml(methodos, null,"ISO-8859-1"),"n/a"," "), lineas_facturas_transformer,"ISO-8859-1");
	   response.addHeader("content-disposition","attachment;filename=ListaLineaFactura.pdf");
	   response.setContentType("application/pdf");
	   response.setHeader("Cache-Control", "");//para que funcione en IE
	   response.setContentLength(content.length);
	   response.getOutputStream().write(content);
	   response.getOutputStream().flush();  
	   response.getOutputStream().close(); 

 } 
 
}


