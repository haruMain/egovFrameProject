package hierp.common.domain.vo;

import java.util.List;

public class BoardDTO {
	private Long boardNum;
	private String boardTit;
	private String boardCon;
	private String boardReiDate;
	private String boardUpDate;
	private Long userNum;
	
	private List<FileVO> files;

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

	public Long getUserNum() {
		return userNum;
	}

	public void setUserNum(Long userNum) {
		this.userNum = userNum;
	}

	public List<FileVO> getFiles() {
		return files;
	}

	public void setFiles(List<FileVO> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "BoardDTO [boardNum=" + boardNum + ", boardTit=" + boardTit + ", boardCon=" + boardCon
				+ ", boardReiDate=" + boardReiDate + ", boardUpDate=" + boardUpDate + ", userNum=" + userNum
				+ ", files=" + files + "]";
	}
	public void create(String boardTit, String boardCon) {
        this.boardTit = boardTit;
        this.boardCon = boardCon;
    }

	public void create(String boardTit, String boardCon, List<FileVO> files) {
		 	this.boardTit = boardTit;
	        this.boardCon = boardCon;
	        this.files = files;
	    }

	public void create(BoardVO findById) {
		
	}
	
	
	
}
