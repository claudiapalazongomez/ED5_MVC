package es.studium.mvcejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Vista vista;
	Modelo modelo;
	
	public Controlador(Vista v, Modelo m) {
		vista = v;
		modelo = m;
		
		v.ventana.addWindowListener(this);
		v.btnCalcular.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// Averiguar botón pulsado
		Object a = e.getSource();
		if(a.equals(vista.btnCalcular))
		{
		float cantidad = Float.parseFloat(vista.txt1.getText());
		float porcentaje = Float.parseFloat(vista.txt2.getText());
		// Calculamos el porcentaje
		float resultado = modelo.porcentaje(cantidad, porcentaje);
		// Reseteamos los elementos
		vista.txt1.selectAll();
		vista.txt1.setText("");
		vista.txt2.selectAll();
		vista.txt2.setText("");
		// Y ponemos el cursor de nuevo en el primer cuadro de texto
		vista.txt1.requestFocus();
		// Colocamos el resultado en el Textfield correspondiente
		// Sumar "" a un número lo transforma en CADENA
		vista.txtResultado.setText(resultado+"");
		}		
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
