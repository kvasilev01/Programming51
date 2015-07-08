package com.hackbulgaria.programming51.week5;

public class LinkedList<T> {
	    private Node<T> head;
	    private Node<T> tail;

	    public LinkedList(){
	        head = null;
	        tail = null;
	    }
	    
	    public boolean contains(T data){
	    	Node<T> temp = new Node<>(data);
	    	return false;
  	
	    
	    }

	   public void addLast(T data){
		   Node<T> temp = new Node<>(data);
	        if(head == null){
	        	head = temp;	        
	        }else{        	
	        	tail.next = temp;        	
	        }
	        tail = temp;
	    }
	   
	   public void addFirst(T data){
		   Node<T> temp = new Node<>(data);
		   temp.next = head;
		   head = temp;
		 
		   }
			  			 		 				      

	    public T getData(int index){    	
	        return getElement(index).data;
	    }

	    public void set(int index, T el){
	        Node<T> temp = head;
	        int counter = 0;
	        while(true){
	        	if(counter == index){
	        		return;
	        	}else{
	        		temp = temp.next;
	        		counter++;
	        	}
	        }
	    }

	    public void remove(int index){
	    	if(index == 0){
	    	head = head.next;	
	    	}else{
	      Node<T>temp = getElement(index - 1);
	      temp.next = temp.next.next;
	    	}  
	    }

	    public void insertAfter(int index, T data){
	        Node<T> temp = new Node<>(data);
	        Node<T>el = getElement(index);
	        temp.next = el.next;
	        el.next = temp;
	        
	    }

	    public String toString(){
	    	String str = "[";
	    	Node <T> temp;
	    	temp = head;
	    	while(temp.next != null){
	    		str += temp.data + ",";
	    		temp = temp.next;    		
	    	}
	        return str + temp.data + "]";
	    }
	    public Node<T> getElement(int index){
	    	int counter = 0;
	    	Node<T>temp = head;
	    	while(temp != null){
	    		if(counter == index){
	    			break;   	
	    		}
	    		temp = temp.next;
	    		counter++;  		
	    	}
	    	return temp;
    		
	    }
	    public int size(){
	    	int counter = 0;
	    	Node<T>temp = head;
	    	while(temp != null){
	    		counter++;
	    		temp = temp.next;
	    	}
	    	return counter;
	    }
	    
	   
	}