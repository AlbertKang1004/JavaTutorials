package javaProject.Lesson52;

public class BST {
	public BST(int i) {
		rootNode = new BstNode(i);
	}

	public void addNode(int i) {
		BstNode currentNode = rootNode;
		boolean finish = false;
		do {
			BstNode curLeftNode = currentNode.leftNode;
			BstNode curRightNode = currentNode.rightNode;
			int curIntData = currentNode.intData;
			if (i > curIntData) {
				if (curRightNode == null) {
					currentNode.rightNode = new BstNode(i);
					finish = true;

				} else {
					currentNode = curRightNode;
				}
			} else {

				if (curLeftNode == null) {
					currentNode.leftNode = new BstNode(i);
					finish = true;
				} else {
					currentNode = curLeftNode;
				}

			}

		} while (!finish);
	}

	public void traverseAndPrint(BstNode currentNode) {
		System.out.println("data = " + currentNode.intData);
		if (currentNode.leftNode == null)
			System.out.println("left = null");
		else
			System.out.println("left = " + currentNode.leftNode.intData);
		if (currentNode.rightNode == null)
			System.out.println("right = null");
		else
			System.out.println("right = " + currentNode.rightNode.intData);
		System.out.println();
		if (currentNode.leftNode != null)
			traverseAndPrint(currentNode.leftNode);
		if (currentNode.rightNode != null)
			traverseAndPrint(currentNode.rightNode);
	}

	public boolean find(int i) {
		BstNode currentNode = rootNode;

		while (true) {
			if (i < currentNode.intData) {
				if (currentNode.leftNode == null) {
					return false;
				} else {
					currentNode = currentNode.leftNode;
				}
			} else if (i == currentNode.intData)
				return true;
			else {
				if (currentNode.rightNode == null) {
					return false;
				} else {
					currentNode = currentNode.rightNode;
				}
			}
		}

	}

	BstNode rootNode;
}
