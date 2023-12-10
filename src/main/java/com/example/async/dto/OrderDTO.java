package com.example.async.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDTO {

	private int productId;
	private String name;
	private String productType;
	private int qty;
	private double price;
	private String trackingId;
}
