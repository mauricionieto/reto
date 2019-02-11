package com.sophos.retofb.tasks;

import java.util.List;
import java.util.Random;

import com.sophos.retofb.Esperar;
import com.sophos.retofb.ui.FacebookPrincipialPages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarPerfil implements Task{

	public static String nombre;
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Entro al ultimo when");
		List<WebElementFacade> perfiles = FacebookPrincipialPages.BTNPERFIL.resolveAllFor(actor);
		Random random = new Random();
		int numero = random.nextInt(perfiles.size() + 1);
		nombre = perfiles.get(numero).getTextValue().toString();
		System.out.println(nombre);
		actor.attemptsTo(Click.on(perfiles.get(numero)),
				Esperar.estos(4));
		
	}

	public static IngresarPerfil on()
	{
		return Instrumented.instanceOf(IngresarPerfil.class).withProperties();
	}
}
