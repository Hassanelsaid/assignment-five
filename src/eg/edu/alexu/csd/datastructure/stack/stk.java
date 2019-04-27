package eg.edu.alexu.csd.datastructure.stack;
class node {
	Object value;
	node next;
	
}


public class stk implements IStack {
	node m=new node();
	node u=new node();
	/**
	 * this method removes the last element in the stack and returns it
	 */
	public Object pop() {
		node p=new node();
		p=u;
		m=u;
		int found =1;
		while(m.next!=null) {
			found=0;
			p=m;
			m=m.next;
		}
		m=p;
		Object temp;
		if(found==1) {
			temp=m.value;
			m.value=null;
			
		}
		else {
		temp=m.next.value;
		m.next=null;
		}
		return temp;
	}
	/**
	 * this method returns the top of stack without removing it
	 */
	public Object peek() {
		while(m.next!=null) {
			m=m.next;
		}
		Object temp=m.value;
		
		return temp;
	}
	/**
	 * this method adds an element to the stack
	 */
	public void push(Object element) {
		if(m.value==null) {
		m.value=element;
		}
		else {
		while(m.next!=null) {
			m=m.next;
		}
		
		node p=new node();
		p.value=element;
		m.next=p;
		p.next=null;
		m=m.next;
		}
	}
	/**
	 * this method checks if the stack is empty or not
	 */
	public boolean isEmpty() {
		if(u.value==null&&u.next==null) {
		return true;
		}
		else {
			return false;
		}
	}
	/**
	 * this method returns the number of elements in the stack
	 */
	public int size() {
		node p=new node();
		p=u;
		int c=0;
		while(p!=null) {
			p=p.next;
			c++;
		}
		return c;
	}
}
