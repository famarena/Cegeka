package com.shoppinglist;



public class Articolo {

	private int id;
	private String nome;
	private int quantita;
	
	public Articolo() {
		
	}
	
	public Articolo(String nome, int quantita) {
		
		this.nome = nome;
		this.quantita = quantita;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
  
}
	



	
	

