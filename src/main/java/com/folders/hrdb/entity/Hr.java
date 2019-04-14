package com.folders.hrdb.entity;

public class Hr {
    private String surname;
    private String firstname;
    private String company;
    private String telefon;

    public Hr() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "insert into hrdata s values (" +
                "'','" + surname +'\'' +
                ", '" + firstname +'\'' +
                ", '" + company +'\'' +
                ", '" + telefon +'\'' +
                ",sysdate)";
    }
}
