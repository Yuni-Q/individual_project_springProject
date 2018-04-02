package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.BoardService;
import vo.BoardPageVO;
import vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	
	public void setService(BoardService service) {
		this.service = service;
	}
//////////////////////////////////////////////////////////////
	@RequestMapping("/board.do")
	public ModelAndView board(
			@RequestParam(value="page", defaultValue="1")int page)
	{
		BoardPageVO boardPage = service.makePage(page);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardPage", boardPage);
		mv.setViewName("board_list"); // board_list.jsp
		
		return mv;
	}	
	
	@RequestMapping("/writeForm.do")
	public String writeForm(HttpSession session){
		
		if(session.getAttribute("loginId")==null){
			return "index"; // 
		}else{
			
			return "write_form"; // write_form.jsp
		}
	}
	
	@RequestMapping(value="/write.do", method=RequestMethod.POST)
	public ModelAndView write(BoardVO board, HttpSession session){
		System.out.println(board);
		int result = service.write(board, session);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("writeResult", result);
		mv.setViewName("write_result"); // write_result.jsp
		
		return mv;
	}

	
	@RequestMapping("/read.do")
	public ModelAndView read(int articleNum){
		BoardVO board = service.read(articleNum);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("board", board);
		mv.setViewName("read"); // read.jsp
		return mv;
	}
	
}













