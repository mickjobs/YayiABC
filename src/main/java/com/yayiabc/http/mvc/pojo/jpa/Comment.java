package com.yayiabc.http.mvc.pojo.jpa;

/**
 * 
 * @author xiaojiang 评论信息表
 */
public class Comment extends BasePojo {
	private Integer commentId;

	private String userId;

	private ItemInfo itemInfo;

	private Ordera ordera;

	private Integer commentGrade;

	private String commentContent;

	private String replyContent;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public ItemInfo getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(ItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Ordera getOrdera() {
		return ordera;
	}

	public void setOrdera(Ordera ordera) {
		this.ordera = ordera;
	}

	public Integer getCommentGrade() {
		return commentGrade;
	}

	public void setCommentGrade(Integer commentGrade) {
		this.commentGrade = commentGrade;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent == null ? null : commentContent
				.trim();
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent == null ? null : replyContent.trim();
	}

	public Comment() {
		super();
	}

	public Comment(Integer commentId, String userId, ItemInfo itemInfo,
			Ordera ordera, Integer commentGrade, String commentContent,
			String replyContent) {
		super();
		this.commentId = commentId;
		this.userId = userId;
		this.itemInfo = itemInfo;
		this.ordera = ordera;
		this.commentGrade = commentGrade;
		this.commentContent = commentContent;
		this.replyContent = replyContent;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", userId=" + userId
				+ ", itemInfo=" + itemInfo + ", ordera=" + ordera
				+ ", commentGrade=" + commentGrade + ", commentContent="
				+ commentContent + ", replyContent=" + replyContent + "]";
	}

}