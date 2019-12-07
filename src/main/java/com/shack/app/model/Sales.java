package com.shack.app.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Sales {

	@Id
	@GeneratedValue
	private Long salesId;
	public Long getSalesId() {
		return salesId;
	}
	public void setSalesId(Long salesId) {
		this.salesId = salesId;
	}
	private String productId;
	private String proposalSource;
	private String profilingScore;
	public Sales(Long salesId, String productId, String proposalSource, String profilingScore) {
		super();
		this.salesId = salesId;
		this.productId = productId;
		this.proposalSource = proposalSource;
		this.profilingScore = profilingScore;
	}
	public Sales(String productId, String proposalSource, String profilingScore) {
		super();
		this.productId = productId;
		this.proposalSource = proposalSource;
		this.profilingScore = profilingScore;
	}
	public Sales() {
		super();
	}
	@Override
	public String toString() {
		return "Sales [salesId=" + salesId + ", productId=" + productId + ", proposalSource=" + proposalSource
				+ ", profilingScore=" + profilingScore + "]";
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProposalSource() {
		return proposalSource;
	}
	public void setProposalSource(String proposalSource) {
		this.proposalSource = proposalSource;
	}
	public String getProfilingScore() {
		return profilingScore;
	}
	public void setProfilingScore(String profilingScore) {
		this.profilingScore = profilingScore;
	}
	
}
