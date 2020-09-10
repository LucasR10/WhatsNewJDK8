package br.com.java8.model;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Usuario {

	private String nome;
	private Integer pontos;
	private Boolean moderador;

	public Usuario(String nome, int pontos, boolean moderador) {
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = moderador;
	}
	
	public Usuario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public boolean isModerador() {
		return moderador;
	}

	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
	
	public void tornaModerador() {
		this.moderador = true;
	}
	
	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", pontos=" + pontos + ", moderador=" + moderador + "]";
	}
	
		
    public static List<Usuario> usuarios = Arrays.asList(new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 5625, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 4545, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 4545, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 45588, true),
				new Usuario(UUID.randomUUID().toString(), 15, false),
				new Usuario(UUID.randomUUID().toString(), 4885, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 15454, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 14545, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 15455, true),
				new Usuario(UUID.randomUUID().toString(), 15, false),
				new Usuario(UUID.randomUUID().toString(), 14545, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 4145, true),
				new Usuario(UUID.randomUUID().toString(), 15, false),
				new Usuario(UUID.randomUUID().toString(), 4415, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 5625, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 4545, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 4545, false),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 45588, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 4588, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 15454, false),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 14545, false),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 15455,false),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 14545, true),
				new Usuario(UUID.randomUUID().toString(), 15, true),
				new Usuario(UUID.randomUUID().toString(), 45, true));
	
	

}


