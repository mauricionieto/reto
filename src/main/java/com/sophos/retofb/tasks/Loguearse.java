package com.sophos.retofb.tasks;

import java.util.List;

import org.openqa.selenium.Alert;

import com.sophos.retofb.ui.LoginPages;
import com.sophos.retofb.webdriver.WebDriverRemote;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Loguearse implements Task{

	private List<String> datos;

	public Loguearse(List<String> datos) {
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(datos.get(0)).into(LoginPages.TXTUSUARIO),
				Enter.theValue(datos.get(1)).into(LoginPages.TXTPASSWORD),
				Click.on(LoginPages.BTNLOGIN));
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Alert alert = WebDriverRemote.driver.switchTo().alert();
//		alert.accept();
		
		
	}

	public static Loguearse con(List<String> datos)
	{
		return Instrumented.instanceOf(Loguearse.class).withProperties(datos);
	}
	
}
