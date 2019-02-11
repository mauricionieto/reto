package com.sophos.retofb.stepdefinitions;


import static com.sophos.retofb.ui.FacebookPrincipialPages.NAMEPERFIL;

import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.sophos.retofb.questions.ElResultado;
import com.sophos.retofb.tasks.BuscarPerfil;
import com.sophos.retofb.tasks.IngresarPerfil;
import com.sophos.retofb.tasks.Loguearse;
import com.sophos.retofb.tasks.OpenUrl;
import com.sophos.retofb.ui.FacebookPrincipialPages;
import com.sophos.retofb.ui.UrlPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BusquedaStepDefinitions {
	
	public static Actor mau = new Actor("MAURICIO");
	
	@Managed(driver = "chrome")
	private WebDriver theBrowser;
	
	private UrlPage pagesUrl;
	
	@Before
	public void setup() {
		mau.can(BrowseTheWeb.with(theBrowser));
	}
	
	@Given("^Que el usuario estar logueado en Facebook$")
	public void queElUsuarioEstarLogueadoEnFacebook(List<String> datos) {
		mau.wasAbleTo(OpenUrl.on(pagesUrl));
		mau.attemptsTo(Loguearse.con(datos));
	}

	@When("^El busque (.*) en la barra de busqueda$")
	public void elBusqueEnLaBarraDeBusqueda(String nombre) {
	    mau.attemptsTo(BuscarPerfil.de(nombre));
	}

	@When("^Ingrese al perfil seleccionado$")
	public void ingreseAlPerfilSeleccionado() {
	    mau.attemptsTo(IngresarPerfil.on());
	}

	@Then("^El podra ver el (.*) en perfil que ingreso$")
	public void elPodraVerElEnPerfilQueIngreso(String texto) {
		mau.should(GivenWhenThen.seeThat(ElResultado.es(NAMEPERFIL), Matchers.equalTo(IngresarPerfil.nombre)));
	 }
}
