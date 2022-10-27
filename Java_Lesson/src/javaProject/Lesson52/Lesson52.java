package javaProject.Lesson52;

public class Lesson52 {

	public static void main(String[] args) {
		BST b = new BST(50);
		b.addNode(56);
		b.addNode(52);
		b.addNode(25);
		b.addNode(74);
		b.addNode(54);
		b.traverseAndPrint(b.rootNode);
		System.out.println(b.find(55));
		
	}
	

}
