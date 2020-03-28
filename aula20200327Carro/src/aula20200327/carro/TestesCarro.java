package aula20200327.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesCarro {

	@Test
	void testes() {
		Carro car = new Carro();
		
		car.abastecer(1.00);
		car.ligar();
		assertTrue(car.isLigado());
		car.acelerar();
		assertFalse(car.isLigado());
		
		car.acelerar();
		car.acelerar();
		car.acelerar();
		assertTrue(car.isLigado());
		
		Carro car2 = new Carro();
		
		assertTrue( car2.isDesligado());
		 car2.abastecer(2.00);
		 car2.ligar();
		assertTrue( car2.isLigado());
		
		 car2.acelerar();
		 car2.acelerar();
		assertTrue( car2.isLigado());
		
		 car2.desligar();
		assertTrue( car2.isDesligado());
	
		
	}


}
