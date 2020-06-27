package principal;

public class Programa {

	public static void main(String[] args) {
        double numero1 = 0.0;
        String nome1 = "Raul";
        int numero2 = 42;
        boolean valor1 = true;

		System.out.println(numero1);
		
		numero1 = 4;
		
		System.out.println(numero1);

		String tipo_numero1 = ((Object)numero1).getClass().getName(); // getSimpleName()
		String tipo_nome1 = nome1.getClass().getName();
		String tipo_numero2 = ((Object)numero2).getClass().getName();
		
		System.out.println(tipo_numero1);
		System.out.println(tipo_nome1);
		System.out.println(tipo_numero2);
		
		
		System.out.println(tipo_numero1 == "java.lang.Double");
		System.out.println(tipo_nome1 == "java.lang.String");
		System.out.println(tipo_nome1 == "java.lang.Integer");
		System.out.println("--------------------------");
		
		int numero_int = 3;
		String numero_string = "3";
		
		//System.out.println(numero_int == numero_string);  dá erro
		System.out.println(((Object)valor1).getClass().getSimpleName());
		System.out.println("--------------------------");
		
		char[] vogais = {'a', 'e', 'i', 'o', 'u'};
				
		for (int i = 0; i < vogais.length; ++ i) {
            System.out.print(vogais[i] + " ");
        }
		
		System.out.println(" ");
		
		for (char item: vogais) {
	         System.out.println(item);
	    }
		
		System.out.println("--------------------------");
		
		int[] numeros = {3, 4, 5, -5, 0, 12};
        int soma = 0;
      
        for (int cada: numeros) {
            soma += cada;
        }
      
        System.out.println("numeros: " + numeros);
        System.out.println("Sum = " + soma);
		
	}

}
