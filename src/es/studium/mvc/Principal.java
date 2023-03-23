package es.studium.mvc;

public class Principal
{
	public static void main(String[] args)
	{
		// Instanciamos dos objetos
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		
		// Llamamos al constructor
		new Controlador(modelo, vista);
	}
}
