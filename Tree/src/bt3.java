


public class bt3 {
	// Java program to find minimum value node in Binary Search Tree
	 
	// A binary tree node
	static class Node {
	 
	    int data;
	    Node left, right;
	 
	    Node(int d) {
	        data = d;
	        left = right = null;
	    }
	}
	 
	static class BinaryTree {
	 
	    static  Node root;
	     
	    Node insert(int data) {
	    	
	         
	        /* 1. If the tree is empty, return a new,     
	         single node */
	        if (root == null) {
	            root= new Node(data);
	            return root;
	        } 
	        
	        else {
	        	return insert(root,data);
	        	
	        }
	    }
	    Node insert(Node node, int data){
	        	
	                 
	            if (data <= node.data) {
	                node.left = insert(node.left, data);
	            } 
	            
	            else {
	                node.right = insert(node.right, data);
	            }
	 
	            /* return the (unchanged) node pointer */
	            return node;
	        }
	    

	    
	    public void inorder(Node currNode){
			
			
			if(currNode!=null){
				inorder(currNode.left);
				
				System.out.println(currNode.data);
				inorder(currNode.right);
				
			}
		}
	 
	    /* Given a non-empty binary search tree,  
	     return the minimum data value found in that 
	     tree. Note that the entire tree does not need 
	     to be searched. */
	    int minvalue(Node node) {
	        Node current = node;
	 
	        /* loop down to find the leftmost leaf */
	        while (current.left != null) {
	            current = current.left;
	        }
	        return (current.data);
	    }
	     
	    // Driver program to test above functions
	   
	    public static void main(String[] args) {
	        BinaryTree tree = new BinaryTree();
	        Node root = null;
	        root = tree.insert(4);
	        tree.insert(2);
	        tree.insert(1);
	        tree.insert(3);
	        tree.insert(6);
	        tree.insert(5);
	        tree.inorder(root);
	 
	        System.out.println("The minimum value of BST is " + tree.minvalue(root));
	    }
	}
	 

}



