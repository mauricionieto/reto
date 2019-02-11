package com.sophos.retofb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ElResultado implements Question<String>{

	protected Target target;
	
	public ElResultado(Target target) {
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(target).viewedBy(actor).asString();
	}

	public static ElResultado es(Target target)
	{
		return new ElResultado(target);
	}
}
