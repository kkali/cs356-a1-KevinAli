
public class MultipleChoice implements Question{

	private String Q;
	private String[] answers;
	private int size =4;
	public MultipleChoice(){
		Q = "Question blank";
		answers = new String[size];
		answers[0] = "A";
		answers[1] = "B";
		answers[2] = "C";
		answers[3] = "D";
	}
	
	public int getSize() {
		return size;
	}

	
	public void setSize(int size) {
		this.size = size;

	}
	public String[] getAnswer() {
		return answers;
	}

}
