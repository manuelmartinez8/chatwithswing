package chatwithSwing.application;

import javax.swing.JFrame;

import chatwithSwing.components.FormLogin;
import chatwithSwing.components.MenuProcesador;

 
public class App {

	public static void main(String[] args) {
		//MenuProcesador procesador = new MenuProcesador();
		//procesador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FormLogin login = new FormLogin();
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
