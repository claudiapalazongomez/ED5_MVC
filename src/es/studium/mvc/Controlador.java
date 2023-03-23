package es.studium.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Modelo modelo;
	Vista vista;
	
	public Controlador(Modelo m, Vista v) { // si ponemos Modelo modelo sería
		modelo = m;
		vista = v; // this.vista = vista;
		
		v.btnCalcular.addActionListener(this); // btnCalcular es un objeto que está en la clase Vista, así que usamos el parámetro para llamarlo 
		v.ventana.addWindowListener(this); // vista.ventana.addWindowListerner(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) // lo cogemos de la clase, no del constructor
	{
		int numero = Integer.parseInt(vista.txtNumero.getText());
		vista.txtResultado.setText(modelo.doble(numero)+""); //llamamos al método y le pasamos nuestra variable
		
	}

	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
