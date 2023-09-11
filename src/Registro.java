import java.util.HashMap;
import java.util.Scanner;

public class Registro {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        HashMap<String, Persona> personas = new HashMap<>();
	        int n;

	        System.out.print("Ingrese el número de personas a registrar: ");
	        n = scanner.nextInt();
	        scanner.nextLine();// Leer la línea completa de texto

	        for (int i = 0; i < n; i++) {
	            System.out.println("Persona #" + (i + 1));

	            System.out.print("Nombre: ");
	            String nombre = scanner.nextLine(); // Leer la línea completa de texto

	            System.out.print("Documento: ");
	            String documento = scanner.nextLine();// Leer la línea completa de texto

	            System.out.print("Edad: ");
	            int edad = scanner.nextInt();
	            scanner.nextLine(); // Leer la línea completa de texto

	            System.out.print("Profesión: ");
	            String profesion = scanner.nextLine();

	            personas.put(documento, new Persona(nombre, edad, profesion));
	        }

	        int cantidadPersonasIngresadas = personas.size();
	        long mayoresDeEdad = personas.values().stream().filter(persona -> persona.getEdad() >= 18).count();
	        long menoresDeEdad = cantidadPersonasIngresadas - mayoresDeEdad;

	        System.out.println("\nInformación de las personas registradas:");
	        System.out.println("Total personas registradas: " + n);
	        System.out.println("Cantidad de personas ingresadas: " + cantidadPersonasIngresadas);
	        System.out.println("Cantidad de personas mayores de edad: " + mayoresDeEdad);
	        System.out.println("Cantidad de personas menores de edad: " + menoresDeEdad);
	    }
	}

	class Persona {
	    private String nombre;
	    private int edad;
	    private String profesion;

	    public Persona(String nombre, int edad, String profesion) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.profesion = profesion;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public String getProfesion() {
	        return profesion;
	    }
	}



