package myproject;
import java.util.Scanner;

public class ClassApnaswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		System.out.println("Select Symbol(+,*,-,/)");
		String sym=sc.next();
		int res;
		switch(sym){
		
		
	    case "+" : res=n1+n2;
		System.out.println("Addition is : "+res);
		break;
		
	    case "*" : res=n1*n2;
	    System.out.println("Multiliction is : "+res);
	    break;
	    
	    case "-": res=n1-n2;
	    System.out.println("Subtraction is : "+res);
	    break;
	    
	    case "/": res=n1/n2;
	    System.out.println("division is: "+res);
	    break;
	    default:
	    	System.out.println("Invalid");
		
		}
		
			

	}

}
