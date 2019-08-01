class Node{
	private Node left, right;
	private String name, phoneNum;

	public Node(String nm, String num){
		name = nm;
		phoneNum = num;
		left = null;
		right = null;
	}

	public void setLeft(Node l){
		left = l;
	}

	public void setRight(Node r){
		right = r;
	}

	public void setName(String nm){
		name = nm;
	}

	public Node getLeft(){
		return left;
	}

	public Node getRight(){
		return right;
	}

	public String getName(){
		return name;
	}

	public String getNumber(){
		return phoneNum;
	}
}