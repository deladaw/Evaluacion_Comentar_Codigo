

	
	/**
	 * Clase para manejar las entradas de un blog.
	 * @since La clase se cre� el 14/03/2021 
	 * @author Daniela Bru Soriano.
	 * @version Esta es la versi�n 2.3
	 */
	public class EntradaBlogDBS {
		/**
		 * separador es el car�cter que separa ENTRADA del nombre del autor.
		 */
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		
		
		/**
		 * Constructor de la clase que recibe los siguientes par�metros:
		 * @param id es el n�mero identificativo del autor
		 * @param autor es el nombre del autor
		 * @param texto es el texto que le pone 
		 * @throws IllegalArgumentException Lanza una excepci�n si el n�mero de la entrada es negativo.
		 */
		public EntradaBlogDBS(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		/**
		 *M�todo toString para mostar todos los datos del objeto.
		 */
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * M�todo que devuelve el n�mero de la entrada.
		 * @return id
		 */
		public int getId(){
			return this.id;
		}
		
		/**
		 * M�todo que devuelve el texto completo de la entrada.
		 * @return texto
		 */
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 * Devuelve el nombre del autor de la entrada en may�sculas.
		 * @return autor.toUpperCase();
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * M�todo que devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor.
		 * @return autor
		 */
		public String devuelveAutor(){
			return this.autor;
		}
		
				/**
				 * M�todo MAIN
				 * @param args No tiene porqu� tener argumentos.
				 */
				public static void main(String[] args) {
	                
			EntradaBlogDBS e1 = new EntradaBlogDBS (5," Daniela Bru Soriano","�ltimas noticias, est� disponible BixBy 2.0");
			System.out.println(e1);
		}
	}
	
	

