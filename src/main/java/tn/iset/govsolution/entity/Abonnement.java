package tn.iset.govsolution.entity;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "abonnement")
public class Abonnement extends AbstractPersistable<Long> {
	//@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dateDeb;
	//@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dateFin;
	
	@Enumerated(EnumType.ORDINAL)
    private TypeAbonnement typeAbonnement;  //1:payant, 2:essai,3 Gratuit
  
  @ManyToOne(fetch=FetchType.LAZY)
   private Etablissement etablissement;

     @ManyToOne()
	 private Module module;
	
	public Abonnement(LocalDateTime dateDeb, LocalDateTime dateFin) {
		super();
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
	}
	public LocalDateTime getDateDeb() {
		return dateDeb;
	}
	public void setDateDeb(LocalDateTime dateDeb) {
		this.dateDeb = dateDeb;
	}
	public LocalDateTime getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}


}
