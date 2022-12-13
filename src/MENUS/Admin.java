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
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByAdminId", query = "SELECT a FROM Admin a WHERE a.adminId = :adminId"),
    @NamedQuery(name = "Admin.findByAdminName", query = "SELECT a FROM Admin a WHERE a.adminName = :adminName"),
    @NamedQuery(name = "Admin.findByAdminSurname", query = "SELECT a FROM Admin a WHERE a.adminSurname = :adminSurname"),
    @NamedQuery(name = "Admin.findByAdminAge", query = "SELECT a FROM Admin a WHERE a.adminAge = :adminAge"),
    @NamedQuery(name = "Admin.findByAdminSex", query = "SELECT a FROM Admin a WHERE a.adminSex = :adminSex"),
    @NamedQuery(name = "Admin.findByAdminOperation", query = "SELECT a FROM Admin a WHERE a.adminOperation = :adminOperation")})
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "admin_id", nullable = false, length = 20)
    private String adminId;
    @Basic(optional = false)
    @Column(name = "admin_name", nullable = false, length = 20)
    private String adminName;
    @Basic(optional = false)
    @Column(name = "admin_surname", nullable = false, length = 45)
    private String adminSurname;
    @Basic(optional = false)
    @Column(name = "admin_age", nullable = false, length = 20)
    private String adminAge;
    @Column(name = "admin_sex", length = 45)
    private String adminSex;
    @Column(name = "admin_operation", length = 45)
    private String adminOperation;

    public Admin() {
    }

    public Admin(String adminId) {
        this.adminId = adminId;
    }

    public Admin(String adminId, String adminName, String adminSurname, String adminAge) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminSurname = adminSurname;
        this.adminAge = adminAge;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminSurname() {
        return adminSurname;
    }

    public void setAdminSurname(String adminSurname) {
        this.adminSurname = adminSurname;
    }

    public String getAdminAge() {
        return adminAge;
    }

    public void setAdminAge(String adminAge) {
        this.adminAge = adminAge;
    }

    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex;
    }

    public String getAdminOperation() {
        return adminOperation;
    }

    public void setAdminOperation(String adminOperation) {
        this.adminOperation = adminOperation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adminId != null ? adminId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.adminId == null && other.adminId != null) || (this.adminId != null && !this.adminId.equals(other.adminId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MENUS.Admin[ adminId=" + adminId + " ]";
    }
    
}
