/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class Reader {
     private String name;
  private String lastname;
   private String email;
   
public Reader(){
    
}   

    public Reader(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Reader{" + "name=" + name + ", lastname=" + lastname + ", email=" + email + '}';
    }
    
}