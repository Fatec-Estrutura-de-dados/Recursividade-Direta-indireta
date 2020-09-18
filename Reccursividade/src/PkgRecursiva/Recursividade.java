package PkgRecursiva;

public class Recursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(""+recursividadeDireta(12,27));
        System.out.println(recursividadeIndireta(12,27));
        
	}

	//Recursividade Direta Calculo de MDC
	private static int recursividadeDireta(int valor1, int valor2) {
		// TODO Auto-generated method stub
		
		 if(valor2==0)
             return valor1;
      else
             return recursividadeDireta(valor2, valor1%valor2);
	}

	
	private static int recursividadeIndireta(int valor1, int valor2) {
		// TODO Auto-generated method stub
		

	       if(valor2==0)
	              return valor1;
	       else
	              return recursividadeIndireta02(valor2, valor1%valor2);
		
	}

	private static int recursividadeIndireta02(int valor1, int valor2) {
		// TODO Auto-generated method stub
		 if(valor2==0)
             return valor1;
      else
             return recursividadeIndireta(valor2, valor1%valor2);
	}

}
