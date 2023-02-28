package tiposDeDatosYVariables;

public class ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicio 1
		int num1 = 5, num2 = 4, num3 = 3;
		int multi, resi;
		multi = num1 * num2;
		resi = num2 % num3;
		System.out.println(multi);
		System.out.println(resi);
		
		//Ejercicio 2
		boolean x = true,y = false;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		
		//Ejercicio 3
		double num4 = 19,num5 = 20;
		if(num4 < num5) {
			System.out.println("Es menor");
		}else {System.out.println("Es mayor");}
		
		// de F a C y 
		
		byte fahrenheit = 1;
        double centigrados = ((fahrenheit-32) / 1.8);
        double kelvin = ((fahrenheit-32) / 1.8) + 273.15;

        System.out.println("1 fahrenheit a centigrados es: " + centigrados);
        System.out.println("1 fahrenheit a kelvin es: " + kelvin);
        
        // Es par o impar
        
        int num = 2;
        if(num % 2 == 0) {
        	System.out.println("El numero es par");
        }else {
        	System.out.println("El numero es impar");
        }
		
		
	}

}
