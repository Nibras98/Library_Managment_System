
package pkgfinal;
public class Author {
    int id;
    String name, email;
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setEmail(String email){
        this.email = email;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
}