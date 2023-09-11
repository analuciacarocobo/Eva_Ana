import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NóminaP1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        HashMap<String, Double> descuentos = new HashMap<>();
	        
	        System.out.print("Ingrese la cantidad de empleados: ");
	        int numEmpleados = scanner.nextInt();
	        
	        for (int i = 0; i < numEmpleados; i++) {
	            System.out.print("Ingrese el nombre del empleado #" + (i + 1) + ": ");
	            String nombre = scanner.next();
	            
	            System.out.print("Ingrese el salario del empleado #" + (i + 1) + ": ");
	            double salario = scanner.nextDouble();
	            
	            System.out.print("Ingrese el estrato social del empleado #" + (i + 1) + ": ");
	            int estrato = scanner.nextInt();
	            
	            double porcentajeDescuento = 0.0;
	            
	            if (estrato == 1 || estrato == 2) {
	                porcentajeDescuento = 0.02; // 2%
	            } else if (estrato == 3 || estrato == 4) {
	                porcentajeDescuento = 0.04; // 4%
	            } else if (estrato == 5) {
	                porcentajeDescuento = 0.08; // 8%
	            } else if (estrato == 6) {
	                porcentajeDescuento = 0.10; // 10%
	            } else {
	                System.out.println("Estrato no válido, no se realizará ningún descuento.");
	            }
	            
	            double descuento = salario * porcentajeDescuento;
	            descuentos.put(nombre, descuento);
	        }
	        
	        System.out.println("\nDescuentos realizados:");
	        for (Map.Entry<String, Double> entry : descuentos.entrySet()) { //permite recorrer cada par clave-valor 
	            String nombreEmpleado = entry.getKey();//obtener el valor asociado
	            double descuentoEmpleado = entry.getValue(); //obtener el valor asociado
	            System.out.println(nombreEmpleado + ": $" + descuentoEmpleado);
	        }
	    }
	}

	   