package com.nour.teachers.entities;

import java.util.Date;
import java.util.List;

import com.nour.teachers.entities.University;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Enseignant {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEnseignant;
	private String nomEnseignant;
	private String villeEnseignant;
	private Date dateNaissance;
	private double salaire;
	
	
	@ManyToOne
	private University university;
	
//	@OneToOne
//	private Image image;

	 @OneToMany (mappedBy = "produit")
	 private List<Image> images;
	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Enseignant() {
		super();}

	
	public Enseignant(Long idEnseignant, String nomEnseignant, String villeEnseignant, Date dateNaissance,
			double salaire, University university, List<Image> images) {
		super();
		this.idEnseignant = idEnseignant;
		this.nomEnseignant = nomEnseignant;
		this.villeEnseignant = villeEnseignant;
		this.dateNaissance = dateNaissance;
		this.salaire = salaire;
		this.university = university;
		this.images = images;
	}

	public Long getIdEnseignant() {
		return idEnseignant;
	}
	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}
	public String getNomEnseignant() {
		return nomEnseignant;
	}
	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}
	public String getVilleEnseignant() {
		return villeEnseignant;
	}
	public void setVilleEnseignant(String villeEnseignant) {
		this.villeEnseignant = villeEnseignant;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nomEnseignant=" + nomEnseignant + ", villeEnseignant="
				+ villeEnseignant + ", dateNaissance=" + dateNaissance + ", salaire=" + salaire + "]";
	}
	
	
	}
