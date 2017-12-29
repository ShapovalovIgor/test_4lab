package ru.shapovalov.Beans.entity;


import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

/**
 * Created by igor on 07.04.15.
 */
@Entity
@Table(name = "ACCOUNT", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "PERSONNEL_NUMBER"),
        @UniqueConstraint(columnNames = "LOGIN")})

public class Account implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqGen")
    @SequenceGenerator(name = "seqGen", sequenceName = "sequenceGeneration", allocationSize=1, initialValue=9999)
    @Column
    private int id;
    @Column(name = "PERSONNEL_NUMBER", unique=true)
    private int personnelNumber;
    @Column(name = "FIRSTNAME", unique=true)
    private String firstNameUser;
    @Column(name = "LASTNAME")
    private String lastNameUser;
    @Column(name = "MIDDLENAME")
    private String middleName;
    @Column(name = "LOGIN", unique=true)
    private String loginUser;
    @Column(name = "PASSWORD")
    private String passwordUser;
    @Column
    private String email;
    @Column(name = "REG_DATE")
    private Date createDate;
    @Column (name = "PHONE_NUMBER")
    private long phoneNumber;
    @Column(name = "ACCESS_L")
    private int access;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstNameUser() {
        return firstNameUser;
    }
    public void setFirstNameUser(String firstNameUser) {
        this.firstNameUser = firstNameUser;
    }
    public String getLastNameUser() {
        return lastNameUser;
    }
    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLoginUser() {
        return loginUser;
    }
    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }
    public String getPasswordUser() {
        return passwordUser;
    }
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getAccess() {
        return access;
    }
    public void setAccess(int access) {
        this.access = access;
    }
    public int getPersonnelNumber() {
        return personnelNumber;
    }
    public void setPersonnelNumber(int personnelNumber) {
        this.personnelNumber = personnelNumber;
    }
    public Account(){}

}
