package com.utn.modelo;

import java.util.Scanner;

public class Cirujano extends Profesion {
	Scanner scanner = new Scanner(System.in);
	private static String nombre;
	private static String apellido;
	private static int dni;
	private static int edad;
	private static String sintomas;
	private static String operar;
	private static String fechaoperacion;
	private static int recuperacion;
	private static String medicacion;
	private static int posOperatorio;
	
	
	@Override
	public void ingresoNombreYApellido() {
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
	public void operar(){
		System.out.println("¿Se debe operar?:");
	operar = scanner.nextLine();
	}
	public void fechaOperacion(){
		System.out.println("Ingresar fecha de la operación (DD/MM/AAAA) : ");
	fechaoperacion = scanner.nextLine();
	}
	public void recuperacion(){
		System.out.println("Ingresar cantidad de días que debe necesitar para recuperación: ");
	recuperacion = scanner.nextInt();
	}
	public void recetarMedicacion(){
		System.out.println("Ingresar la medicación que debe recibir el paciente: ");
	medicacion = scanner.nextLine();
	medicacion = scanner.nextLine();
	}
	public void cantidadDiasPosOperatorio(){
		System.out.println("Ingresar cantidad de días que llevara el posOperatorio: ");
	posOperatorio = scanner.nextInt();
	}
	public void planilla(){
		System.out.println("================================================");
		System.out.println("La planilla del paciente es la  siguiente: \n" + 
				"\nNombre : " + nombre +
				"\nApellido : " + apellido +
				"\nD.N.I: " + dni +
				"\nEdad: " + edad +
				"\nSintomas: " + sintomas +
				"\n¿Se debe operar?: " + operar +
				"\nFecha de operación: " + fechaoperacion +
				"\nCantidad de días de recuperacion: " + recuperacion +
				"\nMedicación que se le debe dar al paciente: " + medicacion +
				"\nCantidad de días de pos-operatorio: " + posOperatorio +
				"\n=======================================================");
}

	}
