package exception.handling;

public class HexReader {
	String[] input = { "000A110D1D260219", "78700F131814E0C", "6A197D45B0FFFFF"};
	
	public static void main(String[] arguments){
		HexReader hex = new HexReader();
		for (int i = 0; i<hex.input.length; i++)
			hex.readLine(hex.input[i]);
	}
	
	void readLine(String code){
		try{
			for (int j=0; j+1<code.length(); j++){
				String sub = code.substring(j, j+2);
				int num = Integer.parseInt(sub, 16);// change from hex to dec
				if (num==255)
					return;
				System.out.print(num + " ");
			}
		
	} finally{ // this piece of code is executed whatsoever
		System.out.println("**");
	}
		return;
}}
