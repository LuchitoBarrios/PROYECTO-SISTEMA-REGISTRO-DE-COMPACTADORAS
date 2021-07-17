

public class OrderListLinked<T extends Comparable<T>> extends ListLinked <T>{
	public void insertOrder(T item) {
		if(this.getFirst()==null) {
			this.setFirst(new Node<T>(item,this.getFirst()));
			this.setCount(this.getCount()+1);	
		}else{
		Node<T> nuevo=new Node<T>(item);
		Node<T> aux=this.getFirst();	
		while(aux.getNext()!=null && aux.getNext().getData().compareTo(nuevo.getData())<0)	
			{aux=aux.getNext();}	
		nuevo.setNext(aux.getNext());
		aux.setNext(nuevo);
		this.setCount(this.getCount()+1);
		if(this.getCount()>=2) {
			if(aux.getData().compareTo(aux.getNext().getData())>0)
			{T temp=aux.getData();
			aux.setData(aux.getNext().getData());
			aux.getNext().setData(temp);}}	
		}}
	//public boolean searchOrder(T item)
	public boolean searchOrder(T item) {
		Node<T> aux = this.getFirst();
		while(aux!=null && aux.getData().compareTo(item)<0) 
			aux=aux.getNext();
		if(aux!=null) 
			return aux.getData().equals(item);
		return false;
	}
	//public void remove(T item);
	public void removeOrder(T item) {
		Node<T> aux = this.getFirst();
		Node<T> antecesor=null; //nodo antecesor
		//asignar el primer nodo al siguiente
		if(aux!=null && aux.getData().equals(item)) {
			this.setFirst(aux.getNext());
			return;//terminar ejecución
		}
		//asignar nodo auxiliar al antecesor mientras la data no sea igual y mientras el auxiliar no sea nulo
		while (aux!=null && aux.getData()!=item) {
			antecesor=aux;
			aux = aux.getNext();
			this.setCount(this.getCount()-1);//contador baja de acuerdo a elemenos eliminados
		}
		//terminar ejecución si el auxiliar es nulo
		if(aux==null) {
			return;//terminar ejecución
		}
		//definir el nodo siguiente del antecesor como el nodo siguiente del auxiliar (aplicando el remove)
		antecesor.setNext(aux.getNext());
	}
	//
	public String toString() {
		String str="";
		Node<T> aux = this.getFirst();
		for(int i=0;aux!=null;aux=aux.getNext(),i++)
			str+= "["+i+"] = "+aux.getData()+"\n"; 
		return str;
	};
}
