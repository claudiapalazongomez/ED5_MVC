package es.studium.mvcejercicio3;

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
		
		v.btnComprobar.addActionListener(this);
		v.ventana.addWindowListener(this);
	}
	
	public void actionPerformed(ActionEvent we) {
		modelo.resultado = "";
		if (vista.chkCorrer.getState() == true) {
		modelo.resultado = modelo.aficion("Correr");
		}
		if (vista.chkNadar.getState() == true) {
		modelo.resultado = modelo.aficion("Nadar");
		}
		if (vista.chkAndar.getState() == true) {
		modelo.resultado = modelo.aficion("Andar");
		}
		if (vista.chkLeer.getState() == true) {
		modelo.resultado = modelo.aficion("Leer");
		}
		if (vista.chkCine.getState() == true) {
		modelo.resultado = modelo.aficion("Ir al Cine");
		}
		if (vista.chkBailar.getState() == true) {
		modelo.resultado = modelo.aficion("Bailar");
		}
		if (vista.chkFutbol.getState() == true) {
		modelo.resultado = modelo.aficion("Fútbol");
		}
		if (vista.chkTenis.getState() == true) {
		modelo.resultado = modelo.aficion("Tenis");
		}
		if (vista.chkBaloncesto.getState() == true) {
		modelo.resultado = modelo.aficion("Baloncesto");
		}
		if (vista.chkVela.getState() == true) {
		modelo.resultado = modelo.aficion("Deportes de vela");
		}
		System.out.println(modelo.resultado);
		}
	
		public void windowActivated(WindowEvent we) {
		}
		public void windowClosed(WindowEvent we) {
		}
		public void windowClosing(WindowEvent we) {
			System.exit(0);
			}
			public void windowDeactivated(WindowEvent we) {
			}
			public void windowDeiconified(WindowEvent we) {
			}
			public void windowIconified(WindowEvent we) {
			}
			public void windowOpened(WindowEvent we) {
			}
}
