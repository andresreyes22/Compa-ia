package entidades;

/**
 * Permite crear un empleado de acuerdo con el tipo seleccionado
 * Corresponde al patron de diseño "FACTORY"
 * @version 1.0
 */
public class FabricaEmpleados {
	
	/**
	 * Crea un nuevo empleado a partir de los parametros recibidos.
	 * @param identificador identifica a un empleado
	 * @param nombre el nombre de un empleado
	 * @param tipo identifica que tipo de empleado es (Asalariado, porHoras, porComision)
	 * @param salarioSemanal Salario que se gana el empleado en la semana
	 * @param valorHora Valor de la hora de pago
	 * @param horasTrabajadas Cantidad de horas que trabajo el empleado
	 * @param ventasRealizadas El valor de las ventas realizadas en la semana
	 * 
	 * @return	el objeto Empleado (Asalariado o porHoras o porComison) creado,
	 */
	public static Empleado crearEmpleado(int identificador, String nombre, char tipo, double salarioSemanal, 
									  double valorHora, int horasTrabajadas, double ventasRealizadas) {
		switch (tipo){
			case 'a':
			case 'A': 	return new EmpleadoAsalariado(identificador,nombre,salarioSemanal);
			case 'h':
			case 'H': 	return new EmpleadoPorHoras(identificador,nombre,valorHora,horasTrabajadas);
			case 'c':
			case 'C': 	return new EmpleadoPorComision(identificador,nombre,salarioSemanal,ventasRealizadas);
		}
		
		return null;
	}


}
