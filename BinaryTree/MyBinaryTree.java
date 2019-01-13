

public class MyBinaryTree {

	MyNode root;

	//Add Function
	private MyNode addRecursive(MyNode current, int value) {
		if (current == null) {
			return new MyNode(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public void add(int value) {
	    root = addRecursive(root, value);
	    System.out.println("added");
	}

	//Contains Function
	private boolean containsNodeRecursive(MyNode current, int value) {
		if (current == null) {
			return false;
		}

		if (value == current.value) {
			return true;
		} 

		return value < current.value ?  containsNodeRecursive(current.left,  value) :
					containsNodeRecursive(current.right,  value) ;
	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}

	//Delete Function
	private MyNode deleteRecursive(MyNode current, int value) {
		if (current == null) {
			return null;
		}

		if (value == current.value) {
			//Node to delete found
			if (current.left == null && current.right == null) {
	    		return null;
			}

			if (current.right == null) {
    			return current.left;
			}
 
			if (current.left == null) {
 			   return current.right;
			}

			int smallestValue = findSmallestValue(current.right);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
			return current;
		} 

		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}

		current.right = deleteRecursive(current.right, value);
		return current; 


	}

	private int findSmallestValue(MyNode root) {
    	return root.left == null ? root.value : findSmallestValue(root.left);
	}

	public void delete(int value) {
    	root = deleteRecursive(root, value);
	}

	public void inOrder() {
		inOrderTraversal(root);
	}
	
	public void preOrder() {
				preOrderTraversal(root);

	}
	
	public void postOrder() {
				postOrderTraversal(root);

	}


	private void inOrderTraversal(MyNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
        	System.out.print(" " + node.value);
        	inOrderTraversal(node.right);
		}
	}

	private void preOrderTraversal(MyNode node) {
		if (node != null) {
			System.out.print(" " + node.value);
			preOrderTraversal(node.left);
        	preOrderTraversal(node.right);
		}
	}

	private void postOrderTraversal(MyNode node) {
		if (node != null) {
			postOrderTraversal(node.left);
        	postOrderTraversal(node.right);
        	System.out.print(" " + node.value);

		}
	}
	





}