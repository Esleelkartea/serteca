package net.idtoki.serteca.model;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import net.zylk.tools.ajax.AjaxUtils;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;

  
    
  
/**
 * This class was autogenerated by Torque on:
 *
 * [Mon Jul 03 11:03:24 CEST 2006]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to OrdenTrabajo
 */
public abstract class BaseOrdenTrabajo extends BaseObject
{
    /** The Peer class */
    private static final OrdenTrabajoPeer peer =
        new OrdenTrabajoPeer();

                                            
    /** The value for the id field */
    private int id = -1;
      
    /** The value for the fechaEntrada field */
    private String fechaEntrada;
      
    /** The value for the fechaSalida field */
    private String fechaSalida;
      
    /** The value for the obs field */
    private String obs;
      
    /** The value for the reparacionId field */
    private int reparacionId;
                                          
    /** The value for the importe field */
    private double importe = 0;
                                          
    /** The value for the tipo field */
    private int tipo = 0;
      
    /** The value for the responsableId field */
    private int responsableId;
                                          
    /** The value for the horas field */
    private double horas = 0;
      
    /** The value for the descripcion field */
    private String descripcion;
  
    
    /**
     * Get the Id
     *
     * @return int
     */
    public int getId()
    {
        return id;
    }

                        
    /**
     * Set the value of Id
     *
     * @param v new value
     */
    public void setId(int v) 
    {
    
                  if (this.id != v)
              {
            this.id = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the FechaEntrada
     *
     * @return String
     */
    public String getFechaEntrada()
    {
        return fechaEntrada;
    }

                        
    /**
     * Set the value of FechaEntrada
     *
     * @param v new value
     */
    public void setFechaEntrada(String v) 
    {
    
                  if (!ObjectUtils.equals(this.fechaEntrada, v))
              {
            this.fechaEntrada = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the FechaSalida
     *
     * @return String
     */
    public String getFechaSalida()
    {
        return fechaSalida;
    }

                        
    /**
     * Set the value of FechaSalida
     *
     * @param v new value
     */
    public void setFechaSalida(String v) 
    {
    
                  if (!ObjectUtils.equals(this.fechaSalida, v))
              {
            this.fechaSalida = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Obs
     *
     * @return String
     */
    public String getObs()
    {
        return obs;
    }

                        
    /**
     * Set the value of Obs
     *
     * @param v new value
     */
    public void setObs(String v) 
    {
    
                  if (!ObjectUtils.equals(this.obs, v))
              {
            this.obs = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the ReparacionId
     *
     * @return int
     */
    public int getReparacionId()
    {
        return reparacionId;
    }

                              
    /**
     * Set the value of ReparacionId
     *
     * @param v new value
     */
    public void setReparacionId(int v) throws TorqueException
    {
    
                  if (this.reparacionId != v)
              {
            this.reparacionId = v;
            setModified(true);
        }
    
                          
                if (aReparacion != null && !(aReparacion.getId() == v))
                {
            aReparacion = null;
        }
      
              }
  
    /**
     * Get the Importe
     *
     * @return double
     */
    public double getImporte()
    {
        return importe;
    }

                        
    /**
     * Set the value of Importe
     *
     * @param v new value
     */
    public void setImporte(double v) 
    {
    
                  if (this.importe != v)
              {
            this.importe = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Tipo
     *
     * @return int
     */
    public int getTipo()
    {
        return tipo;
    }

                        
    /**
     * Set the value of Tipo
     *
     * @param v new value
     */
    public void setTipo(int v) 
    {
    
                  if (this.tipo != v)
              {
            this.tipo = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the ResponsableId
     *
     * @return int
     */
    public int getResponsableId()
    {
        return responsableId;
    }

                              
    /**
     * Set the value of ResponsableId
     *
     * @param v new value
     */
    public void setResponsableId(int v) throws TorqueException
    {
    
                  if (this.responsableId != v)
              {
            this.responsableId = v;
            setModified(true);
        }
    
                          
                if (aTrabajador != null && !(aTrabajador.getId() == v))
                {
            aTrabajador = null;
        }
      
              }
  
    /**
     * Get the Horas
     *
     * @return double
     */
    public double getHoras()
    {
        return horas;
    }

                        
    /**
     * Set the value of Horas
     *
     * @param v new value
     */
    public void setHoras(double v) 
    {
    
                  if (this.horas != v)
              {
            this.horas = v;
            setModified(true);
        }
    
          
              }
  
    /**
     * Get the Descripcion
     *
     * @return String
     */
    public String getDescripcion()
    {
        return descripcion;
    }

                        
    /**
     * Set the value of Descripcion
     *
     * @param v new value
     */
    public void setDescripcion(String v) 
    {
    
                  if (!ObjectUtils.equals(this.descripcion, v))
              {
            this.descripcion = v;
            setModified(true);
        }
    
          
              }
  
      
    
                  
    
        private Reparacion aReparacion;

    /**
     * Declares an association between this object and a Reparacion object
     *
     * @param v Reparacion
     * @throws TorqueException
     */
    public void setReparacion(Reparacion v) throws TorqueException
    {
            if (v == null)
        {
                          setReparacionId( 0);
              }
        else
        {
            setReparacionId(v.getId());
        }
            aReparacion = v;
    }

                                            
    /**
     * Get the associated Reparacion object
     *
     * @return the associated Reparacion object
     * @throws TorqueException
     */
    public Reparacion getReparacion() throws TorqueException
    {
        if (aReparacion == null && (this.reparacionId != 0))
        {
                          aReparacion = ReparacionPeer.retrieveByPK(SimpleKey.keyFor(this.reparacionId));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               Reparacion obj = ReparacionPeer.retrieveByPK(this.reparacionId);
               obj.addOrdenTrabajos(this);
            */
        }
        return aReparacion;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setReparacionKey(ObjectKey key) throws TorqueException
    {
      
                        setReparacionId(((NumberKey) key).intValue());
                  }
    
    
                  
    
        private Trabajador aTrabajador;

    /**
     * Declares an association between this object and a Trabajador object
     *
     * @param v Trabajador
     * @throws TorqueException
     */
    public void setTrabajador(Trabajador v) throws TorqueException
    {
            if (v == null)
        {
                          setResponsableId( 0);
              }
        else
        {
            setResponsableId(v.getId());
        }
            aTrabajador = v;
    }

                                            
    /**
     * Get the associated Trabajador object
     *
     * @return the associated Trabajador object
     * @throws TorqueException
     */
    public Trabajador getTrabajador() throws TorqueException
    {
        if (aTrabajador == null && (this.responsableId != 0))
        {
                          aTrabajador = TrabajadorPeer.retrieveByPK(SimpleKey.keyFor(this.responsableId));
              
            /* The following can be used instead of the line above to
               guarantee the related object contains a reference
               to this object, but this level of coupling
               may be undesirable in many circumstances.
               As it can lead to a db query with many results that may
               never be used.
               Trabajador obj = TrabajadorPeer.retrieveByPK(this.responsableId);
               obj.addOrdenTrabajos(this);
            */
        }
        return aTrabajador;
    }

    /**
     * Provides convenient way to set a relationship based on a
     * ObjectKey, for example
     * <code>bar.setFooKey(foo.getPrimaryKey())</code>
     *
         */
    public void setTrabajadorKey(ObjectKey key) throws TorqueException
    {
      
                        setResponsableId(((NumberKey) key).intValue());
                  }
       
                
    private static List fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList();
              fieldNames.add("Id");
              fieldNames.add("FechaEntrada");
              fieldNames.add("FechaSalida");
              fieldNames.add("Obs");
              fieldNames.add("ReparacionId");
              fieldNames.add("Importe");
              fieldNames.add("Tipo");
              fieldNames.add("ResponsableId");
              fieldNames.add("Horas");
              fieldNames.add("Descripcion");
              fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
          if (name.equals("Id"))
        {
                return new Integer(getId());
            }
          if (name.equals("FechaEntrada"))
        {
                return getFechaEntrada();
            }
          if (name.equals("FechaSalida"))
        {
                return getFechaSalida();
            }
          if (name.equals("Obs"))
        {
                return getObs();
            }
          if (name.equals("ReparacionId"))
        {
                return new Integer(getReparacionId());
            }
          if (name.equals("Importe"))
        {
                return new Double(getImporte());
            }
          if (name.equals("Tipo"))
        {
                return new Integer(getTipo());
            }
          if (name.equals("ResponsableId"))
        {
                return new Integer(getResponsableId());
            }
          if (name.equals("Horas"))
        {
                return new Double(getHoras());
            }
          if (name.equals("Descripcion"))
        {
                return getDescripcion();
            }
          return null;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
          if (name.equals(OrdenTrabajoPeer.ID))
        {
                return new Integer(getId());
            }
          if (name.equals(OrdenTrabajoPeer.FECHA_ENTRADA))
        {
                return getFechaEntrada();
            }
          if (name.equals(OrdenTrabajoPeer.FECHA_SALIDA))
        {
                return getFechaSalida();
            }
          if (name.equals(OrdenTrabajoPeer.OBSERVACION))
        {
                return getObs();
            }
          if (name.equals(OrdenTrabajoPeer.REPARACION_ID))
        {
                return new Integer(getReparacionId());
            }
          if (name.equals(OrdenTrabajoPeer.IMPORTE))
        {
                return new Double(getImporte());
            }
          if (name.equals(OrdenTrabajoPeer.TIPO))
        {
                return new Integer(getTipo());
            }
          if (name.equals(OrdenTrabajoPeer.RESPONSABLE_ID))
        {
                return new Integer(getResponsableId());
            }
          if (name.equals(OrdenTrabajoPeer.HORAS))
        {
                return new Double(getHoras());
            }
          if (name.equals(OrdenTrabajoPeer.DESCRIPCION))
        {
                return getDescripcion();
            }
          return null;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
            if (pos == 0)
        {
                return new Integer(getId());
            }
              if (pos == 1)
        {
                return getFechaEntrada();
            }
              if (pos == 2)
        {
                return getFechaSalida();
            }
              if (pos == 3)
        {
                return getObs();
            }
              if (pos == 4)
        {
                return new Integer(getReparacionId());
            }
              if (pos == 5)
        {
                return new Double(getImporte());
            }
              if (pos == 6)
        {
                return new Integer(getTipo());
            }
              if (pos == 7)
        {
                return new Integer(getResponsableId());
            }
              if (pos == 8)
        {
                return new Double(getHoras());
            }
              if (pos == 9)
        {
                return getDescripcion();
            }
              return null;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     *
     * @throws Exception
     */
    public void save() throws Exception
    {
          save(OrdenTrabajoPeer.getMapBuilder()
                .getDatabaseMap().getName());
      }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
       * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
       *
     * @param dbName
     * @throws TorqueException
     */
    public void save(String dbName) throws TorqueException
    {
        Connection con = null;
          try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
      }

      /** flag to prevent endless save loop, if this object is referenced
        by another object which falls in this transaction. */
    private boolean alreadyInSave = false;
      /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally
     *
     * @param con
     * @throws TorqueException
     */
    public void save(Connection con) throws TorqueException
    {
          if (!alreadyInSave)
        {
            alreadyInSave = true;


  
            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    OrdenTrabajoPeer.doInsert((OrdenTrabajo) this, con);
                    setNew(false);
                }
                else
                {
                    OrdenTrabajoPeer.doUpdate((OrdenTrabajo) this, con);
                }
            }

                      alreadyInSave = false;
        }
      }

                  
      /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key id ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
            setId(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
            setId(Integer.parseInt(key));
        }

  
    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
          return SimpleKey.keyFor(getId());
      }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
       * It then fills all the association collections and sets the
     * related objects to isNew=true.
       */
      public OrdenTrabajo copy() throws TorqueException
    {
        return copyInto(new OrdenTrabajo());
    }
  
    protected OrdenTrabajo copyInto(OrdenTrabajo copyObj) throws TorqueException
    {
          copyObj.setId(id);
          copyObj.setFechaEntrada(fechaEntrada);
          copyObj.setFechaSalida(fechaSalida);
          copyObj.setObs(obs);
          copyObj.setReparacionId(reparacionId);
          copyObj.setImporte(importe);
          copyObj.setTipo(tipo);
          copyObj.setResponsableId(responsableId);
          copyObj.setHoras(horas);
          copyObj.setDescripcion(descripcion);
  
                            copyObj.setId( -1);
                                                                  
                return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public OrdenTrabajoPeer getPeer()
    {
        return peer;
    }

    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("OrdenTrabajo:\n");
        str.append("Id = ")
               .append(getId())
             .append("\n");
        str.append("FechaEntrada = ")
               .append(getFechaEntrada())
             .append("\n");
        str.append("FechaSalida = ")
               .append(getFechaSalida())
             .append("\n");
        str.append("Obs = ")
               .append(getObs())
             .append("\n");
        str.append("ReparacionId = ")
               .append(getReparacionId())
             .append("\n");
        str.append("Importe = ")
               .append(getImporte())
             .append("\n");
        str.append("Tipo = ")
               .append(getTipo())
             .append("\n");
        str.append("ResponsableId = ")
               .append(getResponsableId())
             .append("\n");
        str.append("Horas = ")
               .append(getHoras())
             .append("\n");
        str.append("Descripcion = ")
               .append(getDescripcion())
             .append("\n");
        return(str.toString());
    }
    public String getComplexId()
    {
    ArrayList a = new ArrayList();
      	          a.add(Integer.toString(this.getId()));
                return  AjaxUtils.concatenateIdFields(a);
    }
}
