package com.kaunghtet.SpringBootRest.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class JobPost {

	@Id
	private int postId;
	private String postTitle;
	private String postDesc;
	private int reqExperience;
	private List<String> postTechStack;
	
}
