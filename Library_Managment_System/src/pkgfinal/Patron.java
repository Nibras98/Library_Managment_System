
package pkgfinal;
import java.io.IOException;

public abstract class Patron implements BasicOperation{
    int id;
    String name, departmentName, email, contactNo, address;
    double amount;
    void setId(int id){
      this.id = id;
    }
    void setName(String name){
      this.name = name;
    }
    void setDepartmentName(String departmentName){
      this.departmentName = departmentName;
    }
    void setEmail(String email){
      this.email = email;
    }
    void setContactNo(String contactNo){
      this.contactNo = contactNo;
    }
    void setAddress(String address){
      this.address = address;
    }
    int getId(){
      return id;
    }
    void setAmount(double amount){
      this.amount = amount;
    }
    String getName(){
      return name;
    }
    String getDepartmentName(){
      return departmentName;
    }
    String getEmail(){
      return email;
    }
    String getContactNo(){
      return contactNo;
    }
    String getAddress(){
      return address;
    }
    double getAmount(){
      return amount;
    }
    abstract void showInfo();
  }

