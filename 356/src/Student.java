import java.util.Arrays;


class Student {
	private int[] answers;
	final String ID ;
	private Question Q;// incase i needed to use data from question later
	Student (String ID, Question q){
		this.ID = ID;
		answers =new int[q.getSize()];
		Arrays.fill(answers, 0);
		Q=q;
	}
	public void setAnswer(int ndx, int value){
		answers[ndx]=value;
	}
	public int[] getAnswer(){
		return answers;
	}
}
