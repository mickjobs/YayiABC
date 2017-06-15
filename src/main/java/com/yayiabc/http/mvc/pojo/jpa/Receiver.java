package com.yayiabc.http.mvc.pojo.jpa;

/**
 * 
 * @author xiaojiang 收货地址表
 */
public class Receiver extends BasePojo {
	private Integer receiverId;

	private String userId;

	private String receiverName;

	private String province;

	private String city;

	private String county;

	private String receiverDetail;

	private String phone;

	private Integer isDefault;

	public Integer getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName == null ? null : receiverName.trim();
	}

	public String getProvince() {
		return province;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getReceiverDetail() {
		return receiverDetail;
	}

	public void setReceiverDetail(String receiverDetail) {
		this.receiverDetail = receiverDetail == null ? null : receiverDetail
				.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public Integer getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}

	public Receiver() {
		super();
	}

	public Receiver(Integer receiverId, String userId, String receiverName,
			String province, String city, String county, String receiverDetail,
			String phone, Integer isDefault) {
		super();
		this.receiverId = receiverId;
		this.userId = userId;
		this.receiverName = receiverName;
		this.province = province;
		this.city = city;
		this.county = county;
		this.receiverDetail = receiverDetail;
		this.phone = phone;
		this.isDefault = isDefault;
	}

	@Override
	public String toString() {
		return "Receiver [receiverId=" + receiverId + ", userId=" + userId
				+ ", receiverName=" + receiverName + ", province=" + province
				+ ", city=" + city + ", county=" + county + ", receiverDetail="
				+ receiverDetail + ", phone=" + phone + ", isDefault="
				+ isDefault + "]";
	}

}