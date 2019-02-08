package almacenes;

/*
 * Implementar un almacén de enteros mediante una tabla de huecos
 * se supone que no puede contener el valor 0 ya que indica posiciones libre.
 */
public class Almacen1 {

	static private final int LIBRE = 0;
	// Array con los valores almacenados
	private int tvalores[];
	private int valoresAlmacenados = 0;
	
	// Constructores sin parámetros creo una tabla de 10 elementos 
	public Almacen1(){
		this.tvalores= new int [10] ;  // Llamo al constructor con parámetros
	}

	// Constructor donde se fija tamaño máximo del Almacén
	public Almacen1( int tamaño){
		tvalores = new int [tamaño];
		init();
	}
	
	// Pone todas las posiciones a LIBRES
	public void init (){
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = Almacen1.LIBRE;
		}
		valoresAlmacenados = 0;
	}
	
	// Muestra una cadena con los valores de la tabla
	public String toString (){
		String cadena="";
		for (int i=0;i<this.tvalores.length;i++) {
			cadena=cadena+ this.tvalores[i];
		}
		return cadena;
	}
	
	// Devuelve el números de posiciones libres
	public int numPosicionesLibres(){
		int cont=0;
		for (int i = 0; i < tvalores.length; i++) {
			if (this.tvalores[i]== LIBRE) {
				cont++;
			}
		}
		return cont;
	}
	
	// Devuelve el número de posiones ocupadas
	public int numPosicionesOcupadas(){
		int cont=0;
		for (int i = 0; i < tvalores.length; i++) {
			if (this.tvalores[i]!= LIBRE) {
				cont++;
			}
		}
		return cont;
	}
	
	// Devuelve verdadero o falso si está almacenado el valor en la tabla
	public boolean estaValor ( int num){
		boolean alm=false;
		for (int i = 0; i < tvalores.length; i++) {
			if (this.tvalores[i]== num) {
				alm= true;
				break;
				}
		}
		return alm;
		

	}
	
	// Almacena el valor el la tabla, devuelve false sin no puede almacenarlo
	public boolean ponValor (int num){
		boolean alm=false;
		for (int i=0; i<this.tvalores.length;i++) {
			if(this.tvalores[i]==LIBRE) {
				this.tvalores[i]=num;
				alm=true;
				break;
			}
		}
		
	return alm;
	}
	
	// Elimina el elemento de la tabla, si no esta devuelve false
	public boolean sacarValor (int num){
		boolean alm=false;
		for (int i=0; i<this.tvalores.length;i++) {
			if(this.tvalores[i]==num) {
				this.tvalores[i]=LIBRE;
				alm=true;
			}
		}
	return alm;
	}
	
	
      // Indica si el almacén esta lleno
	public boolean estaLleno (){	
		boolean alm=false;
		int cont=0;
		for (int i=0; i<this.tvalores.length;i++) {
			if(this.tvalores[i]!=LIBRE) {
				cont++;
				}
		}
		if (cont==this.tvalores.length) {
			alm=true;
		}
	return alm;
	}
}



