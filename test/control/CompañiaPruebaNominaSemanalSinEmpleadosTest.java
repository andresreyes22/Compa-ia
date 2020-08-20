package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import persistencia.ListaEmpleados;

class CompañiaPruebaNominaSemanalSinEmpleadosTest {

	
	@Test
	void testCalcularNominaSinEmpleados() {
		Compañia compañia = new Compañia(new ListaEmpleados());
		double nominaEsperada= 0;
		double nomina = compañia.calcularNominaSemanal();
		assertEquals(nominaEsperada,nomina);
	}
}
