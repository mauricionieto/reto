package com.sophos.retofb;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

public class Esperar implements Interaction{

	private int segundos;
	
	public Esperar(int segundos) {
		super();
		this.segundos = segundos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Performable estos(int segundos)
	{
		return Instrumented.instanceOf(Esperar.class).withProperties(segundos);
	}
}
