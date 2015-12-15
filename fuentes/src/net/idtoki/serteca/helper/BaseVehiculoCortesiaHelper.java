package net.idtoki.serteca.helper;

import net.zylk.web.WebUtils;
import net.zylk.web.helper.BaseHelper;
import javax.servlet.http.HttpServletRequest;
import org.apache.torque.TorqueException;
import net.zylk.tools.format.FormatUtils;


import net.idtoki.serteca.model.VehiculoCortesiaPeer;
import net.idtoki.serteca.model.VehiculoCortesia;
import net.idtoki.serteca.manager.VehiculoCortesiaManager;

/**
 * This class was autogenerated by Torque on:
 *
 * [Mon Jul 03 11:03:24 CEST 2006]
 *
 */
public abstract class BaseVehiculoCortesiaHelper extends BaseHelper
{
	public static final String COMPLEX_ID_GET_METHOD = "getComplexId";
	private VehiculoCortesia obj;
	public static final String ID_GET_METHOD_NAME = "getId";
	public static final String MODELO_ID_GET_METHOD_NAME = "getModeloId";
	public static final String CHASIS_ID_GET_METHOD_NAME = "getChasisId";
	public static final String VERSION_GET_METHOD_NAME = "getVersion";
	public static final String MATRICULA_GET_METHOD_NAME = "getMatricula";
	public static final String COLOR_GET_METHOD_NAME = "getColor";
	public static final String OBSERVACION_GET_METHOD_NAME = "getObs";
	public static final String ESTADO_GET_METHOD_NAME = "getEstado";


	public BaseVehiculoCortesiaHelper()
	{
		this.obj = new VehiculoCortesia();
	}

	public BaseVehiculoCortesiaHelper(VehiculoCortesia obj)
	{
		this.obj = obj;
	}


	public String getIdHTMLAttrs()
	{
		return " name=\"" + getIdName() + "\" " +
			   "id=\"" + getIdId() + "\" " +
			   "value=\"" + getIdValue() + "\" ";
	 }

	public String getIdId()
	{
		return getIdId(obj);
	}

	private static String getIdId(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.ID;
	}

	public String getIdName()
	{
		return getIdName(obj);
	}

	private static String getIdName(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.ID;
	}

	public String getIdValue()
	{
		return getIdValue(obj);
	}

	private static String getIdValue(VehiculoCortesia o)
	{
			return "" + o.getId();
		}

	public String getModeloIdHTMLAttrs()
	{
		return " name=\"" + getModeloIdName() + "\" " +
			   "id=\"" + getModeloIdId() + "\" " +
			   "value=\"" + getModeloIdValue() + "\" ";
	 }

	public String getModeloIdId()
	{
		return getModeloIdId(obj);
	}

	private static String getModeloIdId(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.MODELO_ID;
	}

	public String getModeloIdName()
	{
		return getModeloIdName(obj);
	}

	private static String getModeloIdName(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.MODELO_ID;
	}

	public String getModeloIdValue()
	{
		return getModeloIdValue(obj);
	}

	private static String getModeloIdValue(VehiculoCortesia o)
	{
			return "" + o.getModeloId();
		}

	public String getChasisIdHTMLAttrs()
	{
		return " name=\"" + getChasisIdName() + "\" " +
			   "id=\"" + getChasisIdId() + "\" " +
			   "value=\"" + getChasisIdValue() + "\" ";
	 }

	public String getChasisIdId()
	{
		return getChasisIdId(obj);
	}

	private static String getChasisIdId(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.CHASIS_ID;
	}

	public String getChasisIdName()
	{
		return getChasisIdName(obj);
	}

	private static String getChasisIdName(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.CHASIS_ID;
	}

	public String getChasisIdValue()
	{
		return getChasisIdValue(obj);
	}

	private static String getChasisIdValue(VehiculoCortesia o)
	{
			if(o.getChasisId() != null)
			return "" + o.getChasisId();
		else
			return "";
		}

	public String getVersionHTMLAttrs()
	{
		return " name=\"" + getVersionName() + "\" " +
			   "id=\"" + getVersionId() + "\" " +
			   "value=\"" + getVersionValue() + "\" ";
	 }

	public String getVersionId()
	{
		return getVersionId(obj);
	}

	private static String getVersionId(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.VERSION;
	}

	public String getVersionName()
	{
		return getVersionName(obj);
	}

	private static String getVersionName(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.VERSION;
	}

	public String getVersionValue()
	{
		return getVersionValue(obj);
	}

