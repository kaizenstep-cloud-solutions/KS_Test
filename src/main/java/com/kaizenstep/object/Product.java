package com.kaizenstep.object;

public class Product extends ksObject {

    public String code;

    public Product(String code){
        this();
        this.code = code;
    }
    public Product() {
        factory();
        this.factoryFields();
    }
    protected void factoryFields(){
        metadata.addField("code", String.class);
    }
}
