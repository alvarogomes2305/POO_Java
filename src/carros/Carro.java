package carros;

public class Carro {
	
	// atributos
	private String chassi;
	private String modelo;
	private String marca;
	private int tamanhoTanque;
	private int qtdCombustivel;
	
	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// construtores
	/***
	 * Construção de um objeto carro informando o tamanho do tanque
	 */
	public Carro(int tamanhoTanque) {
		this.tamanhoTanque = tamanhoTanque;
	}
	
	/***
	 * Construção de um objeto carro com tanque de 50 litros
	 */
	public Carro() {
		this(50);
	}
	
	public Carro(int tamanhoTanque, 
			String modelo, 
			String marca) {
		this(tamanhoTanque);		
		this.modelo = modelo;
		this.marca = marca;
	}
	
	public Carro(int tamanhoTanque, 
			String chassi, 
			String modelo, 
			String marca) {		
		this(tamanhoTanque, modelo, marca);
		this.chassi = chassi;
	}

	// métodos
	public void buzinar() {
		System.out.println("Bi bi bi");		
	}

	public void acelerar() {
		System.out.println("O carro " + this.marca + " - " + this.modelo + " estÃ¡:");
		if (this.qtdCombustivel > 0) {
			System.out.println("Acelerando");
			qtdCombustivel--;
		} else {
			System.out.println("Tanque vazio: " + this.qtdCombustivel);
		}
	}

	public void frear() {
		System.out.println("Freando");
	}

	public void abastecer(int litros) {
		if (qtdCombustivel + litros > tamanhoTanque) {
			System.out.println("NÃ£o cabe no tanque");
		} else {
			qtdCombustivel += litros;
		}
	}
}