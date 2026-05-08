package Type_Casting;

public class Conversiones {
	// Métodos de conversión numérica
	
		  public static void decimalAentero() {
			  System.out.println(" ----------- Decimal a Entero ----------- ");
			  
		        double numero = 10.55;

		        System.out.println("\nNúmero decimal: " + numero);
		        
		        int entero = (int) numero;

		        System.out.println("\nConversión a entero: " + entero);
		    }
		  
		  public static void enteroAdecimal() {
			  System.out.println("\n ----------- Entero a Decimal ----------- ");
			  
			  int entero = 30;
			  
			  System.out.println("\nNúmero entero: " + entero);
			  
			  double decimal = entero;
			  
			  System.out.println("\nConversión a decimal: " + decimal );
		  }
		  
		  
		// Métodos de conversión entre números y cadenas
		  public static void enteroAcadena() {
			  
			        System.out.println("\n ----------- Entero a cadena ----------- ");
			 
				    int num = 10;
				    
				    System.out.println("\nEl valor del entero: " + num);

				    String cadena = String.valueOf(num);
				    
				    System.out.println("\nConversión a cadena: " + cadena);
				
		  }
		  
		  public static void cadenaAEntero() {

			    System.out.println("\n ----------- Cadena a entero ----------- ");  
			  
			    String texto = "25";

			    int numero = Integer.parseInt(texto);

			    System.out.println("\nCadena original: " + texto);
			    System.out.println("\nConvertido a entero: " + numero);
			}
		  
	}

