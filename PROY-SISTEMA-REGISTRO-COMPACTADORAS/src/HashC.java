import java.util.ArrayList;


public class HashC<E,TicketPesaje extends Comparable<E>> {
	
	protected class Element<E>{
		int mark;
		Register<E> reg;
		public Element(int mark, Register<E> reg) {
			this.mark = mark;
			this.reg = reg;
		}
	}
	protected ArrayList<Element> table;
	protected int m;
	
	public HashC (int n) {
		this.m=n; 
		this.table= new ArrayList<Element>(m);
		for (int i=0; i<m; i++) {
			this.table.add(new Element(0,null));
		}
	}
	private int functionHash(int key) {
		return key%m;
	}
	
	private int linearProbing(int dressHash, int key) {
		int posInit = dressHash;
		do {
			if(table.get(dressHash).mark==0)
				return dressHash;
			if(table.get(dressHash).mark == 1 && table.get(dressHash).reg.getKey()==key)
				return -1;
			dressHash = (dressHash + 1) % m;
		}
		while(dressHash!=posInit);
		return -1;
	}
	public void insert(int key, E reg) {
		int dressHash = functionHash(key);
		dressHash = linearProbing(dressHash,key);
		if(dressHash == -1) {
			System.out.println("Key table hash is full...");
			return;
		}
		else if(dressHash == -2) {
			System.out.println("Key is duplicated");
			return;
		}
		else {
			Element aux= new Element(1,new Register<E>(key,reg));
			table.set(dressHash, aux);
		}
	}
	private int linearProbingSearch(int dressHash,int key) {
		int posInit=dressHash;
		do {
			if(table.get(dressHash).mark==1 && table.get(dressHash).reg.getKey()==key)
				return dressHash;
			dressHash=(dressHash+1)%m;
		}while(dressHash != posInit);
		return -1;
	}
	public Object search(int key) {
		int dressHash=functionHash(key);
		dressHash=linearProbingSearch(dressHash,key);
		if (dressHash==-1) {
			return null;
		}
		
		return table.get(dressHash).reg.value;
	}
	private int linearProbingRemove(int dressHash,int key) {
		int posInit=dressHash;
		do {
			if(table.get(dressHash).mark==1 && table.get(dressHash).reg.getKey()==key) {
				table.get(dressHash).mark=0;
				return dressHash;}
			dressHash=(dressHash+1)%m;
		}while(dressHash != posInit);
		return -1;
	}
	//
	public Object remove(int key) {
		int dressHash=functionHash(key);
		dressHash=linearProbingRemove(dressHash,key);
		if(dressHash==-1) {
			return null;
		}
		
		return table.get(dressHash).reg.value;
	}

	public String toString() {
		String s = "D.Real\t.D.Hash\tRegister\n";
		int i = 0;
		for (Element item : table) {
			s+=(i++) + "-->\t";
			if (item.mark == 1)
				s+= functionHash(item.reg.getKey())+"\t"+item.reg.toString()+"\n";
			else
				s+="empty\n";
		}
		return s;
	}

}