package com.nour.teachers.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
@Entity
//@Builder
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Image {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long idImage ;
 private String name ;
 private String type ;
 @Column( name = "IMAGE" , length = 4048576 ) 
 @Lob
 private byte[] image; 

 @ManyToOne
 @JoinColumn (name="Enseignant_ID")
 @JsonIgnore
 private Enseignant enseignant;

public Image(Long idImage, String name, String type, byte[] image, Enseignant enseignant) {
	super();
	this.idImage = idImage;
	this.name = name;
	this.type = type;
	this.image = image;
	this.enseignant = enseignant;
}

public Long getIdImage() {
	return idImage;
}

public void setIdImage(Long idImage) {
	this.idImage = idImage;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public byte[] getImage() {
	return image;
}

public void setImage(byte[] image) {
	this.image = image;
}

public Enseignant getEnseignant() {
	return enseignant;
}

public void setEnseignant(Enseignant enseignant) {
	this.enseignant = enseignant;
}
 
 
}
