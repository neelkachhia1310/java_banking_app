package loanType;
interface LoanType {
    
    void setInterestRate(double rate);
    
    double getInterestRate();

    double getLoanPayableAmmount(double ammount, double time);
}

