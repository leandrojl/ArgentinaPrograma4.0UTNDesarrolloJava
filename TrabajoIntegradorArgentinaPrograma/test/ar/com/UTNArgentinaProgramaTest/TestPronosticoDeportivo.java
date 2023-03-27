package ar.com.UTNArgentinaProgramaTest;

import org.junit.Test;

import ar.com.UTNArgentinaPrograma.Clases.Equipo;
import ar.com.UTNArgentinaPrograma.Clases.Partido;
import ar.com.UTNArgentinaPrograma.Clases.Persona;
import ar.com.UTNArgentinaPrograma.Clases.Pronostico;
import ar.com.UTNArgentinaPrograma.Clases.RESULTADO;
import ar.com.UTNArgentinaPrograma.Clases.Ronda;
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

@Test
public void queSePuedaCrearUnaPersona() {
	Persona persona =dadoQueTengoUnaPersona();
	entoncesPudeCrearLaPersona(persona);
}

@Test
public void queUnaPersonaTengaPronosticos() {
	Persona persona =dadoQueTengoUnaPersona();
	Pronostico pronostico = dadoQueTengoUnPronostico();
	
	cuandoUnaPersonaTieneUnPronostico(persona, pronostico);
	
	entoncesLaPersonaTieneUnPronostico(persona, pronostico);
}

@Test
public void queSePuedaCrearUnaRondaConUnPartido() {
	Ronda ronda = dadoQueTengoUnaRonda();
	Partido partido = dadoQueTengoUnPartido();
	cuandoAgregoElPartidoALaRonda(ronda, partido);
	entoncesTengoUnaRondaConUnPartido(ronda, partido);
}

@Test
public void queSePuedaCrearUnPartidoConDosEquiposYGaneUnEquipoDosAUno() {
	Ronda ronda = dadoQueTengoUnaRonda();
	Partido partido = dadoQueTengoUnPartido();
	//dadoQueTengoDosEquipos
	Equipo equipo1 = new Equipo("Arabia Saudita");
	Equipo equipo2 = new Equipo("Argentina");
	cuandoGuardoLosEquiposEnElPartido(partido, equipo1, equipo2);
	cuandoAgregoElPartidoALaRonda(ronda, partido);
	cuandoUnPartidoLeOtorgoUnResultado(partido, 2,1);
	entoncesElEquipoUnoLeGanoAlEquipoDosConElResultadoDeDosAUno(partido,2,1);
}

@Test
public void queSePuedaCrearUnPronosticoConUnaRondaYUnPartido() {
	Pronostico pronostico = dadoQueTengoUnPronostico();
	Ronda ronda = dadoQueTengoUnaRonda();
	Partido partido = dadoQueTengoUnPartido();
	Equipo equipo1 = new Equipo("Arabia Saudita");
	Equipo equipo2 = new Equipo("Argentina");
	cuandoAgregoLaRondaAlPronostico(pronostico, ronda);
	entoncesTengoElPronosticoEnLaRonda(ronda, pronostico);
}

@Test
public void queUnaPersonaTengaUnPronosticoConUnaRondaConUnPartido() {
	Persona persona =dadoQueTengoUnaPersona();
	Pronostico pronostico = dadoQueTengoUnPronostico();
	Ronda ronda = dadoQueTengoUnaRonda();
	Partido partido = dadoQueTengoUnPartido();
	Equipo equipo1 = new Equipo("Arabia Saudita");
	Equipo equipo2 = new Equipo("Argentina");
	cuandoGuardoLosEquiposEnElPartido(partido, equipo1, equipo2);
	cuandoAgregoElPartidoALaRonda(ronda, partido);
	cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(pronostico,ronda);
	cuandoUnaPersonaTieneUnPronostico(persona, pronostico);
	entoncesLaPersonaTieneUnPronosticoConUnaRondaConUnPartido(persona, pronostico, ronda);
}

@Test
public void queUnaPersonaTengaUnPronosticoConUnaRondaConDosPartidosArabiaSauditaVsArgentinaSaleDosAUnoYPoloniaVsMexicoSaleCeroACero() {
	Persona persona =dadoQueTengoUnaPersona();
	Pronostico pronostico = dadoQueTengoUnPronostico();
	Ronda ronda = dadoQueTengoUnaRonda();
	Partido partidoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
	Partido partidoMexicoVsPolonia = dadoQueTengoUnPartido();
	Equipo equipo1 = new Equipo("Arabia Saudita");
	Equipo equipo2 = new Equipo("Argentina");
	Equipo equipo3 = new Equipo("Mexico");
	Equipo equipo4 = new Equipo("Polonia");
	
	cuandoGuardoLosEquiposEnElPartido(partidoArabiaSauditaVsArgentina, equipo1, equipo2);
	cuandoGuardoLosEquiposEnElPartido(partidoMexicoVsPolonia, equipo3, equipo4);
	cuandoUnPartidoLeOtorgoUnResultado(partidoArabiaSauditaVsArgentina, 2,1);
	cuandoUnPartidoLeOtorgoUnResultado(partidoMexicoVsPolonia, 0,0);
	cuandoAgregoElPartidoALaRonda(ronda, partidoArabiaSauditaVsArgentina);
	cuandoAgregoElPartidoALaRonda(ronda, partidoMexicoVsPolonia);
	cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(pronostico,ronda);
	cuandoUnaPersonaTieneUnPronostico(persona, pronostico);
	entoncesTengoUnPronosticoConUnaRondaConElPartidoArabiaSauditaVsArgentinaSaleDosAUno(persona,partidoArabiaSauditaVsArgentina, equipo1, equipo2);
	entoncesTengoUnPronosticoConUnaRondaConElPartidoMexicoVsPoloniaSaleCeroACero(persona,partidoMexicoVsPolonia, equipo3, equipo4);
}



