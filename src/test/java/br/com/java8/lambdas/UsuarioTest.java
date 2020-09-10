package br.com.java8.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import br.com.java8.model.Usuario;
import br.com.java8.model.Validador;

public class UsuarioTest {
    private List<Usuario> usuarios = Usuario.usuarios;
	
	@Test
	@Disabled
	void printUsuarios() {
		usuarios.forEach(System.out::println);
	}

	@Test
	@Disabled
	void consumerTest() {
		usuarios.forEach(Usuario::tornaModerador);
	}

	@Test
	@Disabled
	void testaTread() {

		Thread t = new Thread(() -> {
			for (int i = 0; i < 1000000; i++) {
				System.out.println(" valoe  " + i);

			}
		});
		t.run();
	}

	@Test @Disabled
	void intefaceFuncional() {
		Validador<String> validador = v -> { return v.equals("sim"); };
	}
	
	@Test @Disabled
	void andThen() {
         Consumer<Usuario> print = usuario -> System.out.println("********* Proximo ************** ");
         Consumer<Usuario> usuario = user -> System.out.println(" Imprimir Nome :" + user.getNome());
         usuarios.forEach(usuario.andThen( print ) );
	}
	
	
	@Test @Disabled
	void predicadoTe() {
		Predicate<Usuario> predicado = new Predicate<Usuario>() {
			@Override
			public boolean test(Usuario t) {
				return !t.isModerador();
			}
		};
		
		usuarios.removeIf( u -> u.isModerador());
		usuarios.forEach(System.out::println);
	}
	
	
	@Test
	void comparador() {
		usuarios.sort( (u1, u2) -> u1.getNome().compareTo( u2.getNome() ) );
		usuarios.forEach(System.out::println);
	}
	
	
	
}
