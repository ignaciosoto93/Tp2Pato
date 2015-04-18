package com.utn.modelo;
import java.util.Scanner;

public class Enfermero extends Profesion{
	Scanner scanner = new Scanner(System.in);
	
	private static String nombre;
	private static String apellido;
	private static int dni;
	private static int edad;
	private static String sintomas;
	private static String heridas;
	private static String inyeccion;
	private static String primerosAuxilios;
	
	
	
	@Override
	public void ingresoNombreYApellido(){
		System.out.println("Ingrese nombre del paciente");
		nombre = scanner.nextLine();
		System.out.println("Ingrese apellido del paciente");
		apellido = scanner.nextLine();
	}
	@Override
	public void ingresoDNI() {
		System.out.println("Ingresar DNI del paciente");
		dni = scanner.nextInt();
		
	}
	@Override
	public void ingresoEdad() {
		System.out.println("Ingresar Edad del paciente");
		edad = scanner.nextInt();
		
	}
	@Override
	public void ingresoSintomas() {
		System.out.println("Ingrese sintomas que padece el paciente");
		sintomas = scanner.nextLine();
		sintomas = scanner.nextLine();
		
	}
	public void heridasLeves(){
		System.out.println("¿El paciente presenta heridas leves?");
	heridas = scanner.nextLine();
	}
	public void inyeccion(){
		System.out.println("¿Se le debe inyectar algo?: ");
	inyeccion = scanner.nextLine();
	}
	public void primerosAuxilios(){
		System.out.println("¿Se le debe suministrar primeros auxilios al paciente?: ");
	primerosAuxilios = scanner.nextLine();
	}
	public void planilla(){
		System.out.println("================================================");
		System.out.println("La planilla del paciente es la  siguiente: \n" + 
				"\nNombre : " + nombre +
				"\nApellido : " + apellido +
				"\nD.N.I: " + dni +
				"\nEdad: " + edad +
				"\nSintomas: " + sintomas +
				"\n¿Posee heridas leves?: " + heridas +
				"\n¿Se le debe inyectar algo? : " + inyeccion +
				"\n¿Se le debe suministrar primeros auxilios?: " + primerosAuxilios +
				"\n===============================================================");
		}

	}


