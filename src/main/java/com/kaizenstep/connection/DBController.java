package com.kaizenstep.connection;

import com.kaizenstep.object.AccountPerson;
import com.kaizenstep.object.Contact;
import com.kaizenstep.object.ksObject;

import java.util.*;

public class DBController {

    public static List<ksObject> select(String dbName) {

        List<ksObject> result = new ArrayList<ksObject>();

        // THIS IS A LIE CONNECTION //
        try {
            Class objClass = Class.forName(dbName);
            ksObject obj = DBMockup.getObject(objClass);
            obj.connect(objClass.getSimpleName());
            result.add(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }
}
