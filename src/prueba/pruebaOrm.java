package prueba;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import control.Compañia;
import entidades.EmpleadoAsalariado;
import entidades.EmpleadoPorComision;
import entidades.EmpleadoPorHoras;
import entidades.Empleado;
public class pruebaOrm {
/**
 * prueba del orm
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CompañiaEmpleados");
				EntityManager gestorBD = fabrica.createEntityManager();
				gestorBD.getTransaction().begin();
				Empleado empleado = new EmpleadoAsalariado(95,"juan",45.000);
				Empleado empleado1 = new EmpleadoAsalariado(96,"Mateo",85.000);
				gestorBD.persist(empleado);
				gestorBD.persist(empleado1);
				gestorBD.getTransaction().commit();
				Empleado consultaEmpleado = gestorBD.find(Empleado.class, 20);
				System.out.println(consultaEmpleado.calcularSalarioSemanal());
				gestorBD.close();
				
				

	}

}
