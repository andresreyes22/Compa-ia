package entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Clase hija que se encarga de crear empleado asalariado
 * @author juan, mateo, oscar
 *
 */
@Entity
@DiscriminatorValue("empleadoAsalariado")
public class EmpleadoAsalariado extends Empleado {

	private double salarioSemanal;
	
	public EmpleadoAsalariado() {
		
	}
	
	public EmpleadoAsalariado(int identificador, String nombre, double salarioSemanal) {
		
		super(identificador, nombre);
		this.salarioSemanal=salarioSemanal;
	}
	
	
	/**
	 * Calcula el pago semanal del empleado
	 * @return	el pago semanal
	 */
	@Override
	public double calcularSalarioSemanal(){
		
		return salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	
	
	
	
}
