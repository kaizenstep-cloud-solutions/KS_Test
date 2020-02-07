package com.kaizenstep.object;

public class Ticket extends Order {

    public String invoice;

    public Ticket(String invoice){
        this();
        this.invoice = invoice;
    }
    public Ticket() {
        factory();
        this.factoryFields();
    }
    protected void factoryFields(){
        metadata.addField("invoice", String.class);
    }
}
