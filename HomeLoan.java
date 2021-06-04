package loanType;
import loanType.*;

public class HomeLoan implements LoanType{
    private double rate;
    public void setInterestRate(double rate)
    {
        this.rate = rate;
    }
    public double getInterestRate()
    {
        return this.rate;
    }
    public double getLoanPayableAmmount(double ammount,double time)
    {
        double interest = (ammount*this.rate*time)/100;
        return interest+ammount;
    }
}