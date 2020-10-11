/*
 * 
 * CONVERSOR DE HORAS ESCRITO EN JAVA By KermitProgrammer
 * 
 * Programa que lee por teclado tres números enteros H, M, S correspondientes a hora, minutos y 
 * segundos respectivamente.
 * 
 * - Comprueba si la hora que indican es una hora válida.
 * - Calcula las horas restantes hasta las 12AM y 12PM y convierte la hora en texto
 * 
 */

package conversorHorasJava;

import java.util.Scanner;
import java.lang.*;

public class ConversorHorasJava {
	public static void main(String[] args) {
	
		String hora, horasString, minutosString, segundosString;
		Scanner valorUsuario = new Scanner(System.in); //Abre el flujo de datos para recibir datos del usuario
		
		int horas, minutos, segundos, horasRestantesPM, horasRestantesAM, minutosRestantes, segundosRestantes;
		
		System.out.print("Introduce la hora con el siguiente formato HH:MM:SS (Incluyendo el 0 a la izquierda si es menor a 10 algun valor): ");
		hora = valorUsuario.next(); //Almacena en una variable tipo string la informacion del usuario en el formato solicitado
		
		valorUsuario.close(); //Cierra el flujo de datos para recibir datos del usuario, es decir, el programa no recibe mas datos del usuario
		
		horasString = hora.substring(0, 2); //Extrae HH de la cadena (HH:MM:SS)
		minutosString = hora.substring(3, 5); //Extrae MM de la cadena (HH:MM:SS)
		segundosString = hora.substring(6, 8); //Extrae SS de la cadena (HH:MM:SS)
		
		horas = Integer.parseInt(horasString); //Convierte HH en un valor numerico
		minutos = Integer.parseInt(minutosString); //Convierte MM en un valor numerico
		segundos = Integer.parseInt(segundosString); //Convierte SS en un valor numerico
		
		
		
		if( (horas <= 24 && horas >= 0) && (minutos <= 60 && minutos >= 0) && (segundos <= 60 && segundos >= 0) && hora.length() == 8 ) {
			
			System.out.println("\nLa fecha introducida es correcta\n");
			
			if (segundos == 60) { //En caso de ser 60, suma 1 al valor minutos
				
				++minutos;
				segundos = 0;
				
			}
			
			if (minutos == 60) { //En caso de ser 60, suma 1 al valor segundos
				
				++horas;
				minutos = 0;
				
			}
			
			if (horas == 24) { //En caso de ser 24 establece el valor en 0 para el correcto funcionamiento del programa
				
				horas = 0;
				
			}
			
			
			if (horas > 12) { //En caso de ser mas de las 12 PM
			
				horasRestantesAM = 23-horas; //Calcula las horas restantes hasta las 12 AM
				horasRestantesPM = (23-horas)+11; //Calcula las horas restantes hasta las 12 PM
				
				minutosRestantes = 60-minutos; //Calcula los minutos restantes
				segundosRestantes = 60-minutos; //Calcula los segundos restantes
				
				System.out.println("Faltan "+horasRestantesAM+" horas, "+minutosRestantes+" minutos y "+segundosRestantes+" segundos hasta las 12 AM");
				System.out.println("Faltan "+horasRestantesPM+" horas, "+minutosRestantes+" minutos y "+segundosRestantes+" segundos hasta las 12 PM");
		
			} else { //En caso de ser menos de las 12 PM
			
			horasRestantesAM = 23-horas; //Calcula las horas restantes hasta las 12 AM
			horasRestantesPM = 12-horas; //Calcula las horas restantes hasta las 12 PM
			
			minutosRestantes = 60-minutos; //Calcula los minutos restantes
			segundosRestantes = 60-minutos; //Calcula los segundos restantes
			
			System.out.println("Faltan "+horasRestantesAM+" horas, "+minutosRestantes+" minutos y "+segundosRestantes+" segundos hasta las 12 AM");
			System.out.println("Faltan "+horasRestantesPM+" horas, "+minutosRestantes+" minutos y "+segundosRestantes+" segundos hasta las 12 PM");
			
			}
			
			switch (horas) { //Convierte HH en formato texto
			
			case 0: System.out.print("\nSon las doce ");
			break;
			case 1: System.out.print("\nEs la una ");
			break;
			case 2: System.out.print("\nSon las dos ");
			break;
			case 3: System.out.print("\nSon las tres ");
			break;
			case 4: System.out.print("\nSon las catro ");
			break;
			case 5: System.out.print("\nSon las cinco ");
			break;
			case 6: System.out.print("\nSon las seis ");
			break;
			case 7: System.out.print("\nSon las siete ");
			break;
			case 8: System.out.print("\nSon las ocho ");
			break;
			case 9: System.out.print("\nSon las nueve ");
			break;
			case 10: System.out.print("\nSon las diez ");
			break;
			case 11: System.out.print("\nSon las once ");
			break;
			case 12: System.out.print("\nSon las doce ");
			break;
			case 13: System.out.print("\nEs la una ");
			break;
			case 14: System.out.print("\nSon las dos ");
			break;
			case 15: System.out.print("\nSon las tres ");
			break;
			case 16: System.out.print("\nSon las catro ");
			break;
			case 17: System.out.print("\nSon las cinco ");
			break;
			case 18: System.out.print("\nSon las seis ");
			break;
			case 19: System.out.print("\nSon las siete ");
			break;
			case 20: System.out.print("\nSon las ocho ");
			break;
			case 21: System.out.print("\nSon las nueve ");
			break;
			case 22: System.out.print("\nSon las diez ");
			break;
			case 23: System.out.print("\nSon las once ");
			break;
			
			}
			
			switch (minutos) { //Convierte MM en formato texto
			
			case 1: System.out.print("y un minuto");
			break;
			case 2: System.out.print("y dos minutos");
			break;
			case 3: System.out.print("y tres minutos");
			break;
			case 4: System.out.print("y cuatro minutos");
			break;
			case 5: System.out.print("y cinco minutos");
			break;
			case 6: System.out.print("y seis minutos");
			break;
			case 7: System.out.print("y siete minutos");
			break;
			case 8: System.out.print("y ocho minutos");
			break;
			case 9: System.out.print("y nueve minutos");
			break;
			case 10: System.out.print("y diez minutos");
			break;
			case 11: System.out.print("y once minutos");
			break;
			case 12: System.out.print("y doce minutos");
			break;
			case 13: System.out.print("y trece minutos");
			break;
			case 14: System.out.print("y catorce minutos");
			break;
			case 15: System.out.print("y cuarto");
			break;
			case 16: System.out.print("y dieciseis minutos");
			break;
			case 17: System.out.print("y diecisiete minutos");
			break;
			case 18: System.out.print("y dieciocho minutos");
			break;
			case 19: System.out.print("y diecinueve minutos");
			break;
			case 20: System.out.print("y veinte minutos");
			break;
			case 21: System.out.print("y veintiuno minutos");
			break;
			case 22: System.out.print("y veintidos minutos");
			break;
			case 23: System.out.print("y veintitres minutos");
			break;
			case 24: System.out.print("y veinticuatro minutos");
			break;
			case 25: System.out.print("y veinticinco minutos");
			break;
			case 26: System.out.print("y veintiséis minutos");
			break;
			case 27: System.out.print("y veintisiete minutos");
			break;
			case 28: System.out.print("y veintiocho minutos");
			break;
			case 29: System.out.print("y veintinueve minutos");
			break;
			case 30: System.out.print("y media");
			break;
			case 31: System.out.print("y treintaiún minutos");
			break;
			case 32: System.out.print("y treinta y dos minutos");
			break;
			case 33: System.out.print("y treinta y tres minutos");
			break;
			case 34: System.out.print("y treinta y cuatro minutos");
			break;
			case 35: System.out.print("y treinta y cinco minutos");
			break;
			case 36: System.out.print("y treinta y seis minutos");
			break;
			case 37: System.out.print("y treinta y siete minutos");
			break;
			case 38: System.out.print("y treinta y ocho minutos");
			break;
			case 39: System.out.print("y treinta y nueve minutos");
			break;
			case 40: System.out.print("y cuarenta minutos");
			break;
			case 41: System.out.print("y cuarentaiún minutos");
			break;
			case 42: System.out.print("y cuarenta y dos minutos");
			break;
			case 43: System.out.print("y cuarenta y tres minutos");
			break;
			case 44: System.out.print("y cuarenta y cuatro minutos");
			break;
			case 45: System.out.print("y cuarenta y cinco minutos");
			break;
			case 46: System.out.print("y cuarenta y seis minutos");
			break;
			case 47: System.out.print("y cuarenta y siete minutos");
			break;
			case 48: System.out.print("y cuarenta y ocho minutos");
			break;
			case 49: System.out.print("y cuarenta y nueve minutos");
			break;
			case 50: System.out.print("y cicuenta minutos");
			break;
			case 51: System.out.print("y cincuentaiún minutos");
			break;
			case 52: System.out.print("y cincuenta y dos minutos");
			break;
			case 53: System.out.print("y cincuenta y tres minutos");
			break;
			case 54: System.out.print("y cincuenta y cuatro minutos");
			break;
			case 55: System.out.print("y cincuenta y cinco minutos");
			break;
			case 56: System.out.print("y cincuenta y seis minutos");
			break;
			case 57: System.out.print("y cincuenta y siete minutos");
			break;
			case 58: System.out.print("y cincuenta y ocho minutos");
			break;
			case 59: System.out.print("y cincuenta y nueve minutos");
			break;
			
			
			}
			
		} else { //En caso de que el usuario haya incumplido una de las condiciones (24>hora>0) (60>minutos>0) (60>segundos>0) (La cadena hora no tiene la longitud estabelcida)
			
			System.out.println("\nLa fecha introducida no es correcta");
			
		}
		
	}
}