	private static String getVersionValue(VehiculoCortesia o)
	{
			if(o.getVersion() != null)
			return "" + o.getVersion();
		else
			return "";
		}

	public String getMatriculaHTMLAttrs()
	{
		return " name=\"" + getMatriculaName() + "\" " +
			   "id=\"" + getMatriculaId() + "\" " +
			   "value=\"" + getMatriculaValue() + "\" ";
	 }

	public String getMatriculaId()
	{
		return getMatriculaId(obj);
	}

	private static String getMatriculaId(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.MATRICULA;
	}

	public String getMatriculaName()
	{
		return getMatriculaName(obj);
	}

	private static String getMatriculaName(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.MATRICULA;
	}

	public String getMatriculaValue()
	{
		return getMatriculaValue(obj);
	}

	private static String getMatriculaValue(VehiculoCortesia o)
	{
			if(o.getMatricula() != null)
			return "" + o.getMatricula();
		else
			return "";
		}

	public String getColorHTMLAttrs()
	{
		return " name=\"" + getColorName() + "\" " +
			   "id=\"" + getColorId() + "\" " +
			   "value=\"" + getColorValue() + "\" ";
	 }

	public String getColorId()
	{
		return getColorId(obj);
	}

	private static String getColorId(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.COLOR;
	}

	public String getColorName()
	{
		return getColorName(obj);
	}

	private static String getColorName(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.COLOR;
	}

	public String getColorValue()
	{
		return getColorValue(obj);
	}

	private static String getColorValue(VehiculoCortesia o)
	{
			if(o.getColor() != null)
			return "" + o.getColor();
		else
			return "";
		}

	public String getObsHTMLAttrs()
	{
		return " name=\"" + getObsName() + "\" " +
			   "id=\"" + getObsId() + "\" " +
			   "value=\"" + getObsValue() + "\" ";
	 }

	public String getObsId()
	{
		return getObsId(obj);
	}

	private static String getObsId(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.OBSERVACION;
	}

	public String getObsName()
	{
		return getObsName(obj);
	}

	private static String getObsName(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.OBSERVACION;
	}

	public String getObsValue()
	{
		return getObsValue(obj);
	}

	private static String getObsValue(VehiculoCortesia o)
	{
			if(o.getObs() != null)
			return "" + o.getObs();
		else
			return "";
		}

	public String getEstadoHTMLAttrs()
	{
		return " name=\"" + getEstadoName() + "\" " +
			   "id=\"" + getEstadoId() + "\" " +
			   "value=\"" + getEstadoValue() + "\" ";
	 }

	public String getEstadoId()
	{
		return getEstadoId(obj);
	}

	private static String getEstadoId(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.ESTADO;
	}

	public String getEstadoName()
	{
		return getEstadoName(obj);
	}

	private static String getEstadoName(VehiculoCortesia o)
	{
		return VehiculoCortesiaPeer.ESTADO;
	}

	public String getEstadoValue()
	{
		return getEstadoValue(obj);
	}

	private static String getEstadoValue(VehiculoCortesia o)
	{
			return "" + o.getEstado();
		}

	public static VehiculoCortesia getVehiculoCortesia(HttpServletRequest req) throws TorqueException
	{
										
		int id_Id = WebUtils.getintParam(req, getIdName(new VehiculoCortesia()));

	
		VehiculoCortesia o = new VehiculoCortesia();
		if((id_Id >= 0)) // no es nuevo y lo fijamos en el objeto
		{
			o = VehiculoCortesiaManager.getVehiculoCortesia(id_Id);
		}
		return o;
	}

	public static VehiculoCortesia createObj(HttpServletRequest req) throws TorqueException
	{
		VehiculoCortesia o =  BaseVehiculoCortesiaHelper.getVehiculoCortesia(req);
			 o.setId(WebUtils.getintParam(req, getIdName(o)));
		
			 		o.setModeloId(Integer.parseInt(FormatUtils.getFkIdFromString(WebUtils.getStringParam(req, getModeloIdName(o)))));
		
			 o.setChasisId(WebUtils.getStringParam(req, getChasisIdName(o)));
		
			 o.setVersion(WebUtils.getStringParam(req, getVersionName(o)));
		
			 o.setMatricula(WebUtils.getStringParam(req, getMatriculaName(o)));
		
			 o.setColor(WebUtils.getStringParam(req, getColorName(o)));
		
			 o.setObs(WebUtils.getStringParam(req, getObsName(o)));
		
			 o.setEstado(WebUtils.getintParam(req, getEstadoName(o)));
		
			return o;
	}
}