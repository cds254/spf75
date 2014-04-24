import java.applet.*;
import java.net.*;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class socialMedia extends JApplet implements ActionListener
{
    // Declarations of class-wide variables

    @Override
    public void init()
    {
        setLayout(new FlowLayout());
        
        Panel socialPanel = new Panel();
        Panel musicPanel  = new Panel();
        Panel foodPanel   = new Panel();
        
        socialPanel.setLayout(new FlowLayout());
        musicPanel.setLayout(new FlowLayout());
        foodPanel.setLayout(new FlowLayout());
        
        JTabbedPane tabbedPane = new JTabbedPane();
        
        tabbedPane.addTab("Social Media", socialPanel);
        tabbedPane.addTab("Music", musicPanel);
        tabbedPane.addTab("Food", foodPanel);
        
        JButton twitButton  = new JButton("twitter");
        JButton fbButton    = new JButton("facebook");
        JButton instaButton = new JButton("instagram");
        JButton pinButton   = new JButton("pinterest");
        
        JButton pandoraButton = new JButton("pandora");
        JButton spotifyButton = new JButton("spotify");
        JButton gmusicButton  = new JButton("music.google");
        JButton grooveButton  = new JButton("grooveshark");
        
        JButton phutButton    = new JButton("pizzahut");
        JButton dominosButton = new JButton("dominos");
        JButton papaButton    = new JButton("papajohns");
        
        twitButton.addActionListener(this);
        fbButton.addActionListener(this);
        instaButton.addActionListener(this);
        pinButton.addActionListener(this);
        
        pandoraButton.addActionListener(this);
        spotifyButton.addActionListener(this);
        gmusicButton.addActionListener(this);
        grooveButton.addActionListener(this);
        
        phutButton.addActionListener(this);
        dominosButton.addActionListener(this);
        papaButton.addActionListener(this);
        
        socialPanel.add(twitButton);
        socialPanel.add(fbButton);
        socialPanel.add(instaButton);
        socialPanel.add(pinButton);
        
        musicPanel.add(pandoraButton);
        musicPanel.add(spotifyButton);
        musicPanel.add(gmusicButton);
        musicPanel.add(grooveButton);
        
        foodPanel.add(phutButton);
        foodPanel.add(dominosButton);
        foodPanel.add(papaButton);
        
        add(tabbedPane);
    }

    @Override
    public void paint(Graphics g)                       
    {
       super.paint(g);
    }

    public void actionPerformed(ActionEvent e)           
    {
        // Code for processing user actions
    	JButton source = (JButton)e.getSource();
        String link = "http://"+source.getText()+".com";
        try {
           AppletContext a = getAppletContext();
           URL url = new URL(link);
           a.showDocument(url,"_blank");
        }
        catch (MalformedURLException eURL){
           System.out.println(eURL.getMessage());
        }
    	
        repaint();                                       
    }
}