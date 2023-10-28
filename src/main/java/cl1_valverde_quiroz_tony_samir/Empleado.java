package cl1_valverde_quiroz_tony_samir;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity (name = "Emp")
@Table(name = "Empleado")


public class Empleado {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String apellido_paterno;
	    private String apellido_materno;
	    private String nombres;
	    private Integer nro_hijos;
	    private Double sueldo;
	    private LocalDate fecha_nacimiento;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getApellido_paterno() {
			return apellido_paterno;
		}
		public void setApellido_paterno(String apellido_paterno) {
			this.apellido_paterno = apellido_paterno;
		}
		public String getApellido_materno() {
			return apellido_materno;
		}
		public void setApellido_materno(String apellido_materno) {
			this.apellido_materno = apellido_materno;
		}
		public String getNombres() {
			return nombres;
		}
		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		public Integer getNro_hijos() {
			return nro_hijos;
		}
		public void setNro_hijos(Integer nro_hijos) {
			this.nro_hijos = nro_hijos;
		}
		public Double getSueldo() {
			return sueldo;
		}
		public void setSueldo(Double sueldo) {
			this.sueldo = sueldo;
		}
		public LocalDate getFecha_nacimiento() {
			return fecha_nacimiento;
		}
		public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
			this.fecha_nacimiento = fecha_nacimiento;
		}
	    
	    
		@Override
		public String toString() {
			return "Empleado [id=" + id + ", apellidos =" + apellido_paterno + apellido_materno+ "nombres=" + nombres+" ]";
		}
		public void setFecha_nacimiento(int i) {
			// TODO Auto-generated method stub
			
		}

}
