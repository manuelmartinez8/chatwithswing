package chatwithSwing.components;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ListPanelU extends JPanel{
	
	public ListPanelU() {
		setLayout(new BorderLayout());
		 JLabel listadoLabel = new JLabel("¡Bienvenido a la pantalla Listar Usuario!", SwingConstants.CENTER);			
	        listadoLabel.setBounds(50, 100, 300, 30);
	        add(listadoLabel);
	}

}
