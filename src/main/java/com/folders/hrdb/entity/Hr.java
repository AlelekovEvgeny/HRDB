package com.folders.hrdb.entity;

import javax.persistence.*;

@Entity
@Table(name = "HRDATA")
public class Hr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String surname;
    private String firstName;
    private String company;
    private String telephone;

    public Hr() {
    }

    public Hr(String surnameScan, String firstNameScan, String companyScan, String telephoneScan) {
        this.surname = surnameScan;
        this.firstName = firstNameScan;
        this.company = companyScan;
        this.telephone = telephoneScan;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String gettelephone() {
        return telephone;
    }

    public void settelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "models.Hrs{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", company='" + company + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}