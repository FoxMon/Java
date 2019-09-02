
public class Travel {
	private Node start;
	
	public class Node {
		private char name; // ���̸�
		private Node left, right; // �� ������ �ٸ� ����
		
		public Node(char newIsland, Node lt, Node rt) {
			this.name = newIsland;
			this.left = lt;
			this.right = rt;
		}
	}
		
		public Node map() { // ���� �����
			Node n1 = new Node('H', null, null); 
			Node n2 = new Node('F', null, null); 
			Node n3 = new Node('S', null, null);
			Node n4 = new Node('U', null, null); 
			Node n5 = new Node('E', null, null); 
			Node n6 = new Node('Z', null, null);  
			Node n7 = new Node('K', null, null); 
			Node n8 = new Node('N', null, null); 
			Node n9 = new Node('A', null, null); 
			Node n10 = new Node('Y', null, null);
			Node n11 = new Node('T', null, null);
			
			n1.left = n2; // n1�� ���ʼ� n2
			n1.right = n3; // n1�� �����ʼ� n3
			n2.left = n4; // n2�� ���ʼ� n4
			n2.right = n5; // n2�� �����ʼ� n5
			n3.left = n6; // n3�� ���ʼ� n6
			n3.right = n7; // n3�� �����ʼ� n7
			n4.left = n8; // n4�� ���ʼ� n8
			n5.left = n9; // n5�� ���ʼ� n9
			n7.right = n10; // n7�� ���ʼ� n10
			n9.right = n11; // n9�� �����ʼ� n11
			
			return n1;
		}
		
		public void A_Course(Node n) { // A-Course
			if(n != null) {
				System.out.print(n.name + "-> ");
				
				A_Course(n.left); // Left
				A_Course(n.right); // Right
			}
		}
		
		public void B_Course(Node n) { // B-Course
			if(n != null) {
				B_Course(n.left); // Left
				
				System.out.print(n.name + "-> ");
				
				B_Course(n.right); // Right
			}
		}
		
		public void C_Course(Node n) { // C-Course
			if(n != null) {
				C_Course(n.left); // Left
				C_Course(n.right); // Right
				
				System.out.print(n.name + "-> ");
			}
		}
		
		public static void main(String args[]) {
			Travel t = new Travel(); // ���ఴü t
		
			t.start = t.map();
			
			System.out.println("A-�ڽ�: ");
			t.A_Course(t.start);
			
			System.out.println("\nB-�ڽ�: ");
			t.B_Course(t.start);
			
			System.out.println("\nC-�ڽ�: ");
			t.C_Course(t.start);
		}
}
