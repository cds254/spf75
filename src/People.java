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
    int number;
    int age;
    String twitter;
    
    public People(String name, int number, int age, String twitterHandle)
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
    
    int getNumber()
    {
        return number;
    }
    
    int getAge()
    {
        return age;
    }
    
    String getTwitter()
    {
        return twitter;
    }
    
    
  
    
    
    
    
    
}
