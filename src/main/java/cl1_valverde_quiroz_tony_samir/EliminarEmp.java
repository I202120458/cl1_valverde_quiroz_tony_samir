package cl1_valverde_quiroz_tony_samir;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EliminarEmp {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		
		
		 int empleadoId = 2;
		
        Empleado empleadoAEliminar = manager.find(Empleado.class, empleadoId);

        if (empleadoAEliminar != null) {
            
            System.out.println("Información del empleado a eliminar:");
            System.out.println(empleadoAEliminar);

          
            System.out.print("¿Desea eliminar este empleado? (S/N): ");
            Scanner scanner = new Scanner(System.in);
            String confirmacion = scanner.nextLine();

            if ("S".equalsIgnoreCase(confirmacion)) {
             
                manager.remove(empleadoAEliminar);
                System.out.println("Empleado eliminado con éxito.");
            } else {
                System.out.println("Eliminación cancelada.");
            }
        } else {
            System.out.println("Empleado no encontrado.");
        }

        tx.commit();

      
    }
}