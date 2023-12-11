package com.belkarradi.Client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.net.server.Client;


@Repository
public interface ClientRepository  extends JpaRepository<com.belkarradi.Client.entities.Client,Long>{

}
