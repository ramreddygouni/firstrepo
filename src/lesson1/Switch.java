package lesson1;

public class Switch {

	public static void main(String[] args) {
		int score = 60;
		
		switch (score)
		{
		case 100 :
		case 95 :
		case 90 :
			System.out.println("Very good");
			break;
		case 60 :
			System.out.println("good");
			break;	
		case 40 :
			System.out.println("OK");
			break;
		default :
			System.out.println("default score : "+ score);
			break;
		}

	}

}
