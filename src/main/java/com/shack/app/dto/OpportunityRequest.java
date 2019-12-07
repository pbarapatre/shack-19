package com.shack.app.dto;

import com.shack.app.model.Leads;

public class OpportunityRequest {

	private Leads leads;

	@Override
	public String toString() {
		return "OpportunityRequest [leads=" + leads + "]";
	}

	public Leads getLeads() {
		return leads;
	}

	public OpportunityRequest() {
		super();
	}

	public OpportunityRequest(Leads leads) {
		super();
		this.leads = leads;
	}

	public void setLeads(Leads leads) {
		this.leads = leads;
	}
	
}
