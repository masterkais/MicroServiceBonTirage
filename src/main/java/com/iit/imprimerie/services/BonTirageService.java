package com.iit.imprimerie.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iit.imprimerie.dao.BonTirageDao;
import com.iit.imprimerie.entities.BonTirage;
import com.iit.imprimerie.entities_response.BonTirageResponse;
import com.iit.imprimerie.entities_response.DemandeTirageResponse;
import com.iit.imprimerie.entities_response.DemandeTirageResponseV2;
import com.iit.imprimerie.entities_response.DocumentResponse;
import com.iit.imprimerie.entities_response.EnseignantResponse;
import com.iit.imprimerie.entities_response.Ligne_DemandeResponse;
import com.iit.imprimerie.entities_response.Ligne_DemandeResponseV2;
import com.iit.imprimerie.exception.NoException;
import com.iit.imprimerie.exception.NotFoundException;
import com.iit.imprimerie.proxies.MicroServiceDemandeTirageProxy;
import com.iit.imprimerie.proxies.MicroServiceDocumentProxy;
import com.iit.imprimerie.proxies.MicroServiceEnseignantProxy;

@Service
public class BonTirageService {
	@Autowired
	BonTirageDao bdo;
	@Autowired
	MicroServiceDemandeTirageProxy mdo;
	@Autowired
	MicroServiceDocumentProxy md;
	@Autowired
	MicroServiceEnseignantProxy me;

	public void EffectuerBon(BonTirage b) {

		DemandeTirageResponse dm = getDemandeById(b.getId_demande());
		bdo.saveAndFlush(b);
		mdo.RealiserDemande(b.getId_demande());
		throw new NoException("bon tirage est effectué avec succée");
	}

	public List<BonTirageResponse> getAllBonTirage() {
		List<BonTirageResponse> lb = new ArrayList<BonTirageResponse>();
		List<BonTirage> l = bdo.findAll();
		for (int i = 0; i < l.size(); i++) {
			BonTirageResponse b = new BonTirageResponse(l.get(i));
			DemandeTirageResponse d=getDemandeById(1);
			
			d.setEns(getEnsById(1));
			d.setLc(null);
			lb.add(b);
		    
		}
		return lb;
	
	}
	public List<BonTirageResponse> getAllBonTirageV2() {
		List<BonTirageResponse> lb = new ArrayList<BonTirageResponse>();
		List<BonTirage> l = bdo.findAll();
		for (int i = 0; i < l.size(); i++) {
			BonTirageResponse b = new BonTirageResponse(l.get(i));
			DemandeTirageResponseV2 d=getDemandeByIdV2(l.get(i).getId_demande());
			List<Ligne_DemandeResponseV2> ld=mdo.GetLigneDemandeByIdDemandeV2(l.get(i).getId_demande());
			d.setLc(ld);
			b.setD(d);
			
			lb.add(b);
		    
		}
		return lb;
	
	}


	  public List<BonTirage> getAllBonTirageByEns(int id) { 
	 return null;
	  }
	 
	public EnseignantResponse getEnsById(int id) {
		return me.getEnsById(id);
	}

	public DocumentResponse getDocById(int id) {
		return md.getDocById(id);
	}

	public DemandeTirageResponse getDemandeById(int id) {
		return mdo.GetDemandeById(id);

	}
	public DemandeTirageResponseV2 getDemandeByIdV2(int id) {
		return mdo.GetDemandeByIdV2(id);

	}
}
