package uy.com.cb.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.*;
import com.opensymphony.xwork2.ActionSupport;

@Results({
	@Result(name="bienvenidoResult", location="bienvenidoTile", type="tiles"),
	@Result(name="personasResult", location="personasTile", type="tiles")
	
})

public class LinkAction extends ActionSupport{

	@Action(value="bienvenidoAction")
	public String bienvenido(){
		return "bienvenidoResult";
	}
	
	@Action(value="personasAction")
	public String personas(){
		return "personasResult";
	}
}
