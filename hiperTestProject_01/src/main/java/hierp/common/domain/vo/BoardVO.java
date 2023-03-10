package hierp.common.domain.vo;

public class BoardVO {
	private Long boardNum;
	private String boardTit;
	private String boardCon;
	private String boardReiDate;
	private String boardUpDate;
	private Long userId;
	
	public Long getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Long boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardTit() {
		return boardTit;
	}
	public void setBoardTit(String boardTit) {
		this.boardTit = boardTit;
	}
	public String getBoardCon() {
		return boardCon;
	}
	public void setBoardCon(String boardCon) {
		this.boardCon = boardCon;
	}
	public String getBoardReiDate() {
		return boardReiDate;
	}
	public void setBoardReiDate(String boardReiDate) {
		this.boardReiDate = boardReiDate;
	}
	public String getBoardUpDate() {
		return boardUpDate;
	}
	public void setBoardUpDate(String boardUpDate) {
		this.boardUpDate = boardUpDate;
	}
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardTit=" + boardTit + ", boardCon=" + boardCon + ", boardReiDate="
				+ boardReiDate + ", boardUpDate=" + boardUpDate + ", userId=" + userId + "]";
	}
	public void create(String boardTit, String boardCon) {
        this.boardTit = boardTit;
        this.boardCon = boardCon;
    }
	

}
