package lexico;
 
	/**
	 * Integrantes: Aleska Andrades C.I 25.430.231
             Edgar Torrealba C.I 22.956.501
             Rafael Colmenares C.I 23.951.654
             
Aqui un pequeño analizador lexico 
en el cual se pueden ver varias funciones
	 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class codigolexico {
	
	public static void main(String[] args) {
		
		String patron = ("(while)|([a-zA-Z]+)|([>|<|=]+)|([0-9]+)|([(|)]+)|([{|}]+)|(;)" );
		String texto = "while (x=0) < [y=0] {=}; ";
		
		Pattern p = Pattern.compile(patron);
		Matcher matcher = p.matcher(texto);
		
	
		while (matcher.find()){
			
			String tokenTipo1 = matcher.group(1);
			if (tokenTipo1 != null){
				System.out.println("Palabra reservada:  " + tokenTipo1);
				
			}
			
			String tokenTipo2 = matcher.group(2);
			if (tokenTipo2 != null){
				System.out.println("Variables:  " + tokenTipo2);
		    }
			
			String tokenTipo3 = matcher.group(3);
			if (tokenTipo3 != null){
				System.out.println("Operador:  " + tokenTipo3);
				
	        }
	
			String tokenTipo4 = matcher.group(4);
			if (tokenTipo4 != null){
				System.out.println("Numero:  " + tokenTipo4);
			
            }
			
			String tokenTipo5 = matcher.group(5);
			if (tokenTipo5 != null){
				System.out.println("Parentesis:  " + tokenTipo5);
				
	        }
			
			String tokenTipo6 = matcher.group(6);
			if (tokenTipo6 != null){
				System.out.println("Llaves:  " + tokenTipo6);
				
	        }
			
			String tokenTipo7 = matcher.group(7);
			if (tokenTipo7 != null){
				System.out.println("Simbolo:  " + tokenTipo7);
				
			}
		}
	}
}
	