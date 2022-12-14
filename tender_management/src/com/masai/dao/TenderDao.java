package com.masai.dao;

import java.util.List;

import com.masai.model.Tender;
import com.masai.model.TenderStatus;

public interface TenderDao {
	
public List<Tender> getTenderDetails(String id);
	
	public List<Tender> getAllTenders();
	
	public String createTender(Tender tender);
	
	public boolean removeTender(String tid);
	
	public String updateTender(Tender tender);
	
	public Tender getTenderDataById(String tenderId);
	
	public String getTenderStatus(String tenderId);
	
	public String assignTender(String tenderId,String vendorId,String bidderId);
	
	public List<TenderStatus> getAllAssignedTenders();

}
