package com.app.service;
import java.util.List;
import com.app.dtos.AddressDTO;

public interface AddressService {
	public String addAddress(AddressDTO addressDto);
	public List<AddressDTO> getAddressesOfUserByUserId(Integer userId);
	public String updateAddress(Integer addressId,AddressDTO addressDto);
	public String deleteAddress(Integer addressId);
	
}
