package cl1_valverde_quiroz_tony_samir;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ServiceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		
		Empleado em = new Empleado();
		em.setApellido_paterno("mates");
		em.setApellido_materno("chilca");
		em.setNombres("juan");
		em.setNro_hijos(1);
		em.setSueldo(2000.00);
		em.setFecha_nacimiento(LocalDate.parse("1999-02-15"));
		
		// Insertar
		manager.persist(em);
		
		tx.commit();
		
		
		List<Empleado> lista = manager.createQuery("from Emp", Empleado.class).getResultList();
		for (Empleado empleado : lista) {
			System.out.println(empleado);
		}

	}

}
