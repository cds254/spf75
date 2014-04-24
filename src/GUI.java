

package project;

import java.awt.BorderLayout;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GUI extends JFrame
{
    JPanel panel = new JPanel();
    JButton add = new JButton("Add");
    JButton search = new JButton("Search");
    JTextField addName = new JTextField(5);
    JTextField addNumber = new JTextField(5);
    JTextField addAge = new JTextField(5);
    JTextField addTwitter = new JTextField(5);
    PeopleList kitten = new PeopleList();
    
    public GUI()
    {
        super("Social Book");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        add(panel);
        panel.add(add, BorderLayout.NORTH);
        panel.add(search, BorderLayout.NORTH);
        setVisible(true);
        panel.add(addName, BorderLayout.CENTER);
        panel.add(addNumber, BorderLayout.CENTER);
        panel.add(addAge, BorderLayout.CENTER);
        panel.add(addTwitter, BorderLayout.CENTER);
        add.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) 
    { 
        int number = Integer.parseInt(addNumber.getText());
        int age = Integer.parseInt(addNumber.getText());
        People temp = new People(addName.getText(), number, age, addTwitter.getText());
        kitten.addPerson(temp);
    }
  }
);
        search.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) 
    { 
        
        for(int i = 0; i < kitten.getSize(); i++)
        {
            System.out.println(kitten.getPerson(i).getName());
        }
    }
  }
);
        
        
        
    }

    
    
    
}
