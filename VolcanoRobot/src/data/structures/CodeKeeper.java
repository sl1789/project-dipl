package data.structures;
import java.util.*;
public class CodeKeeper {
	Vector list;
	String[] codes = {"alpha","lambda","gamma","delta","zeta"};
	
	public CodeKeeper(String[] userCodes){
		list = new Vector();
		// load pre-defined codes
		for (int i = 0; i < codes.length; i++){
			addCode(codes[i]);
		}
		// load user defined codes
		for (int j=0; j<userCodes.length; j++){
			addCode(userCodes[j]);
		}
		// print all codes
		for (Iterator ite = list.iterator(); ite.hasNext();){
			String output= (String)ite.next();
			System.out.println(output);
		}// great how for loop in java does not need to know the length of the data structure, in case it is dynamic
	}
	
	private void addCode(String code){
		if(!list.contains(code)){
			list.add(code);// here we add only the elements that are not already on the list
		}
	}
	
	public static void main(String[] arguments){
		CodeKeeper keeper = new CodeKeeper(arguments);
	}
}
