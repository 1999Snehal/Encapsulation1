import  java.util.*;
 class  Account
 {
     public  String name;
     protected String email;
     private  String password;

     public  String getPassword()
     {
         return  this.password;
     }

     public void  setPassword(String pass)
     {
         this.password = pass;
     }
 }

  class Encapsulation
 {
    public  static  void  main(String args[])
    {
        Account account1= new Account();
        account1.name = "Sonam kapur";
        account1.email = "sonamkapur@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
 }
