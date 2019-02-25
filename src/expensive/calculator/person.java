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
public class person {
    String personlastname;
    String personfirstname;
    String personemail;
   public person(String lname, String fname,String pemail)
   {
      personlastname= lname;
      personfirstname= fname;
      personemail= pemail;
   }
public void setlname(String lname)
{
    personlastname= lname;
}
public void setfname(String fname)
{
    personfirstname=fname;
}
public void setpemail(String pemail)
{
    personemail=pemail;
}
public String getlname()
{
    return personlastname;
}
public String getfname()
{
    return personfirstname;
}
public String getpemail()
{
    return personemail;
}
public void login()
{
    System.out.println("loggedin");
}
public void persondisplay()
{
    System.out.println("personlastname     "+getlname());
    System.out.println("personfirstname     "+getfname());
    System.out.println("personemail         "+getpemail());
}
}
