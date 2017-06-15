package com.yayiabc.http.mvc.pojo.jpa;

import java.util.List;

/**
 * 
 * @author xiaojiang 购物车表
 */
public class Cart extends BasePojo {
	private Integer cartId;

	private String userId;

	private String itemId;

	private String name;

	private String pic;

	private Integer num;

	private Integer price;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Cart() {
		super();
	}

	public Cart(Integer cartId, String userId, String itemId, String name,
			String pic, Integer num, Integer price) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.itemId = itemId;
		this.name = name;
		this.pic = pic;
		this.num = num;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", userId=" + userId + ", itemId="
				+ itemId + ", name=" + name + ", pic=" + pic + ", num=" + num
				+ ", price=" + price + "]";
	}

}