
public class Bt {
	Node root;
	public static int sumOf=0;
	
	public void addNode(int key){
		Node newNode= new Node(key);
		
		//if no node in the tree, make this root
		if(root==null){
			root=newNode;
//			System.out.println(root.key);
			
		}
		else{
			//create a temp node or the curr node and set it to root
			 Node currNode=root;
			 
			 
			 //also create a parent node to keep track while traversing
			 Node parent;
			 
			 while(true){
				 //starting, parent will be root -> currNode
				 parent=currNode;
//				 System.out.println(parent.key);
				 if(key<currNode.key){
					 currNode=currNode.left;
					 
					 if(currNode==null){
						 
						 parent.left=newNode;
//						 System.out.println();
						 return;
						 
					 }
					 			 
					 
				 }
				 else{
					 currNode=currNode.right;
					 if(currNode==null){
						 parent.right=newNode;
						 return;
					 }
				 }
				 
			 }
			 
		}
	}
	
	public void inorder(Node currNode){
		
		
		if(currNode!=null){
			inorder(currNode.left);
			
			System.out.println(currNode.key);
			inorder(currNode.right);
			
		}
	}
	
	public void sum(Node currNode, Node root){
		
		if(currNode!=null){
			
			sum(currNode.left,root.left );
			if((currNode.left==null && currNode.right==null)&& root.left==currNode.left){
				sumOf=sumOf+currNode.key;
				System.out.println("ENtered");
			}
			sum(currNode.right,root);
		}
//		System.out.println("The sum"+sumOf);
		
		
	}
	
	
	public static void main(String[] args){
		Bt b=new Bt();
		b.addNode(20);
		b.addNode(50);
		b.addNode(15);
		b.addNode(5);
		b.addNode(100);
		
		b.inorder(b.root);
		 b.sum(b.root, b.root);
		System.out.println("the sum = "+sumOf);
		
	}
	

}
