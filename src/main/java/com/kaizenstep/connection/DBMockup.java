package com.kaizenstep.connection;

import com.kaizenstep.object.AccountB2B;
import com.kaizenstep.object.AccountPerson;
import com.kaizenstep.object.Contact;
import com.kaizenstep.object.ksObject;

public class DBMockup {

    public static ksObject getObject(Class objectClass) {
        if(objectClass == Contact.class) {
            return getContact();
        } else if (objectClass == AccountB2B.class) {
            return getAccountB2B();
        } else {
            return null;
        }
    }
    public static Contact getContact() {

        AccountB2B b2b = getAccountB2B();
        Contact contact = new Contact("Jordi","Carabel");
        b2b.addContact(contact);
        return contact;
    }
    public static AccountB2B getAccountB2B() {
        AccountB2B b2b = new AccountB2B(); b2b.name = "EMPRESA SL";
        return b2b;
    }

}
