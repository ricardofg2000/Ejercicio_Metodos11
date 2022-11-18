package unico;

import java.text.DecimalFormat;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		  Implementar un método que calcule la superficie o el volumen de una esfera.
		  El prototipo del método es este:
		  
		  static double superficieOvolumen(char peticion, double radio)
		  
		  El método recibe el carácter 'S' o el carácter 'V' en el primer parámetro,
		  según quiera calcularse la superficie o el volumen. En el segundo parámetro,
		  recibirá el valor del radio de la esfera. Las ecuaciones de los dos conceptos
		  son estas:
		  
		  Volumen = 4/3 PI r^3
		  
		  Superficie = 4 PI r^2
		 */
		
		DecimalFormat decimal = new DecimalFormat("#.000");
		char opc;
		double radio;
		double resultado;
		
		opc = Util.leerChar("¿Qué quiere calcular?[S→superficie V→volumen]: ");
		radio = Util.leerDouble("Valor del radio: ");
		
		resultado = superficieOvolumen(opc,radio);
				
		Util.escribir(decimal.format(resultado));
	}

	static double superficieOvolumen(char peticion, double radio) {
		
		double valor = 0;
		switch(peticion) {
		case 'S','s': valor = (4/3)*Math.PI*Math.pow(radio, 3);break;
		case 'V','v': valor = 4*Math.PI*Math.pow(radio, 2);break;
		}
		return valor;
	}
	
}
