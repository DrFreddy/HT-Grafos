import java.util.ArrayList;
import java.util.Vector;

/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 10
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Nodo: Esta clase permite crear objetos que almacenan un valor determinado y una 
 *referencia de otro objeto de la mimsa clase con los cuales es posible crear una lista enlazada.
 * @param <E>: Este parámetro permite establecer el tipo de dato con el que se desea trabajar el
 * Nodo
 **/
public class Grafo<E> {
	private Vector<String> ciudades;
	private Vector<SimplementeEnlazada<E>> listas;
	
	public Grafo(){
		ciudades = new Vector<String>();
		listas = new Vector<SimplementeEnlazada<E>>();
	}
	
	public Vector<String> getCiudades(){
		return ciudades;
	}
	
	public Vector<SimplementeEnlazada<E>> getListas(){
		return listas;
	}
	
	public ArrayList<E> removeVertice(E ciudad, E label){
		int index = ciudades.indexOf(ciudad);
		return listas.get(index).remove(label);
	}
	
	public void addNodo(String ciudad){
		ciudades.add(ciudad);
		listas.add(new SimplementeEnlazada<E>());
	}
	
	public void addVertice(int from,E to, E value){
		listas.get(from).addLast(value,to);
	}
}
