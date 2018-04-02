package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.BoardService;
import service.NaverBookService;
import vo.BoardPageVO;
import vo.BoardVO;
import vo.Book;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	// private NaverBookService service2;

	public void setService(BoardService service) {
		this.service = service;
	}

	// public void setService2(NaverBookService service2) {
	// this.service2 = service2;
	//
	// }
	//////////////////////////////////////////////////////////////
	@RequestMapping("/board.do")
	public ModelAndView board(@RequestParam(value = "page", defaultValue = "1") int page) {
		BoardPageVO boardPage = service.makePage(page);

		ModelAndView mv = new ModelAndView();
		mv.addObject("boardPage", boardPage);
		mv.setViewName("board_list"); // board_list.jsp

		return mv;
	}

	@RequestMapping(value = "/writeForm.do", method = RequestMethod.POST)
	public ModelAndView writeForm(Book book, HttpSession session) {
		//
		System.out.println(book);
		// System.out.println(book.getTitle());
		ModelAndView mv = new ModelAndView();

		if (session.getAttribute("loginId") == null) {
			// return "index"; //
			mv.setViewName("index");
			return mv; // write_form.jsp
		} else {
			//
			mv.addObject("image", book.getImage());
			mv.addObject("title", book.getTitle());
			mv.addObject("author", book.getAuthor());
			mv.addObject("publisher", book.getPublisher());
			mv.addObject("pubdate", book.getPubdate());
			mv.setViewName("write_form");
			return mv; // write_form.jsp
		}
	}
	// @RequestMapping("/updateForm.do")
	// public ModelAndView updateForm(BoardVO board, HttpSession session,int
	// articleNum){
	// ModelAndView mv = new ModelAndView();
	//
	// mv.addObject("original", service.readWithOutReadCount(articleNum));
	// mv.setViewName("updateForm");
	// return mv; // updateForm.jsp
	// }

	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public ModelAndView write(BoardVO board, HttpSession session) {
		System.out.println(board);
		int result = service.write(board, session);

		ModelAndView mv = new ModelAndView();
		mv.addObject("writeResult", result);
		mv.setViewName("write_result"); // write_result.jsp

		return mv;
	}

	// 실패?
	// @RequestMapping("/writeForm.do")
	// public ModelAndView write(Book book, HttpSession session) {
	// BoardVO board = service.read(title);
	//
	// mv.addObject("original", service.readWithOutReadCount(title));
	// mv.setViewName("writeForm");
	// return mv;
	// }

	@RequestMapping("/read.do")
	public ModelAndView read(int articleNum) {
		BoardVO board = service.read(articleNum);

		ModelAndView mv = new ModelAndView();
		mv.addObject("board", board);
		mv.setViewName("read"); // read.jsp
		return mv;
	}
	
//	@RequestMapping(value="/updatethis.do", method=RequestMethod.POST)
//	public ModelAndView updateThis(BoardVO board) {
//		System.out.println("*********************************"+board);
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("update_form");
//		mv.setViewName("read"); // read.jsp
//		return mv;
//	}

	@RequestMapping(value = "/updateForm.do", method = RequestMethod.POST)
	public ModelAndView updataForm(Book book, HttpSession session) {
		//BoardVO board로 하면 안되고 Book book으로 하면 된다 왜일까...?
		
		ModelAndView mv = new ModelAndView();
		System.out.println(book);
		if (session.getAttribute("loginId") == null) {
			// return "index"; //
			mv.setViewName("index");
			return mv; // write_form.jsp
		} else {
			mv.addObject("image", book.getImage());
			mv.addObject("articleNum", book.getArticleNum());
			mv.addObject("title", book.getTitle());
			mv.addObject("author", book.getAuthor());
			mv.addObject("publisher", book.getPublisher());
			mv.addObject("pubdate", book.getPubdate());
			mv.setViewName("update_form");
			return mv; // update_form.jsp
		}
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public ModelAndView update(BoardVO board, HttpSession session) {
		System.out.println(board);
		int result = service.update(board, session);

		ModelAndView mv = new ModelAndView();
		mv.addObject("writeResult", result);
		mv.setViewName("write_result"); // write_result.jsp

		return mv;
	}

	@RequestMapping("/delete.do")
	public ModelAndView delete(int articleNum) {
		int board = service.delete(articleNum);

		ModelAndView mv = new ModelAndView();
		mv.addObject("board", board);
		mv.setViewName("write_result"); // write_result.jsp
		return mv;
	}

}
