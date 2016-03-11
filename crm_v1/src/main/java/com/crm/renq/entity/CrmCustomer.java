package com.crm.renq.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CrmCustomer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "crm_customer", catalog = "crm")
public class CrmCustomer implements java.io.Serializable {

	// Fields

	private Integer cusId;
	private SysUserInfo sysUserInfo;
	private SysCustomerState sysCustomerState;
	private SysCustomerLevel sysCustomerLevel;
	private String cusName;
	private String cusSex;
	private Integer cusAge;
	private String cusPhone;
	private String cusQq;
	private String cusAddress;
	private String cusRemark;
	private String cusMark;

	// Constructors

	/** default constructor */
	public CrmCustomer() {
	}

	/** minimal constructor */
	public CrmCustomer(SysUserInfo sysUserInfo,
			SysCustomerState sysCustomerState,
			SysCustomerLevel sysCustomerLevel, String cusName, String cusSex,
			Integer cusAge, String cusPhone, String cusAddress, String cusMark) {
		this.sysUserInfo = sysUserInfo;
		this.sysCustomerState = sysCustomerState;
		this.sysCustomerLevel = sysCustomerLevel;
		this.cusName = cusName;
		this.cusSex = cusSex;
		this.cusAge = cusAge;
		this.cusPhone = cusPhone;
		this.cusAddress = cusAddress;
		this.cusMark = cusMark;
	}

	/** full constructor */
	public CrmCustomer(SysUserInfo sysUserInfo,
			SysCustomerState sysCustomerState,
			SysCustomerLevel sysCustomerLevel, String cusName, String cusSex,
			Integer cusAge, String cusPhone, String cusQq, String cusAddress,
			String cusRemark, String cusMark) {
		this.sysUserInfo = sysUserInfo;
		this.sysCustomerState = sysCustomerState;
		this.sysCustomerLevel = sysCustomerLevel;
		this.cusName = cusName;
		this.cusSex = cusSex;
		this.cusAge = cusAge;
		this.cusPhone = cusPhone;
		this.cusQq = cusQq;
		this.cusAddress = cusAddress;
		this.cusRemark = cusRemark;
		this.cusMark = cusMark;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cus_id", unique = true, nullable = false)
	public Integer getCusId() {
		return this.cusId;
	}

	public void setCusId(Integer cusId) {
		this.cusId = cusId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_user_id", nullable = false)
	public SysUserInfo getSysUserInfo() {
		return this.sysUserInfo;
	}

	public void setSysUserInfo(SysUserInfo sysUserInfo) {
		this.sysUserInfo = sysUserInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_state_id", nullable = false)
	public SysCustomerState getSysCustomerState() {
		return this.sysCustomerState;
	}

	public void setSysCustomerState(SysCustomerState sysCustomerState) {
		this.sysCustomerState = sysCustomerState;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_level_id", nullable = false)
	public SysCustomerLevel getSysCustomerLevel() {
		return this.sysCustomerLevel;
	}

	public void setSysCustomerLevel(SysCustomerLevel sysCustomerLevel) {
		this.sysCustomerLevel = sysCustomerLevel;
	}

	@Column(name = "cus_name", nullable = false, length = 50)
	public String getCusName() {
		return this.cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	@Column(name = "cus_sex", nullable = false, length = 10)
	public String getCusSex() {
		return this.cusSex;
	}

	public void setCusSex(String cusSex) {
		this.cusSex = cusSex;
	}

	@Column(name = "cus_age", nullable = false)
	public Integer getCusAge() {
		return this.cusAge;
	}

	public void setCusAge(Integer cusAge) {
		this.cusAge = cusAge;
	}

	@Column(name = "cus_phone", nullable = false, length = 30)
	public String getCusPhone() {
		return this.cusPhone;
	}

	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}

	@Column(name = "cus_qq", length = 50)
	public String getCusQq() {
		return this.cusQq;
	}

	public void setCusQq(String cusQq) {
		this.cusQq = cusQq;
	}

	@Column(name = "cus_address", nullable = false, length = 2000)
	public String getCusAddress() {
		return this.cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	@Column(name = "cus_remark", length = 500)
	public String getCusRemark() {
		return this.cusRemark;
	}

	public void setCusRemark(String cusRemark) {
		this.cusRemark = cusRemark;
	}

	@Column(name = "cus_mark", nullable = false, length = 5)
	public String getCusMark() {
		return this.cusMark;
	}

	public void setCusMark(String cusMark) {
		this.cusMark = cusMark;
	}

}