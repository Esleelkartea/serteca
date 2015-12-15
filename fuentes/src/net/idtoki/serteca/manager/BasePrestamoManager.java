package net.idtoki.serteca.manager;

import java.util.logging.Logger;
import net.idtoki.serteca.model.PrestamoPeer;
import net.idtoki.serteca.group.PrestamoGroupBean;
import net.idtoki.serteca.model.Prestamo;
import net.zylk.torque.SearchQuery;
import net.zylk.torque.BaseQuery;
import net.zylk.torque.TorqueUtils;
import net.zylk.torque.manager.BaseManager;
import org.apache.torque.TorqueException;
import java.util.Enumeration;


import net.idtoki.serteca.model.VehiculoCortesia;
import net.idtoki.serteca.model.VehiculoCortesiaPeer;
import net.idtoki.serteca.model.Reparacion;
import net.idtoki.serteca.model.ReparacionPeer;

import org.apache.torque.util.Criteria;
import org.apache.torque.util.UniqueList;
import net.zylk.tools.ajax.AjaxUtils.DinamicGridBean;

/**
 * This class was autogenerated by Torque on:
 *
 * [Mon Jul 03 11:03:24 CEST 2006]
 *
 */
public abstract class BasePrestamoManager extends BaseManager
{
	protected static final Logger logger = Logger.getLogger(
	   "net.idtoki.serteca.managers.BasePrestamoManager");

	public static final Criteria buildSearchCriteria(DinamicGridBean dgb)
	{
		return BaseManager.buildSearchCriteria(dgb, new PrestamoManager());
	}

	public static final Criteria buildSearchCriteria(String query, int offset, int limit)
	{
		return BaseManager.buildSearchCriteria(query, offset, limit, new PrestamoManager());
	}

	public static final Criteria buildSearchCriteria(String query)
	{
		return BaseManager.buildSearchCriteria(query, new PrestamoManager());
	}

	protected void addOrSearchCriteria(Criteria criteria,String campo,String valor, String condicion){
		Criteria.Criterion criterion = PrestamoManager.getSearchCriterion(campo,valor, condicion);
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
		Criteria.Criterion criterion = PrestamoManager.getSearchCriterion(campo,valor, condicion);
		criteria.and(criterion);
	}

