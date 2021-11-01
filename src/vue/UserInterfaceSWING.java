package vue;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class UserInterfaceSWING extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JButton btnAjouter;
	private JButton supprimer;
	private JPanel contentPane;
	private JCheckBox chkCheckMe;
	JTextField txtEditMe;
	
	public UserInterfaceSWING() {
		super( "Transporting company application" );
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new DimensionUIResource(200, 300));
        this.setLocationRelativeTo(null);
        
        this.contentPane = (JPanel) this.getContentPane();
        this.setLayout(new FlowLayout());
        
        
        this.btnAjouter = new JButton ("Ajouter ");
        contentPane.add(btnAjouter);
        
        this.supprimer = new JButton("Supprimer"); 
        contentPane.add(this.supprimer);   
        
        this.chkCheckMe = new JCheckBox( "Check me!" );
        contentPane.add(chkCheckMe );
        
        this.txtEditMe = new JTextField( "Edit me!" );
        txtEditMe.setPreferredSize( new Dimension( 120,  30 ) );
        contentPane.add( txtEditMe );
        
	}


	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		// Start my window
		
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		UserInterfaceSWING  myWindow = new UserInterfaceSWING ();
        myWindow.setVisible( true );
		        
		        
		        	        
	}
}
