package banco;

public class ContaBancaria {
	private double saldo;
	private String agencia;
	private String numero;
	private Cliente cliente;
			
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String agencia, 
			String numero) {
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public ContaBancaria(String agencia, 
			String numero, Cliente cliente) {
		this(agencia, numero);
		this.cliente = cliente;
	}

	public String exibeSaldo() {
		return String.format("Saldo: R$ %.2f", this.saldo);
	}
	
	// método auxiliar para verificar se não é possivel realizar o saque
	private boolean isAutorizado(double valor) {
		if (this.saldo >= valor) {
			return true;
		}
		return false;
	}

	public boolean sacar(double valor) {
		if (isAutorizado(valor)) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor,
				ContaBancaria destino) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}

	public String info() {
		String retorno = String.format("%s%n<<Cliente>>%n%s", this.exibeSaldo(), this.cliente.info());
		return retorno;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

}