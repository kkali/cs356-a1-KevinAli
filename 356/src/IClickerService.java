import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class IClickerService {
	private int[] stats;
	private String[] answer;
	private int length;
	private List<Student> ID=new ArrayList<Student>();
	
	public IClickerService(Question q)
	{
		length = q.getSize();
		stats = new int[length];
		answer = q.getAnswer();
	}
	public void getAnswer(Student s){
		if (ID.isEmpty())
		{
			ID.add(s);
		}
		else{//This will check for if ID is unique or not if it 
			for(int i=0;i<ID.size();i++){
				Student temp = ID.get(i);
				if(temp.ID.equals(s.ID)){
					ID.set(i, s);
				}
				if(i+1>=ID.size()){
					ID.add(s);
					break;
				}
			}
		}
		

	}
	public void calcstats(){ // Will calculate the final tally of answers
		for(int i=0; i<ID.size();i++){
			for(int j=0; j<length;j++){
				if(ID.get(i).getAnswer()[j]==1){
					stats[j]+=1;
				}
			}
		}
	}
	public void calcstats(List<Student> L){// at first i thought passing List of Students would be best
		Arrays.fill(stats, 0);// reset stats so incase if user has updated his answer
		for(int i=0; i<ID.size();i++){
			for(int j=0; j<length;j++){
				if(ID.get(i).getAnswer()[j]==1){
					stats[j]+=1;
				}
			}
		}
	}
	public void printStats(){ // Probably can be moved to calcstats function
		System.out.println(ID.size() +" Student entered");
		for(int i=0; i<length;i++){
			System.out.print(answer[i]+":"+stats[i] +"\n");
		}
	}
}
