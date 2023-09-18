import javax.print.attribute.standard.JobHoldUntil;

public class Main {
   public static void main(String [] args){
      ContactsManager myContactManager = new ContactsManager();


      Contact c1 = new Contact();
      c1.name = "Mark";
      c1.phoneNumber = "4169982108";

      myContactManager.addContact(c1);

      Contact c2 = new Contact();
      c2.name = "John";
      c2.phoneNumber = "6478482345";

      myContactManager.addContact(c2);

      Contact c3 = new Contact();
      c3.name = "Xaiver";
      c3.phoneNumber = "4132278907";

      myContactManager.addContact(c3);

      Contact result = myContactManager.searchContact("John");
      System.out.println(result.phoneNumber);
      System.out.println(result);
   }
}
