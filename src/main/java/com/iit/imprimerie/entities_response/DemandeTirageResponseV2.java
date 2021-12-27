package com.iit.imprimerie.entities_response;

import java.io.Serializable;
import java.util.*;
import java.util.Date;

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
public class DemandeTirageResponseV2 implements Serializable {
	private int id_demande;
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date date_demande;
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date date_arrive;
	private int nbr_copie; // limiter par nbr de classe
	private int type_tirage; // presentielle (reservation place pour turage) ou bien envoie pdf a distant
	private int etat_demande; // 1 si la demande et préparé si non 0
	private int id_ens;
    private List<Ligne_DemandeResponseV2> lc;
	public DemandeTirageResponseV2(int id) {
		this.id_demande = id;
	}
	public DemandeTirageResponseV2(int id_demande, Date date_demande, Date date_arrive, int nbr_copie, int type_tirage,
			int etat_demande, int id_ens) {
		super();
		this.id_demande = id_demande;
		this.date_demande = date_demande;
		this.date_arrive = date_arrive;
		this.nbr_copie = nbr_copie;
		this.type_tirage = type_tirage;
		this.etat_demande = etat_demande;
		this.id_ens = id_ens;
	}
	
}
