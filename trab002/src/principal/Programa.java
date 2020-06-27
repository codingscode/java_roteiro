package principal;

public class Programa {

	public static void main(String[] args) {

         int i = 1;
		
		 while (i <= 3) {
			 System.out.println("Linha " + i);
			 i++;
		 }
		
		 System.out.println("i fora " + i);
		 System.out.println("-----------");
		 
		 for (int j=0; j<=8; j++) {
			 if (j == 5) {
				 break;
			 }
			 
			 System.out.println("j: " + j);
		 }
		 
		 System.out.println("-----------");
		 
		 
		 
		

	}

}
