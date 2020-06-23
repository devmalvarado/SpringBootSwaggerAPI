package dev.malva.product.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Table(name="products")
public class Product {
	
	@Getter
	@Setter
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Getter
	@Setter
	@Column(name="name", nullable=false, length=30)
	private String name;	
	
}
