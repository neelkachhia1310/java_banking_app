package customer;
import person.*;
import accountType.SavingAccount;
import loanType.*;

public class Customer {
    
    public static void main(String args[]){
        Address address1 = new Address("5", "Flat A", "Gopi cinema road", "Anand", 388001);
        Person person1 = new Person(1, "Neel", "customer", address1);
        //Person p = new Person();
        SavingAccount s1 = new SavingAccount();
        s1.setInterestRate(10.00);
        s1.setTime(1, 4);
        System.out.print("Interest rate is  " + s1.getInterestRate()); 
        double ammount = s1.getReturnAmmount(10000);
        System.out.print("\nTotal savings account ammount " + ammount);


        HomeLoan homeloan = new HomeLoan();
        homeloan.setInterestRate(10.00);
        System.out.print("\nInterest rate is  " + homeloan.getInterestRate());
        System.out.print("\n Home loan ammount  is  " + homeloan.getLoanPayableAmmount(1000,2));
        
        
    }
}
