import java.util.Scanner;

public class vainos {
    
    public static void main(String[] args) {

        System.out.print(yesOrNo("ingrese si desea algo", "La cagaste"));
        
    }
    
    public static String yesOrNo(String textBeforeCheck, String textTryAgain){

		Scanner sk = new Scanner(System.in);

        String checkedYesOrNo = " ";

		do{
				
			System.out.print(textBeforeCheck);
			checkedYesOrNo = sk.nextLine();
			
			if(checkedYesOrNo.equalsIgnoreCase("si") || checkedYesOrNo.equalsIgnoreCase("no")) {
				break;
			}

			System.out.println(textTryAgain);

		}while(true);

        sk.close();
		return checkedYesOrNo;
	}
}
