package com.zakar1a.claim.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "claim_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClaimDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "claim_id", nullable=false)
	private Claim claim;

	@Column(name = "transaction_date")
	private Timestamp transactionDate;
	
	@Column(name = "cost_center")
	private Integer costCenter;
	
	@Column(name = "gl_code")
	private String glCode;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "gst")
	private Double gst;
	
	@Column(name = "exchange_rate")
	private Double exchangeRate;

	@Column(name = "reciept_no")
	private String reciptNo;	

	@Column(name = "total_amount")
	private Double totalAmount;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the claim
	 */
	public Claim getClaim() {
		return claim;
	}

	/**
	 * @param claim the claim to set
	 */
	public void setClaim(Claim claim) {
		this.claim = claim;
	}

	/**
	 * @return the transactionDate
	 */
	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * @return the costCenter
	 */
	public Integer getCostCenter() {
		return costCenter;
	}

	/**
	 * @param costCenter the costCenter to set
	 */
	public void setCostCenter(Integer costCenter) {
		this.costCenter = costCenter;
	}

	/**
	 * @return the glCode
	 */
	public String getGlCode() {
		return glCode;
	}

	/**
	 * @param glCode the glCode to set
	 */
	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the gst
	 */
	public Double getGst() {
		return gst;
	}

	/**
	 * @param gst the gst to set
	 */
	public void setGst(Double gst) {
		this.gst = gst;
	}

	/**
	 * @return the exchangeRate
	 */
	public Double getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	/**
	 * @return the reciptNo
	 */
	public String getReciptNo() {
		return reciptNo;
	}

	/**
	 * @param reciptNo the reciptNo to set
	 */
	public void setReciptNo(String reciptNo) {
		this.reciptNo = reciptNo;
	}

	/**
	 * @return the totalAmount
	 */
	public Double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}