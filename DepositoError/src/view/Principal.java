package view;

import exceptions.ContaException;
import model.Conta;

public class Principal {

	 public static void main(String[] args) throws ContaException {
	        Conta minhaConta = new Conta();
	        minhaConta.setSaldo(1000);
	        minhaConta.setLimite(500);

	        float valorSaque = 2000;
	        minhaConta.saca(valorSaque);
	        
	        System.out.println("Saque realizado com sucesso. Novo saldo: " + minhaConta.getSaldo());          
	 }
}
