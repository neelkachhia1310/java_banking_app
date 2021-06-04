package accountType;
import accountType.*;
public class SavingAccount extends AccountType {
    public void setInterestRate(double rate)
    {
        interestRate = rate;
    }
    public double getInterestRate()
    {
        return interestRate;
    }
    public double getReturnAmmount(double principal)
    {
        double interest = (principal*this.time*this.interestRate)/100;
        double returnAmmount = principal + interest ;
        
        return returnAmmount;
    }
}

