package teste;

import carros.Carro;

public class TestaArray {
	public static void main(String[] args) {
		
		// cria um array de Carro com 4 posições
		Carro[] carros = new Carro[4];
		carros[0] = new Carro();
		carros[0].setMarca("Ford");
		carros[0].setModelo("Ka");
		
		// cria um objeto Carro
		Carro c1 = new Carro();
		
		// aponta a posição 1 do vetor para c1
		carros[1] = c1;
		carros[1].setMarca("VW");
		carros[1].setModelo("Golf");
		carros[2] = new Carro();
		carros[3] = new Carro();
		
		// percorrendo array de objetos
		for (Carro c : carros) {
			System.out.println(c != null ? c.getModelo() : "carro nÃ£o inicializado");
			
			// isso alterara todos os modelos para Onix
			c.setModelo("Onix");;
		}
		System.out.println(carros[0].getModelo());
		System.out.println(carros[1].getModelo());
		System.out.println(carros[2].getModelo());
		System.out.println(carros[3].getModelo());
		
	}
}