package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gol")
public class Gol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id  = 0L;
    
    private int munitoJogo;
    private String times;

    public Gol() {
    }

    public Gol(int munitoJogo, String times) {
        this.munitoJogo = munitoJogo;
        this.times = times;
    }
    
    public int getMunitoJogo() {
        return munitoJogo;
    }

    public void setMunitoJogo(int munitoJogo) {
        this.munitoJogo = munitoJogo;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gol)) {
            return false;
        }
        Gol other = (Gol) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Gol[ id=" + id + " ]";
    }
    
}
