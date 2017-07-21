package book.algorithms;

public class Fibonacci2 {
	public static int[] fibo(int n){
		//if (n==0) return 0;
		int[] fibonacci = new int[n-1];
		fibonacci[0]=0;
		fibonacci[1]=1;
		for (int i=2; i<=fibonacci.length;i++)
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		return fibonacci;
		}
	
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		for (int i=1; i <= n; i++)
			System.out.println(i +": "+ fibo(i));
		
	//this algo is faster fibo1 since it stores the intermediate results
	//so the complexity becomes polynomial compared to expo in fibo1
	}

}
