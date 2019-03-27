package paquete;

import java.awt.EventQueue;

public class Principal {
	public static void main(String[] args) {
		
		EventQueue.invokeLater(()->{
			try {
				//Creo una instancia de la ventana
				VentanaPrincipal ventana = new VentanaPrincipal();
				//Inicializo la ventana
				ventana.Inicializar();
			} catch (Exception e) {
				//Capturo la excepcion por si peta algo del programa
				e.printStackTrace();
			}
		});	
	
	}
}
