package project;

import java.applet.*;
import java.net.*;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;


@SuppressWarnings("serial")
public class FridgeProject extends JApplet implements ActionListener
{
    private String[] labels = { "SocialMedia", "Music", "Food", "People"};
    private String[] socialMediaButtonLabels = {"twitter", "facebook", "instagram", "pinterest"};
    private String[] musicButtonLabels = {"pandora", "spotify", "music.google", "grooveshark"};
    private String[] foodButtonLabels = {"pizzahut", "dominos", "papajohns"};
    private HashMap<String,String[]> buttonList = new HashMap<String,String[]> (); 
    private JTabbedPane tabbedPane;

    @Override
    public void init()
    {
        setLayout(new FlowLayout());
        tabbedPane = new JTabbedPane();   
        buttonList.put("SocialMedia",socialMediaButtonLabels);
        buttonList.put("Music",musicButtonLabels);
        buttonList.put("Food",foodButtonLabels);
               
        for (int i = 0; i < labels.length; i++) {
            if(!"People".equals(labels[i])) {
                Panel panel = new Panel();
                panel.setLayout(new FlowLayout());
                if (buttonList.containsKey(labels[i])) {
                    String[] buttons = buttonList.get(labels[i]);
                    for(int j = 0; j <buttons.length; j++) {
                        JButton button = new JButton(buttons[j]);
                        button.addActionListener(this);
                        panel.add(button);
                    }
                }
                tabbedPane.addTab(labels[i], panel);
            }
            else {
                Panel panel = new peoplePanel().initPanel();
                tabbedPane.addTab("People", panel);
            }   
        }   
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

    private static class peoplePanel extends Panel {
        
        private Panel panel;
        private javax.swing.JButton addButton;
        private javax.swing.JButton searchButton;
        private javax.swing.JTextArea resultArea;
        private javax.swing.JTextField nameTextField;
        private javax.swing.JTextField numberTextField;
        private javax.swing.JTextField ageTextField;
        private javax.swing.JTextField twitterHandleTextField;
        private javax.swing.JTextField searchNameTextField;
        private javax.swing.JTextField searchNumberTextField;
        private PeopleList addressBook;
        private PeopleList searched;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JScrollPane jScrollPane1;
        

        public peoplePanel() {
            
            panel                  = new Panel();
            jScrollPane1 = new javax.swing.JScrollPane();
            
            addButton              = new javax.swing.JButton();
            searchButton           = new JButton();
            
            resultArea             = new JTextArea();
            
            nameTextField          = new JTextField();
            numberTextField        = new JTextField();
            ageTextField           = new JTextField();
            twitterHandleTextField = new JTextField();
            searchNameTextField    = new JTextField();
            searchNumberTextField  = new JTextField();
            
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();  
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            
            addressBook = new PeopleList();
            searched = new PeopleList();
                 
        }
        
        public Panel initPanel(){
            
            jLabel1.setText("Enter your information: ");
            jLabel2.setText("Search by: ");
            jLabel3.setText("Name: ");
            jLabel4.setText("Number: ");
            jLabel5.setText("Age:");
            jLabel6.setText("Twiter Handle: ");
            jLabel7.setText("Name: ");
            jLabel8.setText("-or-");
            jLabel9.setText("Number: ");
            addButton.setText("Add");
            searchButton.setText("Search");
            resultArea.setColumns(20);
            resultArea.setRows(5);
            jScrollPane1.setViewportView(resultArea);
            
            org.jdesktop.layout.GroupLayout panelLayout = new org.jdesktop.layout.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLayout.createSequentialGroup()
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1))
                    .add(panelLayout.createSequentialGroup()
                        .add(104, 104, 104)
                        .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(panelLayout.createSequentialGroup()
                                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(panelLayout.createSequentialGroup()
                                        .add(jLabel6)
                                        .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(panelLayout.createSequentialGroup()
                                                .add(18, 18, 18)
                                                .add(addButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelLayout.createSequentialGroup()
                                                .add(18, 18, 18)
                                                .add(twitterHandleTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                        .add(233, 233, 233)
                                        .add(searchButton))
                                    .add(panelLayout.createSequentialGroup()
                                        .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(panelLayout.createSequentialGroup()
                                                .add(jLabel3)
                                                .add(18, 18, 18)
                                                .add(nameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(jLabel1))
                                        .add(184, 184, 184)
                                        .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel2)
                                            .add(panelLayout.createSequentialGroup()
                                                .add(jLabel7)
                                                .add(39, 39, 39)
                                                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                                    .add(searchNumberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                    .add(searchNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                                    .add(panelLayout.createSequentialGroup()
                                        .add(jLabel5)
                                        .add(18, 18, 18)
                                        .add(ageTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(184, 184, 184)
                                        .add(jLabel9)))
                                .add(0, 118, Short.MAX_VALUE))
                            .add(panelLayout.createSequentialGroup()
                                .add(jLabel4)
                                .add(18, 18, 18)
                                .add(numberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel8)
                                .add(209, 209, 209)))))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelLayout.createSequentialGroup()
                .add(25, 25, 25)
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(searchNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel7))
                    .add(panelLayout.createSequentialGroup()
                        .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(jLabel2))
                        .add(28, 28, 28)
                        .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(nameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(26, 26, 26)
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(jLabel8)
                    .add(numberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(41, 41, 41)
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jLabel9)
                    .add(ageTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(searchNumberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(48, 48, 48)
                .add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(twitterHandleTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6)
                    .add(searchButton))
                .add(42, 42, 42)
                .add(addButton)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .add(12, 12, 12))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
           
            
            addButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    String name = nameTextField.getText();
                    String number = numberTextField.getText();
                    String age = ageTextField.getText();
                    String twitterHandle = twitterHandleTextField.getText();
                    People newPerson = new People(name,number,age,twitterHandle);
                    addressBook.addPerson(newPerson);
                    resultArea.setText(name + " has been added to the book.");
                }
            });
                      
            searchButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    if(searchNameTextField.getText().matches(""))
                    {
                       searched = addressBook.searchNumber(searchNumberTextField.getText());
                    }
                    else if(searchNumberTextField.getText().matches(""))
                    {
                       searched = addressBook.searchName(searchNameTextField.getText());
                    }
                    else
                       searched = addressBook.searchBoth(searchNameTextField.getText(), searchNumberTextField.getText());
                    String text = "";
                    for(int i = 0; i < searched.getSize(); i++)
                    {
                       People temp = searched.getPerson(i);
                       text = text + temp.outputPerson(temp) + "\r\n";
                    }
                    if(text.length() > 0){
                        resultArea.setText(text);
                    }
                    else{
                        resultArea.setText("Can't find this person. Try again.");
                    }           
                }
            });         
            return panel;
        }
    }
}