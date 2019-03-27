package paquete;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VentanaPrincipal {
	JFrame ventana;// Esto es la ventana 
	JButton boton; // Esto el Boton
	JList<String> lista;// Esta es la Lista que todo lo que contengan van a ser cadenas
	String []listData = {"Linea 1","Linea 2","Linea 3"};//Creo Un Array De Cadenas Para Meterselo a La Lista
	/**
	 * Constructor de la Ventana
	 */
	public VentanaPrincipal() {
		ventana = new JFrame();// Crea La ventana
		ventana.setBounds(0, 0, 500, 400);// Le da Tamaño
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Y le digo que se cierre cuando pulse la cruz
	}
	/**
	 * Metodo que Hace la ventana visible y llama a los metodos necesarios para cargar la ventana
	 */
	public void Inicializar() {
		ventana.setVisible(true);
		InicializarComponentes();
		InicializarListeners();
	}
	
	private void InicializarComponentes() {
		ventana.setLayout(new GridLayout(1,3));// Esto es asignar un Layout NO PREOCUPARSE AUN
		boton = new JButton("PULSAME"); // Inicializo el boton con el TEXTO PULSAME
		lista = new JList<>(listData);// Inicializo la lista cargando el array
		ventana.add(lista);// Añado ambos  a la ventana
		ventana.add(boton);
	}
	/**
	 * Metodo que gestiona los eventos
	 * Para Capturar Evemtos es Necesario Poner a la escucha los componentes de ahi viene lo de Listener
	 */
	private void InicializarListeners() {
		// Esto Inicializa El Listener del boton
		boton.addActionListener(new ActionListener() {// Esto pone el componente a la escucha
			
			@Override
			public void actionPerformed(ActionEvent e) {// Este Metodo ya recibe el evento
				// El codigo que se ejecuta cuando pulsas un boton es este de aqui
				JOptionPane.showMessageDialog(ventana, "HAS PULSADO EL BOTON", "HOOOLAAAA", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		//Esto inicializa el Listener del boton
		lista.addListSelectionListener(new ListSelectionListener() {//Componente a la escucha
			
			@Override
			public void valueChanged(ListSelectionEvent e) {// Este evento detecta cuando la lista sea seleccionada
				String msj = lista.getSelectedValue();// Esto te devuelve El valor Seleccionado
				JOptionPane.showMessageDialog(ventana, msj, "HOOOLAAAA", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
}
