package ar.com.UTNArgentinaProgramaTest;

import org.junit.Test;
import org.junit.Assert;
import ar.com.UTNArgentinaPrograma.Clases.Equipo;
import ar.com.UTNArgentinaPrograma.Clases.Partido;
import ar.com.UTNArgentinaPrograma.Clases.Persona;
import ar.com.UTNArgentinaPrograma.Clases.Pronostico;
import ar.com.UTNArgentinaPrograma.Clases.RESULTADO;
import ar.com.UTNArgentinaPrograma.Clases.Ronda;


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
	entoncesTengoElPronosticoConLaRonda(ronda, pronostico);
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
	//GIVEN
	Persona persona =dadoQueTengoUnaPersona(); //devuelve el constructor new Persona();
	Pronostico pronostico = dadoQueTengoUnPronostico();
	Ronda ronda = dadoQueTengoUnaRonda();
	Partido partidoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
	Partido partidoMexicoVsPolonia = dadoQueTengoUnPartido();
	Equipo equipo1 = new Equipo("Arabia Saudita");
	Equipo equipo2 = new Equipo("Argentina");
	Equipo equipo3 = new Equipo("Mexico");
	Equipo equipo4 = new Equipo("Polonia");
	//WHEN
	cuandoGuardoLosEquiposEnElPartido(partidoArabiaSauditaVsArgentina, equipo1, equipo2);
	cuandoGuardoLosEquiposEnElPartido(partidoMexicoVsPolonia, equipo3, equipo4);
	cuandoUnPartidoLeOtorgoUnResultado(partidoArabiaSauditaVsArgentina, 2,1);
	cuandoUnPartidoLeOtorgoUnResultado(partidoMexicoVsPolonia, 0,0);
	cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(ronda, partidoArabiaSauditaVsArgentina);
	cuandoAgregoElPartidoEnLaPosicionUnoDeLaRonda(ronda, partidoMexicoVsPolonia);
	//cuandoAgregoElPartidoALaRonda(ronda, partidoArabiaSauditaVsArgentina);
	//cuandoAgregoElPartidoALaRonda(ronda, partidoMexicoVsPolonia);
	cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(pronostico,ronda);
	cuandoUnaPersonaTieneUnPronostico(persona, pronostico);
	//THEN
	entoncesLaPersonaTieneUnPronostico(persona, pronostico);
	entoncesTengoElPronosticoConLaRonda(ronda, pronostico);
	entoncesTengoUnaRondaConUnPartido(ronda, partidoArabiaSauditaVsArgentina);
	entoncesTengoUnaRondaConUnPartido(ronda, partidoMexicoVsPolonia);
	entoncesTengoUnPartidoArabiaSauditaVsArgentina(partidoArabiaSauditaVsArgentina, equipo1, equipo2);
	entoncesTengoUnPartidoMexicoVsPolonia(partidoMexicoVsPolonia, equipo3, equipo4);
	entoncesElPartidoArabiaSauditaVsArgentinaSaleDosAUno(partidoArabiaSauditaVsArgentina,2,1);
	entoncesElPartidoMexicoVsPoloniaSaleCeroACero(partidoMexicoVsPolonia, 0, 0);
}

@Test
public void queUnaPersonTengaUnPronosticoConUnPartidoConResultado() {
	//GIVEN
	Equipo arabiaSaudita = new Equipo("Arabia Saudita");
	Equipo argentina = new Equipo("Argentina");
	Persona persona =dadoQueTengoUnaPersona(); //devuelve el constructor new Persona();
	Pronostico pronostico = dadoQueTengoUnPronostico();
	Ronda ronda = dadoQueTengoUnaRonda();
	Partido partidoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
	//WHEN
	cuandoGuardoLosEquiposEnElPartido(partidoArabiaSauditaVsArgentina, arabiaSaudita, argentina);
	cuandoLaPersonaTieneUnResultadoDelEquipo(partidoArabiaSauditaVsArgentina, argentina, RESULTADO.GANADOR);
	cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(ronda, partidoArabiaSauditaVsArgentina);
	cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(pronostico,ronda);
	cuandoUnaPersonaTieneUnPronostico(persona, pronostico);
	//THEN
	entoncesEnElPartidoArgentinaTieneUnResultadoGanador(partidoArabiaSauditaVsArgentina, RESULTADO.GANADOR);
	entoncesEnElPartidoArabiaSauditaTieneUnResultadoPerdedor(partidoArabiaSauditaVsArgentina, RESULTADO.PERDEDOR);
	
}

