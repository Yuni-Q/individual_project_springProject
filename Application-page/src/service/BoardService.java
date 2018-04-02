package service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.BoardDao;
import vo.BoardPageVO;
import vo.BoardVO;

@Component
public class BoardService {
	@Autowired
	private BoardDao dao;
	public void setDao(BoardDao dao) {
		this.dao = dao;
	}
/////////////////////////////////////////////////////////////
	
	public BoardPageVO makePage(int page){
		final int COUNT_PER_PAGE = 10; 
		
		
		int totalArticleCount = dao.selectTotalCount();
		
		
		int totalPageCount = totalArticleCount/COUNT_PER_PAGE;
		if(totalArticleCount%COUNT_PER_PAGE != 0)
			totalPageCount++;

	
		int startPage = (page-1)/10*10 + 1;
		
	
		int endPage = startPage+9;
		if(totalPageCount<endPage)
			endPage = totalPageCount;
		
		
		int startRow = (page-1)*COUNT_PER_PAGE;	
		
		
		List<BoardVO> boardList = 
				dao.selectList(startRow, COUNT_PER_PAGE);
		
	
		return new BoardPageVO
				(boardList, page, startPage, endPage, totalPageCount);		
	}

	
	
	public int write(BoardVO board, HttpSession session){
		board.setReadCount(0); 
		board.setWriter((String)session.getAttribute("loginId")); 
		return dao.insert(board);
	}


	public BoardVO read(int articleNum){
		BoardVO board = dao.select(articleNum);
		if(board != null){
		
			dao.updateReadCount(articleNum);
		}
		return board;
	}
}








