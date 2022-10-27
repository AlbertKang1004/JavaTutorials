package javaProject.Lesson52;

public class BsTree {
	public BsTree(Comparable<String> d) {
		theData = d;
		leftNode = null;
		rightNode = null;
	}

	public BsTree addNode(Comparable<String> d) {
		if (d.compareTo((String) theData) > 0) {
			if (rightNode != null) {
				rightNode.addNode(d);
			} else {
				rightNode = new BsTree(d);
			}
		} else {
			if (leftNode != null) {
				leftNode.addNode(d);
			} else {
				leftNode = new BsTree(d);
			}
		}
		return this;
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

	private Comparable<String> theData;
	private BsTree leftNode, rightNode;
}
