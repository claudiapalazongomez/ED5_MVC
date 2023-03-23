package es.studium.ejercicio5;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio5 implements WindowListener, ItemListener
{
	Frame ventana = new Frame("Provincias Espa�olas");
	Choice choProvincias = new Choice();
	String[] provincias =
	{ "Seleccione una provincia", "�lava", "Albacete", "Alicante", "Almer�a", "Asturias", "�vila", "Badajoz",
			"Barcelona", "Burgos", "C�ceres", "C�diz", "Cantabria", "Castell�n", "Ciudad Real", "C�rdoba", "La Coru�a",
			"Cuenca", "Gerona", "Granada", "Guadalajara", "Guip�zcoa", "Huelva", "Huesca", "Islas Baleares", "Ja�n",
			"Le�n", "L�rida", "Lugo", "Madrid", "M�laga", "Murcia", "Navarra", "Orense", "Palencia", "Las Palmas",
			"Pontevedra", "La Rioja", "Salamanca", "Segovia", "Sevilla", "Soria", "Tarragona", "Santa Cruz de Tenerife",
			"Teruel", "Toledo", "Valencia", "Valladolid", "Vizcaya", "Zamora", "Zaragoza" };
	String[] gentilicios =
	{ "No ha elegido ninguna opci�n", "Alav�s/Alavesa o Babazorro/rra", "Albacete�o/�a o Albacetense", "Alicantino/na",
			"Almeriense, Urcitano/na", "Asturiano/na", "Abulense, Avil�s/esa",
			"Pacense, Badajocense, Badajoce�o/�a", "Barcelon�s/esa, Barcinonense", "Burgal�s/esa", "Cacere�o/�a",
			"Gaditano/na", "C�ntabro/a", "Castellonense", "Ciudadreale�o/�a", "Cordob�s/esa", "Coru��s", "Conquense",
			"Gerundense, Giron�s/esa", "Granadino/na", "Guadalajar�o/�a, Caracense, Arriacense", "Guipuzcoano/na",
			"Onubense", "Oscense", "Balear", "Jaen�s/esa, Jaenero/ro, Jienense, Giennense", "Leon�s/esa", "Leridano",
			"Lucense", "Madrile�o/�a", "Malague�o/�a", "Murciano/na", "Navarro/rra", "Orensano/na", "Palentino/na",
			"Palmense", "Pontevedr�s/esa", "Riojano/a", "Salamanquino/na", "Segoviano/na", "Sevillano/na, Hispalense",
			"Soriano/na", "Tarracconense/a", "Santacrucero/ra", "Turolense", "Toledano/na", "Valenciano/na",
			"Pucelano/na", "Vizca�no/na", "Zamorano/na", "Zaragozano/na" };
	TextField txtGentilicio = new TextField(30);

	public Ejercicio5()
	{
		ventana.setLayout(new FlowLayout());
		for (String provincia : provincias)
		{
			choProvincias.add(provincia);
		}
		ventana.add(choProvincias);
		ventana.add(txtGentilicio);
		// A�adir el Listener a la ventana
		ventana.addWindowListener(this);
		choProvincias.addItemListener(this);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setSize(300, 100);
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new Ejercicio5();
	}

	public void itemStateChanged(ItemEvent e)
	{
		int posicion = 0;
		for (String provincia : provincias)
		{
			if (provincia.equals(e.getItem()))
			{
				txtGentilicio.setText(gentilicios[posicion]);
			}
			posicion++;
		}
	}

	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}

	public void windowActivated(WindowEvent we)
	{}

	public void windowClosed(WindowEvent we)
	{}

	public void windowDeactivated(WindowEvent we)
	{}

	public void windowDeiconified(WindowEvent we)
	{}

	public void windowIconified(WindowEvent we)
	{}

	public void windowOpened(WindowEvent we)
	{}
}
