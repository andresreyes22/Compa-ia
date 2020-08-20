package persistencia;

import java.util.ArrayList;
import java.util.List;
import entidades.*;


public class ListaEmpleados implements RepositorioEmpleados{

	
	private List<Empleado> empleados;

	public ListaEmpleados() {
		empleados = new ArrayList<Empleado>();
	}
	
	
	@Override
	public boolean adicionarEmpleado(Empleado empleado) {
		if (empleado == null) {
			return false;
		}
		return empleados.add(empleado);
	}
	
	@Override
	public List<Empleado> consultarEmpleados() {
		return empleados;
	}
	
	@Override
	public Empleado buscarEmpleado(int identificador) {
		for (Empleado empleado : empleados) {
			if (empleado.getIdentificador()==identificador) {
				return empleado;
			}
		}
		return null;
	}


	
	
}

