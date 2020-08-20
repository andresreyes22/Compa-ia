package entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 * Clase hija que se encarga de crear empleado asalariado
 * @author juan, mateo, oscar
 *
 */
@Entity
@DiscriminatorValue("empleadoPorHoras")
public class EmpleadoPorHoras extends Empleado {
	
	private double valorHora;
	private int horasTrabajadas;
	
	public EmpleadoPorHoras() {
		
	}
	
	public EmpleadoPorHoras(int identificador, String nombre, double valorHora, int horasTrabajadas) {
		
		super(identificador, nombre);
		this.valorHora=valorHora;
		this.horasTrabajadas=horasTrabajadas;
	}
	
	/**
	 * Calcula el pago semanal del empleado
	 * @return	el pago semanal
	 */
	@Override
	public double calcularSalarioSemanal(){
		
		double salario;
		double bono = 200000;
		
		if(horasTrabajadas>40) {
			salario = bono + (valorHora*horasTrabajadas);
		}
		else {
			salario = (valorHora*horasTrabajadas);
		}
		return salario;
	}
	
	
	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}


}
