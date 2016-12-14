package lesson1;

public class MyClass1 {

	public static void main(String[] args) {
		int score = 50 ;
		
		switch (score)
		{
		case 90:
		     System.out.println("very good");
		     break;
		case 60:
			 System.out.println("ok");
			 break;
		case 40:
			 System.out.println("average");
			 break;
	    default:
	    	System.out.println("default value = "+ score);
		}
	}

}
