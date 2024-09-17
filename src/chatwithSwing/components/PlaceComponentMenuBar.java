package chatwithSwing.components;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PlaceComponentMenuBar extends JPanel{
	
	public PlaceComponentMenuBar(JPanel jpcenter) {
		initComponentsMenuBar(jpcenter);
	}

	private void initComponentsMenuBar(JPanel center) {
		setLayout(new BorderLayout());
		//JPanel laminaMenu = new JPanel();
		JMenuBar barraMenu = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		JMenuItem abrir= new JMenuItem("Abrir");
		JMenuItem editar= new JMenuItem("Editar");
		JMenuItem cerrar= new JMenuItem("Cerrar");
		archivo.add(abrir);
		archivo.add(editar);
		archivo.add(cerrar);
		
		JMenu gestion = new JMenu("Gestion");
		JMenuItem gestion1= new JMenuItem("Gestion I");
		JMenuItem gestion2= new JMenuItem("Gestion II");
		gestion.add(gestion1);
		gestion.add(gestion2);
		
		JMenu administrar = new JMenu("Administrar");
		JMenuItem admin1= new JMenuItem("Admin I");
		JMenuItem admin2= new JMenuItem("Admin II");
		administrar.add(admin1);
		administrar.add(admin2);
		
		JMenu usuarios = new JMenu("Usuarios");//los usuarios deben tener rol y permisos
		JMenuItem agregarU   = new JMenuItem("Agregar Usuario");
		agregarU.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
		
			 
				center.removeAll();
				center.setSize(PlaceComponentCenter.ancho, PlaceComponentCenter.alto);
			 
				center.repaint();
				center.revalidate();
				center.setVisible(true);
				center.setEnabled(true);
				
			}
		});
		JMenuItem modificarU = new JMenuItem("Modificar Usuario");
		JMenuItem eliminarU  = new JMenuItem("Eliminar Usuario");
		usuarios.add(agregarU);
		usuarios.add(modificarU);
		usuarios.add(eliminarU);
		
		JMenu contenido = new JMenu("Gestion II");			
		
		JMenuItem contenido1= new JMenuItem("Contenido I");
		JMenuItem contenido2= new JMenuItem("Contenido II");
		JMenuItem contenido3= new JMenuItem("Contenido III");
		contenido.add(contenido1);
		contenido.add(contenido2);
		contenido.add(contenido3);		
		
		barraMenu.add(archivo);
		barraMenu.add(administrar);
		barraMenu.add(gestion);
		barraMenu.add(usuarios);
		barraMenu.add(contenido);
		add(barraMenu, BorderLayout.NORTH);
		
	}

}
