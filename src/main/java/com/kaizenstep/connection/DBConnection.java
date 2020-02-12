package com.kaizenstep.connection;

import com.kaizenstep.object.MetadataField;
import com.kaizenstep.object.ksObject;

public class DBConnection {

    public String dbname;
    public DBConnection(String dbname) { this.dbname = dbname; }
    public DBConnection(){}

    public void connect(String dbName) {}
    public void connect() {}
    public ksObject connect(ksObject sobject) {

        System.out.println(" >DBConnection>>connect>>>buildQuery>>> ");

        String buildQuery = "SELECT "; boolean firstField = true;
        //System.out.println(" >DBConnection>>connect>>>buildQuery>>> DEBUG fieldMap? " + sobject.metadata.fieldMap);
        for(MetadataField field : sobject.metadata.fieldMap.values()) {

            if(field.dbName != null) {
                if(!firstField) { buildQuery+= ", " + field.dbName; }
                else { buildQuery += field.dbName; }
                firstField = false;
            }

        }
        //System.out.println(" >DBConnection>>connect>>>buildQuery>>> DEBUG master? " + sobject.master);
        if(sobject.master != null && !sobject.master.isEmpty()) {
            for( String masterN : sobject.master.keySet() ) {
                if(!firstField) { buildQuery+= ", " + masterN; }
                else { buildQuery += masterN; }
                firstField = false;
            }
        }

        buildQuery += " FROM " + sobject.dbname;

        System.out.println(buildQuery);
        System.out.println(" >DBConnection>>connect>>>buildQuery>>> ");

        return sobject;
    }
}
