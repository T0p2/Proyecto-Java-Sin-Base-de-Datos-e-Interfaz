

public class Main {

	public static void main(String[] args) {
	
	Catalogo catalogo = new Catalogo();
	
	

	
	catalogo.agregarPeli("ClubDeLaPelea", "Brad pitt", "accion", 300, false, "Excelente");
	catalogo.agregarPeli("El hoyo", "Brad pitt", "accion", 300, false, "Buena");
	catalogo.agregarPeli("Batman", "Jim", "accion", 250, true, "Muy buena");
	catalogo.agregarCd("Tan Bionica", "Chano", "pop", 5, false, "Muy bueno");
	catalogo.agregarPeli("Barbie", "James", "aventura y infantil", 100, false, "Mala");	
	catalogo.agregarCd("A-ha", "Jhonn", "pop", 5, false, "Bueno");
	catalogo.agregarCd("Muse", "Brad pitt", "indie", 9, true, "Excelente");
	catalogo.agregarCd("Altamar", "Jhonn", "pop", 5, false, "Malo");
	
	
	
	System.out.println("Todos los temas: \n");
	catalogo.listarCd();
	System.out.println("Todas las peliculas: \n");
	catalogo.listarPeli();
	System.out.println("Mis temas: \n");
	catalogo.listarMisCds();
	System.out.println("Mis peliculas: \n");
	catalogo.listarMisDvds();
	catalogo.listarMenosMinCds(40);
	catalogo.listarMenosMinPeli(140);
	catalogo.eliminar("Batman");
	catalogo.modifcarAtrib("Barbie","Buena", 36);
	catalogo.listarXDir("Brad pitt");
	catalogo.listarXInterprete("Jhonn");
	
	
	System.out.println("Cantidad de peliculas: " + catalogo.getCantTotDvd() + "\n");
	System.out.println("Cantidad de mis peliculas: " + catalogo.getCantMisDvd() + "\n");
	System.out.println("Cantidad de temas: " + catalogo.getCantTotCd() + "\n");
	System.out.println("Cantidad de mis temas: " + catalogo.getCantMisCd() + "\n");
	
	

	}

}
