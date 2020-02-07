package com.kaizenstep.object;

import java.util.*;

public class Contact extends sObject {

    public String firstName;
    public String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        factory();
        this.factoryFields();
    }

    protected void factoryFields(){ factoryFields(false); }
    protected void factoryFields(Boolean reset){
        if(reset){metadata.fieldMap = new HashMap<String,MetadataField>();}
        metadata.addField("firstName", String.class);
        metadata.addField("lastName", String.class);
    }
}
