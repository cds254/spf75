/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Tyler
 */
public class People 
{
    String name;
    String number;
    String age;
    String twitter;
    
    public People(String name, String number, String age, String twitterHandle)
    {
       this.name = name;
       this.number = number;
       this.age = age;
       twitter = twitterHandle;
    }
   
    String getName()
    {
        return name;
    }
    
    String getNumber()
    {
        return number;
    }
    
    String getAge()
    {
        return age;
    }
    
    String getTwitter()
    {
        return twitter;
    }
    
    String outputPerson(People person)
    {
        String text = "";
        text = "Name: " + person.getName() + " " + "Number: " + person.getNumber() + " "
                + "Age: " + person.getAge() + " " + "Twitter Handle: " + person.getTwitter();
        return text;
    }
  
    
    
    
    
    
}
