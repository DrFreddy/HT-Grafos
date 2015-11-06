import java.util.ArrayList;

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
public class Nodo<E> {
	private ArrayList<E> valores;
	private E label;		//Nodo al que se hace referencia 
	private E valor;		//Valor de la etiqueta del vertice entre los nodos 
	private Nodo<E> next;	//Referencia al siguiente nodo de la lista 
	
	/**
	 * Constructor de la clase Nodo. Permite crear un nuevo objeto de Nodo
	 * con los parametros indicados 
	 * @param valor Valor de la etiqueta entre los nodos 
	 * @param next	Referencia al siguiente nodo de la lista 
	 * @param label	Nodo al cual hace referencia el nodo 
	 */
	public Nodo(E valor, Nodo<E> next, E label){
		valores = new ArrayList<E>();
		this.valor=valor;
		this.next=next;
		this.label=label;
	}
	
	/**
	 * Constructos de la case Nodo sin referencia a otro objeto
	 * @param valor Valor de la etiqueta entre los nodos 
	 * @param label Nodo al cual hace referencia el nodo 
	 */
	public Nodo(E valor,E label){
		this(valor, null, label);
	}
	
	/**
	 * Retorna la referencia al nodo siguiente en la lista 
	 * @return Objeto Nodo siguiente en la lista 
	 */
	public Nodo<E> next(){
		return next;
	}
	
	/**
	 * Establece una nueva referencia para este nodo 
	 * @param next Nuevo nodo a hacer referencia 
	 */
	public void setNext(Nodo<E> next){
		this.next=next;
	}
	
	/**
	 * Retorna el valor de la etiqueta entre los Nodos 
	 * @return el valor de la etiqueta 
	 */
	public ArrayList<E> valor(){
		valores.add(label);
		valores.add(valor);
		return valores;
	}
	
	public void setValor(E valor){
		this.valor = valor;
	}
	
	public E label(){
		return label;
	}
	
	public void setLabel(E label){
		this.label = label; 
	}
}
