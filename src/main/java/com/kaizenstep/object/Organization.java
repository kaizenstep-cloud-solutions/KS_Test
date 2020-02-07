package com.kaizenstep.object;

public class Organization {

    public String ID;
    public String name;
    public Metadata metadata;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organization(String ID, String name) {
        this.ID = ID;
        this.name = name;
        this.factory();
    }
    private void factory(){
        metadata = new Metadata();
        metadata.addField("ID", String.class);
        metadata.addField("name", String.class);
    }
}
