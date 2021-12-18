package com.iit.imprimerie.entities_response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
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
public class Ligne_DemandeResponse implements Serializable {
	
	private int id;
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id_demande")
	private DemandeTirageResponse demande;
	private DocumentResponse doc;
	/*public Ligne_DemandeResponse(Ligne_Demande l) {
		this.id=l.getId();
	}
	*/
}

