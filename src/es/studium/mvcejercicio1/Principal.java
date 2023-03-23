package es.studium.mvcejercicio1;

public class Principal
{

	public static void main(String[] args)
	{
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		
		new Controlador(vista, modelo);
	}

}
