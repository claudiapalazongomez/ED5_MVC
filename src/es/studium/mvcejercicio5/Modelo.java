package es.studium.mvcejercicio5;

public class Modelo
{
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

		public String getGentilicio(int indice)
		{
			return gentilicios[indice];
		}
}
