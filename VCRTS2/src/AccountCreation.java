import java.awt.*;
import javax.swing.*;

public class AccountCreation {

    JFrame frame = new JFrame();
   
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 500;

	//Labels and variables for the Frame and Panel:
	private JLabel test;
	private JPanel panel;
	private JTextField nameField;
	private JTextField licensePlateField;
	private JTextField IDNumberField; 
	private JButton submitButton; 
	
	//Variables collecting and storing user information; to be written to file:
	private boolean vehicleOwner; 
	
	public AccountCreation() {
		test = new JLabel("Create Account Here"); 
		test.setBounds(150,10,350,50);
		test.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));	
		
		nameField = new JTextField("Name: ");
		nameField.setBounds(150, 110, 150, 25);
		
		IDNumberField = new JTextField("ID Number: ");
		IDNumberField.setBounds(138, 160, 175, 25);
		
		
		createPanel();
		
		frame.setTitle("VCRTS"); //setting Title on top left corner of GUI
		
		ImageIcon CloudComputingIcon = new ImageIcon("Cloud Computing.jpg");
		frame.setIconImage(CloudComputingIcon.getImage()); //Changing Frame Icon to cloud computing icon
		
		//INPUTTING SIZE OF GUI from VARIABLES
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
	
	private void createPanel() {
		panel = new JPanel();

		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		panel.add(test);
		panel.add(nameField);
		panel.add(IDNumberField);

		// adds to current object
		frame.add(panel);
	}
}
