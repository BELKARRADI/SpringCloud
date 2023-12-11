package com.belkarradi.Client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private Float age;

	public Client(String nom, Float age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	public Client() {
		super();
	}

	public Client(Long id, String nom, Float age) {
		super();
		this.id = id;
		this.nom = nom;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", age=" + age + "]";
	}

}
