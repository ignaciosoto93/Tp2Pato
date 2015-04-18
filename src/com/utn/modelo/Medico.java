package com.utn.modelo;
import java.util.Scanner;

public class Medico extends Profesion {
	Scanner scanner = new Scanner(System.in);
	private static String nom;
	private static String apellido;
	private static int dni;
	private static int edad;
	private static String sintomas;
	private static String Tratamiento;
	private static String Medicamentos;
	private static String Reposo;
	
	
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
	public void ingresoTratamiento(){
		System.out.println("Ingrese Tratamiento a seguir para el paciente");
	Tratamiento = scanner.nextLine();
	
	}
	public void recetoMedicamento(){
		System.out.println("Ingrese medicamentos a recetar para el paciente");
	Medicamentos = scanner.nextLine();
}
	public void recetoReposo10dias(){
		System.out.println("¿El paciente deberá hacer reposo?");
	Reposo = scanner.nextLine();
	}
	public void planilla(){
		System.out.println("================================================");
		System.out.println("La planilla del paciente es la  siguiente: \n" + 
				"\nNombre : " + nom +
				"\n Apellido : " + apellido +
				"\nD.N.I: " + dni +
				"\nEdad: " + edad +
				"\nSintomas: " + sintomas +
				"\nTratamiento: " + Tratamiento +
				"\nMedicamentos recetados: " + Medicamentos +
				"\n¿Necesita Reposo?: " + Reposo +
				"\n==============================================");
		}
	


}
