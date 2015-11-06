/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Clase Abstracta ListaAbstracta: Esta clase implementa la Interface listaEnlazada
 *e implementa el metodo size 
 **/

public abstract class ListaAbstracta<E> implements ListaEnlazada<E> {
	/**
	 * Esta variable lleva el conteo de los elementos 
	 * creados en la lista
	 */
	protected int count;
	
	/**
	 * Constructor de la clase Abstracta
	 * Inicializa en 0 el contador de elementos 
	 */
	public ListaAbstracta(){
		count=0;
	}
	
	/**
	 * Metodo size: Retorna el tamano de la lista 
	 * @return
	 */
	public int size(){
		return count;
	}
}
