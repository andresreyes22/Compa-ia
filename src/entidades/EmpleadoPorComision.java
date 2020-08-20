package entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 * Clase hija que se encarga de crear empleado asalariado
 * @author juan, mateo, oscar
 *
 */
@Entity
@DiscriminatorValue("empleadoPorComision")
public class EmpleadoPorComision extends Empleado {
	
	private double salarioSemanal;
	private double ventasRealizadas;
	
	
	public EmpleadoPorComision() {
		
	}
	
	public EmpleadoPorComision(int identificador, String nombre, double salarioSemanal,double ventasRealizadas) {
		
		super(identificador, nombre);
		this.salarioSemanal=salarioSemanal;
		this.ventasRealizadas=ventasRealizadas;
	}
	
	/**
	 * Calcula el pago semanal del empleado
	 * @return	el pago semanal
	 */
	@Override
	public double calcularSalarioSemanal(){
		
		double salario;
		
		salario = salarioSemanal + (ventasRealizadas*0.05);
		
		return salario;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	public double getVentasRealizadas() {
		return ventasRealizadas;
	}

	public void setVentasRealizadas(double ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}
	
	
}
