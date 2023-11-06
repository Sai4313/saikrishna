package com.example.demo.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Subject")
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
	
	@Id
	private String id;
	private String Name;
	

}
