package br.com.ProjetoIntroducaoSpring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.ProjetoIntroducaoSpring.entites.Usuario;
import br.com.ProjetoIntroducaoSpring.repositories.UsuarioReposiroty;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UsuarioReposiroty usuarioReposiroty;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 

		usuarioReposiroty.saveAll(Arrays.asList(u1,u2));
	}
	
	
	
}
