package entidades;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Clase padre que se encarga de crear empleados
 * @author juan, mateo, oscar
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Empleado {
	
	@Id
	private int identificador;
	private String nombre;
	
	
	public Empleado() {
		
	}
	
	public Empleado(int identificador, String nombre) {
		
		this.identificador=identificador;
		this.nombre=nombre;
	}

	/**
	 * Calcula el pago semanal del empleado
	 * @return	el pago semanal
	 */
	public abstract double calcularSalarioSemanal();	
	

	public int getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
