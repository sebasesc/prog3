package prog3;

public class Node {
	private Integer info;
	private Node next;

	public Node(){
		info = null;
		next = null;
	}
	public Node (Integer o, Node n){
		info=o;
		next=n;
	}
	public void setInfo(Integer o){
	info = o;
	}
	public void setNext(Node n){
		next = n;

	}
	public Integer getInfo(){
		return info;
	}
	public Node getNext(){
		return next;
	}
	public boolean hasNext(){
		return (getNext()!=null);
	}
public int compareTo(Node n1){
	 return (info.compareTo(n1.getInfo()));

}
public boolean contains (Integer i1){
	return (info.equals(i1));
}


}
