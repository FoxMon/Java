import java.util.Vector;
import java.util.Scanner;

class Word{
	private String engWord; // ����ܾ�
	private String korWord; // �ѱ۴ܾ�
	
	public Word(String engWord, String korWord) { // WordŬ������ ������
		this.engWord = engWord;
		this.korWord = korWord;
	}
	
	public String getEngWord() { // ���ܾ� ������
		return engWord;
	}
	
	public String getKorWord() { // ���ܾ� ������
		return korWord;
	}
}

public class WordQuiz {
	private String quiz; // �����̸�
	private Vector<Word> w; // Vector�÷���
	
	public WordQuiz(String quiz) { // WordQuizŬ������ ������
		this.quiz = quiz;
		
		w = new Vector<Word>(); // Vector�÷����� ��ü ����
		/* 17���� �ܾ� ���� */
		w.add(new Word("love", "���"));
		w.add(new Word("car", "��"));
		w.add(new Word("bus", "����"));
		w.add(new Word("doctor", "�ǻ�"));
		w.add(new Word("teacher", "������"));
		w.add(new Word("work", "��"));
		w.add(new Word("school", "�б�"));
		w.add(new Word("mother", "����"));
		w.add(new Word("father", "�ƺ�"));
		w.add(new Word("day", "����"));
		w.add(new Word("university", "���б�"));
		w.add(new Word("hug", "����"));
		w.add(new Word("subway", "����ö"));
		w.add(new Word("travel", "����"));
		w.add(new Word("schedule", "����"));
		w.add(new Word("book", "å"));
		w.add(new Word("computer", "��ǻ��"));
	}
	
	public int makeQuestion(int q[], int answer) { // ������ ����
		int[] tempQ = new int[4]; // �ӽ÷� ������ ������ �迭, 4���� ���⸦ ����
		int idx; // �ε���
		
		for(int i = 0; i < tempQ.length; i++) {
			do{
				idx = (int)(Math.random() * w.size()); // vector�ε����� �ִ� ����� ũ����� ������ ���� ����
			}while(idx == answer || exist(tempQ, idx)); // ���� �迭���� ���� �ε����� ������ �ȵ�
			
			tempQ[i] = idx;
		}
		
		for(int i = 0; i < tempQ.length; i++) {
			q[i] = tempQ[i];
		}
		
		return (int)(Math.random()*tempQ.length);
	}
	
	public boolean exist(int tempQ[], int idx) { // ������ idx�� �����ϸ�
		for(int i = 0; i < tempQ.length; i++) {
			if(tempQ[i] == idx) {
				return true; // ��
			}
		}
		
		return false; // ����
	}
	
	public void start() { // ���� ����
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\""+quiz+"\""+"�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("����  17���� �ܾ ��� �ֽ��ϴ�.");
		
		while(true) {
			int answer = (int)(Math.random()*w.size()); // ������ ����ִ� ������ �ε��� ��ȯ
			String engVoca = w.get(answer).getEngWord(); // get���� String answer�ε����� ��ü �ް� �� ��ü�� ����ܾ� �ѱ�
			int[] example = new int[4]; // 4���� ����
			int ansIndex = makeQuestion(example, answer); // �� �߿� �ϳ��� ������
			example[ansIndex] = answer; 
			
			System.out.println(engVoca + "?");
			
			for(int i = 0; i < example.length; i++) {
				System.out.print("("+(i+1)+")"+w.get(example[i]).getKorWord()+" "); // ���� ���
			}
			System.out.print(":>");
			
			int user = scan.nextInt(); // ����ڰ� ��ȣ �Է�
			
			if(user == -1) {
				System.out.println("\""+quiz+"\""+"�� �����մϴ�...");
				break; // -1�Է½� ����
			}
			
			user--; // �ε����� ������ �ٲٰ�
			
			if(user == ansIndex) {
				System.out.println("Excellent !!");
			}
			else {
				System.out.println("No !!");
			}
		}
	}
	
	public static void main(String[] args) {
		WordQuiz quiz = new WordQuiz("��ǰ����");
		
		quiz.start();
	}
}
