package Ejercicios;

public class AtribuVariaCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte edad=35; // se declara la variable con su respectivo tipo (int, short, byte, boolean, etc) y a su vez se inicializó (valor)
		System.out.println(edad);
		edad=90; // acá se actualiza el valor de la vble a 90
		System.out.println(edad);	// se visualiza ahora actualizado en la consola.	
		
		// operacion básica 
		
		
		System.out.println("");
		System.out.println("Inicia el ejercio de operación raiz cuadrada");
		double raiz=Math.sqrt(9);// el tipo de vble debe ser double porque el metodo Math lo exige dado que el resultado es double según la instrucción
		System.out.println(raiz);

		
		// redondeo y refunción
		
		System.out.println("");
		System.out.println("Inicia el ejercio de operación redondeo y refunción");
		
		/*	float num1=5.86f;// el tipo de vble debe ser double o float porque el tipo de dato que es decimal
		int resultado=Math.round(num1);// metodo de rednodeo y permite una variable float a entero (int)
		System.out.println(resultado);*/
		
		// en caso que sea vble double y por necesidad el resultado sea en entero se aplica el metodo refunción asi:
		
		double num1=5.86;// el tipo de vble debe ser double o float porque el tipo de dato que es decimal
		int resultado=(int)Math.round(num1);// metodo de rednodeo y permite una variable double  a entero (int) por refuncion aplicar antes (int) al math
		System.out.println(resultado);
	}

}
