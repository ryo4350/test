package com.tcial.model;

import java.io.Serializable;
import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Datastore;
import org.slim3.datastore.ModificationDate;

import com.google.appengine.api.datastore.Key;

public abstract class BaseModel<T> implements Serializable {

    protected static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    protected Key key;

    @Attribute(version = true)
    protected Long version;

    @Attribute(listener = CreationDate.class)
    protected Date created_at;

    @Attribute(listener = ModificationDate.class)
    protected Date updated_at;

    /**
     * @return key
     */
    public Key getKey() {
        return key;
    }

    /**
     * @param key セットする key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * @param version セットする version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * @return created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at セットする created_at
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * @return updated_at
     */
    public Date getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at セットする updated_at
     */
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * モデルオブジェクトをデータストアに登録する
     */
    public Key save(){
        Key key = Datastore.put(this);

        return key;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BaseModel<T> other = (BaseModel<T>) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
}
