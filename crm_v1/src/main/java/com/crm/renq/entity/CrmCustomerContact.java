package com.crm.renq.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CrmCustomerContact entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "crm_customer_contact", catalog = "crm")
public class CrmCustomerContact implements java.io.Serializable {

	// Fields

	private Integer contactId;
	private Timestamp contactTime;
	private String contactContent;

	// Constructors

	/** default constructor */
	public CrmCustomerContact() {
	}

	/** full constructor */
	public CrmCustomerContact(Timestamp contactTime, String contactContent) {
		this.contactTime = contactTime;
		this.contactContent = contactContent;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "contact_id", unique = true, nullable = false)
	public Integer getContactId() {
		return this.contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	@Column(name = "contact_time", nullable = false, length = 19)
	public Timestamp getContactTime() {
		return this.contactTime;
	}

	public void setContactTime(Timestamp contactTime) {
		this.contactTime = contactTime;
	}

	@Column(name = "contact_content", nullable = false, length = 2000)
	public String getContactContent() {
		return this.contactContent;
	}

	public void setContactContent(String contactContent) {
		this.contactContent = contactContent;
	}

}