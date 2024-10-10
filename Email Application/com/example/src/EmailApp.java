package com.example.src;
public class EmailApp 
{
    public static void main(String[] args)
    {
        Email email = new Email("ram", "seth");
        // email.setAlternateEmail("ram@xyzcompany.com");
        // System.out.println(email.getAlternateEmail());
        System.out.println(email.showInfo());
    }    
}
