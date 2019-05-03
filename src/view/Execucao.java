package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PessoaFisica pf = new PessoaFisica();	
	
	pf.setNome("Clayton Silva França");
	pf.setCpf(800274);
	pf.setEndereco("Rua Theodoro da Fonseca");
	pf.setBairro("Vila Rosa");
	pf.setEstado("São Paulo");
	pf.setTelefone(2053-9956);
	pf.setCep(2546848);
	
	PessoaJuridica pj = new PessoaJuridica();

	pj.setNome("Soft and Hard");
	pj.setCnpj(850996);
	pj.setEndereco("Rua Theodoro de Santos");
	pj.setBairro("Itaquera");
	pj.setEstado("São Paulo");
	pj.setTelefone(4520-3758);
	pj.setCep(2468759);
	
	System.out.println("\nCadastro de Pessoa Física: ");
	
	System.out.println("\nNome: " + pf.getNome());
	System.out.println("\nCpf: " + pf.getCpf());
	System.out.println("\nEndereco: " + pf.getEndereco());
	System.out.println("\nBairro: " + pf.getBairro());
	System.out.println("\nEstado: " + pf.getEstado ());
	System.out.println("\nTelefone: " + pf.getTelefone ());
	System.out.println("\nCep: " + pf.getCep());
	
	System.out.println("\n\nCadastro de Pessoa Juridca: ");
	
	System.out.println("\nNome: " + pj.getNome());
	System.out.println("\nCnpj: " + pj.getCnpj());
	System.out.println("\nEndereco: " + pj.getEndereco());
	System.out.println("\nBairro: " + pj.getBairro());
	System.out.println("\nEstado: " + pj.getEstado ());
	System.out.println("\nTelefone: " + pj.getTelefone ());
	System.out.println("\nCep: " + pj.getCep());
	
	}

}
