package teste;

import banco.Cliente;
import banco.ContaBancaria;

public class TestaConta {
	public static void main(String[] args) {
		
		// criar uma conta
		ContaBancaria conta = new ContaBancaria();
		
		// criar um cliente
		Cliente c = new Cliente("João","111.111.111-22");
		
		// associar o cliente Ã  conta
		conta.setCliente(c);
		
		// exibe o nome do cliente
		System.out.println(conta.getCliente().getNome());
		
		// exibe informação da conta
		System.out.println(conta.info());
		
		// depositar na conta
		conta.depositar(1000);
		
		// exibe saldo da conta depois do deposito
		System.out.println(conta.exibeSaldo());
		
		// sacar 500
		conta.sacar(500);
		
		// exibe o saldo da conta depois do saque
		System.out.println(conta.exibeSaldo());
	}
}