@Test
public void queUnPronosticoAcierteUnResultado() {
	//GIVEN A PERSON WITH A SPORTS FORECAST
	Persona persona =dadoQueTengoUnaPersona();
	Pronostico pronostico = dadoQueTengoUnPronostico();
	Ronda rondaPronostico = dadoQueTengoUnaRonda();
	Partido partidoPronosticoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
	Equipo equipoPronosticoArabiaSaudita = new Equipo("Arabia Saudita");
	Equipo equipoPronosticoArgentina = new Equipo("Argentina");
	
	//WHEN

	cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(pronostico,rondaPronostico);
	cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(rondaPronostico, partidoPronosticoArabiaSauditaVsArgentina);
	cuandoGuardoLosEquiposEnElPartido(partidoPronosticoArabiaSauditaVsArgentina, equipoPronosticoArabiaSaudita,  equipoPronosticoArgentina);
	cuandoLaPersonaTieneUnResultadoDelEquipo(partidoPronosticoArabiaSauditaVsArgentina, equipoPronosticoArgentina, RESULTADO.GANADOR);
	

	cuandoUnaPersonaTieneUnPronostico(persona, pronostico);
	cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(pronostico,rondaPronostico);
	cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(rondaPronostico, partidoPronosticoArabiaSauditaVsArgentina);
	cuandoGuardoLosEquiposEnElPartido(partidoPronosticoArabiaSauditaVsArgentina, equipoPronosticoArabiaSaudita,  equipoPronosticoArgentina);
	cuandoLaPersonaTieneUnResultadoDelEquipo(partidoPronosticoArabiaSauditaVsArgentina, equipoPronosticoArabiaSaudita, RESULTADO.GANADOR);
		

	//GIVEN A RESULT BETWEEN TWO TEAMS
	Ronda rondaResultados = dadoQueTengoUnaRonda();
	Partido partidoResultadoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
	Equipo equipoResultadoArabiaSaudita = new Equipo("Arabia Saudita");
	Equipo equipoResultadoArgentina = new Equipo("Argentina");
	
	//WHEN
	cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(rondaResultados, partidoResultadoArabiaSauditaVsArgentina);
	cuandoGuardoLosEquiposEnElPartido(partidoResultadoArabiaSauditaVsArgentina,equipoResultadoArabiaSaudita , equipoResultadoArgentina);
	cuandoUnPartidoLeOtorgoUnResultado(partidoResultadoArabiaSauditaVsArgentina, 2,1);
	cuandoLeAsignoUnResultadoElEquipo(partidoResultadoArabiaSauditaVsArgentina, equipoPronosticoArabiaSaudita, RESULTADO.GANADOR);
	//cuandoLeAsignoUnResultadoElEquipo(partidoResultadoArabiaSauditaVsArgentina, equipoPronosticoArgentina, RESULTADO.PERDEDOR );
	//THEN
	entoncesLaPersonaAcertoElPronostico(pronostico,partidoResultadoArabiaSauditaVsArgentina);
}

