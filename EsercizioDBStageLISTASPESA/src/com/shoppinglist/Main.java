package com.shoppinglist;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import util.ListaConnection;



public class Main {
	
	public static void main(String[] args) throws Exception {	
		
		ListaConnection lc = new ListaConnection();
		Articolo a = new Articolo();
		
		ArrayList<Articolo> list = lc.visTutti();

	
			
		
			
			
		
	}
	
} 
	 