private void entoncesTengoUnPronosticoConUnaRondaConElPartidoMexicoVsPoloniaSaleCeroACero(Persona persona, Partido partido,
		Equipo mexico, Equipo polonia) {
	//VERIFICAR COMO ACCEDER AL ARRAYLIST DE PARTIDOS PARA PODER IDENTIFICAR X PARTIDO
	Assert.assertTrue(persona.getPronostico().getRondas().get(0).getPartidos().get(1).getEquipo1().equals(mexico) && persona.getPronostico().getRondas().get(0).getPartidos().get(0).getEquipo2().equals(polonia));
	
}

private void entoncesTengoUnPronosticoConUnaRondaConElPartidoArabiaSauditaVsArgentinaSaleDosAUno(Persona persona, Partido partido,
		Equipo arabiaSaudita, Equipo argentina) {
	//VERIFICAR COMO ACCEDER AL ARRAYLIST DE PARTIDOS PARA PODER IDENTIFICAR X PARTIDO
	Assert.assertTrue(persona.getPronostico().getRondas().get(0).getPartidos().get(0).getEquipo1().equals(arabiaSaudita) && persona.getPronostico().getRondas().get(0).getPartidos().get(0).getEquipo2().equals(argentina));
	
}

private void entoncesLaPersonaTieneUnPronostico(Persona persona, Pronostico pronostico) {
	Assert.assertTrue(persona.getPronostico().equals(pronostico));
	
}

private void entoncesTengoElPronosticoEnLaRonda(Ronda ronda, Pronostico pronostico) {
	Assert.assertTrue(pronostico.getRondas().contains(ronda));
}

private void cuandoAgregoLaRondaAlPronostico(Pronostico pronostico, Ronda ronda) {
	pronostico.agregarRonda(ronda);
}

private void cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(Pronostico pronostico, Ronda ronda) {
	pronostico.agregarRonda(0,ronda);
}

@SuppressWarnings("deprecation")
private void entoncesLaPersonaTieneUnPronosticoConUnaRondaConUnPartido(Persona persona, Pronostico pronostico, Ronda ronda) {
	Assert.assertTrue(persona.getPronostico().getRondas().get(0).equals(ronda));
}

private void cuandoUnPartidoLeOtorgoUnResultado(Partido partido, Integer golesEquipoUno, Integer golesEquipoDos) {
	partido.setGolesEquipoUno(golesEquipoUno);
	partido.setGolesEquipoDos(golesEquipoDos);	
}

private void entoncesElEquipoUnoLeGanoAlEquipoDosConElResultadoDeDosAUno(Partido partido, Integer golesEquipoUno, Integer golesEquipoDos) {
	Assert.assertTrue(partido.getGolesEquipoUno() == 2);
	Assert.assertTrue(partido.getGolesEquipoDos() == 1);
}

private void cuandoUnEquipoGanaUnoACero(Partido partido, int golesEquipoUno,int golesEquipoDos) {
	partido.setGolesEquipoUno(golesEquipoUno);
	partido.setGolesEquipoDos(golesEquipoDos);
}

private void entoncesTengoUnaRondaConUnPartido(Ronda ronda, Partido partido) {
	Assert.assertTrue(ronda.getPartidos().contains(partido));	
}

private void cuandoAgregoElPartidoALaRonda(Ronda ronda, Partido partido) {
	ronda.agregarPartido(partido);
}

private Partido dadoQueTengoUnPartido() {
	return new Partido();
}

private Ronda dadoQueTengoUnaRonda() {
	return new Ronda();
}

private void cuandoUnaPersonaTieneUnPronostico(Persona persona, Pronostico pronostico) {	
	persona.setPronostico(pronostico);	
}

private Pronostico dadoQueTengoUnPronostico() {
	return new Pronostico();
}

private void entoncesPudeCrearLaPersona(Persona persona) {
	Assert.assertTrue(persona != null);
}

private Persona dadoQueTengoUnaPersona() {
	return new Persona();
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
