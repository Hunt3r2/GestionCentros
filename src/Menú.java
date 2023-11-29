import java.util.Scanner;

public class Menú {
	
	Profesor profesores;
	
	Profesor[] vectorProfesor;
	
	public Menú() {
			profesores = new Profesor();
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
				System.out.println("Introduzca el nombre del profesor (MAX 30 caracteres):");
				profesores.añadirProfesor();
			case 2:
				consultarProfesor();
			}
			
			
			

		
		
		
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
				profesores.getNombreAlumno();
				profesores.getApellidoAlumno();
				profesores.getEmail();
				Profesor nuevoProfesor = new Profesor();
				profesores.getNombre1();
				this.vectorProfesor[0] = nuevoProfesor;
				
		}
		
		public void añadirProfesor() {
			Scanner sc2 = new Scanner(System.in);
			this.vectorProfesor[0] = sc2.next();
			System.out.println("Nombre: " + nombre);
			System.out.println("Introduzca el primer apellido del profesor (MAX 40 caracteres): ");
			Scanner ape = new Scanner(System.in);
			this.apellido = ape.next();
			System.out.println("Apellido: " + apellido);
			return nombre;
		}
		
		
		
	

}
