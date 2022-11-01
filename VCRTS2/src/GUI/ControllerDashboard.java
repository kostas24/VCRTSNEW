package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import ObjectClasses.Controller;

public class ControllerDashboard implements ActionListener{

		JFrame ControllerFrame = new JFrame();
		private static final int FRAME_WIDTH = 800;
		private static final int FRAME_HEIGHT = 800;
		
		private JButton buttonCompletionTime;
		private JLabel completionTimeLabel;
		private JLabel nameLabel;
		private JPanel panel;
		//private Controller controller = new Controller();
		private ArrayList<Integer> completionTimes;
		
		
		public ControllerDashboard() {
			//completionTimes = controller.calculateCompletionTime();
			nameLabel = new JLabel("Controller"); 
			nameLabel.setBounds(0, 0, 200, 35);
			nameLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
			nameLabel.setForeground(Color.white);

			completionTimeLabel = new JLabel("(insert compTime Here)"); 
			completionTimeLabel.setBounds(300, 300, 350, 40); 
			completionTimeLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
			completionTimeLabel.setForeground(Color.white);
			
			createButtonCompletitionTime();
			createPanel();			
			ControllerFrame.setTitle("VCRTS - Vehicle Controller Dashboard"); 
			
			ImageIcon CloudComputingIcon = new ImageIcon("Images/Cloud Computing.jpg");
			ControllerFrame.setIconImage(CloudComputingIcon.getImage()); 
			
			//INPUTTING SIZE OF GUI from VARIABLES
			ControllerFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

			ControllerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    ControllerFrame.setVisible(true);
		}

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == buttonCompletionTime)
			{		
				
				//Maybe add an if statement to detect if there are no Jobs/completionTime arraylist is empty?
				/*
				StringBuilder sb = new StringBuilder();
				for (Integer i : completionTimes) {
				    sb.append(i == null ? "" : i.toString());
				}
				completionTimeLabel.setText(sb.toString());
			*/		
			}
		}
		
		private void createButtonCompletitionTime() {
			buttonCompletionTime = new JButton("Find Completition Time");
			buttonCompletionTime.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
			buttonCompletionTime.setForeground(Color.white);
			buttonCompletionTime.setBounds(220, 360, 360, 40); 
			buttonCompletionTime.setBackground(Color.BLUE);
			buttonCompletionTime.setBorderPainted(false);
			buttonCompletionTime.addActionListener(this);
		}
		
		
		
		private void createPanel() {
			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(new Color (32, 42, 68));
			panel.add(nameLabel);
			panel.add(buttonCompletionTime);
			panel.add(completionTimeLabel);
			
			ControllerFrame.add(panel);
		
		}
		
	
}
