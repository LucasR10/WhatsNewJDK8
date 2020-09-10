package br.com.java8.lambdas.oracle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import br.com.java8.model.Pessoa;

public class StreamOracle {

	List<Pessoa> pessoas = Pessoa.populaPessoas();
	
	@Test @SuppressWarnings("unused")
	@Disabled
	public void criandoStream() {
		IntStream numerosAtream = Arrays.stream(new int [] {1, 2, 3, 4, 5});
		Stream<Integer> numerosFromStream = Stream.of(1, 2, 3, 4, 5);
	}

	
	@Test @Disabled
	public void opercoesEmStrem(){
		 Predicate<Pessoa> filtraPessoaPorNacionalidade = p -> p.getNacionalidade().equalsIgnoreCase("Brasil");
		 Predicate<Pessoa> terceiraCondicao = p -> p.getNome().contains("junior");
		 filtraPessoaPorNacionalidade.and( p -> p.getIdade() == 222 ).and(terceiraCondicao);
		 
		 pessoas.stream().filter( filtraPessoaPorNacionalidade ).forEach(System.out::println);
		
		 long quantidade = pessoas.stream().filter(filtraPessoaPorNacionalidade).count();
		 
		 
		 System.out.println(quantidade);
				
	}
	
	
	@Test  @Disabled
	public void operacaoMap() {
		List<Pessoa> toList = pessoas.stream().filter( p -> p.getNome().length() > 10 ).collect(Collectors.toList());
		toList.forEach( System.out::println);
	}
	
	@Test
	public void opercaoMap() {
		Predicate<String> predicate = nome -> nome.contentEquals("Neymar");
		List<String> noems = pessoas.stream().map(Pessoa::getNome).filter(predicate).collect(Collectors.toList());
		noems.forEach(System.out::println);
		
		long idades = pessoas.stream().map(Pessoa::getIdade).count();
		System.out.println(idades);
		
		Set<Pessoa> pessoasSet = pessoas.stream().collect(Collectors.toSet());
		pessoasSet.forEach( System.out::println );
		
		Map<String, String> pesssoaMpa = pessoas.stream().collect( Collectors.toMap(Pessoa::getId, Pessoa::getNome) );
	}
}
