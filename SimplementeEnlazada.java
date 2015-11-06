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
public class SimplementeEnlazada<E> extends ListaAbstracta<E>{
	private Nodo<E> cabeza;
	 
	public SimplementeEnlazada(){
		super();
		cabeza = null;
	}

	public void addFirst(E value, E label) {
		// TODO Auto-generated method stub
		cabeza = new Nodo<E>(value, cabeza, label);
		count++;
	}

	
	public ArrayList<E> removeFirst() {
		// TODO Auto-generated method stub
		Nodo<E> temporal = cabeza;
		cabeza = cabeza.next();
		count--;
		return temporal.valor();
	}

	public ArrayList<E> removeLast() {
		// TODO Auto-generated method stub
		Nodo<E> apuntador = cabeza;
		Nodo<E> previo = null;
//		Assert.pre(cabeza != null, "Lista no empezada");
		while(apuntador.next() != null){
			previo = apuntador;
			apuntador = apuntador.next();
		}
		if(previo==null)
			cabeza = null;
		else
			previo.setValor(null);
		count--;
		return apuntador.valor();
	}

	public void addLast(E value, E label) {
		// TODO Auto-generated method stub
		Nodo<E> temporal = new Nodo<E>(value,null, label);
		if(cabeza != null){
			Nodo<E> apuntador = cabeza;
			while(apuntador.next() != null){
				apuntador = apuntador.next();
			}
			apuntador.setNext(temporal);
		}
		else
			cabeza = temporal;
		count++;
		
	}

	public ArrayList<E> getFirst() {
		// TODO Auto-generated method stub
		return cabeza.valor();
	}

	public ArrayList<E> getLast() {
		// TODO Auto-generated method stub
		Nodo<E> apuntador = cabeza;
		while(apuntador.next()!= null){
			apuntador = apuntador.next();
		}
		return apuntador.valor();
	}

	public boolean contains(E value) {
		// TODO Auto-generated method stub
		Nodo<E> apuntador = cabeza;
		while(apuntador != null && !apuntador.valor().equals(value)){
			apuntador = apuntador.next();
		}
		return apuntador != null;
	}
	
}
