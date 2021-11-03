package vue;

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;  
 

public class LoginForm extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6132864352361801230L;
	private JButton btnSeConnecter;
	private JPanel newPanel;
	private JLabel emailLabel, passLabel;
	final JTextField emailField, passField;
	
	
	public LoginForm() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		
		//Create label for user name
		emailLabel = new JLabel();
		emailLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		emailLabel.setBackground(Color.GRAY);
		emailLabel.setText("E-mail");
		
		//create text field to get username from the user  
        emailField = new JTextField(15);    //set length of the text  
        emailField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        
        //create label for password  
        passLabel = new JLabel();  
        passLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        passLabel.setBackground(Color.LIGHT_GRAY);
        passLabel.setText("Password");      //set label value for textField2  
		
        //create text field to get password from the user  
        passField = new JPasswordField(15);    //set length for the password
        
        
        //create submit button  
        btnSeConnecter = new JButton("Se connecter");
        btnSeConnecter.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
      //create panel to put form elements  
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.setBackground(SystemColor.inactiveCaption);
        this.setLocationRelativeTo(null);
        newPanel.add(emailLabel);    //set username label to panel  
        newPanel.add(emailField);   //set text field to panel  
        newPanel.add(passLabel);    //set password label to panel  
        newPanel.add(passField);   //set text field to panel  
        newPanel.add(btnSeConnecter);           //set button to panel  
        
        getContentPane().add(newPanel, BorderLayout.CENTER); 
        
        //perform action on button click   
        btnSeConnecter.addActionListener(this);     //add action listener to button  
        setTitle("LOGIN FORM");         //set title to the login form  
	}
        //define abstract method actionPerformed() which will be called on button click 
        
        public void actionPerformed(ActionEvent ae)     //pass action listener as a parameter  
        {  
            String userValue = emailField.getText();        //get user entered username from the textField1  
            String passValue = passField.getText();        //get user entered pasword from the textField2  
                         
            try {
            	//JDBC SQL Driver loading
				Class.forName("com.mysql.cj.jdbc.Driver");
				 //Database connection
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/applicationtranport", "root", "" );
			    System.out.println("CONNECTION:: SUCCESS");
            } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
           
            
            
            if (userValue.equals("youcef@mail.com") && passValue.equals("testPass")) {  //if authentic, navigate user to a new page  
                  
                //create instance of the NewPage  
                UserInterfaceSWING page = new UserInterfaceSWING();  
                  
                //make page visible to the user  
                page.setVisible(true);  
                  
                //create a welcome label and set it to the new page  
                JLabel wel_label = new JLabel("Welcome: "+userValue);  
                page.getContentPane().add(wel_label);  
            }  
            else{  
                //show error message  
                System.out.println("Please enter valid username and password");  
            }  
        }      
	 
        
	public static void main(String[] args) {
		
		try  
        {  
            //create instance of the CreateLoginForm  
            LoginForm form = new LoginForm();  
            form.setSize(300,100);  //set size of the frame  
            form.setVisible(true);  //make form visible to the user  
        }  
        catch(Exception e)  
        {     
            //handle exception   
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  	
	}
}
