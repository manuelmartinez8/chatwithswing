package chatwithSwing.components;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EditPanelU extends JPanel{
	
	public EditPanelU() {
		setLayout(new BorderLayout());
		 JLabel editLabel = new JLabel("¡Bienvenido a la pantalla Editar Usuario!", SwingConstants.CENTER);			
	        editLabel.setBounds(50, 100, 300, 30);
	        add(editLabel);
	}

}
