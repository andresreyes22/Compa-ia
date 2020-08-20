package entidades;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import control.Compañia;
import control.EmpleadoException;
import persistencia.ListaEmpleados;

/**
 * Clase que se encarga de realizar dos pruebas de test
 * 1. Adicionar empleados de cada tipo
 * 2. Verificar la nomina semanal 
 * @author Juan, Mateo, Oscar
 * @version 1
 */
class EmpleadoAdicionarTest {

	Compañia compañia = new Compañia(new ListaEmpleados());
	boolean adicionAsalariado;
	boolean adicionPorHoras;
	boolean adicionPorComision;
	
	/**
	 * Se adiciona 3 empleados de cada tipo (asalariado,porHoras,porComision:
	 * @throws EmpleadoException
	 */
	@Test
	void testAdicionarBarcosValidos() throws EmpleadoException {
		
		adicionAsalariado = compañia.adicionarEmpleado(01, "Juan",'A', 250000, 0, 0, 0);
		adicionPorHoras = compañia.adicionarEmpleado(02, "Mateo",'H', 0, 4500, 48, 0);
		adicionPorComision = compañia.adicionarEmpleado(03, "Oscar",'C', 250000, 0, 0, 300000);
		assertTrue(adicionAsalariado);
		assertTrue(adicionPorHoras);
		assertTrue(adicionPorComision);
	}
	
	/**
	 * Se calcula la nomina semanal con 3 empleados:
	 * @throws EmpleadoException 
	 */
	@Test
	void testCalcularValido() throws EmpleadoException {
		double nominaEsperada = 931000;
		double nomina = compañia.calcularNominaSemanal();
		assertEquals(nominaEsperada,nomina);
	}
	
	
	
}
