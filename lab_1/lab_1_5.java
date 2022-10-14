/**
 * lab_1_5
 */
public class lab_1_5 {
    public static void main(String[] args){

		
    int metoda[] = new int[]{1, 2, 3, 3, 3};

		for (int i=0; i<metoda.length; i++){
			

			if (metoda[i] == 1){
				System.out.println("Tak"); break;
			}
			else if(metoda[i] == 2){
				System.out.println("Nie"); break;
			}
			else if(metoda[i] == 3){
				System.out.println("Nie wiem"); break;
			}
			else{
				System.out.println("???"); break;
			}
		}

		for (int i=0; i<metoda.length; i++){
			switch(metoda[i]){

			case 1:
				System.out.println("Tak"); break;
			case 2:
				System.out.println("Nie"); break;
			case 3:
				System.out.println("Nie wiem"); break;
			default:
				System.out.println("???"); break;
			}
		}
	}
}
