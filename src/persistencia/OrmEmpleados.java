package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entidades.*;

public class OrmEmpleados implements RepositorioEmpleados {
	
	private EntityManagerFactory fabrica;
	
	@Override
	public boolean adicionarEmpleado(Empleado empleado) {
		try	{
			EntityManager gestorBd = fabrica.createEntityManager();
			gestorBd.getTransaction().begin();	
			gestorBd.persist(empleado);
			gestorBd.getTransaction().commit();
			gestorBd.close();
		}
		catch (Exception errorCrear)	{
			return false;
		}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> consultarEmpleados() {
		EntityManager gestorBd = fabrica.createEntityManager();
		Query query = gestorBd.createQuery("select b from Empleado b");
		List<Empleado> empleados = query.getResultList();
		gestorBd.close();
		return empleados;
	}
	
	
	@Override
	public Empleado buscarEmpleado(int identificador) {
		EntityManager gestorBd = fabrica.createEntityManager();
		Empleado barco = gestorBd.find(Empleado.class, identificador);
		gestorBd.close();
		return barco;
	}
	

}
