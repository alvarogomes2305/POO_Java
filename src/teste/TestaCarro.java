package teste;

import carros.Carro;

public class TestaCarro {
	public static void main(String[] args) {
		
		// instancia um carro
		Carro c1 = new Carro(40, "", "Uno", "Fiat");
		
		// chamando os métodos
		c1.buzinar();
		c1.abastecer(1);
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		// instancia outro carro
		Carro c2 = new Carro(55);
		c2.setMarca("VW");
		c2.setModelo("Fusca");
		c2.acelerar();
	}
}