package com.pns.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "directors")
@Getter
@Setter
public class DirectorEntity {
	
	@Id
	private String directorId;
	private String directorName;
	private String directorAddress;
	
}
