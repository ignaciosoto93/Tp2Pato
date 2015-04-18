package com.utn.modelo;

import java.util.Scanner;

public class NuevoRol1 extends Profesion {
	Scanner scanner = new Scanner(System.in);
	
	private static String nom;
	private static String apellido;
	private static int dni;
	private static int edad;
	private static String sintomas;
	
	@Override
	public void ingresoNombreYApellido() {		
	System.out.println("Ingrese nombre del paciente");
	nom = scanner.nextLine();
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
	public void ingresoSintomas(){
		System.out.println("Ingrese sintomas que padece el paciente");
	sintomas = scanner.nextLine();
	sintomas = scanner.nextLine();
	}
	@Override
	public void planilla() {
		System.out.println("================================================");
		System.out.println("La planilla del paciente es la  siguiente: \n" + 
				"\nNombre : " + nom +
				"\n Apellido : " + apellido +
				"\nD.N.I: " + dni +
				"\nEdad: " + edad +
				"\nSintomas: " + sintomas +
				"\n==============================================");
		
	}

}
