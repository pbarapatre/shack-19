package com.shack.app.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Leads {
	
	@Id
    @GeneratedValue
    private Long id;
	private String occupation;
	private String leadsSource;
	private String doNotMail;
	private String doNotCall;
	private String converted;
	
	
	
	/*
	 * @OneToMany(targetEntity = Sales.class,cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name ="ls_fk",referencedColumnName = "id") private
	 * Set<Sales>sales;
	 */
	 
	
	public Leads(Long id, String occupation, String leadsSource, String doNotMail, String doNotCall,
			String converted) {
		super();
		this.id = id;
		this.occupation = occupation;
		this.leadsSource = leadsSource;
		this.doNotMail = doNotMail;
		this.doNotCall = doNotCall;
		this.converted = converted;
	}
	public Leads() {
		super();
	}
	public Leads(String occupation, String leadsSource, String doNotMail, String doNotCall, String converted) {
		super();
		this.occupation = occupation;
		this.leadsSource = leadsSource;
		this.doNotMail = doNotMail;
		this.doNotCall = doNotCall;
		this.converted = converted;
	}
	
	@Override
	public String toString() {
		return "Leads [occupation=" + occupation + ", leadsSource=" + leadsSource + ", doNotMail=" + doNotMail
				+ ", doNotCall=" + doNotCall + ", converted=" + converted + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getoccupation() {
		return occupation;
	}
	public void setoccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getLeadsSource() {
		return leadsSource;
	}
	public void setLeadsSource(String leadsSource) {
		this.leadsSource = leadsSource;
	}
	public String getDoNotMail() {
		return doNotMail;
	}
	public void setDoNotMail(String doNotMail) {
		this.doNotMail = doNotMail;
	}
	public String getDoNotCall() {
		return doNotCall;
	}
	public void setDoNotCall(String doNotCall) {
		this.doNotCall = doNotCall;
	}
	public String getConverted() {
		return converted;
	}
	public void setConverted(String converted) {
		this.converted = converted;
	}
	
	
}
