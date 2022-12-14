package com.masai.dao;

import java.util.List;


import com.masai.model.Vendor;

public interface VenderDao {

	
public String registerVendor(Vendor vendor);
	
	public List<Vendor> getAllVendors();
	
	public boolean validatePassword(String vendorId,String password);
	
	public String updateProfile(Vendor vendor);
	
	public String changePassword(String vendorId,String oldPassword,String newPassword);
	
	public Vendor getVendorDataById(String vendorId);
}
