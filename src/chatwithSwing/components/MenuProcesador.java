package chatwithSwing.components;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

 

public class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		setVisible(true);
		setBounds(550, 300, 700, 500);
	LaminaProcesador lamina = new LaminaProcesador();	
	add(lamina);
	}
	
	class LaminaProcesador extends JPanel{
		JTextPane miarea;
		public LaminaProcesador() {
			setLayout(new BorderLayout());
			JPanel laminaMenu = new JPanel();
			JMenuBar miBarra = new JMenuBar();
			//----------------------------------
			JMenu fuente = new JMenu("Fuente");
			JMenu estilo = new JMenu("Estilo");
			JMenu tamanio = new JMenu("Tamanio");
			//----------------------------------
			GestionaMenu getiona = new GestionaMenu();
			fuente.add(new JMenuItem("Arial"));
			JMenuItem courier = new JMenuItem("Courier");
			courier.addActionListener(getiona);
			JMenuItem verdana = new JMenuItem("Verdana");
			verdana.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					miarea.setFont(new Font("Verdana", Font.PLAIN, 14));
					
				}
			});
					
					
			fuente.add(courier);			
			fuente.add(verdana);
			//----------------------------------
			JMenuItem negrita= new JMenuItem("Negrita");
			JMenuItem cursiva= new JMenuItem("Cursiva");
			estilo.add(new JMenuItem("Negrita"));
			estilo.add(cursiva);
			//----------------------------------
			tamanio.add(new JMenuItem("12"));
			tamanio.add(new JMenuItem("16"));
			tamanio.add(new JMenuItem("20"));
			tamanio.add(new JMenuItem("24"));
			//----------------------------------
			
			miBarra.add(fuente);
			miBarra.add(estilo);
			miBarra.add(tamanio);
			
			laminaMenu.add(miBarra);
			add(laminaMenu, BorderLayout.NORTH);
			  miarea = new JTextPane();
			add(miarea, BorderLayout.CENTER);
			
			
		}
		
		private class GestionaMenu implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				miarea.setFont(new Font("Courier", Font.PLAIN, 12));
				
			}
			
			
		}
		
	}

}
