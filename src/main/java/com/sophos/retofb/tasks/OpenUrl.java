package com.sophos.retofb.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUrl implements Task{

	private PageObject url;

	public OpenUrl(PageObject url) {
		this.url = url;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(url));
		
	}

	public static OpenUrl on(PageObject url)
	{
		return Instrumented.instanceOf(OpenUrl.class).withProperties(url);
	}
}
