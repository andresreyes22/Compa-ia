package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import persistencia.ListaEmpleados;

class Compa�iaPruebaNominaSemanalSinEmpleadosTest {

	
	@Test
	void testCalcularNominaSinEmpleados() {
		Compa�ia compa�ia = new Compa�ia(new ListaEmpleados());
		double nominaEsperada= 0;
		double nomina = compa�ia.calcularNominaSemanal();
		assertEquals(nominaEsperada,nomina);
	}
}
