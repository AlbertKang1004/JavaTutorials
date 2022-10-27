package javaProject.Lesson49;

public class Lesson49 {
	public static void main(String args[]) {
		append(0, "Pump station");
		append(3050, "Hwy 35");
		append(4573, "Tank Farm");

		insert(4073, "Cold Creek", 3);
		traverseAndPrint();
	}

	public static void append(int pos, String descr) {
		PipelineNode newNode = new PipelineNode(pos, descr, null);
		if (headNode == null) {
			headNode = newNode;
		} else {
			tailNode.nextNode = newNode;
		}
		tailNode = newNode;

	}

	private static PipelineNode headNode = null;
	private static PipelineNode tailNode = null;

	public static void traverseAndPrint() {
		PipelineNode currentNode = headNode;
		int nodeNum = -1;
		do {
			nodeNum++;
			System.out.println("Node Number: " + nodeNum);
			System.out.println("Position: " + currentNode.position);
			System.out.println("Description: " + currentNode.description);
			System.out.println();
			currentNode = currentNode.nextNode;
		} while (currentNode != null);

	}

	public static void insert(int pos, String descr, int index) {
		
		if (index == 0) {
			PipelineNode newNode = new PipelineNode(pos, descr, headNode);
			headNode = newNode;
		} else {
			PipelineNode currentNode = headNode;
			for (int i = 0; i < index - 1; i++) {
				currentNode = currentNode.nextNode;
			}
			PipelineNode tempNode = currentNode.nextNode;
			PipelineNode newNode = new PipelineNode(pos, descr, tempNode);
			currentNode.nextNode = newNode;
		}
	}
}
