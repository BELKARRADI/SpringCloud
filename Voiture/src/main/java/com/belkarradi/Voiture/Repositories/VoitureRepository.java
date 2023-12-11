package com.belkarradi.Voiture.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.belkarradi.Voiture.entities.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long>{
	 @Query("SELECT v FROM Voiture v WHERE v.id_client = :clientId")
	    List<Voiture> findByClientId(@Param("clientId") Long clientId);

}
