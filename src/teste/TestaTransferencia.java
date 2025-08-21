package teste;


import banco.ContaBancaria;

public class TestaTransferencia {
	public static void main(String[] args) {
		
		// cria as contas
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		// deposita
		c1.depositar(1000);
		c2.depositar(500);		
		
		// exibe o saldo
		System.out.println(c1.exibeSaldo());
		System.out.println(c2.exibeSaldo());
		
		// transfere
		c1.transferir(500, c2);
		
		// exibe o saldo
		System.out.println(c1.exibeSaldo());
		System.out.println(c2.exibeSaldo());
	}
}