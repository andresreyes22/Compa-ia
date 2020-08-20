package persistencia;

import java.util.List;

import entidades.Empleado;


public interface RepositorioEmpleados {

	
	/**
	 * Adiciona un empleado al repositorio para hacerlo persistente
	 * @param empleado el objeto empleado que se desea guardar
	 * @return un valor booleano indicando si se pudo guardar en el repositorio o no
	 */
	public abstract boolean adicionarEmpleado(Empleado empleado);
	
	/**
	 * Consulta toda la lista de los empleados que hay registrados
	 * @return	la lista (List) con los empleados.
	 */
	public List<Empleado> consultarEmpleados();
	
	/**
	 * Busca un empleado en la base de datos a partir de su identificador
	 * @param identificador	El numero con el que se desea buscar
	 * @return	el objeto empleado con el identificador dado, o null si no se encuentra.
	 */
	public abstract Empleado buscarEmpleado(int identificador);
	
}

