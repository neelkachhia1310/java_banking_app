package person;
public class Address {
    private String houseNo,addressline1,addressline2,city;
    private int pincode;

    public Address(){
        
    }
    

    public Address(String houseNo, String addressline1, String addressline2, String city, int pincode) {
        this.houseNo = houseNo;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.city = city;
        this.pincode = pincode;
    }

    public String getHouseNo() {
        return this.houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getAddressline1() {
        return this.addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return this.addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return this.pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    


    
    
}
