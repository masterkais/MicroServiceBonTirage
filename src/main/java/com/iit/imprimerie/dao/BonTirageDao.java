package com.iit.imprimerie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iit.imprimerie.entities.BonTirage;

@Repository
public interface BonTirageDao extends JpaRepository<BonTirage, Integer> {
	/*@Query("SELECT u FROM BonTirage u WHERE u.demande.ens.id = :id ")
	public List<BonTirage> getAllBonTirageByEns(@Param("id") int id);
*/
}
