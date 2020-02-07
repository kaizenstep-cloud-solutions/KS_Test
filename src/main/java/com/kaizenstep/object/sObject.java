/*
 * Copyright 2020 KaizenStep S.L - Cloud Solutions & Services SL
 * All rights reserved.
 */

package com.kaizenstep.object;
import java.util.*;

/**
 * @author  KAIZENstep
 * @version 0.1 2020/02/06
 */
/* First version: JCAR 2020/02/06 */

public class sObject {

    public String ID;
    public Metadata metadata;
    public Organization organization;
    public List<Relation> lookup;
    public Map<String,Relation> master;
    public Map<String,List<Relation>> children;

    public sObject(){
        this.factory();
    }
    protected void factory(){
        metadata = new Metadata();
        metadata.addField("organization", Organization.class);
        metadata.addField("ID", String.class);
        metadata.addField("lookup", List.class);
        metadata.addField("master", Map.class);
        metadata.addField("children", Map.class);
        this.master = new HashMap<String,Relation>();
        this.children = new HashMap<String,List<Relation>>();
        this.lookup = new ArrayList<Relation>();
    }

    @Override
    public String toString() {
        String objtostring = new String();
        objtostring = getClassName() + " { " + "\r\n";
        if( metadata != null && metadata.fieldMap != null && !metadata.fieldMap.isEmpty() ) {

            for( String fieldName : metadata.fieldMap.keySet() ) {
                try {
                    MetadataField metafield = metadata.fieldMap.get( fieldName );
                    objtostring += metafield.fieldClass.getName() + " " + fieldName + " : " + metafield.getValue(this) + "\r\n";
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        objtostring += " } ";
        return objtostring;

    }

    public sObject(String organizationID, String ID){
        this( new Organization(organizationID,""), ID);
    }
    public sObject(Organization organization, String ID){
        this();
        this.organization = organization;
        this.ID = ID;
    }

    public String getClassName() { return this.getClass().getName(); }

    public void addMaster(sObject obj) {
        obj.addChildren(this);
    }
    public void addChildren(sObject obj) {

        Relation newRelation = new Relation(this,obj);

        obj.master = obj.master != null ? obj.master : new HashMap<String,Relation>();
        obj.master.put( this.getClassName(), newRelation );

        List<Relation> childrenList = new ArrayList<Relation>();
        childrenList = this.children.get(obj.getClassName()) != null ? this.children.get(obj.getClassName()) : childrenList;
        childrenList.add( newRelation ); this.children.put( obj.getClassName() , childrenList );
    }

    protected void factoryFields() {}
}
