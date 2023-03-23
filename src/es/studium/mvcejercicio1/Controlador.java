package es.studium.mvcejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Modelo modelo;
	Vista vista;
	
	public Controlador(Vista v, Modelo m) {
		vista = v;
		modelo = m;
		
		v.ventana.addWindowListener(this);
		v.btnCelFah.addActionListener(this);
		v.btnFahCel.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(vista.btnCelFah))
		{
		float celsius = Float.parseFloat(vista.txtCelsius.getText());
		// °F = (°C x 9/5) + 32
		float fahrenheit = modelo.celsiusFahrenheit(celsius);
		vista.txtFahrenheit.setText(fahrenheit+"");
		}
		else
		{
		float fahrenheit = Float.parseFloat(vista.txtFahrenheit.getText());
		// °C = (°F - 32) x 5/9
		float celsius = modelo.fahrenheitCelsius(fahrenheit);
		vista.txtCelsius.setText(celsius+"");
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
