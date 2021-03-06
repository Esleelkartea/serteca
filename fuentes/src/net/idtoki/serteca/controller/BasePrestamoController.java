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

import net.idtoki.serteca.manager.PrestamoManager;
import net.idtoki.serteca.helper.PrestamoHelper;

/**
 * This class was autogenerated by Torque on:
 *
 * [Mon Jul 03 11:03:24 CEST 2006]
 *
 */
public abstract class BasePrestamoController extends AppController
{
 private static final Logger logger = Logger.getLogger("net.idtoki.serteca.controller.BasePrestamoController");
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
   PrestamoManager.updateId(
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
    	return new StringBuffer(Integer.toString(PrestamoManager.getPrestamo(  Integer.parseInt(a.get(0).toString())).getId()));
   }

 protected String updateIdRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateVehiculoCortesiaId(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   PrestamoManager.updateVehiculoCortesiaId(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateVehiculoCortesiaIdRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateVehiculoCortesiaIdResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateVehiculoCortesiaIdResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(Integer.toString(PrestamoManager.getPrestamo(  Integer.parseInt(a.get(0).toString())).getVehiculoCortesiaId()));
   }

 protected String updateVehiculoCortesiaIdRequestCallBack(String value)
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
   PrestamoManager.updateReparacionId(
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
    	return new StringBuffer(Integer.toString(PrestamoManager.getPrestamo(  Integer.parseInt(a.get(0).toString())).getReparacionId()));
   }

 protected String updateReparacionIdRequestCallBack(String value)
 {
  return FormatUtils.getFkIdFromString(value);
  }
 public void serviceUpdateEstadoPrevio(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   PrestamoManager.updateEstadoPrevio(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateEstadoPrevioRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateEstadoPrevioResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateEstadoPrevioResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(PrestamoManager.getPrestamo(  Integer.parseInt(a.get(0).toString())).getEstadoPrevio());
   }

 protected String updateEstadoPrevioRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateEstadoEntrega(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   PrestamoManager.updateEstadoEntrega(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateEstadoEntregaRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateEstadoEntregaResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateEstadoEntregaResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(PrestamoManager.getPrestamo(  Integer.parseInt(a.get(0).toString())).getEstadoEntrega());
   }

 protected String updateEstadoEntregaRequestCallBack(String value)
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
   PrestamoManager.updateFechaIni(
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
    	return new StringBuffer(PrestamoManager.getPrestamo(  Integer.parseInt(a.get(0).toString())).getFechaIni());
   }

 protected String updateFechaIniRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateFechaFin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   PrestamoManager.updateFechaFin(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateFechaFinRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateFechaFinResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateFechaFinResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(PrestamoManager.getPrestamo(  Integer.parseInt(a.get(0).toString())).getFechaFin());
   }

 protected String updateFechaFinRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateHoraIni(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   PrestamoManager.updateHoraIni(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateHoraIniRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateHoraIniResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateHoraIniResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(PrestamoManager.getPrestamo(  Integer.parseInt(a.get(0).toString())).getHoraIni());
   }

 protected String updateHoraIniRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateHoraFin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   PrestamoManager.updateHoraFin(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateHoraFinRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateHoraFinResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateHoraFinResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(PrestamoManager.getPrestamo(  Integer.parseInt(a.get(0).toString())).getHoraFin());
   }

 protected String updateHoraFinRequestCallBack(String value)
 {
  return value;
  }

 public void serviceDeletePrestamo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ELIMINAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   PrestamoManager.deletePrestamo(  Integer.parseInt(a.get(0).toString()));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido eliminar el valor "+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 public void serviceAddUpdatePrestamo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  try
  {
   PrestamoManager.addUpdatePrestamo(PrestamoHelper.createObj(request));
  }
   catch(Exception e)
  {
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }


}