@Test
public void unaPersonaAciertaUnPartidoDeUnPronosticoYSumaUnPunto() {
	//GIVEN A PERSON WITH A SPORTS FORECAST
		Persona persona =dadoQueTengoUnaPersona();
		Pronostico pronostico = dadoQueTengoUnPronostico();
		Ronda rondaPronostico = dadoQueTengoUnaRonda();
		Partido partidoPronosticoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
		Equipo equipoPronosticoArabiaSaudita = new Equipo("Arabia Saudita");
		Equipo equipoPronosticoArgentina = new Equipo("Argentina");
		
		//GIVEN A RESULT BETWEEN TWO TEAMS
		Ronda rondaResultados = dadoQueTengoUnaRonda();
		Partido partidoResultadoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
		Equipo equipoResultadoArabiaSaudita = new Equipo("Arabia Saudita");
		Equipo equipoResultadoArgentina = new Equipo("Argentina");
		
		//WHEN
		cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(rondaResultados, partidoResultadoArabiaSauditaVsArgentina);
		cuandoGuardoLosEquiposEnElPartido(partidoResultadoArabiaSauditaVsArgentina,equipoResultadoArabiaSaudita , equipoResultadoArgentina);
		cuandoUnPartidoLeOtorgoUnResultado(partidoResultadoArabiaSauditaVsArgentina, 2,1);
		cuandoLeAsignoUnResultadoElEquipo(partidoResultadoArabiaSauditaVsArgentina, equipoPronosticoArabiaSaudita, RESULTADO.GANADOR);
		//cuandoLeAsignoUnResultadoElEquipo(partidoResultadoArabiaSauditaVsArgentina, equipoPronosticoArgentina, RESULTADO.PERDEDOR );
		
		//WHEN
		cuandoUnaPersonaTieneUnPronostico(persona, pronostico);
		cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(pronostico,rondaPronostico);
		cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(rondaPronostico, partidoPronosticoArabiaSauditaVsArgentina);
		cuandoGuardoLosEquiposEnElPartido(partidoPronosticoArabiaSauditaVsArgentina, equipoPronosticoArabiaSaudita,  equipoPronosticoArgentina);
		cuandoLaPersonaTieneUnResultadoDelEquipo(partidoPronosticoArabiaSauditaVsArgentina, equipoPronosticoArabiaSaudita, RESULTADO.GANADOR);
		cuandoLaPersonaActualizaSuPuntajeEnBaseAlResultado(persona, partidoPronosticoArabiaSauditaVsArgentina,partidoResultadoArabiaSauditaVsArgentina);
		
		//THEN
		entoncesLaPersonaTieneUnPuntoPorAcertarElResultado(persona);
	
	
}

