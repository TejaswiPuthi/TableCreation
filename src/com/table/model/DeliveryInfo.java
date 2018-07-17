package com.table.model;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="DeliveryInfo")
public class DeliveryInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long DeliveryInfoId;
	private int mobileNum;
	private boolean status;
	@CreationTimestamp
	private LocalDateTime createDateTime;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private UserEntity user;

	public long getDeliveryInfoId() {
		return DeliveryInfoId;
	}

	public void setDeliveryInfoId(long deliveryInfoId) {
		DeliveryInfoId = deliveryInfoId;
	}

	public int getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public DeliveryInfo(int mobileNum, boolean status,
			LocalDateTime createDateTime, UserEntity user) {
		super();
		this.mobileNum = mobileNum;
		this.status = status;
		this.createDateTime = createDateTime;
		this.user = user;
	}
	 
	

}
