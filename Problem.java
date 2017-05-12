import java.util.*;

public class Problem {

	public static void main(String[] args) {
		//Read input from user
		Scanner sc = new Scanner(System.in);
		String t = sc.next(); //HOT or COLD
				
		String commandNums = sc.nextLine(); //command number
		String[] c = commandNums.split(","); //save each command numbers into array
		
		GetDressed dress = new GetDressed(t,c);
		
		Temperature temperature = dress.getTemperature();
		
		//invalid input check
		if(temperature == null){
				return;
		}
		else temperature.doPerform(c);
		
	}

}

interface Temperature {
	
	ArrayList<String> output = new ArrayList<String>(); //save response
	//HashMap hm = new HashMap();
	
	public static void printResponse(){
		for(int i=0; i< output.size()-1; i++){
			System.out.print(output.get(i)+", ");
		}
		System.out.println(output.get(output.size()-1));
	}
	
	public static void addOutput(String s){
		output.add(s);
	}
	
	public void getCommand(String s);
	
	
	public void doPerform(String[] s);
	
}
