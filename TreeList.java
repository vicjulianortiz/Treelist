import java.util.*;

class Tree{
	private Node root, focusNode;

	public void InsertBinarySearchTree(Node newNode){
		if(root == null){
			root = newNode;
		}
		else{
			Node parent = root;

			boolean loopSwitch = true;
			do{

				if(newNode.getName().compareTo(parent.getName()) < 0){
					if(parent.getLeft() != null){
						parent = parent.getLeft();
					}
					else{
						parent.setLeft(newNode);
						loopSwitch = false;
						break;
					}
				}
				else if(newNode.getName().compareTo(parent.getName()) > 0){
					if(parent.getLeft() != null){
						parent = parent.getLeft();
					}
					else{
						parent.setRight(newNode);
						loopSwitch = false;
						break;
					}
				}
				else{
					System.out.println("Node has been found.");
				}
			}while (loopSwitch == true);
		}
	}

	public Node FindCustomerIterative(String nm){
		focusNode = root;

		boolean loopSwitch = true;
		do{
			if(nm.equals(focusNode.getName())){
				loopSwitch = false;
			}

			else if(nm.compareTo(focusNode.getName()) < 0){
				if(focusNode.getLeft() != null){
					focusNode = focusNode.getLeft();
					break;
				}
			}
			else if(nm.compareTo(focusNode.getName()) > 0){
				if(focusNode.getRight() != null){
					focusNode = focusNode.getRight();
					break;
				}
			}
		}while (loopSwitch == true);
		return focusNode;
	}


	public Node FindCustomerRecursive(String nm, Node f){
		if(f != null){
			focusNode = f;
		}
		else{
			focusNode = root;
		}

		if(nm.compareTo(focusNode.getName()) < 0)
			FindCustomerRecursive(nm, focusNode.getLeft());
		if(nm.compareTo(focusNode.getName()) > 0)
			FindCustomerRecursive(nm, focusNode.getRight());

		return focusNode;
	}

 	public void InOrderSuccessor(Node n){
		if( n != null){
			focusNode = n;


			List <Node> myList = new ArrayList<Node>();
			int counter = 0;
			while(focusNode != null){
				myList.add(focusNode);
				counter++;
				focusNode = focusNode.getLeft();
			}
			int size = myList.size();
			for(int i = size; i >= 0; i--){
				System.out.println("Name: " + myList.get(i).getName() + " Phone Number: " + myList.get(i).getNumber());
				if(myList.get(i).getRight() != null)
					if(i != 0)
						System.out.println("Name: " + myList.get(i).getRight().getName() + " Phone Number: " + myList.get(i).getRight().getNumber());

			}

			focusNode = focusNode.getRight();

			List <Node> myList2 = new ArrayList<Node>();
			counter = 0;
			while(focusNode != null){
				myList2.add(focusNode);
				counter++;
				focusNode = focusNode.getLeft();
			}
			size = myList.size();
			for(int i = size; i >= 0; i--){
				System.out.println("Name: " + myList2.get(i).getName() + " Phone Number: " + myList2.get(i).getNumber());
				if(myList2.get(i).getRight() != null)
					System.out.println("Name: " + myList2.get(i).getRight().getName() + " Phone Number: " + myList2.get(i).getRight().getNumber());

			}
		}
	}

	public void PreOrderTraversal(Node n){

		if(n != null){
			System.out.println("Name: " + n.getName() + " Phone Number: " + n.getNumber());

			PreOrderTraversal(n.getLeft());
			PreOrderTraversal(n.getRight());
		}
	}

		public static Node deleteRandomNode(Node root, String nm) {
			if (root == null)
				return null;
			if (root.getName().compareTo(nm) > 0) {
				root.setLeft(deleteRandomNode(root.getLeft(), nm));
			}
			else if (root.getName().compareTo(nm) < 0) {
				root.setRight(deleteRandomNode(root.getRight(), nm));

			} else {
				if (root.getLeft() != null && root.getRight() != null) {
					Node temp = root;
					Node minOnRight = minNode(temp.getRight());
					root.setName(minOnRight.getName());
					deleteRandomNode(root.getRight(), minOnRight.getName());

				}
				else if (root.getLeft() != null) {
					root = root.getLeft();
				}
				else if (root.getRight() != null) {
					root = root.getRight();
				}
				else
					root = null;
			}
		return root;
	}

		public static Node minNode(Node root) {
				if (root.getLeft() == null)
					return root;
				else {
					return minNode(root.getLeft());
				}
		}

	public void ReverseInOrder(Node root) {
			if(root !=  null) {
				ReverseInOrder(root.getLeft());
				System.out.println("Name: " + root.getName() + " Phone Number: " + root.getNumber());
				ReverseInOrder(root.getRight());
			}
	}

	public Node getRoot(){
		return root;
	}

}
