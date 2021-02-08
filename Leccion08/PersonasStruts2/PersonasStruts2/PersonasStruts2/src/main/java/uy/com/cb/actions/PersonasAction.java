package uy.com.cb.actions;

import org.apache.logging.log4j.*;

import com.opensymphony.xwork2.ActionSupport;

import uy.com.cb.model.Persona;

public class PersonasAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	Logger log = LogManager.getLogger(PersonasAction.class);
	
	private Persona persona;
	
	@Override
	public String execute() {
		if(this.persona != null){
			log.info("\n");
			log.info("persona:" + persona);
		}
		else{
			log.info("Persona con valor nulo");
		}
		return SUCCESS;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}


}
