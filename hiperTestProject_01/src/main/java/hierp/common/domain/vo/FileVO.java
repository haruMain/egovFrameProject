package hierp.common.domain.vo;

public class FileVO {
	private int boardNum;
	private int fileNum;
	private String fileUuid;
	private String uploadPath;
	private long fileSize;
	private String fileName;
	private boolean fileType;
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public int getFileNum() {
		return fileNum;
	}
	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
	}
	public String getFileUuid() {
		return fileUuid;
	}
	public void setFileUuid(String fileUuid) {
		this.fileUuid = fileUuid;
	}
	public String getUploadPath() {
		return uploadPath;
	}
	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public boolean isFileType() {
		return fileType;
	}
	public void setFileType(boolean fileType) {
		this.fileType = fileType;
	}
	@Override
	public String toString() {
		return "FileVO [boardNum=" + boardNum + ", fileNum=" + fileNum + ", fileUuid=" + fileUuid + ", uploadPath="
				+ uploadPath + ", fileSize=" + fileSize + ", fileName=" + fileName + ", fileType=" + fileType + "]";
	}
	
	
}
