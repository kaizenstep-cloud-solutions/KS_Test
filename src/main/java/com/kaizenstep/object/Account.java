package com.kaizenstep.object;

public class Account extends sObject {

    public String name;

    public Account(String name){
        this();
        this.name = name;
    }
    public Account() {
        factory();
        this.factoryFields();
    }
    protected void factoryFields(){
        metadata.addField("name", String.class);
    }
}
