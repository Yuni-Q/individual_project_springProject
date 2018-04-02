package vo;

import java.util.Date;

// 게시글 VO
public class BoardVO {
	private int articleNum; // 글번호
	private String title;	// 제목
	private String writer;	// 작성자
	private String content;	// 내용
	private int readCount;	// 조회수
	private Date writeDate;	// 작성날짜
////////////////////////////////////////////////////////
	public BoardVO(){
	}
	public BoardVO(String title, String writer, String content, int readCount, Date writeDate) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.readCount = readCount;
		this.writeDate = writeDate;
	}
	public BoardVO(int articleNum, String title, String writer, String content, int readCount, Date writeDate) {
		this.articleNum = articleNum;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.readCount = readCount;
		this.writeDate = writeDate;
	}
/////////////////////////////////////////////////////////
	public int getArticleNum() {
		return articleNum;
	}
	public void setArticleNum(int articleNum) {
		this.articleNum = articleNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
/////////////////////////////////////////////////////////////////	
	@Override
	public String toString() {
		return "BoardVO [articleNum=" + articleNum + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", readCount=" + readCount + ", writeDate=" + writeDate + "]";
	}
}
