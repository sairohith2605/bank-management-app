package com.bankmanagement.customermanagementapi.common.models;

import java.time.Instant;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
public abstract class AbstractBaseModel {
	
	@Id
	@Field("id")
	private UUID id;
	
	@CreatedDate
	@Field("createdDate")
	private Instant createdDate;
	
	@LastModifiedDate
	@Field("lastModifiedDate")
	private Instant lastModifiedDate;

}
