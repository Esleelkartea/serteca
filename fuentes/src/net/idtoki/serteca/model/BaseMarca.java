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
 * extended all references should be to Marca
 */
public abstract class BaseMarca extends BaseObject
{
    /** The Peer class */
    private static final MarcaPeer peer =
        new MarcaPeer();

                                            
    /** The value for the id field */
    private int id = -1;
                                                
    /** The value for the nombre field */
    private String nombre = "";
  
    
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
    public void setId(int v) throws TorqueException
    {
    
                  if (this.id != v)
              {
            this.id = v;
            setModified(true);
        }
    
          
                                  
                                }
  
    /**
     * Get the Nombre
     *
     * @return String
     */
    public String getNombre()
    {
        return nombre;
    }

                        
    /**
     * Set the value of Nombre
     *
     * @param v new value
     */
    public void setNombre(String v) 
    {
    
                  if (!ObjectUtils.equals(this.nombre, v))
              {
            this.nombre = v;
            setModified(true);
        }
    
          
              }
  
         
                                
            
      
    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getModelos(new Criteria())
     *
     * @throws TorqueException
     */
    public List getModelos() throws TorqueException
    {
                  return getModelos(new Criteria(10));
          }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Marca has previously
     * been saved, it will retrieve related Modelos from storage.
     * If this Marca is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     *
     * @throws TorqueException
     */
    public List getModelos(Criteria criteria) throws TorqueException
    {
                            criteria.add(ModeloPeer.MARCA_ID, getId());
                            return ModeloPeer.doSelect(criteria);
          }

    /**
     * If this collection has already been initialized, returns
     * the collection. Otherwise returns the results of
     * getModelos(new Criteria(),Connection)
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getModelos(Connection con) throws TorqueException
    {
                  return getModelos(new Criteria(10), con);
          }

    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Marca has previously
     * been saved, it will retrieve related Modelos from storage.
     * If this Marca is new, it will return
     * an empty collection or the current collection, the criteria
     * is ignored on a new object.
     * This method takes in the Connection also as input so that
     * referenced objects can also be obtained using a Connection
     * that is taken as input
     */
    public List getModelos(Criteria criteria, Connection con)
            throws TorqueException
    {
                             criteria.add(ModeloPeer.MARCA_ID, getId());
                             return ModeloPeer.doSelect(criteria, con);
           }

                  
              
                    
                              
                                
                                                              
                                        
                    
                    
          
    /**
     * If this collection has already been initialized with
     * an identical criteria, it returns the collection.
     * Otherwise if this Marca is new, it will return
     * an empty collection; or if this Marca has previously
     * been saved, it will retrieve related Modelos from storage.
     *
     * This method is protected by default in order to keep the public
     * api reasonable.  You can provide public methods for those you
     * actually need in Marca.
     */
    protected List getModelosJoinMarca(Criteria criteria)
        throws TorqueException
    {
            
                        criteria.add(ModeloPeer.MARCA_ID, getId());
                                    return ModeloPeer.doSelectJoinMarca(criteria);
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
              fieldNames.add("Nombre");
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
          if (name.equals("Nombre"))
        {
                return getNombre();
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
          if (name.equals(MarcaPeer.ID))
        {
                return new Integer(getId());
            }
          if (name.equals(MarcaPeer.NOMBRE))
        {
                return getNombre();
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
                return getNombre();
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
          save(MarcaPeer.getMapBuilder()
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
                    MarcaPeer.doInsert((Marca) this, con);
                    setNew(false);
                }
                else
                {
                    MarcaPeer.doUpdate((Marca) this, con);
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
        throws TorqueException
    {
            setId(((NumberKey) key).intValue());
        }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) throws TorqueException
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
      public Marca copy() throws TorqueException
    {
        return copyInto(new Marca());
    }
  
    protected Marca copyInto(Marca copyObj) throws TorqueException
    {
          copyObj.setId(id);
          copyObj.setNombre(nombre);
  
                            copyObj.setId( -1);
                  
                                      
                            return copyObj;
    }

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public MarcaPeer getPeer()
    {
        return peer;
    }

    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("Marca:\n");
        str.append("Id = ")
               .append(getId())
             .append("\n");
        str.append("Nombre = ")
               .append(getNombre())
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
