package net.idtoki.serteca.manager;

import net.idtoki.serteca.model.ReparacionPeer;

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
public class ReparacionManager
    extends BaseReparacionManager
{

	public static boolean borraReparacion(int idBorrar)
	{
		Criteria c=new Criteria();
		c.add(ReparacionPeer.ID, idBorrar);
		boolean bRet = false;
		try {
			ReparacionPeer.doDelete(c);
			bRet = true;
		} catch (TorqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			bRet = false;
		}
		return bRet;
	}
}


