package com.bankmanagement.customermanagementapi.customers;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.StringUtils;

import com.bankmanagement.customermanagementapi.common.models.AbstractBaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Document(collection = "customers")
@EqualsAndHashCode(callSuper = false)
public class Customer extends AbstractBaseModel {

	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private int age;
	
	private LocalDateTime dateOfBirth;
	
	private Address primaryAddress;
	
	public String getFullName() {
		return String.join(
				" ", firstName, StringUtils.hasText(middleName) ? middleName : "", lastName
		);
	}
}
