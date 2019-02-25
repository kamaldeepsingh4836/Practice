/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expensive.calculator;

/**
 *
 * @author padda
 */
public class user extends person{
    public String usermobilenumber;
  public user(String umobileno,String lname, String fname,String pemail)
  {
     super(lname,fname,pemail);
     usermobilenumber=umobileno;
     
  }
  public void order()
  {
      System.out.println("ordered");
  }
  public void userdisplay()
  {
     System.out.println("user mobile number     "+getUsermobilenumber());  
     
    super.persondisplay();
  }

    /**
     * @return the usermobilenumber
     */
    public String getUsermobilenumber() {
        return usermobilenumber;
    }

    /**
     * @param usermobilenumber the usermobilenumber to set
     */
    public void setUsermobilenumber(String usermobilenumber) {
        this.usermobilenumber = usermobilenumber;
    }
}
