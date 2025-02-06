package chatwithSwing.components;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class WelcomePanel extends JPanel{
	
	public WelcomePanel() {
		setLayout(new BorderLayout());
		
		 JLabel welcomeLabel = new JLabel("¡Bienvenido a la pantalla principal!", SwingConstants.CENTER);			
	        welcomeLabel.setBounds(50, 100, 300, 30);
	        add(welcomeLabel);
		
	}

}
