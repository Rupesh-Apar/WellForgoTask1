package com.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FinancialAdvisor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;
	
	
    
    private String name;
    
    // Other attributes
    
    
    public FinancialAdvisor() {
        // Default constructor
    }
    
    public FinancialAdvisor(Long advisorId, String name) {
		super();
		this.advisorId = advisorId;
		this.name = name;
	}

	public FinancialAdvisor(String name /* Other attributes */) {
        this.name = name;
        // Initialize other attributes
    }

    // Getter and setters
    public Long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
