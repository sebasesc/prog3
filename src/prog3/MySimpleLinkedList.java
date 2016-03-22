package prog3;



public class MySimpleLinkedList {
	protected Node first;
	static int tam;
	//a list is created in an empty state
	public MySimpleLinkedList(){
		first = null;
		tam=0;
	}
public void insert(Integer o){
	Node tmp = new Node (o,first);
	first=tmp;
	tam++;
}

public Object extract(){
//extracts the first element and returns its object
	Node tmp=first;
	first=tmp.getNext();
	tam--;

	return tmp.getInfo();


}
public Object get (int n){
	if (n>tam)
	return null;
		Node tmp=first;
		int i=1;
	while (i<=tam){
		if (i==n)
			return tmp.getInfo();
		tmp=tmp.getNext();
		i++;
	}
	return null;


}
public void print(){
	Node tmp=first;


	while (tmp!=null){
		System.out.println(tmp.getInfo().toString());
		tmp=tmp.getNext();

	}

}
public boolean isEmpty(){
	return (first==null);
}
public boolean estaOrdenado(Node n1){
	if (n1.hasNext()){
	if (n1.compareTo(n1.getNext())!=-1){
		return false;
		}
		else{
			return estaOrdenado(n1.getNext());
		}
	}
	return true;

	}
/**
 *
 * @param n1
 * @param i1
 * @return
 */
private Node search(Node n1, Integer i1){
	if (n1.contains(i1))
		return n1;
		else if (n1.hasNext())
			return search(n1.getNext(),i1);
	return null;
}
/**
 * funcion para retornar un nodo que contenga un Integer determinado
 * @param i1
 * @return
 */
public Node buscar(Integer i1){
	return search (first, i1);

}
}

