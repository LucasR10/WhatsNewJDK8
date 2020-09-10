package br.com.java8.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.java8.model.Pessoa;
import br.com.java8.model.Pessoa1;
import br.com.java8.model.Pessoa2;
import br.com.java8.model.Pessoa3;
import br.com.java8.model.Pessoa4;
import br.com.java8.model.Pessoa5;

public class ProcessarInumerosDadosStrem {

	static List<Pessoa> pessoasData = new ArrayList<>(); 
	
	@BeforeAll
	public static void initData() {
		pessoasData.addAll(Pessoa.populaPessoas());
		pessoasData.addAll(Pessoa1.populaPessoas());
		pessoasData.addAll(Pessoa2.populaPessoas());
		pessoasData.addAll(Pessoa3.populaPessoas());
		pessoasData.addAll(Pessoa4.populaPessoas());
		pessoasData.addAll(Pessoa5.populaPessoas());
		System.out.println("Dados Processados..");
	}


	private int total;
	
	@Test 
	public void processadDadosStrem() {
		Predicate<? super Pessoa> filtraPorNome = p -> p.getId().equals("p6");
		long totalDePessoasComNomeP6 = pessoasData.parallelStream().filter( filtraPorNome ).map(Pessoa::getIdade).map(Integer::new).count();
	   System.out.println(totalDePessoasComNomeP6);
	  
	}


	@Test
	public void forNormal() {
		BinaryOperator<Integer> opercao = (n1, n2) ->  n1 + n2;
		 Integer result = pessoasData.parallelStream().map(Pessoa::getIdade).reduce(opercao).get();
		System.out.println(result );
		
		
	}

}
