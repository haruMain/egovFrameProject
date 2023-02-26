package hierp.common.domain.vo;

public class ReplyVO {
	private Long replyNum;
	private Long boardNum;
	private String replyCon;
	private String replyWriter;
	private String replyReiDate;
	private String replyUpDate;
	
	public Long getReplyNum() {
		return replyNum;
	}
	public void setReplyNum(Long replyNum) {
		this.replyNum = replyNum;
	}
	public Long getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Long boardNum) {
		this.boardNum = boardNum;
	}
	public String getReplyCon() {
		return replyCon;
	}
	public void setReplyCon(String replyCon) {
		this.replyCon = replyCon;
	}
	public String getReplyWriter() {
		return replyWriter;
	}
	public void setReplyWriter(String replyWriter) {
		this.replyWriter = replyWriter;
	}
	public String getReplyReiDate() {
		return replyReiDate;
	}
	public void setReplyReiDate(String replyReiDate) {
		this.replyReiDate = replyReiDate;
	}
	public String getReplyUpDate() {
		return replyUpDate;
	}
	public void setReplyUpDate(String replyUpDate) {
		this.replyUpDate = replyUpDate;
	}
	@Override
	public String toString() {
		return "ReplyVO [replyNum=" + replyNum + ", boardNum=" + boardNum + ", replyCon=" + replyCon + ", replyWriter="
				+ replyWriter + ", replyReiDate=" + replyReiDate + ", replyUpDate=" + replyUpDate + "]";
	}
	public void create(String replyCon, String replyWriter) {
        this.replyCon = replyCon;
        this.replyWriter = replyWriter;
    }
	
	
	
}
