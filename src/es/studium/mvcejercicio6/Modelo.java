package es.studium.mvcejercicio6;

public class Modelo
{
	String[] ciudades =
		{ "No ha elegido ning�n equipo", "Madrid", "Barcelona", "Tenerife", "Vitoria", "Burgos", "Valencia", "Badalona",
				"M�laga", "Murcia", "Manresa", "Andorra", "Gran Canaria", "Santiago de Compostela", "Madrid", "Zaragoza",
				"Fuenlabrada", "Sevilla", "Bilbao", "Guipuzcoa" };
	public String ciudad(int indice)
	{
		return ciudades[indice];
	}
}
