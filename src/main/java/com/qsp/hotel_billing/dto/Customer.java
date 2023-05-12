package com.qsp.hotel_billing.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cutomerId;
	private String customerName;
	@Column(unique = true)
	private Long customerPhone;
	private double totalBillAmount;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Product> products;
}
