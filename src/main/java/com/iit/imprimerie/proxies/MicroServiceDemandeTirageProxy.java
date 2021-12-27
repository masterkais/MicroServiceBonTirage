package com.iit.imprimerie.proxies;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.iit.imprimerie.entities_response.DemandeTirageResponse;
import com.iit.imprimerie.entities_response.DemandeTirageResponseV2;
import com.iit.imprimerie.entities_response.Ligne_DemandeResponse;
import com.iit.imprimerie.entities_response.Ligne_DemandeResponseV2;

@FeignClient(name = "service-DemandeTirage")
//supprimer l 'url  = "localhost:8083"
@RibbonClient(name = "service-DemandeTirage")
public interface MicroServiceDemandeTirageProxy {
@GetMapping(value="/DemandeTirage/{id}")
public DemandeTirageResponse GetDemandeById(@PathVariable int id);
@GetMapping(value="/DemandeTirageV2/{id}")
public DemandeTirageResponseV2 GetDemandeByIdV2(@PathVariable int id);
@GetMapping(value="/LigneDemandeTirageByDemande/{id}")
public List<Ligne_DemandeResponse> GetLigneDemandeByIdDemande(@PathVariable int id);
@GetMapping(value="/LigneDemandeTirageByDemandeV2/{id}")
public List<Ligne_DemandeResponseV2> GetLigneDemandeByIdDemandeV2(@PathVariable int id);
@PostMapping(value="/RealiserDemande/{id}")
public void RealiserDemande(@PathVariable int id);
}
