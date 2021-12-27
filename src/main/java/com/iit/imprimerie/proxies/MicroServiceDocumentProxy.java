package com.iit.imprimerie.proxies;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.iit.imprimerie.entities_response.DocumentResponse;
import com.iit.imprimerie.entities_response.EnseignantResponse;

import io.micrometer.core.annotation.Timed;

@FeignClient(name = "microservice-document")
//supprimer l 'url  = "localhost:8084"
@RibbonClient(name = "microservice-document")
public interface MicroServiceDocumentProxy {
	@GetMapping(value="/Document/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	@Timed
	@Transactional(timeout = 120)
	public DocumentResponse getDocById(@PathVariable int id);
	}

