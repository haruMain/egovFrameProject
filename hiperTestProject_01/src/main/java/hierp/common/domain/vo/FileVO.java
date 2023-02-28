package hierp.common.domain.vo;

public class FileVO {
	private Long fileNum;
	private String fileName;
	private String fileReiDate;
	private String fileUuid;
	private Long boardNum;
	
	public Long getFileNum() {
		return fileNum;
	}
	public void setFileNum(Long fileNum) {
		this.fileNum = fileNum;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileReiDate() {
		return fileReiDate;
	}
	public void setFileReiDate(String fileReiDate) {
		this.fileReiDate = fileReiDate;
	}
	public String getFileUuid() {
		return fileUuid;
	}
	public void setFileUuid(String fileUuid) {
		this.fileUuid = fileUuid;
	}
	public Long getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Long boardNum) {
		this.boardNum = boardNum;
	}
	@Override
	public String toString() {
		return "FileVO [fileNum=" + fileNum + ", fileName=" + fileName + ", fileReiDate=" + fileReiDate + ", fileUuid="
				+ fileUuid + ", boardNum=" + boardNum + "]";
	}
	
}