@Test
public void unaPersonaAciertaDosPartidosDeUnPronosticoYSumaDosPuntos() {
			//DADA UNA PERSONA
			Persona persona =dadoQueTengoUnaPersona();
			//DADO UN PRONOSTICO
			Pronostico pronostico = dadoQueTengoUnPronostico();
			//DADO UNA RONDA DEL PRONOSTICO
			Ronda rondaPronostico = dadoQueTengoUnaRonda();
			//DADO UN PARTIDO PRONOSTICO ARABIA SAUDITA VS ARGENTINA
			Partido partidoPronosticoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
			Equipo equipoPronosticoArabiaSaudita = new Equipo("Arabia Saudita");
			Equipo equipoPronosticoArgentina = new Equipo("Argentina");
			//DADO UN PARTIDO DEL PRONOSTICO DE LA PERSONA POLONIA VS MEXICO
			Partido partidoPronosticoMexicoVsPolonia = dadoQueTengoUnPartido();
			Equipo equipoPronosticoPolonia = new Equipo("Polonia");
			Equipo equipoPronosticoMexico = new Equipo("Mexico");
			//DADO LA RONDA CON RESULTADOS
			Ronda rondaResultados = dadoQueTengoUnaRonda();
			//DADO EL PARTIDO CON RESULTADO DE ARABIA SAUDITA VS ARGENTINA
			Partido partidoResultadoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
			Equipo equipoResultadoArabiaSaudita = new Equipo("Arabia Saudita");
			Equipo equipoResultadoArgentina = new Equipo("Argentina");
			//DADO EL PARTIDO CON RESULTADO POLONIA VS MEXICO
			Partido partidoResultadoMexicoVsPolonia = dadoQueTengoUnPartido();
			Equipo equipoResultadoMexico = new Equipo("Mexico");
			Equipo equipoResultadoPolonia = new Equipo("Polonia");
			//CUANDO ORDENO EL PARTIDO CON RESULTADO DE ARABIA SAUDITA VS ARGENTINA
			cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(rondaResultados, partidoResultadoArabiaSauditaVsArgentina);
			cuandoGuardoLosEquiposEnElPartido(partidoResultadoArabiaSauditaVsArgentina,equipoResultadoArabiaSaudita , equipoResultadoArgentina);
			cuandoUnPartidoLeOtorgoUnResultado(partidoResultadoArabiaSauditaVsArgentina, 2,1);
			cuandoLeAsignoUnResultadoElEquipo(partidoResultadoArabiaSauditaVsArgentina, equipoPronosticoArabiaSaudita, RESULTADO.GANADOR);
			//CUANDO ORDENO EL PARTIDO CON RESULTADO DE POLONIA VS MEXICO
			cuandoAgregoElPartidoEnLaPosicionUnoDeLaRonda(rondaResultados, partidoResultadoMexicoVsPolonia);
			cuandoGuardoLosEquiposEnElPartido(partidoResultadoMexicoVsPolonia,equipoResultadoMexico , equipoResultadoPolonia);
			cuandoUnPartidoLeOtorgoUnResultado(partidoResultadoMexicoVsPolonia, 0,0);
			cuandoLeAsignoUnResultadoElEquipo(partidoResultadoMexicoVsPolonia, equipoPronosticoMexico, RESULTADO.EMPATE);
			//CUANDO UNA PERSONA TIENE UN PRONOSTICO
			cuandoUnaPersonaTieneUnPronostico(persona, pronostico);
			//CUANDO ORDENO EL PRONOSTICO DE LA PERSONA
			cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(pronostico,rondaPronostico);
			cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(rondaPronostico, partidoPronosticoArabiaSauditaVsArgentina);
			cuandoAgregoElPartidoEnLaPosicionUnoDeLaRonda(rondaPronostico,partidoPronosticoMexicoVsPolonia);
			cuandoGuardoLosEquiposEnElPartido(partidoPronosticoArabiaSauditaVsArgentina, equipoPronosticoArabiaSaudita,  equipoPronosticoArgentina);
			cuandoGuardoLosEquiposEnElPartido(partidoPronosticoMexicoVsPolonia, equipoPronosticoMexico,  equipoPronosticoPolonia);
			cuandoLaPersonaTieneUnResultadoDelEquipo(partidoPronosticoMexicoVsPolonia, equipoPronosticoMexico, RESULTADO.EMPATE);
			cuandoLaPersonaTieneUnResultadoDelEquipo(partidoPronosticoArabiaSauditaVsArgentina, equipoPronosticoArgentina, RESULTADO.PERDEDOR);
			//CUANDO ACTUALIZO EL PUNTAJE DE LA PERSONA CON PRONOSTICO
			cuandoLaPersonaActualizaSuPuntajeEnBaseAlResultado(persona, partidoPronosticoArabiaSauditaVsArgentina,partidoResultadoArabiaSauditaVsArgentina);
			cuandoLaPersonaActualizaSuPuntajeEnBaseAlResultado(persona, partidoPronosticoMexicoVsPolonia,partidoResultadoMexicoVsPolonia);
			//ENTONCES LA PERSONA TIENE DOS PUNTOS
			entoncesLaPersonaTieneDosPuntosPorAcertarDosResultados(persona);
}

private void entoncesLaPersonaTieneDosPuntosPorAcertarDosResultados(Persona persona) {
	Assert.assertTrue(persona.getPuntaje()==2);
	
}

private void entoncesLaPersonaTieneUnPuntoPorAcertarElResultado(Persona persona) {
	Assert.assertTrue(persona.getPuntaje() == 1);
	
}

