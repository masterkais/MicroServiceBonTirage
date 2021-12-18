package com.iit.imprimerie.proxies;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.iit.imprimerie.entities_response.DemandeTirageResponse;

@FeignClient(name = "service-DemandeTirage", url = "localhost:8083")
public interface MicroServiceDemandeTirageProxy {
@GetMapping("/DemandeTirage/{id}")
public DemandeTirageResponse GetDemandeById(@PathVariable int id);
@PostMapping("/RealiserDemande/{id}")
public void RealiserDemande(@PathVariable int id);
}
