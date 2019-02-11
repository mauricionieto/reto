package com.sophos.retofb.tasks;

import com.sophos.retofb.Esperar;
import com.sophos.retofb.ui.FacebookPrincipialPages;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BuscarPerfil implements Task{

	private String perfil;
	
	public BuscarPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(perfil).into(FacebookPrincipialPages.TXTBUSQUEDA));
	
		actor.attemptsTo(Click.on(FacebookPrincipialPages.BTNBUSQUEDA),
				Esperar.estos(5));
		
	}

	public static BuscarPerfil de(String perfil)
	{
		return Instrumented.instanceOf(BuscarPerfil.class).withProperties(perfil);
	}
	
}
