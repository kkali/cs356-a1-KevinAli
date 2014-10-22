import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


public class SimulationDriver {
	public static void main(String[] args){
		Random rnb = new Random();
		for(int i=0; i<10;i++){
			if(rnb.nextBoolean()){
				SimulationDriver.runMC();
			}
			else
				SimulationDriver.runSC();
		}
	}
	// I thought that doing all the random manipulation would be best in the driver code rather then in student or question class
	public static void runMC(){
		System.out.println("\n\nMULTIPLE CHOICE IS RUNNING");
		Question mc = new MultipleChoice();// this will change the test case by switch what type of question
		IClickerService ss = new IClickerService(mc);
		Random rand = new Random();
		int user = rand.nextInt(10)+5;//5-15 users
		for (int i =0; i <user; i++){
			Student temp =new Student(String.valueOf(UUID.randomUUID())+i,mc);//UUID+ index at the end to make sure of unique string
			for(int j=0;j<mc.getSize();j++){
				if(mc.getSize()>2)
					temp.setAnswer(j,rand.nextInt(2));
				else{
					int t =rand.nextInt(2);
					if(t==1){
						temp.setAnswer(j, 1);
						j++;
					}
					else{
						j++;
						temp.setAnswer(j,1);
					}
				}
			}
			ss.getAnswer(temp);
		}
		ss.calcstats();
		ss.printStats();

	}
	// this is the exact same code except it runs single choice kind of annoying to have 2 of the same code i probably
	//could have done the random question loop in the run function.
	public static void runSC(){
		System.out.println("\n\nSINGLE CHOICE IS RUNNING");
		Question mc = new SingleChoice();// this will change the test case by switch what type of question
		IClickerService ss = new IClickerService(mc);
		Random rand = new Random();
		int user = rand.nextInt(10)+5;//5-15 users
		for (int i =0; i <user; i++){
			Student temp =new Student(String.valueOf(UUID.randomUUID())+i,mc);//UUID+ index at the end to make sure of unique string
			for(int j=0;j<mc.getSize();j++){
				if(mc.getSize()>2)
					temp.setAnswer(j,rand.nextInt(2));
				else{
					int t =rand.nextInt(2);
					if(t==1){
						temp.setAnswer(j, 1);
						j++;
					}
					else{
						j++;
						temp.setAnswer(j,1);
					}
				}
			}
			ss.getAnswer(temp);
		}
		ss.calcstats();
		ss.printStats();
	}
}
