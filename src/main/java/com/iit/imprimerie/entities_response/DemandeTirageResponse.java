package com.iit.imprimerie.entities_response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class DemandeTirageResponse implements Serializable {
	@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id", scope = DemandeTirageResponse.class)
	private int id_demande;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date date_demande;
	//@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date date_arrive;
	private int nbr_copie; // limiter par nbr de classe
	private int type_tirage; // presentielle (reservation place pour turage) ou bien envoie pdf a distant
	private int etat_demande; // 1 si la demande et préparé si non 0
	private EnseignantResponse ens;
	private Ligne_DemandeResponse lc;
	
/*
	public DemandeTirageResponse(DemandeTirage d) {
		this.id_demande = d.getId_demande();
		this.date_demande = d.getDate_demande();
		this.date_arrive = d.getDate_arrive();
		this.nbr_copie = d.getNbr_copie(); // limiter par nbr de classe
		this.type_tirage = d.getType_tirage(); // presentielle (reservation place pour turage) ou bien envoie pdf a
												// distant
		this.etat_demande = d.getEtat_demande(); // 1 si la demande et préparé si non 0
	}
	*/
/*
	public DemandeTirageResponse(DemandeTirage d, EnseignantResponse ens) {
		this.id_demande = d.getId_demande();
		this.date_demande = d.getDate_demande();
		this.date_arrive = d.getDate_arrive();
		this.nbr_copie = d.getNbr_copie(); // limiter par nbr de classe
		this.type_tirage = d.getType_tirage(); // presentielle (reservation place pour turage) ou bien envoie pdf a
												// distant
		this.etat_demande = d.getEtat_demande(); // 1 si la demande et préparé si non 0
		this.ens = ens;
	}
*/

	public DemandeTirageResponse(int id) {
		this.id_demande = id;
	}


public DemandeTirageResponse(Date date_demande, Date date_arrive, int nbr_copie, int type_tirage, int etat_demande) {
	super();
	this.date_demande = date_demande;
	this.date_arrive = date_arrive;
	this.nbr_copie = nbr_copie;
	this.type_tirage = type_tirage;
	this.etat_demande = etat_demande;
}


public DemandeTirageResponse(int id_demande, Date date_demande, Date date_arrive, int nbr_copie, int type_tirage,
		int etat_demande) {
	super();
	this.id_demande = id_demande;
	this.date_demande = date_demande;
	this.date_arrive = date_arrive;
	this.nbr_copie = nbr_copie;
	this.type_tirage = type_tirage;
	this.etat_demande = etat_demande;
}

public DemandeTirageResponse(DemandeTirageResponse ld) {
	super();
	this.id_demande =ld.getId_demande();
	this.date_demande = date_demande;
	this.date_arrive = date_arrive;
	this.nbr_copie = nbr_copie;
	this.type_tirage = type_tirage;
	this.etat_demande = etat_demande;
}





	
}
