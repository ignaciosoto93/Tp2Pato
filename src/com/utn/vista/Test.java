package com.utn.vista;

import java.util.Scanner;

import com.utn.controlador.Usuario;

public class Test {

	static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {
	Usuario user = new Usuario();
	System.out.println("Ingrese el cargo que lo atendió: ");

String profesion = scanner.nextLine();
		switch (profesion) {
		case "Medico":
			int cont = 0;
			cont ++;
			do {
				System.out.println("Usted puede seguir atendiendo porque es el paciente número: " + cont);
				cont ++;
				user.creoMedico();
			}
			while (cont < 3);
			
			break;
		case "Cirujano":
			int cont2=0;
			cont2 ++;
			do {
				System.out.println("Usted puede seguir atendiendo porque es el paciente número: " + cont2);
				user.creoCirujano();
			} while (cont2 <11);
				
			break;
		case "Enfermero":
			int cont3=0;
			cont3 ++;
			do{ System.out.println("Usted puede seguir atendiendo porque es el paciente número: " + cont3);
			user.creoEnfermero();
			cont3++;
			} while (cont3<11);
			
	/*	case "NuevoRol1":
			int cont4=0;
			cont4 ++;
			do{ System.out.println("Usted puede seguir atendiendo porque es el paciente número: " + cont4);
			Usuario user3 = new Usuario ();
			user3.creoEnfermero();
			} while (cont4<11);
		case "NuevoRol2":
			int cont5=0;
			cont5 ++;
			do{ System.out.println("Usted puede seguir atendiendo porque es el paciente número: " + cont5);
			Usuario user3 = new Usuario ();
			user3.creoEnfermero();
			} while (cont5<11); */
		default:
			System.out.println("Cargo incorrecto");
			break;
			}
		user.muestroDatos();
	}
	
	public static void muestroPlanillas(){
	  
		}
	}
		

		


