package vo;

import java.util.List;

// 게시판 입장했을 때 목록에 보여져야 할 데이터 묶어놓는 용도
public class BoardPageVO {
	private List<BoardVO> boardList; // 목록에 보여질 실제 게시글들
	private int currentPage; 	// 목록 하단에 페이지 링크에 사용
	private int startPage;		// 목록 하단에 페이지 링크에 사용
	private int endPage;		// 목록 하단에 페이지 링크에 사용
	private int totalPage; 		// 총 몇페이지 필요한지
////////////////////////////////////////////////////////////////
	public BoardPageVO(){
	}
	public BoardPageVO(List<BoardVO> boardList, int currentPage, int startPage, int endPage, int totalPage) {
		this.boardList = boardList;
		this.currentPage = currentPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}
/////////////////////////////////////////////////////////////////	
	public List<BoardVO> getBoardList() {
		return boardList;
	}
	
	public void setBoardList(List<BoardVO> boardList) {
		this.boardList = boardList;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	

}
