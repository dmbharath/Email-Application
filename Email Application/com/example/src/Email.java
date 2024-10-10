package com.example.src;

import java.util.Scanner;

public class Email 
{
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private int mailBoxCapacity = 500;
  private int defaultPasswordLength = 10;
  private String alternateEmail;
  private String companySuffix = "xyzcompany.com";

  public Email(String firstName, String lastName) 
  {
    this.firstName = firstName;
    this.lastName = lastName;
    // System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);
    this.department = this.setDepartment();
    System.out.println("Department is : " + this.department);
    this.password = this.randomPassword(defaultPasswordLength);
    System.out.println("Your password is : "+this.password);
    email = firstName.toLowerCase() + "."+ lastName.toLowerCase()+"@" + department + companySuffix;
    System.out.println("Your email is : "+email);
  } 

  public String setDepartment() 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Department codes \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \n Enter the department");
    int choice = sc.nextInt();
    sc.close();
    if (choice == 1) 
    {
      return "sales";
    } 
    else if (choice == 2) 
    {
      return "development";
    } 
    else if(choice == 3)
    {
      return "accounting";
    }
    else 
    {
      return "";
    }
  }
  // setting to generate random passwords
  private String randomPassword(int length)
  {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$^%";
    char[] password = new char[length];
    for(int i=0;i<length;i++)
    {
      int random = (int)(Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(random);
      // System.out.println(random);
    }
    return new String(password);
  }
  //setting the mail box capacity
  public void setMailBoxCapacity(int capacity)
  {
    this.mailBoxCapacity = capacity;
  }
  //getting the mail box capacity
  public int getMailBoxCapacity()
  {
    return mailBoxCapacity;
  }
  //setting the alternate email
  public void setAlternateEmail(String altemail)
  {
    this.alternateEmail = altemail;
  }
  //getting the alternate email
  public String getAlternateEmail()
  {
    return alternateEmail;
  }
  //change the passowrd
  public void changePassword(String password)
  {
    this.password = password;
  }
  public String getPassword()
  {
    return password;
  }
  public String showInfo()
  {
    return "DISPLAY NAME : " +firstName +" "+lastName+
            "\n COMPANY EMAIL : "+ email +
            "\n MAILBOXCAPACITY : "+mailBoxCapacity + "mb";
  }
}
