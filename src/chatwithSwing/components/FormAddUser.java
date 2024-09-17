package chatwithSwing.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FormAddUser extends JPanel{
	
	private JLabel   titulo, usuario, password, documento, rol;
	private JTextField txtUsuario, txtPassword, txtdocumento, txtrol;
	private JButton btnagregar,btnborrar,btncancelar;

	public FormAddUser() {
		initComponentCenter();
		setBounds(450, 300, 450, 300);		
	}
	
	private void initComponentCenter() {
		setLayout(null);
		
		titulo    = new JLabel("Agregar Usuario");
		titulo.setBounds(100, 15, 200, 25);
		usuario   = new JLabel("Usuario:");
		usuario.setBounds(10, 50, 80, 25);
		password  = new JLabel("Password:");
		password.setBounds(10, 80, 80, 25);
		documento = new JLabel("Documento:"); 
		documento.setBounds(10, 110, 80, 25);
		rol = new JLabel("Rol:");	
		rol.setBounds(10, 140, 80, 25);
			  
	    txtUsuario   = new JTextField(20);
	    txtUsuario.setBounds(100, 50, 80, 25);
	    txtPassword  = new JPasswordField(20);
	    txtPassword.setBounds(100, 80, 80, 25);
		txtdocumento = new JTextField(20);
	    txtdocumento.setBounds(100, 110, 80, 25);
		      txtrol = new JTextField(20);
		      txtrol.setBounds(100, 140, 80, 25);
		      
		      
		btnagregar  = new JButton("Agregar");
		btnagregar.setBounds(10, 200, 80, 25);
		btnagregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String usuariotext = txtUsuario.getText();
				String password = txtPassword.getText();
				String documento = txtdocumento.getText();
				String rol = txtrol.getText();
				System.out.println("Los datos son:\n" + usuariotext +"\n" + password + "\n"+documento+"\n"+rol);
				
			}
		});
		btnborrar   = new JButton("Limpiar");
		btnborrar.setBounds(100, 200, 80, 25);
		btnborrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtUsuario.setText("");
				txtPassword.setText("");
				txtdocumento.setText("");
				txtrol.setText("");
				
			}
		});
		btncancelar = new JButton("Cancelar");     
		btncancelar.setBounds(200, 200, 100, 25);
		btncancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		add(titulo);      
		add(usuario);
		add(password);
		add(documento);
		add(rol);
		add(txtUsuario);
		add(txtPassword);
		add(txtdocumento);
		add(txtrol);
		add(btnagregar);
		add(btnborrar);
		add(btncancelar);
		

		
		
	}

}
