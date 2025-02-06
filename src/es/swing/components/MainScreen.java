package chatwithSwing.components;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/*
QUEDE EN DECIDIR COMO UBICAR EN LA PANTALLA PRINCIPAL LOS COMPONENTES UNA VEZ SE ACTIVE EL ACTION
DESDE EL MENU ITEM


*/

public class MainScreen extends JFrame{
	
	public MainScreen() {
		//setVisible(true);
		initComponents();
		setTitle("Pantalla Principal");		
	}
	
	private void initComponents() {
		
		setBounds(550, 400,450,300);		
		PlaceComponentCenter centro = new PlaceComponentCenter();
		PlaceComponentMenuBar menuBarComponents = new PlaceComponentMenuBar(centro);
		
		setLocationRelativeTo(null);		
        add(menuBarComponents, BorderLayout.NORTH);
        add(centro,BorderLayout.CENTER);       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	private class GestionMenu implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
