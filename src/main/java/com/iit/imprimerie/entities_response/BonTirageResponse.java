package com.iit.imprimerie.entities_response;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.iit.imprimerie.entities.BonTirage;

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
public class BonTirageResponse implements Serializable {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id@GeneratedValue(strategy = GenerationType.AUTO) 
	    private  int id_bon;
	    private Date date_bon;
		private DemandeTirageResponseV2 d;
		public BonTirageResponse(BonTirage b) {
			this.id_bon=b.getId_bon();
			this.date_bon=b.getDate_bon();
		}
		
}
