package person;
import person.*;
import java.util.*; 
public class Person {
    private int id;
    private String name,role;
    Address address;
    public Person(){

    }   

    public Person(int id, String name, String role,Address address) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}