private void cuandoLaPersonaActualizaSuPuntajeEnBaseAlResultado(Persona persona,
		Partido partidoPronostico, Partido partidoResultado) {
	persona.actualizarPuntaje(partidoPronostico, partidoResultado);
	
}

private void cuandoLeAsignoUnResultadoElEquipo(Partido partido,
		Equipo equipo, RESULTADO resultado) {
	partido.agregarResultado(equipo, resultado);
	
}

private void entoncesLaPersonaAcertoElPronostico(Pronostico pronostico,
		Partido partido) {
	Assert.assertEquals(pronostico.getRondas().get(0).getPartidos().get(0).getResultadoEquipoUno() , partido.getResultadoEquipoUno());
	
}

private void entoncesEnElPartidoArabiaSauditaTieneUnResultadoPerdedor(Partido partido,RESULTADO resultado) {
	Assert.assertTrue(partido.getResultadoEquipoUno().equals(resultado));
	
}

private void entoncesEnElPartidoArgentinaTieneUnResultadoGanador(Partido partido,RESULTADO resultado) {
	Assert.assertTrue(partido.getResultadoEquipoDos().equals(resultado));
	
}

private void cuandoLaPersonaTieneUnResultadoDelEquipo(Partido partido, Equipo equipo1,
		RESULTADO resultado) {
	
	partido.agregarResultado(equipo1, resultado);
	
}


private void entoncesElPartidoMexicoVsPoloniaSaleCeroACero(Partido partidoMexicoVsPolonia, Integer golesMexico, Integer golesPolonia) {
	Assert.assertTrue(partidoMexicoVsPolonia.getGolesEquipoUno() == golesMexico);
	Assert.assertTrue(partidoMexicoVsPolonia.getGolesEquipoDos() == golesPolonia);
}

private void entoncesElPartidoArabiaSauditaVsArgentinaSaleDosAUno(Partido partidoArabiaSauditaVsArgentina, Integer golesArabiaSaudita,
		Integer golesArgentina) {
	Assert.assertTrue(partidoArabiaSauditaVsArgentina.getGolesEquipoUno() == golesArabiaSaudita);
	Assert.assertTrue(partidoArabiaSauditaVsArgentina.getGolesEquipoDos() == golesArgentina);
	
}

private void entoncesTengoUnPartidoMexicoVsPolonia(Partido partidoMexicoVsPolonia, Equipo equipo3, Equipo equipo4) {
	Assert.assertTrue(partidoMexicoVsPolonia.getEquipo1().equals(equipo3));
	Assert.assertTrue(partidoMexicoVsPolonia.getEquipo2().equals(equipo4));
}

private void entoncesTengoUnPartidoArabiaSauditaVsArgentina(Partido partidoArabiaSauditaVsArgentina, Equipo equipo1,
		Equipo equipo2) {
	Assert.assertTrue(partidoArabiaSauditaVsArgentina.getEquipo1().equals(equipo1));
	Assert.assertTrue(partidoArabiaSauditaVsArgentina.getEquipo2().equals(equipo2));
	
}

private void cuandoAgregoElPartidoEnLaPosicionUnoDeLaRonda(Ronda ronda, Partido partido) {
	ronda.getPartidos().add(1, partido);
	
}

private void cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(Ronda ronda, Partido partidoArabiaSauditaVsArgentina) {
	ronda.getPartidos().add(0, partidoArabiaSauditaVsArgentina);
	
}

private void entoncesLaPersonaTieneUnPronostico(Persona persona, Pronostico pronostico) {
	Assert.assertTrue(persona.getPronostico().equals(pronostico));
	
}

private void entoncesTengoElPronosticoConLaRonda(Ronda ronda, Pronostico pronostico) {
	Assert.assertTrue(pronostico.getRondas().contains(ronda));
}

private void cuandoAgregoLaRondaAlPronostico(Pronostico pronostico, Ronda ronda) {
	pronostico.agregarRonda(ronda);
}

private void cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(Pronostico pronostico, Ronda ronda) {
	pronostico.agregarRonda(0,ronda);
}


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
