package com.iit.imprimerie.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.iit.imprimerie.entities_response.EnseignantResponse;
import com.iit.imprimerie.entities_response.MatiereResponse;

import io.micrometer.core.annotation.Timed;

@FeignClient(name = "service-administration")
//supprimer l 'url  = "localhost:8081"
@RibbonClient(name = "service-administration")
public interface MicroServiceEnseignantProxy {
	@GetMapping(value="/Enseignant/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	@Timed
	@Transactional(timeout = 120)
	public EnseignantResponse getEnsById(@PathVariable int id);
	@GetMapping(value="/Matiere/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	@Timed
	@Transactional(timeout = 120)
	public MatiereResponse getMatById(@PathVariable int id);
	}

