package com.iit.imprimerie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iit.imprimerie.entities.BonTirage;
import com.iit.imprimerie.entities_response.BonTirageResponse;
import com.iit.imprimerie.services.BonTirageService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class BonTirageController {
	@Autowired
	BonTirageService dts;

	@ApiOperation(value = "Effecuer un bon pour une demande", notes = "cette methode permet au agent d'eefectuer un bon pour une demande ", response = BonTirage.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "l'objet  est ajouter"),
			@ApiResponse(code = 400, message = "l'objet  n'est pas valide") })
	@PostMapping("/BonTirage")
	public void EffectuerBon(@RequestBody BonTirage b) {
		dts.EffectuerBon(b);

	}

	@ApiOperation(value = "renvoie la liste des bons", notes = "cette methode permet de renvoyer la liste des objet qui existe dans le base de donnée", responseContainer = "List<BonTirage>")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "la liste des objet / une liste vide"), })
	@GetMapping("/GetAllBonTirage")
	public List<BonTirageResponse> getAllBonTirage() {
		return dts.getAllBonTirage();
	}
/*
	@ApiOperation(value = "renvoie la liste des bons par enseiganat", notes = "cette methode permet de renvoyer la liste des objet qui existe dans le base de donnée", responseContainer = "List<BonTirage>")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "la liste des objet / une liste vide"), })
	@GetMapping("/GetAllBonTirageByEns/{id}")
	public List<BonTirage> getAllBonTirageByEns(@PathVariable int id) {
		return dts.getAllBonTirageByEns(id);
	}
	*/
}
