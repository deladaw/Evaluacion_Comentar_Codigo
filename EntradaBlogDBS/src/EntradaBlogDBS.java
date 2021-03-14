

	
	/**
	 * Clase para manejar las entradas de un blog.
	 * @since La clase se creó el 14/03/2021 
	 * @author Daniela Bru Soriano.
	 * @version Esta es la versión 2.3
	 */
	public class EntradaBlogDBS {
		/**
		 * separador es el carácter que separa ENTRADA del nombre del autor.
		 */
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		
		
		/**
		 * Constructor de la clase que recibe los siguientes parámetros:
		 * @param id es el número identificativo del autor
		 * @param autor es el nombre del autor
		 * @param texto es el texto que le pone 
		 * @throws IllegalArgumentException Lanza una excepción si el número de la entrada es negativo.
		 */
		public EntradaBlogDBS(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		/**
		 *Método toString para mostar todos los datos del objeto.
		 */
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		
		/**
		 * Método que devuelve el número de la entrada.
		 * @return id
		 */
		public int getId(){
			return this.id;
		}
		
		/**
		 * Método que devuelve el texto completo de la entrada.
		 * @return texto
		 */
		public String getTexto(){
			return this.texto;
		}
		
		/**
		 * Devuelve el nombre del autor de la entrada en mayúsculas.
		 * @return autor.toUpperCase();
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * Método que devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor.
		 * @return autor
		 */
		public String devuelveAutor(){
			return this.autor;
		}
		
				/**
				 * Método MAIN
				 * @param args No tiene porqué tener argumentos.
				 */
				public static void main(String[] args) {
	                
			EntradaBlogDBS e1 = new EntradaBlogDBS (5," Daniela Bru Soriano","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}
	}
	
	

