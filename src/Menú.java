import java.util.Scanner;

public class Menú {
	
	Profesor profesores;
	
	Profesor[] vectorProfesor;
	boolean claseLLena;
	
	public Menú() {
			profesores = new Profesor(null, null, null, null, null, claseLLena, 0, 0);
			this.vectorProfesor = new Profesor[2];
		}

	public static void main(String[] args) {
		Menú menu = new Menú();
		
		menu.pedirDatosProfesor();
		
		System.out.println("Bienvenido al software de gestión de centros educativos.");
		System.out.println("--------------------------------------------");
		System.out.println("Por favor, escoja una de las opciones válidas:");
		System.out.println("--------------------------------------------");
		System.out.println("1. Menú de profesores.");
		System.out.println("2. Menú de asignaturas.");
		System.out.println("3. Menú de alumnos.");
		System.out.println("4. Salir del gestor.");
		System.out.println("--------------------------------------------");
		System.out.println("OPCION:");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				menu.opcionProfesor();
			case 2:
				
			case 4:
                System.out.println("Gracias por usar nuestro software.");
        		System.out.println("CERRANDO...");
                break;
            default:
                System.out.println("Opción no válida");
        }
		
	}
		
		
		public void opcionProfesor() {
			System.out.println("--------------------------------------------");
			System.out.println("PROFESORES:");
			System.out.println("--------------------------------------------");
			System.out.println("1. Añadir profesor.");
			System.out.println("2. Consultar datos profesor.");
			System.out.println("3. Volver.");
			System.out.println("--------------------------------------------");
			System.out.println("OPCION:");
			Scanner sc = new Scanner(System.in);
			int opcion1 = sc.nextInt();
			
			switch(opcion1) {
			case 1:
				profesores.añadirProfesor();
			case 2:
				consultarProfesor();
			}
			
			
			

		
		
		
	}
		public void consultarProfesor() {
			System.out.println("--------------------------------------------");
			System.out.println("Listado de profesores:");
			System.out.println("--------------------------------------------");
			System.out.println(profesores.nombre + " " + profesores.apellido);
			System.out.println("Escoger profesor (0: Volver al menú anterior):");
			System.out.println("OPCION:");
			
			Scanner sc3 = new Scanner(System.in);
			int elegirProf = sc3.nextInt();
			
			switch(elegirProf) {
			case 0:
				Menú menu = new Menú();
				menu.opcionProfesor();
			case 1:
				profesores.profesor1();
			}
		}
		
		public void pedirDatosProfesor() {
				Profesor nuevoProfesor = new Profesor(null, null, null, null, null, claseLLena, 0, 0);
				profesores.getNombre();
				profesores.getApellido();
				profesores.getEmail();
				profesores.getTlfProfesor();
				
				int huecoVectorProfesores = espacioVector();
				if(huecoVectorProfesores<vectorProfesor.length) {
					this.vectorProfesor[huecoVectorProfesores] = nuevoProfesor;
				}
				else {
					claseLLena = true;
				}
		}
		
		private int espacioVector() {
			int huecoVector = 0;
			for (int i = 0;i<vectorProfesor.length;i++) {
				if(vectorProfesor[i]== null) {
					huecoVector = i;
					break;
				}
			}
			return huecoVector;
		}
		
		
		
		
		
	

}
