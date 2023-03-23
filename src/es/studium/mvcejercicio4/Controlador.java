package es.studium.mvcejercicio4;

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
	
	public void actionPerformed(ActionEvent ae) {
		modelo.presupuesto = 0;
		if (vista.chkGasolina.getState() == true) {
		modelo.presupuesto = modelo.calculoPresupuesto(7000);
		}
		if (vista.chkDiesel.getState() == true) {
		modelo.presupuesto = modelo.calculoPresupuesto(8000);
		}
		if (vista.chkHibrido.getState() == true) {
		modelo.presupuesto = modelo.calculoPresupuesto(9000);
		}
		if (vista.chkElectrico.getState() == true) {
		modelo.presupuesto = modelo.calculoPresupuesto(8500);
		}
		if (vista.chkTresPuertas.getState() == true) {
			modelo.presupuesto = modelo.calculoPresupuesto(2000);
			}
			if (vista.chkCuatroPuertas.getState() == true) {
			modelo.presupuesto = modelo.calculoPresupuesto(3000);
			}
			if (vista.chkCincoPuertas.getState() == true) {
			modelo.presupuesto = modelo.calculoPresupuesto(2500);
			}
			if (vista.chkPinturaMetalizada.getState() == true) {
			modelo.presupuesto = modelo.calculoPresupuesto(1500);
			}
			vista.txtPresupuesto.setText(modelo.presupuesto + " €");
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
