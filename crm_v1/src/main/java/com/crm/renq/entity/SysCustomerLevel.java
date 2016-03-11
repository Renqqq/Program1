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
 * SysCustomerLevel entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_customer_level", catalog = "crm")
public class SysCustomerLevel implements java.io.Serializable {

	// Fields

	private Integer levelId;
	private String levelName;
	private String levelDesc;
	private String levelMark;
	private Set<CrmCustomer> crmCustomers = new HashSet<CrmCustomer>(0);

	// Constructors

	/** default constructor */
	public SysCustomerLevel() {
	}

	/** minimal constructor */
	public SysCustomerLevel(String levelName, String levelDesc, String levelMark) {
		this.levelName = levelName;
		this.levelDesc = levelDesc;
		this.levelMark = levelMark;
	}

	/** full constructor */
	public SysCustomerLevel(String levelName, String levelDesc,
			String levelMark, Set<CrmCustomer> crmCustomers) {
		this.levelName = levelName;
		this.levelDesc = levelDesc;
		this.levelMark = levelMark;
		this.crmCustomers = crmCustomers;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "level_id", unique = true, nullable = false)
	public Integer getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	@Column(name = "level_name", nullable = false, length = 50)
	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	@Column(name = "level_desc", nullable = false, length = 2000)
	public String getLevelDesc() {
		return this.levelDesc;
	}

	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}

	@Column(name = "level_mark", nullable = false, length = 5)
	public String getLevelMark() {
		return this.levelMark;
	}

	public void setLevelMark(String levelMark) {
		this.levelMark = levelMark;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sysCustomerLevel")
	public Set<CrmCustomer> getCrmCustomers() {
		return this.crmCustomers;
	}

	public void setCrmCustomers(Set<CrmCustomer> crmCustomers) {
		this.crmCustomers = crmCustomers;
	}

}