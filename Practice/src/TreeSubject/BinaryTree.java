package TreeSubject;

import java.util.*;

public class BinaryTree<Key extends Comparable<Key>> {
	private Node root; // Root Node
	
	public BinaryTree() { root = null; }
	
	// Getter and Setter
	public Node getRoot() { return root; }
	public void setRoot(Node root) { this.root = root; }
	
	public boolean isEmpty() { return ( root == null ); } // null�̸� true
	
	public void preorder(Node myNode) { // ������ȸ
		if(myNode != null) { // �� -> ���� -> ������ ������ �湮
			System.out.print(myNode.getKey() + " "); // �� �湮
			
			preorder(myNode.getLeft()); // ���� �湮
			preorder(myNode.getRight()); // ������ �湮
		}
	}
	
	public void inorder(Node myNode) { // ������ȸ
		if(myNode != null) { // ���� -> �� -> ������ ������ �湮
			inorder(myNode.getLeft()); // ���� �湮
			
			System.out.print(myNode.getKey() + " "); // �� �湮
			
			inorder(myNode.getRight()); // ������ �湮
		}
	}
	
	public void postorder(Node myNode) { // ������ȸ
		if(myNode != null) { // ���� -> ������ -> �� ������ �湮
			postorder(myNode.getLeft()); // ���� �湮
			postorder(myNode.getRight()); // ������ �湮
			
			System.out.print(myNode.getKey() + " "); // �� �湮
		}
	}
	
	public void levelorder(Node root) { // ������ȸ
		Queue<Node> que = new LinkedList<Node>(); // Queue�ڷα��� �̿�
		Node temp; // �ӽ÷� ������ ���
		
		que.add(root); // root Node���� ����
		
		while(!que.isEmpty()) { // que�� ����ִ� ������ ������ �ݺ�
			temp = que.remove(); // �� ���� level ���� �����ϱ� ����
			
			System.out.print(temp.getKey() + " "); // ������ ��� ���
			
			if(temp.getLeft() != null) { // ���� ������ ������ �湮�ϸ鼭 ����
				que.add(temp.getLeft());
			}
			
			if(temp.getRight() != null) {
				que.add(temp.getRight());
			}
		}
	}
	
	public int size(Node myNode) { // myNode�� ��Ʈ�� �ϴ� (����)Ʈ���� �ִ� ��� ��
		if(myNode == null) { // myNode�� null�̸� 0
			return 0;
		} else { // �ƴ� ��� ����� ����� �̿��Ͽ� ���� ���
			return ( 1 + size(myNode.getLeft()) + size(myNode.getRight()));
		}
	}
	
	public int height(Node myNode) { // myNode�� ���̷� �ϴ� (����)Ʈ���� ����
		if(myNode == null) { // null �̸� 0 ����
			return 0;
		} else { // �� ���� hegiht ���Ͽ� �� ���� �ʿ� 1 ���Ͽ� height�� ����
			return ( 1 + Math.max(height(myNode.getLeft()), height(myNode.getRight())) );
		}
	}
	
	public static boolean isEqual(Node n1, Node n2) { // ���ϼ� �˻�
		if(n1 == null || n2 == null) { // ���� �ϳ��� null�̸�
			return ( n1 == n2 ); // �� �� null�̸� true, �ƴϸ� false
		}
		
		if(n1.getKey().compareTo(n2.getKey()) != 0) { // �� �� null�� �ƴϸ� item��
			return false;
		}
		
		return ( isEqual(n1.getLeft(), n2.getLeft()) && isEqual(n1.getRight(), n2.getRight()) ); // item ������ ���� ������ ��� ȣ��
	}
	
	public int countLeaf(Node root) { // ���ĸ���� ī����		
		if(root == null) { // root�� null�̸� �׳� �����Ŵ
			return 0;
		}
		
		// ���� -> ������ -> �� ���� ��, ����, �������� null�̸� ���� �ܸ���� �̹Ƿ�, 1�� ��ȯ
		if(root.getLeft() == null && root.getRight() == null) { // ���� �� ��尡 ���ٸ� 1�� ��ȯ
			return 1;
		} else { // �ƴ϶�� ��������� ���� / ������ �湮�ϸ鼭 �ٽ� �ܸ���带 ã��
			return ( countLeaf(root.getLeft()) + countLeaf(root.getRight()) );
		}
	}
}