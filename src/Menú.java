import java.util.Scanner;

public class Menú {
	
	Profesor profesores;
	
	Profesor[] vectorProfesor;
	boolean claseLLena;
	
	public Menú() {
			profesores = new Profesor();
			this.vectorProfesor = new Profesor[2];
		}
	
	Profesor nuevoProfesor = new Profesor();		

	

	public static void main(String[] args) {
		Menú menu = new Menú();
		
		
		
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
				
			case 3:
				
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
				pedirDatosProfesor();
			case 2:
				consultarProfesor();
			case 3:
				main(null);
			}
		}
			
			public void opcionAlumno() {
				System.out.println("--------------------------------------------");
				System.out.println("ALUMNOS:");
				System.out.println("--------------------------------------------");
				System.out.println("1. Añadir alumno.");
				System.out.println("2. Consultar alumnos.");
				System.out.println("3. Volver.");
				System.out.println("--------------------------------------------");
				System.out.println("OPCION:");
				Scanner sc = new Scanner(System.in);
				int opcion1 = sc.nextInt();
				
				switch(opcion1) {
				case 1:
					pedirDatosProfesor();
				case 2:
					consultarProfesor();
				case 3:
					main(null);
				}
			
			
			

		
		
		
	}
			public String añadirProfesor() {

				vectorProfesor[0] = nuevoProfesor;
				System.out.println("Introduzca el nombre del profesor (MAX 30 caracteres):");
				Scanner nom = new Scanner(System.in);
				nuevoProfesor.nombre = nom.next();
				System.out.println("Nombre: " + nuevoProfesor.nombre);
				System.out.println("Introduzca el primer apellido del profesor (MAX 40 caracteres): ");
				Scanner ape = new Scanner(System.in);
				nuevoProfesor.apellido = ape.next();
				System.out.println("Apellido: " + nuevoProfesor.apellido);
				System.out.println("Introduzca el segundo apellido del profesor (opcional):");
				Scanner ape2 = new Scanner(System.in);	
				nuevoProfesor.apellido2 = ape.next();
				System.out.println("Segundo apellido: " + nuevoProfesor.apellido2);
				Scanner em = new Scanner(System.in);
				System.out.println("Introduzca el email del profesor (cadena@profesor.es):");
				nuevoProfesor.email = em.next();
				System.out.println("Email: " + nuevoProfesor.email);
				System.out.println("Introduzca el teléfono del profesor ([6,7 o 9] y 8 números):");
				nuevoProfesor.telefono = em.next();
				System.out.println("Telefono: " + nuevoProfesor.telefono);
				return nuevoProfesor.nombre;
				}
				
				
			
			
			
		public void consultarProfesor() {
			System.out.println("--------------------------------------------");
			System.out.println("Listado de profesores:");
			System.out.println("--------------------------------------------");

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
				
				profesores.getNombre();
				profesores.getApellido();
				profesores.getEmail();
				profesores.getTlfProfesor();
				espacioVector();
				int huecoVectorProfesores = espacioVector();
				
				if(huecoVectorProfesores<vectorProfesor.length) {
					this.vectorProfesor[huecoVectorProfesores] = nuevoProfesor;
		
					vectorProfesor[0] = nuevoProfesor;
					
					System.out.println("Introduzca el nombre del profesor (MAX 30 caracteres):");
					Scanner nom = new Scanner(System.in);
					nuevoProfesor.nombre = nom.next();
					System.out.println("Nombre: " + nuevoProfesor.nombre);
					System.out.println("Introduzca el primer apellido del profesor (MAX 40 caracteres): ");
					Scanner ape = new Scanner(System.in);
					nuevoProfesor.apellido = ape.next();
					System.out.println("Apellido: " + nuevoProfesor.apellido);
					System.out.println("Introduzca el segundo apellido del profesor (opcional):");
					Scanner ape2 = new Scanner(System.in);	
					nuevoProfesor.apellido2 = ape.next();
					System.out.println("Segundo apellido: " + nuevoProfesor.apellido2);
					Scanner em = new Scanner(System.in);
					System.out.println("Introduzca el email del profesor (cadena@profesor.es):");
					nuevoProfesor.email = em.next();
					System.out.println("Email: " + nuevoProfesor.email);
					System.out.println("Introduzca el teléfono del profesor ([6,7 o 9] y 8 números):");
					nuevoProfesor.telefono = em.next();
					System.out.println("Telefono: " + nuevoProfesor.telefono);
					return;
					
				}
				else {
					claseLLena = true;
					System.out.println("La clase está llena");
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
