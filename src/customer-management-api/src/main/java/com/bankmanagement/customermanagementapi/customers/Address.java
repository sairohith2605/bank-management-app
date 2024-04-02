package com.bankmanagement.customermanagementapi.customers;

import lombok.Data;

/**
 * The {@code Address} class is expected only to be used
 * as part of a composite class and does not contribute
 * as an entity in itself in a separate collection.
 * 
 * @author Sai Rohith
 *
 */
@Data
public class Address {

	private String addressLine1;
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String zipCode;
}
