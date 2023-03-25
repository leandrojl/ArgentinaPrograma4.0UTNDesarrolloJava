package ar.com.UTNArgentinaProgramaTest;

import org.junit.Test;

import ar.com.UTNArgentinaPrograma.Clases.Equipo;
import ar.com.UTNArgentinaPrograma.Clases.Partido;
import junit.framework.Assert;

public class TestPronosticoDeportivo {
	
@Test
public void queSePuedaCrearUnPartidoConDosEquipos(){
	
	//dadoQueTengoUnPartidoYDosEquipos
	Partido partido = new Partido();
	Equipo equipo1 = new Equipo("Argentina");
	Equipo equipo2 = new Equipo("Arabia Saudita");
	
	cuandoConsultoSiSeCreoElEquipo1(equipo1);
	cuandoConsultoSiSeCreoElEquipo2(equipo2);
	cuandoGuardoLosEquiposEnElPartido(partido, equipo1, equipo2);
	entoncesSePudoCrearElPartidoConDosEquipos(partido, equipo1, equipo2);
}


private void cuandoGuardoLosEquiposEnElPartido(Partido partido, Equipo equipo1, Equipo equipo2) {
	partido.agregarEquipos(equipo1,equipo2);
	
}


private Boolean cuandoConsultoSiSeCreoElEquipo2(Equipo equipo2) {
	return equipo2 != null;
	
}


private Boolean cuandoConsultoSiSeCreoElEquipo1(Equipo equipo1) {
	return equipo1 != null;
	
}


private void entoncesSePudoCrearElPartidoConDosEquipos(Partido partido, Equipo equipo1, Equipo equipo2) {
	Assert.assertEquals(partido.getEquipo1(), equipo1);
	Assert.assertEquals(partido.getEquipo2(), equipo2);
	
}




}
