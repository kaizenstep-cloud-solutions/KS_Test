
import com.kaizenstep.connection.DBController;
import com.kaizenstep.object.*;

import java.lang.reflect.Field;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        System.out.println(" -- <> -- WELCOME TO KS_TEST CONSOLE DEBUG -- <> -- ");

        Contact contact = (Contact) DBController.select(Contact.class.getName()).get(0);
        System.out.println(contact);

        AccountB2B b2b = (AccountB2B) DBController.select(AccountB2B.class.getName()).get(0);
        System.out.println(b2b);

        /*AccountB2B b2b = new AccountB2B(); b2b.name = "EMPRESA SL";
        Contact contact = new Contact("Jordi","Carabel");
        b2b.addContact(contact);
        System.out.println(b2b);
        System.out.println(contact);*/

        //System.out.println("\r\n -- <> -- <> -- <> -- -- <> -- -- <> -- <> -- <> -- \r\n");

        //AccountPerson persona = new AccountPerson("Jordi","Carabel");

        /*System.out.println("\r\n -- <> -- <> -- <> -- -- <> -- -- <> -- <> -- <> -- \r\n");

        Ticket invoice = new Ticket("TICKET001");
        Product product = new Product("PROD0001");
        TicketLine invL = new TicketLine(invoice,product);

        System.out.println(invL);
        System.out.println(invoice);
        System.out.println(product);*/

        System.out.println(" -- <> -- <> -- <> -- GOODBYE-- <> -- <> -- <> -- ");
    }
}
