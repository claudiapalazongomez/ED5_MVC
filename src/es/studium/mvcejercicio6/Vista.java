package es.studium.mvcejercicio6;

import java.awt.*;

public class Vista
{
	Frame ventana = new Frame("Baloncesto");
	// Creaci�n de una lista con 5 elementos visibles y que no
	// permite multiselecci�n
	List lisEquipos = new List(10, false);
	String[] Equipos =
	{ "Seleccione un equipo", "Real Madrid", "Barca", "Iberoestar Tenerife", "TD Systems Baskonia",
			"Hereda San Pablo Burgos", "Valencia Basket", "Club Joventut de Badalona", "Unicaja", "UCAM Murcia",
			"Baxi Manresa", "MoraBanc Andorra", "Herbalife Gran Canaria", "Monbus Obradoiro", "Movistar Estudiantes",
			"Casademont Zaragoza", "Urbas Fuenlabrada", "Coosur RealBetis", "RETAbet Bilbao Basket",
			"Acunsa Gipuzkoa Basket" };
	String[] ciudades =
	{ "No ha elegido ning�n equipo", "Madrid", "Barcelona", "Tenerife", "Vitoria", "Burgos", "Valencia", "Badalona",
			"M�laga", "Murcia", "Manresa", "Andorra", "Gran Canaria", "Santiago de Compostela", "Madrid", "Zaragoza",
			"Fuenlabrada", "Sevilla", "Bilbao", "Guipuzcoa" };

	public Vista()
	{
		ventana.setLayout(new FlowLayout());
		for (String equipo : Equipos)
		{
			lisEquipos.add(equipo);
		}
		ventana.add(lisEquipos);
		ventana.setSize(250, 250);
		ventana.setVisible(true);
	}
}
