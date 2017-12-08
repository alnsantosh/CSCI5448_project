package com.flight.bean;

import java.util.List;

public class SelectedTransport extends Transportation {
	
	List<Transportation> selectedList;
	
	
	public List<Transportation> getSelectedList() {
		return selectedList;
	}

	public void setSelectedList(List<Transportation> selectedList) {
		this.selectedList = selectedList;
	}

	public int returnAvailableSeats()
	{
		return 0;
	}
	
	public void selectPreference()
	{
		
	}
	
	public void addSelectedTransport(Transportation transport)
	{
		
	}
	
	public void removeSelectedTransport(Transportation transport)
	{
		
	}
	

}
