package com.example.SpringDrinks.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity 
public class Drink {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
 // @Column(nullable = false)
	@NotNull(message = "The beer name")
	private String name;
	
	@Column
	private String type;
	
	@Column
	private long alcholicPrecentage;
	
	@Column
	private long calories;
	
	@Column
	private long carbohydrates;
	
	
	// Default constructor 
	public Drink() {
		
	}

// For testing 
	public Drink(long id, String name, String type, long alcholicPrecentage,
			long calories, long carbohydrates) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.alcholicPrecentage = alcholicPrecentage;
		this.calories = calories;
		this.carbohydrates = carbohydrates;
	}
	
// For creating 
	public Drink(String name, String type, long alcholicPrecentage,
			long calories, long carbohydrates) {
		super();
		this.name = name;
		this.type = type;
		this.alcholicPrecentage = alcholicPrecentage;
		this.calories = calories;
		this.carbohydrates = carbohydrates;
	}

// Getters and Setters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public long getAlcholicPrecentage() {
		return alcholicPrecentage;
	}

	public void setAlcholicPrecentage(long alcholicPrecentage) {
		this.alcholicPrecentage = alcholicPrecentage;
	}

	public long getCalories() {
		return calories;
	}

	public void setCalories(long calories) {
		this.calories = calories;
	}

	public long getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(long carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alcholicPrecentage, calories, carbohydrates, id, name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drink other = (Drink) obj;
		return alcholicPrecentage == other.alcholicPrecentage && calories == other.calories
				&& carbohydrates == other.carbohydrates && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(type, other.type);
	}
	
	

	

}
