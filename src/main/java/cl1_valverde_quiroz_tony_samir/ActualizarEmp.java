package cl1_valverde_quiroz_tony_samir;

import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ActualizarEmp {

	public static void main(String[] args) {
	
		  EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
	        EntityManager manager = factory.createEntityManager();

	        EntityTransaction tx = manager.getTransaction();

	        tx.begin();

	        int empleadoId = 4;
	        Empleado empleadoModificado = new Empleado();
	        empleadoModificado.setId(Long.valueOf(empleadoId)); 
	        empleadoModificado.setApellido_paterno("Perez");
	        empleadoModificado.setApellido_materno("Santillan");
	        empleadoModificado.setNombres("Andrea");
	        empleadoModificado.setNro_hijos(2);
	        empleadoModificado.setSueldo(1500.00);
	        empleadoModificado.setFecha_nacimiento(LocalDate.parse("1990-02-15"));

	        // Actualizar el empleado
	        manager.merge(empleadoModificado);
	        System.out.println("Empleado actualizado con éxito.");

	        tx.commit();

	       
	    }
	

	

}
