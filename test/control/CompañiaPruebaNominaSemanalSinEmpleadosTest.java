package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import persistencia.ListaEmpleados;

class CompaņiaPruebaNominaSemanalSinEmpleadosTest {

	
	@Test
	void testCalcularNominaSinEmpleados() {
		Compaņia compaņia = new Compaņia(new ListaEmpleados());
		double nominaEsperada= 0;
		double nomina = compaņia.calcularNominaSemanal();
		assertEquals(nominaEsperada,nomina);
	}
}
