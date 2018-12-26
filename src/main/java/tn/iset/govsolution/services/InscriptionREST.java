package tn.iset.govsolution.services;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import tn.iset.govsolution.dao.RegistrationDAOImpl;
import tn.iset.govsolution.entity.Inscription;
 
@Path("/inscription")
public class InscriptionREST {
	
	RegistrationDAOImpl dao = new RegistrationDAOImpl();
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Inscription> findAll() {
 
		return dao.getInscriptions();
	}
 
	@Path("{c}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Inscription findByOne(@PathParam("c") String c) {
		return dao.getInscription(Integer.parseInt(c));
	}
	
	@Path("accept/{c}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Inscription accept(@PathParam("c") String c) {
		return dao.accept(Long.parseLong(c));
	}
	
	
	@Path("refuse/{c}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Inscription refuse(@PathParam("c") String c) {
		return dao.refuse((Long.parseLong(c)));
	}
	
	@Path("{Du}/{Au}/{RS}/{Etat}")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Inscription> findByQuery(@PathParam("Du") String du,@PathParam("Au") String Au,@PathParam("RS") String Rs,@PathParam("Etat") String Etat) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		
		
		
		String query ="select ins from Inscription ins";
		
		if(!du.equals("NULL")) {
			query+=" WHERE ins.dateDemande BETWEEN '" + du +"'" ;
		}

		if(!du.equals("NULL") && !Au.equals("NULL")) {
			query+=" AND '" + Au +"'" ;
		}

		if(!du.equals("NULL") && Au.equals("NULL")){
			query+=" AND '" + dateFormat.format(date) +"'" ;
		}
		
		

		if(!du.equals("NULL") && !Rs.equals("NULL")) {
			query+=" AND ins.rsFr like '" + Rs + "%'" ;
		}
		
		if(du.equals("NULL") &&!Rs.equals("NULL")) {
			query+=" Where ins.rsFr like '" + Rs + "%'" ;
		}

		if((!Rs.equals("NULL") || !du.equals("NULL")) && Etat.equals("Oui")) {
			
			query+=" AND ins.resolu = 1" ;
			
		}

		if(Rs.equals("NULL") && du.equals("NULL") && Etat.equals("Oui")){
			query+=" Where ins.resolu = 1" ;
		}
		
		if((!Rs.equals("NULL") || !du.equals("NULL")) && Etat.equals("Non")) {
			
			query+=" AND ins.resolu = 0" ;
			
		}

		if(Rs.equals("NULL") && du.equals("NULL") && Etat.equals("Non")){
			query+=" Where ins.resolu = 0" ;
		}
		

		return dao.findByQuery(query);
	}
	
	
}
