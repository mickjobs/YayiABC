package com.yayiabc.http.mvc.pojo.jpa;

import java.util.List;

/**
 * 
 * @author xiaojiang 商品信息表
 */
public class ItemInfo extends BasePojo {
	private String itemId;

	private String itemName;

	private ItemBrand itemBrand;

	// private Refund refundId;

	private Integer itemPrice;

	private Integer sales;

	private Integer state;

	private ItemClassify oneClassify;

	private ItemClassify twoClassify;

	private ItemClassify threeClassify;

	private ItemProperty itemPnamea;

	private ItemProperty itemPnameb;

	private ItemProperty itemPnamec;

	private List<Comment> commentList;

	public ItemBrand getItemBrand() {
		return itemBrand;
	}

	public void setItemBrand(ItemBrand itemBrand) {
		this.itemBrand = itemBrand;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId == null ? null : itemId.trim();
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName == null ? null : itemName.trim();
	}

	public Integer getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Integer itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public ItemClassify getOneClassify() {
		return oneClassify;
	}

	public void setOneClassify(ItemClassify oneClassify) {
		this.oneClassify = oneClassify;
	}

	public ItemClassify getTwoClassify() {
		return twoClassify;
	}

	public void setTwoClassify(ItemClassify twoClassify) {
		this.twoClassify = twoClassify;
	}

	public ItemClassify getThreeClassify() {
		return threeClassify;
	}

	public void setThreeClassify(ItemClassify threeClassify) {
		this.threeClassify = threeClassify;
	}

	public ItemProperty getItemPnamea() {
		return itemPnamea;
	}

	public void setItemPnamea(ItemProperty itemPnamea) {
		this.itemPnamea = itemPnamea;
	}

	public ItemProperty getItemPnameb() {
		return itemPnameb;
	}

	public void setItemPnameb(ItemProperty itemPnameb) {
		this.itemPnameb = itemPnameb;
	}

	public ItemProperty getItemPnamec() {
		return itemPnamec;
	}

	public void setItemPnamec(ItemProperty itemPnamec) {
		this.itemPnamec = itemPnamec;
	}

	public ItemInfo() {
		super();
	}

	public ItemInfo(String itemId, String itemName, ItemBrand itemBrand,
			Integer itemPrice, Integer sales, Integer state,
			ItemClassify oneClassify, ItemClassify twoClassify,
			ItemClassify threeClassify, ItemProperty itemPnamea,
			ItemProperty itemPnameb, ItemProperty itemPnamec,
			List<Comment> commentList) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemBrand = itemBrand;
		this.itemPrice = itemPrice;
		this.sales = sales;
		this.state = state;
		this.oneClassify = oneClassify;
		this.twoClassify = twoClassify;
		this.threeClassify = threeClassify;
		this.itemPnamea = itemPnamea;
		this.itemPnameb = itemPnameb;
		this.itemPnamec = itemPnamec;
		this.commentList = commentList;
	}

	@Override
	public String toString() {
		return "ItemInfo [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemBrand=" + itemBrand + ", itemPrice=" + itemPrice
				+ ", sales=" + sales + ", state=" + state + ", oneClassify="
				+ oneClassify + ", twoClassify=" + twoClassify
				+ ", threeClassify=" + threeClassify + ", itemPnamea="
				+ itemPnamea + ", itemPnameb=" + itemPnameb + ", itemPnamec="
				+ itemPnamec + ", commentList=" + commentList + "]";
	}

}