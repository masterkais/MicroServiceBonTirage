package com.iit.imprimerie.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.iit.imprimerie.entities_response.DemandeTirageResponse;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BonTirage implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,property="@id", scope = BonTirage.class)
	private int id_bon;
	private Date date_bon;
	private int id_demande;

	public BonTirage(Date date_bon, int id_demande) {
		super();
		this.date_bon = date_bon;
		this.id_demande = id_demande;
	}
}
