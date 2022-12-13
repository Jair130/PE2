/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENUS;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jairp
 */
@Entity
@Table(catalog = "finalp", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operations.findAll", query = "SELECT o FROM Operations o"),
    @NamedQuery(name = "Operations.findByIdOperation", query = "SELECT o FROM Operations o WHERE o.idOperation = :idOperation"),
    @NamedQuery(name = "Operations.findByOperationType", query = "SELECT o FROM Operations o WHERE o.operationType = :operationType"),
    @NamedQuery(name = "Operations.findByUniqueId", query = "SELECT o FROM Operations o WHERE o.uniqueId = :uniqueId")})
public class Operations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_operation", nullable = false)
    private Integer idOperation;
    @Column(name = "operation_type", length = 45)
    private String operationType;
    @Column(name = "unique_id", length = 45)
    private String uniqueId;

    public Operations() {
    }

    public Operations(Integer idOperation) {
        this.idOperation = idOperation;
    }

    public Integer getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(Integer idOperation) {
        this.idOperation = idOperation;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOperation != null ? idOperation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operations)) {
            return false;
        }
        Operations other = (Operations) object;
        if ((this.idOperation == null && other.idOperation != null) || (this.idOperation != null && !this.idOperation.equals(other.idOperation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MENUS.Operations[ idOperation=" + idOperation + " ]";
    }
    
}
