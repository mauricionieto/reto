package com.sophos.retofb.tasks;

import java.util.Random;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class EscogerPerfil implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		//List<WebElementFacade> perfiles = FacebookPrincipialPages.BTNPERFIL.resolveAllFor(actor);
		Random random = new Random();

		
	}

	public static EscogerPerfil es()
	{
		return Instrumented.instanceOf(EscogerPerfil.class).withProperties();
	}
}
