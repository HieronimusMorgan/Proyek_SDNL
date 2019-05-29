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
@Table(name = "bahasabarubanget", catalog = "sdnl", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bahasabarubanget.findAll", query = "SELECT b FROM Bahasabarubanget b")
    , @NamedQuery(name = "Bahasabarubanget.findByNgoko", query = "SELECT b FROM Bahasabarubanget b WHERE b.ngoko = :ngoko")
    , @NamedQuery(name = "Bahasabarubanget.findByKrama", query = "SELECT b FROM Bahasabarubanget b WHERE b.krama = :krama")
    , @NamedQuery(name = "Bahasabarubanget.findByKramaInggil", query = "SELECT b FROM Bahasabarubanget b WHERE b.kramaInggil = :kramaInggil")
    , @NamedQuery(name = "Bahasabarubanget.findByIndonesia", query = "SELECT b FROM Bahasabarubanget b WHERE b.indonesia = :indonesia")})
public class Bahasabarubanget implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "Ngoko")
    private String ngoko;
    @Column(name = "Krama")
    private String krama;
    @Column(name = "Krama Inggil")
    private String kramaInggil;
    @Id
    @Basic(optional = false)
    @Column(name = "Indonesia")
    private String indonesia;

    public Bahasabarubanget() {
    }

    public Bahasabarubanget(String indonesia) {
        this.indonesia = indonesia;
    }

    public String getNgoko() {
        return ngoko;
    }

    public void setNgoko(String ngoko) {
        String oldNgoko = this.ngoko;
        this.ngoko = ngoko;
        changeSupport.firePropertyChange("ngoko", oldNgoko, ngoko);
    }

    public String getKrama() {
        return krama;
    }

    public void setKrama(String krama) {
        String oldKrama = this.krama;
        this.krama = krama;
        changeSupport.firePropertyChange("krama", oldKrama, krama);
    }

    public String getKramaInggil() {
        return kramaInggil;
    }

    public void setKramaInggil(String kramaInggil) {
        String oldKramaInggil = this.kramaInggil;
        this.kramaInggil = kramaInggil;
        changeSupport.firePropertyChange("kramaInggil", oldKramaInggil, kramaInggil);
    }

    public String getIndonesia() {
        return indonesia;
    }

    public void setIndonesia(String indonesia) {
        String oldIndonesia = this.indonesia;
        this.indonesia = indonesia;
        changeSupport.firePropertyChange("indonesia", oldIndonesia, indonesia);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indonesia != null ? indonesia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bahasabarubanget)) {
            return false;
        }
        Bahasabarubanget other = (Bahasabarubanget) object;
        if ((this.indonesia == null && other.indonesia != null) || (this.indonesia != null && !this.indonesia.equals(other.indonesia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Bahasabarubanget[ indonesia=" + indonesia + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
