
package net.idtoki.serteca.model;


import java.util.logging.Logger;

import net.zylk.tools.format.FormatUtils;

import org.apache.torque.TorqueException;
import org.apache.torque.om.Persistent;

/**
 * The skeleton for this class was autogenerated by Torque on:
 *
 * [Wed Feb 01 12:46:43 CET 2006]
 *
 * You should add additional methods to this class to meet the
 * application requirements.  This class will only be generated as
 * long as it does not already exist in the output directory.
 */
public  class OrdenTrabajo
    extends net.idtoki.serteca.model.BaseOrdenTrabajo
    implements Persistent
{
	private static final Logger logger = Logger.getLogger("net.idtoki.serteca.model.OrdenTrabajo");
	
	public String getFechaEntradaOrdenTrabajoParsed()
	{
		return FormatUtils.genericParsedStr(FormatUtils.aaaammdd2ddmmaaaa(this.getFechaEntrada(),"-"));
	}
	
	public String getFechaSalidaOrdenTrabajoParsed()
	{
		return FormatUtils.genericParsedStr(FormatUtils.aaaammdd2ddmmaaaa(this.getFechaSalida(),"-"));		
	}
	
	public String getReparacionIdOrdenTrabajoParsed()
	{
		String reparacion=null;
		try {
			reparacion=FormatUtils.genericParsedStr(this.getReparacion().getId() + "-" + this.getReparacion().getVehiculoIdReparacionParsed());
		} catch (TorqueException te) {
			logger.severe("No se ha podido recoger la reparaci�n. public String getReparacionIdOrdenTrabajoParsed()");
			te.printStackTrace();
		}
		return FormatUtils.genericParsedStr(reparacion);
	}	
	
	public String getResponsableIdOrdenTrabajoParsed()
	{
		String responsable=null;
		try {
			responsable=FormatUtils.genericParsedStr(this.getTrabajador().getId() + "-" + this.getTrabajador().getNombreTrabajadorParsed());
		} catch (TorqueException te) {
			logger.severe("No se ha podido recoger el responsable. public String getResponsableIdOrdenTrabajoParsed()");
			te.printStackTrace();
		}
		return FormatUtils.genericParsedStr(responsable);
	}	
	
	public String getObsOrdenTrabajoParsed()
	{
		return FormatUtils.genericParsedStr(this.getObs());		
	}
	
	public String getDescripcionOrdenTrabajoParsed()
	{
		return FormatUtils.genericParsedStr(this.getDescripcion());		
	}	

	public String getImporteOrdenTrabajoParsed()
	{
		return FormatUtils.genericParsedStr(new Float(this.getImporte()).toString());		
	}	
	
	public String getHorasOrdenTrabajoParsed()
	{
		return FormatUtils.genericParsedStr(new Float(this.getHoras()).toString());		
	}
	
	public String getTipoOrdenTrabajoParsedLabel()
	{
		String cadena="";
		switch (this.getTipo())
		{
		case 0:
			cadena="<span class='Estilo_00'>Electricidad</span>";
			break;
		case 1:
			cadena="<span class='Estilo_01'>Mecanica</span>";
			break;
		case 2:
			cadena="<span class='Estilo_02'>Chapa</span>";
			break;
		case 3:
			cadena="<span class='Estilo_03'>Pintura</span>";
			break;
		case 4:
			cadena="<span class='Estilo_04'>Neumatica</span>";
			break;			
		default:
			cadena="<span class='Estilo_04'>n/a</span>";
			break;
		}
		return cadena;
	}
	public String getTipoOrdenTrabajoParsed()
	{
		String cadena="";
		switch (this.getTipo())
		{
		case 0:
			cadena="0-Electricidad";
			break;
		case 1:
			cadena="1-Mecanica";
			break;
		case 2:
			cadena="2-Chapa";
			break;
		case 3:
			cadena="3-Pintura";
			break;
		case 4:
			cadena="4-Neumatica";
			break;			
		}
		return cadena;
	}	
	
	public String getDeleteOrdenTrabajo()
	{
		return "<a href='#' class='eliminar' id='getDeleteOrdenTrabajo" + this.getId() + "'>&#160;&#160;&#160;&#160;</a>";
	}	
	public String getEditOrdenTrabajo()
	{
		return "<a href='#' class='edicion' id='getEditOrdenTrabajo" + this.getId() + "'>&#160;&#160;&#160;&#160;</a>";
	}		
	
}