package mapper;

import java.util.List;
import java.util.Map;

import vo.BoardVO;

public interface BoardMapper {
	public int selectTotalCount(); 
	public List<BoardVO> selectList(Map<String, Integer> param); 
	public BoardVO select(int articleNum); 
	public int updateReadCount(int articleNum); 
	public int insert(BoardVO article); 
}
