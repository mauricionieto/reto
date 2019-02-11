package com.sophos.retofb.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPages {

	public static final Target TXTUSUARIO=Target.the("").located(By.id("email"));
	
	public static final Target TXTPASSWORD=Target.the("").located(By.name("pass"));
	
	public static final Target BTNLOGIN=Target.the("").located(By.id("u_0_2"));
	
	//public static final Target BTNLOGIN=Target.the("").locatedBy("//input[@value='Entrar']");
	
}



// u_0_2    u_0_8