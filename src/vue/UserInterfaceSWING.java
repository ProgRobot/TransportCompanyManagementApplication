package vue;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class UserInterfaceSWING extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UserInterfaceSWING() {
		super( "Transporting company application" );
        this.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        this.setSize( 600, 400 );
        this.setLocationRelativeTo( null );
        JPanel contentPane = (JPanel) this.getContentPane();
        JButton btnPushMe = new JButton( "Push me!" );
        contentPane.add( btnPushMe );
        JButton btnClickMe = new JButton( "Click me!!!!!!!!!!" );
        contentPane.add( btnClickMe );
        JCheckBox chkCheckMe = new JCheckBox( "Check me!" );
        contentPane.add( chkCheckMe );
        JTextField txtEditMe = new JTextField( "Edit me!" );
        txtEditMe.setPreferredSize( new DimensionUIResource(500, 300));
        contentPane.add( txtEditMe );
	}
	
	

	public static void main(String[] args) {
		// Start my window
		UserInterfaceSWING  myWindow = new UserInterfaceSWING ();
        myWindow.setVisible( true );
		        
		        
		        	        
	}
}
