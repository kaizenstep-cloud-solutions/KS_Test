package com.kaizenstep.object;

public class AccountPerson extends Account {

    public Contact person;

    public AccountPerson(String firstName, String lastName) {
        this(new Contact(firstName,lastName));
    }
    public AccountPerson(Contact person) {
        this.person = person;
        person.factoryFields(true);
        metadata.fieldMap.remove("name");
        metadata.addField("person", Contact.class);
    }
}
