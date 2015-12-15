package net.idtoki.serteca.controller;

import java.io.IOException;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.zylk.tools.format.FormatUtils;
import net.zylk.web.WebUtils;
import java.util.ArrayList;
import net.zylk.tools.ajax.AjaxUtils;

import net.idtoki.serteca.manager.FacturasManager;
import net.idtoki.serteca.helper.FacturasHelper;

/**
 * This class was autogenerated by Torque on:
 *
 * [Mon Jul 03 11:03:24 CEST 2006]
 *
 */
public abstract class BaseFacturasController extends AppController
{
 private static final Logger logger = Logger.getLogger("net.idtoki.serteca.controller.BaseFacturasController");
 protected static final String UPDATE_PRIMARY_KEY_FORM_NAME = "primaryKeyId";
 protected static final String UPDATE_VALUE_FORM_NAME = "value";


        	
  	            
 public void serviceUpdateId(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   FacturasManager.updateId(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateIdRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateIdResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateIdResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(Integer.toString(FacturasManager.getFacturas(  Integer.parseInt(a.get(0).toString())).getId()));
   }

 protected String updateIdRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateFechaIni(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   FacturasManager.updateFechaIni(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateFechaIniRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateFechaIniResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateFechaIniResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(FacturasManager.getFacturas(  Integer.parseInt(a.get(0).toString())).getFechaIni());
   }

 protected String updateFechaIniRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateImporte(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   FacturasManager.updateImporte(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateImporteRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateImporteResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateImporteResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(Double.toString(FacturasManager.getFacturas(  Integer.parseInt(a.get(0).toString())).getImporte()));
   }

 protected String updateImporteRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateEstado(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   FacturasManager.updateEstado(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateEstadoRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateEstadoResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateEstadoResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(Integer.toString(FacturasManager.getFacturas(  Integer.parseInt(a.get(0).toString())).getEstado()));
   }

 protected String updateEstadoRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateDescripcion(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   FacturasManager.updateDescripcion(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateDescripcionRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateDescripcionResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateDescripcionResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(FacturasManager.getFacturas(  Integer.parseInt(a.get(0).toString())).getDescripcion());
   }

 protected String updateDescripcionRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateObs(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   FacturasManager.updateObs(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateObsRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateObsResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateObsResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(FacturasManager.getFacturas(  Integer.parseInt(a.get(0).toString())).getObs());
   }

 protected String updateObsRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateClienteId(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   FacturasManager.updateClienteId(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateClienteIdRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateClienteIdResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateClienteIdResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(Integer.toString(FacturasManager.getFacturas(  Integer.parseInt(a.get(0).toString())).getClienteId()));
   }

 protected String updateClienteIdRequestCallBack(String value)
 {
  return FormatUtils.getFkIdFromString(value);
  }
 public void serviceUpdateReparacionId(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   FacturasManager.updateReparacionId(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateReparacionIdRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateReparacionIdResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateReparacionIdResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(Integer.toString(FacturasManager.getFacturas(  Integer.parseInt(a.get(0).toString())).getReparacionId()));
   }

 protected String updateReparacionIdRequestCallBack(String value)
 {
  return FormatUtils.getFkIdFromString(value);
  }

 public void serviceDeleteFacturas(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ELIMINAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   FacturasManager.deleteFacturas(  Integer.parseInt(a.get(0).toString()));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido eliminar el valor "+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 public void serviceAddUpdateFacturas(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  try
  {
   FacturasManager.addUpdateFacturas(FacturasHelper.createObj(request));
  }
   catch(Exception e)
  {
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }


}

