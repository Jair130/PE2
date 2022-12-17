/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MENUS;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jairp
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u"),
    @NamedQuery(name = "Users.findByUsersId", query = "SELECT u FROM Users u WHERE u.usersId = :usersId"),
    @NamedQuery(name = "Users.findByUserName", query = "SELECT u FROM Users u WHERE u.userName = :userName"),
    @NamedQuery(name = "Users.findByUserSurname", query = "SELECT u FROM Users u WHERE u.userSurname = :userSurname"),
    @NamedQuery(name = "Users.findByUserAge", query = "SELECT u FROM Users u WHERE u.userAge = :userAge"),
    @NamedQuery(name = "Users.findByUserSex", query = "SELECT u FROM Users u WHERE u.userSex = :userSex")})
public class Users implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "user_id", nullable = false, length = 20)
    private String userId;
    @Column(name = "user_operation", length = 45)
    private String userOperation;
    @OneToMany(mappedBy = "userDoneId")
    private Collection<Results> resultsCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "users_id")
    private Integer usersId;
    @Basic(optional = false)
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @Column(name = "user_surname")
    private String userSurname;
    @Basic(optional = false)
    @Column(name = "user_age")
    private String userAge;
    @Column(name = "user_sex")
    private String userSex;

    public Users(int id, String name, String surname, String age, String sex, String operation) {
    }

    public Users(Integer usersId) {
        this.usersId = usersId;
    }

    public Users(Integer usersId, String userName, String userSurname, String userAge) {
        this.usersId = usersId;
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAge = userAge;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersId != null ? usersId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.usersId == null && other.usersId != null) || (this.usersId != null && !this.usersId.equals(other.usersId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MENUS.Users[ usersId=" + usersId + " ]";
    }

    public Users(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserOperation() {
        return userOperation;
    }

    public void setUserOperation(String userOperation) {
        this.userOperation = userOperation;
    }

    @XmlTransient
    public Collection<Results> getResultsCollection() {
        return resultsCollection;
    }

    public void setResultsCollection(Collection<Results> resultsCollection) {
        this.resultsCollection = resultsCollection;
    }

   

   
    
}
