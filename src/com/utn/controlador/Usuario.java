package com.utn.controlador;



import java.util.ArrayList;

import com.utn.modelo.Cirujano;
import com.utn.modelo.Enfermero;
import com.utn.modelo.Medico;
import com.utn.modelo.NuevoRol1;
import com.utn.modelo.NuevoRol2;

public class Usuario {
	private ArrayList<Medico> listaMedico = new ArrayList<Medico>();
	private ArrayList<Enfermero> listaEnfermero = new ArrayList<Enfermero>();
	private ArrayList<Cirujano> listaCirujano = new ArrayList<Cirujano>();
	
	public void creoMedico(){
		Medico medico = new Medico();
		medico.ingresoNombreYApellido();
		medico.ingresoDNI();
		medico.ingresoEdad();
		medico.ingresoSintomas();
		medico.ingresoTratamiento();
		medico.recetoMedicamento();
		medico.recetoReposo10dias();
		listaMedico.add(medico);
	
	}
	public void creoCirujano(){
		
	Cirujano cirujano = new Cirujano();
	cirujano.ingresoNombreYApellido();
	cirujano.ingresoDNI();
	cirujano.ingresoEdad();
	cirujano.ingresoSintomas();
	cirujano.operar();
	cirujano.fechaOperacion();
	cirujano.recuperacion();
	cirujano.recetarMedicacion();
	cirujano.cantidadDiasPosOperatorio();
	listaCirujano.add(cirujano);

	}
	public void creoEnfermero(){
		Enfermero enfermero = new Enfermero();
		enfermero.ingresoNombreYApellido();
		enfermero.ingresoDNI();
		enfermero.ingresoEdad();
		enfermero.ingresoSintomas();
		enfermero.heridasLeves();
		enfermero.inyeccion();
		enfermero.primerosAuxilios();
		listaEnfermero.add(enfermero);
	
		}
	public void creoNuevoRol1(){
		NuevoRol1 nuevoRol1 = new NuevoRol1();
		ArrayList<NuevoRol1> listanuevoRol1 = new ArrayList<NuevoRol1>();
		nuevoRol1.ingresoNombreYApellido();
		nuevoRol1.ingresoDNI();
		nuevoRol1.ingresoEdad();
		nuevoRol1.ingresoSintomas();
		listanuevoRol1.add(nuevoRol1);
	}
	public void creoNuevoRol2(){
		NuevoRol2 nuevoRol2 = new NuevoRol2();
		ArrayList<NuevoRol2> listanuevoRol2 = new ArrayList<NuevoRol2>();
		nuevoRol2.ingresoNombreYApellido();
		nuevoRol2.ingresoDNI();
		nuevoRol2.ingresoEdad();
		nuevoRol2.ingresoSintomas();
		listanuevoRol2.add(nuevoRol2);
	}
	public void muestroDatos(){
		for (Medico medico : listaMedico) {
			medico.planilla();
		}
		for (Cirujano cirujano : listaCirujano) {
			cirujano.planilla();
		}
		for (Enfermero enfermero : listaEnfermero) {
			enfermero.planilla();
			
		}
	}




}
