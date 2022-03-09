package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
		private List<String>listaParole;
		
		
		
	public Parole() {
		 listaParole= new LinkedList <String>();//se creo con arraylist noto che ci mette più tempo
		
	}
	
	public void addParola(String p) {
		//Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
	
		listaParole.add(p);
		
	
		
	}
	
	public List<String> getElenco() {
		
		LinkedList<String>paroleOrd=new LinkedList<String>(listaParole);
		Collections.sort(paroleOrd,String.CASE_INSENSITIVE_ORDER );	
		return paroleOrd;
	}
	
	public void reset() {
		// TODO
		listaParole.clear();
	
	}
	
	public void cancella(String s) {
		listaParole.remove(s);
			
	}

}
