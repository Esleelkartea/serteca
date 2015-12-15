package net.idtoki.serteca.manager;

import java.util.logging.Logger;
import net.idtoki.serteca.model.LocalidadPeer;
import net.idtoki.serteca.group.LocalidadGroupBean;
import net.idtoki.serteca.model.Localidad;
import net.zylk.torque.SearchQuery;
import net.zylk.torque.BaseQuery;
import net.zylk.torque.TorqueUtils;
import net.zylk.torque.manager.BaseManager;
import org.apache.torque.TorqueException;
import java.util.Enumeration;


import net.idtoki.serteca.model.Provincia;
import net.idtoki.serteca.model.ProvinciaPeer;

import org.apache.torque.util.Criteria;
import org.apache.torque.util.UniqueList;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;

/**
 * This class was autogenerated by Torque on:
 *
 * [Mon Jul 03 11:03:24 CEST 2006]
 *
 */
public abstract class BaseLocalidadManager extends BaseManager
{
	protected static final Logger logger = Logger.getLogger(
	   "net.idtoki.serteca.managers.BaseLocalidadManager");

	public static final Criteria buildSearchCriteria(DinamicGridBean dgb)
	{
		return BaseManager.buildSearchCriteria(dgb, new LocalidadManager());
	}

	public static final Criteria buildSearchCriteria(String query, int offset, int limit)
	{
		return BaseManager.buildSearchCriteria(query, offset, limit, new LocalidadManager());
	}

	public static final Criteria buildSearchCriteria(String query)
	{
		return BaseManager.buildSearchCriteria(query, new LocalidadManager());
	}

	protected void addOrSearchCriteria(Criteria criteria,String campo,String valor, String condicion){
		Criteria.Criterion criterion = LocalidadManager.getSearchCriterion(campo,valor, condicion);
		//Si existe ya un criterion hay que utilizarlo para añadir el or sino utilizará un and
		Enumeration enumeration =criteria.elements();
		if(enumeration.hasMoreElements()){
			Criteria.Criterion cr = (Criteria.Criterion) enumeration.nextElement();
			cr.or(criterion);
		}else{
			criteria.or(criterion);
		}
	}

	protected void addAndSearchCriteria(Criteria criteria,String campo, String valor, String condicion){
		Criteria.Criterion criterion = LocalidadManager.getSearchCriterion(campo,valor, condicion);
		criteria.and(criterion);
	}

	protected static Criteria.Criterion getSearchCriterion(String campo,String valor, String condicion){
        Criteria criteria =  new Criteria();
        Criteria.Criterion criterion = null;

			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(LocalidadPeer.ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,LocalidadPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,LocalidadPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,LocalidadPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,LocalidadPeer.ID,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(LocalidadPeer.PROVINCIA_ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,LocalidadPeer.PROVINCIA_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,LocalidadPeer.PROVINCIA_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,LocalidadPeer.PROVINCIA_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,LocalidadPeer.PROVINCIA_ID,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(LocalidadPeer.NOMBRE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,LocalidadPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,LocalidadPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,LocalidadPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,LocalidadPeer.NOMBRE,valor,true);
		}
									if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ProvinciaPeer.ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ProvinciaPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ProvinciaPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ProvinciaPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ProvinciaPeer.ID,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ProvinciaPeer.NOMBRE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ProvinciaPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ProvinciaPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ProvinciaPeer.NOMBRE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ProvinciaPeer.NOMBRE,valor,true);
		}
						
		return criterion;
	}

	public static final LocalidadGroupBean getLocalidads() {
    	return BaseLocalidadManager.getLocalidads(false);
	}

	public static final LocalidadGroupBean getLocalidads(boolean paginado) {
    	return BaseLocalidadManager.getLocalidads(new Criteria(), paginado,0);
	}

	public static final LocalidadGroupBean getLocalidads(Criteria c) {
		return BaseLocalidadManager.getLocalidads(c,false,0);
	}

	public static final LocalidadGroupBean getLocalidads(Criteria criteria,boolean paginado, int pagina) {
		LocalidadGroupBean objLocalidadGroupBean = new LocalidadGroupBean();
		objLocalidadGroupBean.setPaginaActual(pagina);
		objLocalidadGroupBean.setLocalidads(criteria, paginado);
		return objLocalidadGroupBean;
	}

							
	public static final Localidad getLocalidad(int id_Id) {
		Criteria c = new Criteria();
			c.add(LocalidadPeer.ID, id_Id);
			return BaseLocalidadManager.LocalidadsGroupBean2Localidad(BaseLocalidadManager.getLocalidads(c));
	}

	public static final Localidad LocalidadsGroupBean2Localidad(LocalidadGroupBean obj){
		if(obj.size() == 1)
			return obj.getLocalidad(0);
		else
			return null;
	}

	private static void updateLocalidadAttribute(int id_Id, String valor, String campo) throws Exception
	{
		Localidad obj = BaseLocalidadManager.getLocalidad(id_Id);
			if(campo.equals(LocalidadPeer.ID))
					obj.setId(Integer.parseInt(valor)); //int
					if(campo.equals(LocalidadPeer.PROVINCIA_ID))
					obj.setProvinciaId(Integer.parseInt(valor)); //int
					if(campo.equals(LocalidadPeer.NOMBRE))
					obj.setNombre(valor); //String
					obj.save();
	}

	public static void updateId(int id_Id, String valor) throws Exception
	{
		updateLocalidadAttribute(id_Id, valor, LocalidadPeer.ID);
	}
	public static void updateProvinciaId(int id_Id, String valor) throws Exception
	{
		updateLocalidadAttribute(id_Id, valor, LocalidadPeer.PROVINCIA_ID);
	}
	public static void updateNombre(int id_Id, String valor) throws Exception
	{
		updateLocalidadAttribute(id_Id, valor, LocalidadPeer.NOMBRE);
	}

				public void addJoins(Criteria criteria)
	{
																																																	criteria.addJoin(LocalidadPeer.PROVINCIA_ID,ProvinciaPeer.ID);
															}
	

  public static void deleteLocalidad(int id_Id) throws TorqueException
  {
  	LocalidadPeer.doDelete(LocalidadManager.getLocalidad(id_Id));
  }

  public static Localidad addUpdateLocalidad(Localidad obj) throws TorqueException
  {
	LocalidadGroupBean gb = new LocalidadGroupBean();
	gb.setElemento(obj);
	gb.save();
	return obj;
  }

}
