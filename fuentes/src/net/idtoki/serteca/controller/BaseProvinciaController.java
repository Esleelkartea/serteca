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

import net.idtoki.serteca.manager.ProvinciaManager;
import net.idtoki.serteca.helper.ProvinciaHelper;

/**
 * This class was autogenerated by Torque on:
 *
 * [Mon Jul 03 11:03:24 CEST 2006]
 *
 */
public abstract class BaseProvinciaController extends AppController
{
 private static final Logger logger = Logger.getLogger("net.idtoki.serteca.controller.BaseProvinciaController");
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
   ProvinciaManager.updateId(
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
    	return new StringBuffer(Integer.toString(ProvinciaManager.getProvincia(  Integer.parseInt(a.get(0).toString())).getId()));
   }

 protected String updateIdRequestCallBack(String value)
 {
  return value;
  }
 public void serviceUpdateNombre(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ACTUALIZAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  logger.finest("Nombre A ACTUALIZAR: "+WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   ProvinciaManager.updateNombre(
     					   Integer.parseInt(a.get(0).toString()),
   					 updateNombreRequestCallBack(WebUtils.getStringParam(request, UPDATE_VALUE_FORM_NAME))
   					);
  				simpleResponseService(response, updateNombreResponseCallBack(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME)));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido actualizar el valor"+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 protected StringBuffer updateNombreResponseCallBack(String s)
 {
  ArrayList a = AjaxUtils.splitIdFields(s);
    	return new StringBuffer(ProvinciaManager.getProvincia(  Integer.parseInt(a.get(0).toString())).getNombre());
   }

 protected String updateNombreRequestCallBack(String value)
 {
  return value;
  }

 public void serviceDeleteProvincia(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  logger.finest("ID A ELIMINAR: "+WebUtils.getintParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
  try
  {
   ArrayList a = AjaxUtils.splitIdFields(WebUtils.getStringParam(request, UPDATE_PRIMARY_KEY_FORM_NAME));
   ProvinciaManager.deleteProvincia(  Integer.parseInt(a.get(0).toString()));
  }
  catch (Exception e)
  {
   logger.severe("NO se ha podido eliminar el valor "+ e.getMessage());
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }

 public void serviceAddUpdateProvincia(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
 {
  utf8RequestService(request);
  try
  {
   ProvinciaManager.addUpdateProvincia(ProvinciaHelper.createObj(request));
  }
   catch(Exception e)
  {
   response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
  }
 }


}

