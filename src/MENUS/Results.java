/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENUS;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @NamedQuery(name = "Results.findAll", query = "SELECT r FROM Results r"),
    @NamedQuery(name = "Results.findByResultId", query = "SELECT r FROM Results r WHERE r.resultId = :resultId"),
    @NamedQuery(name = "Results.findByResult", query = "SELECT r FROM Results r WHERE r.result = :result")})
public class Results implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "result_id", nullable = false)
    private Integer resultId;
    @Column(length = 20)
    private String result;
    @JoinColumn(name = "user_done_id", referencedColumnName = "user_id")
    @ManyToOne
    private Users userDoneId;

    public Results() {
    }

    public Results(Integer resultId) {
        this.resultId = resultId;
    }

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Users getUserDoneId() {
        return userDoneId;
    }

    public void setUserDoneId(Users userDoneId) {
        this.userDoneId = userDoneId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resultId != null ? resultId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Results)) {
            return false;
        }
        Results other = (Results) object;
        if ((this.resultId == null && other.resultId != null) || (this.resultId != null && !this.resultId.equals(other.resultId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MENUS.Results[ resultId=" + resultId + " ]";
    }
    
}
