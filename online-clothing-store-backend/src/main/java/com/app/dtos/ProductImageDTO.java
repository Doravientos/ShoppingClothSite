 package com.app.dtos;

import javax.persistence.Lob;

import com.app.pojos.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class ProductImageDTO {

	private String name;
	
	@Lob // large object :col : longblob
	private Byte[] image;
	
	// product id
	private Integer productId;
}
