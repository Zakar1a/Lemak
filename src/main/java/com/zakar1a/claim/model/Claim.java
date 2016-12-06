package com.zakar1a.claim.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.zakar1a.employee.model.Employee;

@Entity
@Table(name = "claim")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Claim implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name = "claim_date")
	private Timestamp claimDate;

	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "status")
	private Integer status;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "claim", cascade = CascadeType.ALL)
    private List<ClaimDetails> claimDetails;

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
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	/**
	 * @return the claimDate
	 */
	public Timestamp getClaimDate() {
		return claimDate;
	}

	/**
	 * @param claimDate the claimDate to set
	 */
	public void setClaimDate(Timestamp claimDate) {
		this.claimDate = claimDate;
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
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the claimDetails
	 */
	public List<ClaimDetails> getClaimDetails() {
		return claimDetails;
	}

	/**
	 * @param claimDetails the claimDetails to set
	 */
	public void setClaimDetails(List<ClaimDetails> claimDetails) {
		this.claimDetails = claimDetails;
	}
	
}
