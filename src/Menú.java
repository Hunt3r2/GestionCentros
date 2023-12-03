import java.util.Scanner;

public class Menú {
	
	Profesor profesores;
	Alumno Alumnos;
	
	
	Profesor[] vectorProfesor;
	Alumno[] vectorAlumno;
	boolean claseLLena;
	
	
	public Menú() {
			profesores = new Profesor(null, null, null, null, null, null, null);
			this.vectorProfesor = new Profesor[4];
			Alumnos = new Alumno(null, null, null, null, null, null, null, null);
			this.vectorAlumno = new Alumno[2];
			
		}
	
	Profesor nuevoProfesor = new Profesor(null, null, null, null, null, null, null);		
	Alumno nuevoAlumno = new Alumno(null, null, null, null, null, null, null, null);

	public static void main(String[] args) {
		Menú menu;
		menu = new Menú();
		boolean salir = false;
	do {	
		
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
				break;
			case 2:
				break;
			case 3:
				menu.opcionAlumno();
				break;
			case 4:
                System.out.println("Gracias por usar nuestro software.");
        		System.out.println("CERRANDO...");
        		salir = true;
                break;
            default:
                System.out.println("Opción no válida");
        }
	} while(!salir);
		
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
					añadirAlumno();
				case 2:
					consultarProfesor();
				case 3:
					main(null);
				}
			
			
			

		
		
		
	}
			public String añadirProfesor() {


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
				Scanner id = new Scanner(System.in);
				System.out.println("Introduzca el ID del profesor (cadena@profesor.es):");
				nuevoProfesor.email = id.next();
				Scanner dni = new Scanner(System.in);
				System.out.println("Introduzca el dni del profesor (cadena@profesor.es):");
				nuevoProfesor.email = dni.next();
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
				espacioVector();
				profesores.getNombre();
				profesores.getApellido();
				profesores.getEmail();
				profesores.getTlfProfesor();
				int huecoVectorProfesores = espacioVector();
				
				if(huecoVectorProfesores<vectorProfesor.length) {
					this.vectorProfesor[huecoVectorProfesores] = nuevoProfesor;
		
					
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
					nuevoProfesor.apellido2 = ape2.next();
					System.out.println("Segundo apellido: " + nuevoProfesor.apellido2);
					Scanner em = new Scanner(System.in);
					System.out.println("Introduzca el email del profesor (cadena@profesor.es):");
					nuevoProfesor.email = em.next();
					System.out.println("Email: " + nuevoProfesor.email);
					Scanner tlf = new Scanner(System.in);
					System.out.println("Introduzca el teléfono del profesor ([6,7 o 9] y 8 números):");
					nuevoProfesor.telefono = tlf.next();
					System.out.println("Telefono: " + nuevoProfesor.telefono);
					return;
					
				}
				else {
					claseLLena = true;
					System.out.println("La clase está llena");
				}
		}
		
		public void añadirAlumno() {
			Alumnos.getNombre();
			Alumnos.getApellido();
			Alumnos.getEmail();
			Alumnos.getTlfAlumno();
			espacioVector();
			int huecoVectorAlumno = espacioVector();
			
			if(huecoVectorAlumno<vectorAlumno.length) {
				this.vectorAlumno[huecoVectorAlumno] = nuevoAlumno;
	

			
			
			System.out.println("Introduzca el nombre del alumno (MAX 30 caracteres):");
			Scanner nom = new Scanner(System.in);
			nuevoAlumno.nombre = nom.next();
			System.out.println("Nombre: " + nuevoAlumno.nombre);
			System.out.println("Introduzca el primer apellido del alumno (MAX 40 caracteres): ");
			Scanner ape = new Scanner(System.in);
			nuevoAlumno.apellido = ape.next();
			System.out.println("Apellido: " + nuevoAlumno.apellido);
			System.out.println("Introduzca el segundo apellido del alumno (opcional):");
			Scanner ape2 = new Scanner(System.in);	
			nuevoAlumno.apellido = ape.next();
			System.out.println("Segundo apellido: " + nuevoAlumno.apellido);
			Scanner em = new Scanner(System.in);
			System.out.println("Introduzca el email del alumno (cadena@alumno.es):");
			nuevoAlumno.email = em.next();
			System.out.println("Email: " + nuevoAlumno.email);
			System.out.println("Introduzca el teléfono del alumno ([6,7 o 9] y 8 números):");
			nuevoAlumno.email = em.next();
			System.out.println("Telefono: " + nuevoAlumno.email);
			}
		}
		
		private int espacioVector() {
			int huecoVector = 0;
			for (int i = 0;i<vectorProfesor.length;i++) {
				if(vectorProfesor[i]== null) {
					huecoVector = i;
					break;
				}
				else {
					System.out.println("La clase está llena");
				}
			}
			return huecoVector;
		}
		
		
		// para sacar los datos uso un bucle for con string format, tambien deberia hacer  
		
		
	

}
