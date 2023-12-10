package com.nour.teachers.dto;
import java.util.Date;
import java.util.List;

import com.nour.teachers.entities.Image;
import com.nour.teachers.entities.University;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnseignantDTO {
	private Long idEnseignant;
	private String nomEnseignant;
	private String villeEnseignant;
	private Date dateNaissance;
	//private double salaire;
	private University university;
	private String nomUniv;
	private Image image;

}
