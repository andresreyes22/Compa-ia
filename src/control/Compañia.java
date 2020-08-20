package control;

import java.util.List;
import entidades.*;

import persistencia.OrmEmpleados;
import persistencia.RepositorioEmpleados;


/**
 * Clase que se encargar de adicionar un empleado, buscar un empleado
 * y calcular la nomina semanal de los empleados
 * @author juan,mateo,oscar
 * @version 1
 */
public class Compañia {

	private RepositorioEmpleados repositorioEmpleados;

	public Compañia() {
		repositorioEmpleados = new OrmEmpleados();
	}

	public Compañia(RepositorioEmpleados repositorioEmpleados) {
		this.repositorioEmpleados = repositorioEmpleados;
	}

	/**
	 * Calcula la nomina semanal de todos los empleados
	 * @return	la nomina total de los empleados
	 */
	public double calcularNominaSemanal() {
		List<Empleado> empleados = repositorioEmpleados.consultarEmpleados();
		double valorNominaTotal = 0;
		for (Empleado empleado : empleados) {
			valorNominaTotal += empleado.calcularSalarioSemanal();
		}
		return valorNominaTotal;
	}	


	/**
	 * Adiciona un empleado a la compañia
	 * @param identificador identifica a un empleado
	 * @param nombre el nombre de un empleado
	 * @param tipo identifica que tipo de empleado es (Asalariado, porHoras, porComision)
	 * @param salarioSemanal Salario que se gana el empleado en la semana
	 * @param valorHora Valor de la hora de pago
	 * @param horasTrabajadas Cantidad de horas que trabajo el empleado
	 * @param ventasRealizadas El valor de las ventas realizadas en la semana
	 * @return
	 * @throws EmpleadoException
	 */
	public boolean adicionarEmpleado(int identificador, String nombre, char tipo, double salarioSemanal, 
			double valorHora, int horasTrabajadas, double ventasRealizadas) throws EmpleadoException {

		Empleado empleadoBuscado = buscarEmpleado(identificador);

		if (empleadoBuscado == null) {

			Empleado empleadoNuevo = FabricaEmpleados.crearEmpleado(identificador,nombre,tipo,salarioSemanal, 
					valorHora,horasTrabajadas,ventasRealizadas);
			return repositorioEmpleados.adicionarEmpleado(empleadoNuevo);
		}

		return false;
	}

	/**
	 * Busca un empleado entre los que estan registrados, por su identificacion
	 * @return el objeto empleado con la identificacion dada, o null si no se encuentra
	 */
	public Empleado buscarEmpleado(int identificador) {
		return repositorioEmpleados.buscarEmpleado(identificador);
	}


}


