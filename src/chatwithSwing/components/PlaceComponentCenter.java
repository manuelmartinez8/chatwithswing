package chatwithSwing.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class PlaceComponentCenter extends JPanel{
	public static int ancho = 300;
	public static int alto = 300;
	
	public PlaceComponentCenter() {
		initComponentCenter();
		setBounds(450, 300, ancho, alto);
		//setBackground(Color.BLUE);
	}

	private void initComponentCenter() {
		 setLayout(new BorderLayout());
		
		 JLabel welcomeLabel = new JLabel("¡Bienvenido a la pantalla principal!", SwingConstants.CENTER);			
	        welcomeLabel.setBounds(50, 100, 300, 30);
	        add(welcomeLabel);
	        JButton cambiar = new JButton("Cambiar");
	        cambiar.setBounds(100, 100, 10, 8);
	        cambiar.addActionListener(new ActionListener() {			
				@Override
				public void actionPerformed(ActionEvent e) {
					//PlaceComponentCenter centro = new PlaceComponentCenter(); 
					//FormAddUser formUser = new  FormAddUser(); 
					//changeView(formUser);
					
				}
			});
	       // add(cambiar);
		
	}
	
	public   void changeView(JPanel jpanel) {
		
		removeAll();
		jpanel.setSize(ancho, alto);
		add(jpanel);
		repaint();
		activeView(jpanel);
	}
	
	private void activeView(JPanel jpanel) {
		jpanel.setVisible(true);
		jpanel.setEnabled(true);
		 
	}

}
