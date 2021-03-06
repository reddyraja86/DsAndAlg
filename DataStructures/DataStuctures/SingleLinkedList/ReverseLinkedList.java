package SingleLinkedList;

public class ReverseLinkedList {
	
	public void reverseLinkedList(Node head) {
		
		Node currentNode = head;
		Node prevNode = null;	
		while(currentNode.nextNode!=null) {
			Node nextNode = currentNode.nextNode;
			currentNode.nextNode = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		
		currentNode.nextNode = prevNode;
		
		head.nextNode= currentNode;
		
		
	}
	
	
	/**
	 * Reversing a Linked list using recursion
	 */
	//TODO : Need to understand this problem completely
	public void reverse(Node head,Node prevNode , Node currentNode) {
		if(currentNode.nextNode == null) {
			//currentNode.nextNode = prevNode;
			head = currentNode;
			head.nextNode = prevNode;
			return;
		}
		
		Node nextNode  = currentNode.nextNode;
		currentNode.nextNode = prevNode;
		reverse(head, currentNode, nextNode);
		
	}
	
	//TODO: Print the elements in reverse order using recursion
	public void reversePrinting(Node head,Node prevNode , Node currentNode) {
		if(currentNode.nextNode == null) {
			//currentNode.nextNode = prevNode;
			head = currentNode;
			head.nextNode = prevNode;
			return;
		}
		
		Node nextNode  = currentNode.nextNode;
		currentNode.nextNode = prevNode;
		reverse(head, currentNode, nextNode);
		System.out.println("----"+currentNode.data);
		
	}
	
	
	
	
	
	//TODO : Check whether the linked list is circular or not
	
	
	

}