	protected static Criteria.Criterion getSearchCriterion(String campo,String valor, String condicion){
        Criteria criteria =  new Criteria();
        Criteria.Criterion criterion = null;

			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(PrestamoPeer.ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,PrestamoPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,PrestamoPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,PrestamoPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,PrestamoPeer.ID,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(PrestamoPeer.VEHICULO_CORTESIA_ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,PrestamoPeer.VEHICULO_CORTESIA_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,PrestamoPeer.VEHICULO_CORTESIA_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,PrestamoPeer.VEHICULO_CORTESIA_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,PrestamoPeer.VEHICULO_CORTESIA_ID,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(PrestamoPeer.REPARACION_ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,PrestamoPeer.REPARACION_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,PrestamoPeer.REPARACION_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,PrestamoPeer.REPARACION_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,PrestamoPeer.REPARACION_ID,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(PrestamoPeer.ESTADO_PREVIO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,PrestamoPeer.ESTADO_PREVIO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,PrestamoPeer.ESTADO_PREVIO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,PrestamoPeer.ESTADO_PREVIO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,PrestamoPeer.ESTADO_PREVIO,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(PrestamoPeer.ESTADO_ENTREGA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,PrestamoPeer.ESTADO_ENTREGA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,PrestamoPeer.ESTADO_ENTREGA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,PrestamoPeer.ESTADO_ENTREGA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,PrestamoPeer.ESTADO_ENTREGA,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(PrestamoPeer.FECHA_INI)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,PrestamoPeer.FECHA_INI,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,PrestamoPeer.FECHA_INI,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,PrestamoPeer.FECHA_INI,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,PrestamoPeer.FECHA_INI,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(PrestamoPeer.FECHA_FIN)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,PrestamoPeer.FECHA_FIN,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,PrestamoPeer.FECHA_FIN,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,PrestamoPeer.FECHA_FIN,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,PrestamoPeer.FECHA_FIN,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(PrestamoPeer.HORA_INI)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,PrestamoPeer.HORA_INI,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,PrestamoPeer.HORA_INI,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,PrestamoPeer.HORA_INI,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,PrestamoPeer.HORA_INI,valor,true);
		}
			if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(PrestamoPeer.HORA_FIN)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,PrestamoPeer.HORA_FIN,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,PrestamoPeer.HORA_FIN,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,PrestamoPeer.HORA_FIN,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,PrestamoPeer.HORA_FIN,valor,true);
		}
									if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(VehiculoCortesiaPeer.ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,VehiculoCortesiaPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,VehiculoCortesiaPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,VehiculoCortesiaPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,VehiculoCortesiaPeer.ID,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(VehiculoCortesiaPeer.MODELO_ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,VehiculoCortesiaPeer.MODELO_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,VehiculoCortesiaPeer.MODELO_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,VehiculoCortesiaPeer.MODELO_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,VehiculoCortesiaPeer.MODELO_ID,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(VehiculoCortesiaPeer.CHASIS_ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,VehiculoCortesiaPeer.CHASIS_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,VehiculoCortesiaPeer.CHASIS_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,VehiculoCortesiaPeer.CHASIS_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,VehiculoCortesiaPeer.CHASIS_ID,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(VehiculoCortesiaPeer.VERSION)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,VehiculoCortesiaPeer.VERSION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,VehiculoCortesiaPeer.VERSION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,VehiculoCortesiaPeer.VERSION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,VehiculoCortesiaPeer.VERSION,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(VehiculoCortesiaPeer.MATRICULA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,VehiculoCortesiaPeer.MATRICULA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,VehiculoCortesiaPeer.MATRICULA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,VehiculoCortesiaPeer.MATRICULA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,VehiculoCortesiaPeer.MATRICULA,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(VehiculoCortesiaPeer.COLOR)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,VehiculoCortesiaPeer.COLOR,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,VehiculoCortesiaPeer.COLOR,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,VehiculoCortesiaPeer.COLOR,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,VehiculoCortesiaPeer.COLOR,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(VehiculoCortesiaPeer.OBSERVACION)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,VehiculoCortesiaPeer.OBSERVACION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,VehiculoCortesiaPeer.OBSERVACION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,VehiculoCortesiaPeer.OBSERVACION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,VehiculoCortesiaPeer.OBSERVACION,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(VehiculoCortesiaPeer.ESTADO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,VehiculoCortesiaPeer.ESTADO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,VehiculoCortesiaPeer.ESTADO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,VehiculoCortesiaPeer.ESTADO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,VehiculoCortesiaPeer.ESTADO,valor,true);
		}
													if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.ID,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.KM)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.KM,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.KM,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.KM,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.KM,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.DEPOSITO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.DEPOSITO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.DEPOSITO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.DEPOSITO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.DEPOSITO,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.FECHA_ENTRADA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.FECHA_ENTRADA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.FECHA_ENTRADA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.FECHA_ENTRADA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.FECHA_ENTRADA,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.FECHA_SALIDA)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.FECHA_SALIDA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.FECHA_SALIDA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.FECHA_SALIDA,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.FECHA_SALIDA,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.OBSERVACION)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.OBSERVACION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.OBSERVACION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.OBSERVACION,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.OBSERVACION,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.ESTADOPREVIO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.ESTADOPREVIO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.ESTADOPREVIO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.ESTADOPREVIO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.ESTADOPREVIO,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.RESPONSABLE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.RESPONSABLE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.RESPONSABLE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.RESPONSABLE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.RESPONSABLE,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.VEHICULO_ID)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.VEHICULO_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.VEHICULO_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.VEHICULO_ID,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.VEHICULO_ID,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.IMPORTE)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.IMPORTE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.IMPORTE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.IMPORTE,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.IMPORTE,valor,true);
		}
					if(campo.equals("all") || campo.equals(BaseManager.campoToLowerCase(ReparacionPeer.ESTADO)))
		{
			if(condicion.equals(BaseQuery.SingleQuery.EQUAL_CONDITION))
				criterion = TorqueUtils.addOrEqualCriteria(criterion,ReparacionPeer.ESTADO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LIKE_CONDITION))
				criterion = TorqueUtils.addOrLikeCriteria(criterion,ReparacionPeer.ESTADO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.LESS_CONDITION))
				criterion = TorqueUtils.addOrLessCriteria(criterion,ReparacionPeer.ESTADO,valor,true);
			else if (condicion.equals(BaseQuery.SingleQuery.GREATER_CONDITION))
				criterion = TorqueUtils.addOrGreaterCriteria(criterion,ReparacionPeer.ESTADO,valor,true);
		}
						
		return criterion;
	}

	public static final PrestamoGroupBean getPrestamos() {
    	return BasePrestamoManager.getPrestamos(false);
	}

	public static final PrestamoGroupBean getPrestamos(boolean paginado) {
    	return BasePrestamoManager.getPrestamos(new Criteria(), paginado,0);
	}

	public static final PrestamoGroupBean getPrestamos(Criteria c) {
		return BasePrestamoManager.getPrestamos(c,false,0);
	}

	public static final PrestamoGroupBean getPrestamos(Criteria criteria,boolean paginado, int pagina) {
		PrestamoGroupBean objPrestamoGroupBean = new PrestamoGroupBean();
		objPrestamoGroupBean.setPaginaActual(pagina);
		objPrestamoGroupBean.setPrestamos(criteria, paginado);
		return objPrestamoGroupBean;
	}

							
	public static final Prestamo getPrestamo(int id_Id) {
		Criteria c = new Criteria();
			c.add(PrestamoPeer.ID, id_Id);
			return BasePrestamoManager.PrestamosGroupBean2Prestamo(BasePrestamoManager.getPrestamos(c));
	}

	public static final Prestamo PrestamosGroupBean2Prestamo(PrestamoGroupBean obj){
		if(obj.size() == 1)
			return obj.getPrestamo(0);
		else
			return null;
	}

	private static void updatePrestamoAttribute(int id_Id, String valor, String campo) throws Exception
	{
		Prestamo obj = BasePrestamoManager.getPrestamo(id_Id);
			if(campo.equals(PrestamoPeer.ID))
					obj.setId(Integer.parseInt(valor)); //int
					if(campo.equals(PrestamoPeer.VEHICULO_CORTESIA_ID))
					obj.setVehiculoCortesiaId(Integer.parseInt(valor)); //int
					if(campo.equals(PrestamoPeer.REPARACION_ID))
					obj.setReparacionId(Integer.parseInt(valor)); //int
					if(campo.equals(PrestamoPeer.ESTADO_PREVIO))
					obj.setEstadoPrevio(valor); //String
					if(campo.equals(PrestamoPeer.ESTADO_ENTREGA))
					obj.setEstadoEntrega(valor); //String
					if(campo.equals(PrestamoPeer.FECHA_INI))
					obj.setFechaIni(valor); //String
					if(campo.equals(PrestamoPeer.FECHA_FIN))
					obj.setFechaFin(valor); //String
					if(campo.equals(PrestamoPeer.HORA_INI))
					obj.setHoraIni(valor); //String
					if(campo.equals(PrestamoPeer.HORA_FIN))
					obj.setHoraFin(valor); //String
					obj.save();
	}

	public static void updateId(int id_Id, String valor) throws Exception
	{
		updatePrestamoAttribute(id_Id, valor, PrestamoPeer.ID);
	}
	public static void updateVehiculoCortesiaId(int id_Id, String valor) throws Exception
	{
		updatePrestamoAttribute(id_Id, valor, PrestamoPeer.VEHICULO_CORTESIA_ID);
	}
	public static void updateReparacionId(int id_Id, String valor) throws Exception
	{
		updatePrestamoAttribute(id_Id, valor, PrestamoPeer.REPARACION_ID);
	}
	public static void updateEstadoPrevio(int id_Id, String valor) throws Exception
	{
		updatePrestamoAttribute(id_Id, valor, PrestamoPeer.ESTADO_PREVIO);
	}
	public static void updateEstadoEntrega(int id_Id, String valor) throws Exception
	{
		updatePrestamoAttribute(id_Id, valor, PrestamoPeer.ESTADO_ENTREGA);
	}
	public static void updateFechaIni(int id_Id, String valor) throws Exception
	{
		updatePrestamoAttribute(id_Id, valor, PrestamoPeer.FECHA_INI);
	}
	public static void updateFechaFin(int id_Id, String valor) throws Exception
	{
		updatePrestamoAttribute(id_Id, valor, PrestamoPeer.FECHA_FIN);
	}
	public static void updateHoraIni(int id_Id, String valor) throws Exception
	{
		updatePrestamoAttribute(id_Id, valor, PrestamoPeer.HORA_INI);
	}
	public static void updateHoraFin(int id_Id, String valor) throws Exception
	{
		updatePrestamoAttribute(id_Id, valor, PrestamoPeer.HORA_FIN);
	}

					public void addJoins(Criteria criteria)
	{
																																																	criteria.addJoin(PrestamoPeer.VEHICULO_CORTESIA_ID,VehiculoCortesiaPeer.ID);
																																																													criteria.addJoin(PrestamoPeer.REPARACION_ID,ReparacionPeer.ID);
															}
	

  public static void deletePrestamo(int id_Id) throws TorqueException
  {
  	PrestamoPeer.doDelete(PrestamoManager.getPrestamo(id_Id));
  }

  public static Prestamo addUpdatePrestamo(Prestamo obj) throws TorqueException
  {
	PrestamoGroupBean gb = new PrestamoGroupBean();
	gb.setElemento(obj);
	gb.save();
	return obj;
  }

}

