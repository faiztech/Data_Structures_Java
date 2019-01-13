
public class MyBinaryTreeTest {


	public static void main (String args[]) {

		MyBinaryTree bt = new MyBinaryTree();
 
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);
		 
		System.out.println(bt.containsNode(6));

		bt.delete(8);

		System.out.println(bt.containsNode(8));

		bt.inOrder();
		bt.preOrder();
		bt.postOrder();

	}
}