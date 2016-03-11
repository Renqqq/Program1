package com.crm.renq.entity;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * SysCustomerState entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_customer_state", catalog = "crm")
public class SysCustomerState implements java.io.Serializable {

	// Fields

	private Integer stateId;
	private String stateName;
	private String stateDesc;
	private String stateMark;
	private Set<CrmCustomer> crmCustomers = new HashSet<CrmCustomer>(0);

	// Constructors

	/** default constructor */
	public SysCustomerState() {
	}

	/** minimal constructor */
	public SysCustomerState(String stateName, String stateDesc, String stateMark) {
		this.stateName = stateName;
		this.stateDesc = stateDesc;
		this.stateMark = stateMark;
	}

	/** full constructor */
	public SysCustomerState(String stateName, String stateDesc,
			String stateMark, Set<CrmCustomer> crmCustomers) {
		this.stateName = stateName;
		this.stateDesc = stateDesc;
		this.stateMark = stateMark;
		this.crmCustomers = crmCustomers;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "state_id", unique = true, nullable = false)
	public Integer getStateId() {
		return this.stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	@Column(name = "state_name", nullable = false, length = 50)
	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Column(name = "state_desc", nullable = false, length = 2000)
	public String getStateDesc() {
		return this.stateDesc;
	}

	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}

	@Column(name = "state_mark", nullable = false, length = 5)
	public String getStateMark() {
		return this.stateMark;
	}

	public void setStateMark(String stateMark) {
		this.stateMark = stateMark;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sysCustomerState")
	public Set<CrmCustomer> getCrmCustomers() {
		return this.crmCustomers;
	}

	public void setCrmCustomers(Set<CrmCustomer> crmCustomers) {
		this.crmCustomers = crmCustomers;
	}

}