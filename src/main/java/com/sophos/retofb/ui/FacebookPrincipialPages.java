package com.sophos.retofb.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FacebookPrincipialPages {

	public static final Target TXTBUSQUEDA = Target.the("").locatedBy("//input[@name = 'q']");
	public static final Target BTNBUSQUEDA = Target.the("").locatedBy("//button[@data-testid = 'facebar_search_button']");
	public static final Target BTNVERTODOS = Target.the("").locatedBy("//a[@id='xt_uniq_7']");
	public static final Target BTNPERFI= Target.the("").locatedBy("//a[@class='_32mo']");
	public static final Target TXTNOMBRE = Target.the("").locatedBy("//a[@class ='_2nlw _2nlv']");
	public static final Target BTNPERFIL = Target.the("").locatedBy("//div[@class='_19_p _6rch']//div[@class='_52eh _5bcu']");
	public static final Target NAMEPERFIL = Target.the("").locatedBy("//a[@class='_2nlw _2nlv']");
	public static final Target BTNVERTODAS = Target.the("").locatedBy("//a[@id='xt_uniq_23']");
}
