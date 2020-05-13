
package com.emrys.rest.config.domain;

import java.io.Serializable;

public class User implements Serializable
{

    private String gender;
    private Name name;
    private String email;
    private String currency;

    private final static long serialVersionUID = 270727596527329664L;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
