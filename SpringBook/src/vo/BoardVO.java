package vo;

import java.util.Date;

// �Խñ� VO
public class BoardVO {
	private int articleNum; // �۹�ȣ
	private String title;	// ����
	private String writer;	// �ۼ���
	private String content;	// ����
	private int readCount;	// ��ȸ��
	private Date writeDate;	// �ۼ���¥
	private String author;
    private String publisher;
    private String pubdate;
    private String image;
    
////////////////////////////////////////////////////////
	public BoardVO(){
	}
	public BoardVO(String title, String writer, String content, int readCount, Date writeDate, String author, String publisher, String pubdate, String image) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.readCount = readCount;
		this.writeDate = writeDate;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.image = image;
	}
	public BoardVO(int articleNum, String title, String writer, String content, int readCount, Date writeDate, String author, String publisher, String pubdate, String image) {
		this.articleNum = articleNum;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.readCount = readCount;
		this.writeDate = writeDate;
		this.author = author;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.image = image;
	}
	public BoardVO(int articleNum, String title, String writer, String content, Date writeDate, String author, String publisher, String pubdate, String image) {
		this.articleNum = articleNum;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writeDate = writeDate;
		this.author = author;
		this.publisher = publisher;
		this.pubdate = pubdate;
		this.image = image;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}	
/////////////////////////////////////////////////////////////////	
	@Override
	public String toString() {
		return "BoardVO [articleNum=" + articleNum + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", readCount=" + readCount + ", writeDate=" + writeDate + ", author=" + author + ", publisher="
				+ publisher + ", pubdate=" + pubdate + ", image=" + image + "]";
	}
}
