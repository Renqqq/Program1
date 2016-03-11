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
 * SysUserInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sys_user_info", catalog = "crm")
public class SysUserInfo implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String userSex;
	private Integer userAge;
	private String userNumber;
	private String userPw;
	private Set<CrmCustomer> crmCustomers = new HashSet<CrmCustomer>(0);

	// Constructors

	/** default constructor */
	public SysUserInfo() {
	}

	/** minimal constructor */
	public SysUserInfo(String userName, String userSex, Integer userAge,
			String userNumber, String userPw) {
		this.userName = userName;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userNumber = userNumber;
		this.userPw = userPw;
	}

	/** full constructor */
	public SysUserInfo(String userName, String userSex, Integer userAge,
			String userNumber, String userPw, Set<CrmCustomer> crmCustomers) {
		this.userName = userName;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userNumber = userNumber;
		this.userPw = userPw;
		this.crmCustomers = crmCustomers;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_name", nullable = false, length = 50)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_sex", nullable = false, length = 10)
	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	@Column(name = "user_age", nullable = false)
	public Integer getUserAge() {
		return this.userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	@Column(name = "user_number", nullable = false, length = 50)
	public String getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	@Column(name = "user_pw", nullable = false, length = 50)
	public String getUserPw() {
		return this.userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sysUserInfo")
	public Set<CrmCustomer> getCrmCustomers() {
		return this.crmCustomers;
	}

	public void setCrmCustomers(Set<CrmCustomer> crmCustomers) {
		this.crmCustomers = crmCustomers;
	}

}