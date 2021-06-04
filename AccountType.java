package accountType;



abstract class AccountType {
    double interestRate,time,principal;

    abstract public void setInterestRate(double rate);
    abstract public double getInterestRate();
    abstract public double getReturnAmmount(double principal);

    public void setTime(double year,double month)
    {
        this.time =  year+(month/12);        
    }
    public void setTime(double year,double month,double day)
    {
        this.time =  year+(month/12)+(day/31);        
    }
    public double getTime()
    {
        return this.time;
    }
}

