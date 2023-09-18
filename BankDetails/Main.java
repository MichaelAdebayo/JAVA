package BankDetails;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) 
{
    CheckingAccount instance1 = new CheckingAccount();
    SavingsAccount instance2 = new SavingsAccount();
    CertificateOfDeposit instance3 = new CertificateOfDeposit();

    int one = instance1.account = 23;
    int two = instance2.balance = 1222;
    instance3.limit = 12;
    System.out.println(one);
    System.out.println(two);
    System.out.println();

    ArrayList grades = new ArrayList<>();
    grades.add(100);
    grades.add("yo");

    System.out.println(grades.get(0));
    System.out.println(grades.get(1));
      
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    String s = cars.get(0);
    System.out.println(s);
    
} 
    
}
