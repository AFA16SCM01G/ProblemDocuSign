import java.util.*;




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
