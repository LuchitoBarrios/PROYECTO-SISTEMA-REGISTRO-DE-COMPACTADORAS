
public class ListLinked <T> implements TDAList<T>{
	private Node<T> first;
	private int count;
	//
	public ListLinked() {
		this.first = null;
		this.count = 0;
	}
	public Node<T> getFirst() {
		return first;
	}
	public void setFirst(Node<T> first) {
		this.first = first;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public boolean isEmptyList() {
		return this.first == null;
	};
	public int length() {
		return this.count;
	};
	public void destroyList() {
		while(this.first !=null)
			this.first = this.first.getNext();
		this.count=0;
	};
	public int search(T x) {
		Node<T> aux=this.first;
		for(int i=0;aux!=null;aux=aux.getNext())
			if(aux.getData().equals(x))
				return i;
		return -1;
	};
	public void insertLast(T x) {
		if(this.isEmptyList())
			this.insertFirst(x);
		else {
			Node<T> lastNode=getLastNode();
			lastNode.setNext(new Node<T>(x));
			this.count++;
		}
	};
	//DEVOLVER EL ÚLTIMO NODO PARA EL INSERTLAST
	//PreCondition: List is not empty
	private Node<T> getLastNode(){
		Node<T> aux= this.first;
		while(aux.getNext()!=null)
			aux=aux.getNext();
		return aux;
	}
	//
	public void insertFirst(T x) {
		/*Node<T> nuevo= new Node<T>(x);
		nuevo.setNext(this.first);
		this.first=nuevo;*/
		//
		this.first = new Node<T>(x,this.first);
		this.count++;
	};
	public void remove(T x) {
		Node<T> aux = this.first;
		Node<T> antecesor=null; //nodo antecesor
		//asignar el primer nodo al siguiente
		if(aux!=null && aux.getData().equals(x)) {
			this.first=aux.getNext();
			return;//terminar ejecución
		}
		//asignar nodo auxiliar al antecesor mientras la data no sea igual y mientras el auxiliar no sea nulo
		while (aux!=null && aux.getData()!=x) {
			antecesor=aux;
			aux = aux.getNext();
			this.count--;//contador baja de acuerdo a elemenos eliminados
		}
		//terminar ejecución si el auxiliar es nulo
		if(aux==null) {
			return;//terminar ejecución
		}
		//definir el nodo siguiente del antecesor como el nodo siguiente del auxiliar (aplicando el remove)
		antecesor.setNext(aux.getNext());
		
	};
	public String toString() {
		String str="";
		Node<T> aux = this.first;
		for(int i=0;aux!=null;aux=aux.getNext(),i++)
			str+= "["+i+"] = "+aux.getData()+"\n"; 
		return str;
	};
}
