package com.belkarradi.Voiture.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
@Entity
public class Voiture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque;
	private String matricule;
	private String model;
	private Long id_client;
	
	
	@Transient
	@ManyToOne
	private Client client;
	public Voiture(Long id, String marque, String matricule, String model, Long id_client,Client client) {
		super();
		this.id = id;
		this.marque = marque;
		this.matricule = matricule;
		this.model = model;
		this.id_client = id_client;
		this.client=client;
	}
	public Voiture() {
		super();
	}
	public Voiture(String marque, String matricule, String model, Long id_client) {
		super();
		this.marque = marque;
		this.matricule = matricule;
		this.model = model;
		this.id_client = id_client;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getId_client() {
		return id_client;
	}
	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + ", matricule=" + matricule + ", model=" + model
				+ ", id_client=" + id_client + "]";
	}
	
	
}
