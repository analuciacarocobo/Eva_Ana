import java.util.Scanner;

public class Arreglos {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Ingrese el tamaño de los arreglos: ");
	        int tamaño = scanner.nextInt();

	        
	        int[] arreglo1 = new int[tamaño];
	        int[] arreglo2 = new int[tamaño];
	        int[] arregloResultante = new int[tamaño];

	        
	        System.out.println("Ingrese los elementos del primer arreglo:");
	        for (int i = 0; i < tamaño; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            arreglo1[i] = scanner.nextInt();
	        }

	       
	        System.out.println("Ingrese los elementos del segundo arreglo:");
	        for (int i = 0; i < tamaño; i++) {
	            System.out.print("Elemento " + (i + 1) + ": ");
	            arreglo2[i] = scanner.nextInt();
	        }

	        
	        for (int i = 0; i < tamaño; i++) {
	            arregloResultante[i] = arreglo1[i] + arreglo2[i];
	        }

	        // Mostrar los arreglos originales y el resultado
	        System.out.println("\nArreglo 1:");
	        mostrarArreglo(arreglo1);
	        
	        System.out.println("\nArreglo 2:");
	        mostrarArreglo(arreglo2);
	        
	        System.out.println("\nArreglo Resultante:");
	        mostrarArreglo(arregloResultante);
	    }

	    
	    public static void mostrarArreglo(int[] arreglo) {
	        for (int elemento : arreglo) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println();
	    }
	}


