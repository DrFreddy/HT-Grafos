import java.util.ArrayList;

/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Interface ListaEnlazada: Esta clase generica tieene unicamente los metodos 
 *a implementar en las clases que contendran las listas SimplementeEnlazada,
 *Doblemente Enlazada y Circular 
 **/

public interface ListaEnlazada<E>{
		/**
		 *Metodo Size: Retorna el tamano de la lista (elementos en la lista)
		 */
		public int size();
		/**
		 * Metodo AddFirst: Agrega un nuevo elelemento en la primera posicion de
		 * la lista. Recibe como parametro el valor a Ingresar a la lista.
		 * @param value
		 */
		public void addFirst(E value, E label);
		/**
		 * Metodo removeFirst: Elimina la direccion y el valor del elemento de la
		 * primera posicion de la lista. Retorna el valor que estaba almacenado.
		 * @return 
		 */
		public ArrayList<E> removeFirst();
		/**
		 * Metodo removeLast: Elimina la direccion y el valor almacenado en la 
		 * ultima posicion de la lista. Retorna el valor que estaba almacenado. 
		 * @return
		 */
		public ArrayList<E> removeLast();
		/**
		 * Metodo addLast: Agrega un nuevo elemento al final de la lista. Recibe
		 * como parametro el valor a ingresar en la lista 
		 * @param value
		 */
		public void addLast(E value, E label);
		/**
		 * Metodo getFirst: Retorna el vlaor del elemento en la primera posicion 
		 * de la lista. 
		 * @return
		 */
		public ArrayList<E> getFirst();
		/**
		 * Metodo contains: Permite conocer si un elemento se encuentra dentro de
		 * la lista. Recibe como parametro el valor que se quiere buscar en la lista
		 * y retorna True si se encontro y False si no se encontro.
		 * @param value
		 * @return
		 */
		public boolean contains (E value);
	}

