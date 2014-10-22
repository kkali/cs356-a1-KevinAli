


public class SingleChoice implements Question {
	private String Q;
	private String[] answers;
	private int size =2;
	public SingleChoice(){
		// I am just hard coding the answers and Q is for the question string ,
		Q = "QUESTION blank";
		answers = new String[size];
		answers[0]="Right";
		answers[1]="Wrong";
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size =size;
	}
	public String[] getAnswer() {
		return answers;
	}

}
