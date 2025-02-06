package chatwithSwing.components;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/*
											TO DO 

DE MOMENTO EL PASO MAS SENCILLO PARA MODULARIZAR LA APLICACION ES DIVIDIRLO EN METODOS QUE RECIBAN VECTORES DE OBJETOS DE 
LOS COMPOENTES
*/

public class Principal extends JFrame{
	
	private JPanel contenedor; // Panel que contiene todos los paneles   
    
    // Paneles que vamos a alternar
    private JPanel panelWelcome;
    private JPanel panel2;
    private JPanel panel3;
    
    private FormAddUser addUser;
    private EditPanelU editUser;
    private ListPanelU listUser;
    
    public Principal() {
    	 // Configurar el JFrame
        setTitle("Alternar Paneles con CardLayout");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        
        initPaneles();
        
        // Creamos el JMenuBar con JMenu y JMenuItem
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        
        JMenu menuUser = new JMenu("Usuario");
        JMenuItem agregarU   = new JMenuItem("Agregar Usuario");
        agregarU.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				 alternarPanel("addUserPanel");				
			}
		});
        JMenuItem editarU   = new JMenuItem("Editar Usuario");
        editarU.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				 alternarPanel("editUserPanel");				
			}
		});
        JMenuItem listarU   = new JMenuItem("Listar Usuarios");
        listarU.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 alternarPanel("listUserPanel");				
			}
		});
        menuUser.add(agregarU);
        menuUser.add(editarU);
        menuUser.add(listarU);        
        
        JMenu menuGestion = new JMenu("Gestion");
        JMenu menuContenido = new JMenu("Contenido");
        
        JMenuItem itemPanel1 = new JMenuItem("Mostrar Panel 1");
        JMenuItem itemPanel2 = new JMenuItem("Mostrar Panel 2");
        JMenuItem itemPanel3 = new JMenuItem("Mostrar Panel 3");
        JMenuItem itemPanel4 = new JMenuItem("Mostrar Panel 4");        
        
        // Agregamos los JMenuItems al JMenu
        menuArchivo.add(itemPanel1);
        menuArchivo.add(itemPanel2);
        menuArchivo.add(itemPanel3);
        menuArchivo.add(itemPanel4);
        
        // Agregamos el JMenu al JMenuBar
        menuBar.add(menuArchivo);
        menuBar.add(menuUser);
        menuBar.add(menuGestion);
        menuBar.add(menuContenido);
        
        // Establecemos el JMenuBar en el JFrame
        setJMenuBar(menuBar);
        // Inicializamos el panel contenedor y establecemos un CardLayout
        contenedor = new JPanel(new CardLayout());
        contenedor.add(panelWelcome, "Panel 1");
        contenedor.add(panel2, "Panel 2");
        contenedor.add(panel3, "Panel 3");
        contenedor.add(addUser, "addUserPanel");
        contenedor.add(editUser, "editUserPanel");
        contenedor.add(listUser, "listUserPanel");

        // Agregamos el contenedor al JFrame
        add(contenedor);
        
        // Escuchadores para alternar entre los paneles
        itemPanel1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Alternamos al Panel 1
                alternarPanel("Panel 1");
            }

        });

        itemPanel2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Alternamos al Panel 2
                alternarPanel("Panel 2");
            }
        });

        itemPanel3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Alternamos al Panel 3
                alternarPanel("Panel 3");
            }
        });
        
        itemPanel4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Alternamos al Panel 3
                alternarPanel("addUserPanel");
            }
        });
    	
    }    

	private void alternarPanel(String nombrePanel) {
		CardLayout cl = (CardLayout)(contenedor.getLayout());
		cl.show(contenedor, nombrePanel);
		
	}

	private void initPaneles() {
        // Configuramos el Panel 1
		panelWelcome = new WelcomePanel();	 

        // Configuramos el Panel 2
        panel2 = new WelcomePanel();
       // panel2.setBackground(Color.GREEN);
       // panel2.add(new JLabel("Este es el Panel 2"));

        // Configuramos el Panel 3
        panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.add(new JLabel("Este es el Panel 3"));
        
        addUser = new FormAddUser();
        editUser = new EditPanelU();
        listUser = new ListPanelU();
		
	}

}
