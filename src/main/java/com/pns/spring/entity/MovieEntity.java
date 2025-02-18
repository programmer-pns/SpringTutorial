package com.pns.spring.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "movies")
public class MovieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String movieId;
	private String movieName;
	private String genre;
	private Float rating;
	private LocalDate releaseDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "director_id",referencedColumnName = "directorId")
	private DirectorEntity director;
}
