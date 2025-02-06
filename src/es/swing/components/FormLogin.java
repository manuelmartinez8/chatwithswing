package chatwithSwing.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 

public class FormLogin extends JFrame{
	
	public FormLogin() {
		initCo0mponents();
		setTitle("Login App");				
		setBounds(450, 300, 450, 300);	
		
		setLocationRelativeTo(null);
		 //pack();
		
	}
	
	private void initCo0mponents() {
		setVisible(true);
		PlaceCompponents lamina = new PlaceCompponents();
		//setSize(350, 200);
		add(lamina);
		
	}
	
	private void closeComponent() {
		//getDefaultCloseOperation();
		dispose();
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	class PlaceCompponents extends JPanel{
		JLabel   usuario, password;
		JTextField txtUsuario, txtPassword;
		
		public PlaceCompponents() {
			setLayout(null);
			// Etiqueta de usuario
	        JLabel userLabel = new JLabel("Usuario:");
	        userLabel.setBounds(10, 20, 80, 25);
	        add(userLabel);

	        // Campo de texto para ingresar el usuario
	        JTextField userText = new JTextField(20);
	        userText.setBounds(100, 20, 165, 25);
	        add(userText);

	        // Etiqueta de contraseña
	        JLabel passwordLabel = new JLabel("Contraseña:");
	        passwordLabel.setBounds(10, 50, 80, 25);
	        add(passwordLabel);

	        // Campo de contraseña
	        JPasswordField passwordText = new JPasswordField(20);
	        passwordText.setBounds(100, 50, 165, 25);
	        add(passwordText);

	        // Botón de login
	        JButton loginButton = new JButton("Iniciar sesión");
	        loginButton.setBounds(100, 90, 150, 25);
	        add(loginButton);
	        loginButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String usuario = userText.getText();
					String contrasena = new String(passwordText.getPassword());
					if(usuario.equals("") && contrasena.equals("")) {
						MainScreen  main = new MainScreen();
						closeComponent();
						main.setVisible(true);
						
						//JOptionPane.showMessageDialog(null, "Login Exitoso");
					}else {
						JOptionPane.showMessageDialog(null, "Login no Exitoso");
					}
				}
			});
			 
		}
		
	}

}
