package com.yayiabc.http.mvc.pojo.jpa;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author xiaojiang 用户表
 */
public class User extends BasePojo {
	private String userId;

	private String phone;

	private String pwd;

	private Integer identity;

	private String trueName;

	private Integer sex;

	private String userPic;

	private Date birthday;

	private String qq;

	private Integer bindUserNum;

	private String reflect;

	private Certification certification;

	private List<Receiver> receiverList;

	private List<Ordera> orderaList;

	// private List<Refund> refundList;

	private Cart cart;

	private SaleInfo saleinfo;

	private List<Comment> commentList;

	private List<ItemStar> itemstarList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	public String getReflect() {
		return reflect;
	}

	public List<ItemStar> getItemstarList() {
		return itemstarList;
	}

	public void setItemstarList(List<ItemStar> itemstarList) {
		this.itemstarList = itemstarList;
	}

	public void setReflect(String reflect) {
		this.reflect = reflect;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}

	public Integer getIdentity() {
		return identity;
	}

	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName == null ? null : trueName.trim();
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getUserPic() {
		return userPic;
	}

	public void setUserPic(String userPic) {
		this.userPic = userPic == null ? null : userPic.trim();
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	public Integer getBindUserNum() {
		return bindUserNum;
	}

	public void setBindUserNum(Integer bindUserNum) {
		this.bindUserNum = bindUserNum;
	}

	public List<Receiver> getReceiverList() {
		return receiverList;
	}

	public void setReceiverList(List<Receiver> receiverList) {
		this.receiverList = receiverList;
	}

	public List<Ordera> getOrderaList() {
		return orderaList;
	}

	public void setOrderaList(List<Ordera> orderaList) {
		this.orderaList = orderaList;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public Certification getCertification() {
		return certification;
	}

	public void setCertification(Certification certification) {
		this.certification = certification;
	}

	public SaleInfo getSaleinfo() {
		return saleinfo;
	}

	public void setSaleinfo(SaleInfo saleinfo) {
		this.saleinfo = saleinfo;
	}

	public User() {
		super();
	}

	public User(String userId, String phone, String pwd, Integer identity,
			String trueName, Integer sex, String userPic, Date birthday,
			String qq, Integer bindUserNum, String reflect,
			Certification certification, List<Receiver> receiverList,
			List<Ordera> orderaList, Cart cart, SaleInfo saleinfo,
			List<Comment> commentList, List<ItemStar> itemstarList) {
		super();
		this.userId = userId;
		this.phone = phone;
		this.pwd = pwd;
		this.identity = identity;
		this.trueName = trueName;
		this.sex = sex;
		this.userPic = userPic;
		this.birthday = birthday;
		this.qq = qq;
		this.bindUserNum = bindUserNum;
		this.reflect = reflect;
		this.certification = certification;
		this.receiverList = receiverList;
		this.orderaList = orderaList;
		this.cart = cart;
		this.saleinfo = saleinfo;
		this.commentList = commentList;
		this.itemstarList = itemstarList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", phone=" + phone + ", pwd=" + pwd
				+ ", identity=" + identity + ", trueName=" + trueName
				+ ", sex=" + sex + ", userPic=" + userPic + ", birthday="
				+ birthday + ", qq=" + qq + ", bindUserNum=" + bindUserNum
				+ ", reflect=" + reflect + ", certification=" + certification
				+ ", receiverList=" + receiverList + ", orderaList="
				+ orderaList + ", cart=" + cart + ", saleinfo=" + saleinfo
				+ ", commentList=" + commentList + ", itemstarList="
				+ itemstarList + "]";
	}

}