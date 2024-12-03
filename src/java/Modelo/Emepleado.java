/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS TUF
 */
@Entity
@Table(name = "emepleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emepleado.findAll", query = "SELECT e FROM Emepleado e")
    , @NamedQuery(name = "Emepleado.findByIdEmepleado", query = "SELECT e FROM Emepleado e WHERE e.idEmepleado = :idEmepleado")
    , @NamedQuery(name = "Emepleado.findByNombre", query = "SELECT e FROM Emepleado e WHERE e.nombre = :nombre")})
public class Emepleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmepleado")
    private Integer idEmepleado;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "idDepartamento", referencedColumnName = "idDepartamento")
    @ManyToOne(fetch = FetchType.LAZY)
    private Departamento idDepartamento;

    public Emepleado() {
    }

    public Emepleado(Integer idEmepleado) {
        this.idEmepleado = idEmepleado;
    }

    public Integer getIdEmepleado() {
        return idEmepleado;
    }

    public void setIdEmepleado(Integer idEmepleado) {
        this.idEmepleado = idEmepleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmepleado != null ? idEmepleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emepleado)) {
            return false;
        }
        Emepleado other = (Emepleado) object;
        if ((this.idEmepleado == null && other.idEmepleado != null) || (this.idEmepleado != null && !this.idEmepleado.equals(other.idEmepleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Emepleado[ idEmepleado=" + idEmepleado + " ]";
    }
    
}
