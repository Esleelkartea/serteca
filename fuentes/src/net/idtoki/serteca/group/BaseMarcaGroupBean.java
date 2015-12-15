package net.idtoki.serteca.group;


import java.sql.Connection;
import java.util.List;
import java.util.logging.Logger;

//Torque classes
import org.apache.torque.TorqueException;
import org.apache.torque.util.Criteria;

import net.zylk.torque.group.BaseGroupBean;

// Local classes
import net.idtoki.serteca.model.MarcaPeer;
import net.idtoki.serteca.model.Marca;

/**
 * This class was autogenerated by Torque on:
 *
 * [Mon Jul 03 11:03:24 CEST 2006]
 *
 */
public abstract class BaseMarcaGroupBean
    extends BaseGroupBean
{

    /** el logger para esta clase */
    private static final Logger logger = Logger
			.getLogger("net.idtoki.serteca.BaseMarcaGroup");

    /**
     * @return the map builder for this peer
     * @throws TorqueException Any exceptions caught during processing will be
     *         rethrown wrapped into a TorqueException.
     */

	public void setMarcas(Criteria criteria, boolean paginado) {
		this.setElementos(criteria, paginado);
	}

	public Marca getMarca() {
		return (Marca) getNext();
	}

	public Marca getMarca(int posicion) {
		return (Marca) get(posicion);
	}


	//EHI : Implementacion de los metodos abstractos de la clase padre
	public List abstractSelect(Criteria c) throws TorqueException {
		return MarcaPeer.doSelect(c);
	}

	public List abstractVillageRecords(Criteria c) throws TorqueException {
		return MarcaPeer.doSelectVillageRecords(c);
	}

	public void abstractSave(Connection conn) throws TorqueException {
		Marca element = null;
		while (this.next()) {
			element = this.getMarca();
			element.save(conn);
		}
	}

	public void abstractDel(Connection conn) throws TorqueException {
		throw new TorqueException();
	}

	public String getDatabaseName(){
		return "SERTECA-DB";
	}
}





