package data.structures;
import java.util.*;
public class CodeKeeper2 {
	Vector<String> list;
	String[] codes = {"alpha","lambda","gamma","delta","zeta"};
	public CodeKeeper2(String[] userCodes){
		list = new Vector<String>();
		// load pre-defined codes
		for (int i = 0; i < codes.length; i++){
			addCode(codes[i]);}
		for (int j=0; j<userCodes.length; j++){
			addCode(userCodes[j]);
		}
		for (String code : list){
			System.out.println(code);
		}
}
	private void addCode(String code){
		if(!list.contains(code)){
			list.add(code);// here we add only the elements that are not already on the list
		}
	}
	public static void main(String[] arguments){
		CodeKeeper2 keeper = new CodeKeeper2(arguments);
	}
}