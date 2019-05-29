/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author acer
 */
@Entity
@Table(name = "coba", catalog = "sdnl", schema = "")
@NamedQueries({
    @NamedQuery(name = "Coba.findAll", query = "SELECT c FROM Coba c")
    , @NamedQuery(name = "Coba.findByIndo", query = "SELECT c FROM Coba c WHERE c.indo = :indo")
    , @NamedQuery(name = "Coba.findByEng", query = "SELECT c FROM Coba c WHERE c.eng = :eng")})
public class Coba implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Indo")
    private String indo;
    @Column(name = "Eng")
    private String eng;

    public Coba() {
    }

    public Coba(String indo) {
        this.indo = indo;
    }

    public String getIndo() {
        return indo;
    }

    public void setIndo(String indo) {
        String oldIndo = this.indo;
        this.indo = indo;
        changeSupport.firePropertyChange("indo", oldIndo, indo);
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        String oldEng = this.eng;
        this.eng = eng;
        changeSupport.firePropertyChange("eng", oldEng, eng);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indo != null ? indo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coba)) {
            return false;
        }
        Coba other = (Coba) object;
        if ((this.indo == null && other.indo != null) || (this.indo != null && !this.indo.equals(other.indo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Coba[ indo=" + indo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
