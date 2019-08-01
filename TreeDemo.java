public class TreeDemo{
	public static void main(String[] args){
		Node Moutafis = new Node("Moutafis", "295-1492");
		Node Ikerd = new Node("Ikerd", "291-1864");
		Node Gladwin = new Node("Gladwin","295-1601");
		Node Robson = new Node("Robson", "293-6122");
		Node Dang = new Node("Dang", "295-1882");
		Node Bird = new Node("Bird",  "291-7890");
		Node Harris = new Node("Harris", "294-8075");
		Node Ortiz = new Node ("Ortiz", "584-3622");

		Tree t1 = new Tree();
		t1.InsertBinarySearchTree(Moutafis);
		t1.InsertBinarySearchTree(Ikerd);
		t1.InsertBinarySearchTree(Gladwin);
		t1.InsertBinarySearchTree(Robson);
		t1.InsertBinarySearchTree(Dang);
		t1.InsertBinarySearchTree(Bird);
		t1.InsertBinarySearchTree(Harris);
		t1.InsertBinarySearchTree(Ortiz);

		System.out.println(t1.FindCustomerIterative("Ortiz"));
		System.out.println(t1.FindCustomerRecursive("Ortiz", t1.getRoot()).getNumber());
		System.out.println(t1.FindCustomerIterative("Penton").getNumber());
		System.out.println(t1.FindCustomerRecursive("Penton", t1.getRoot()).getNumber());

		t1.InOrderSuccessor(t1.FindCustomerIterative("Ikerd"));

		Node Avila = new Node("Avila", "294-1568");
		Node Quijada = new Node("Quijada", "294-1882");
		Node Villatoro =new  Node("Villatoro", "295-662");

		t1.InsertBinarySearchTree(Avila);
		t1.InsertBinarySearchTree(Quijada);
		t1.InsertBinarySearchTree(Villatoro);

		t1.InOrderSuccessor(t1.FindCustomerIterative(t1.getRoot().getName()));

		t1.PreOrderTraversal(t1.getRoot());

		t1.deleteRandomNode(t1.FindCustomerIterative("Robson"), "Robson");
		t1.deleteRandomNode(t1.FindCustomerIterative("Moutafis"), "Moutafis");
		t1.deleteRandomNode(t1.FindCustomerIterative("Ikerd"), "Ikerd");

		Node Poudel = new Node("Poudel", "294-1666");
		Node Spell = new Node("Spell", "295-1882");

		t1.InsertBinarySearchTree(Poudel);
		t1.InsertBinarySearchTree(Spell);

		t1.InOrderSuccessor(t1.FindCustomerIterative(t1.getRoot().getName()));

		t1.ReverseInOrder(t1.FindCustomerIterative(t1.getRoot().getName()));

		t1.PreOrderTraversal(t1.getRoot());



	}
}
