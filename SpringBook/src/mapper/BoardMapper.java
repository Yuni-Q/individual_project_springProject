package mapper;

import java.util.List;
import java.util.Map;

import vo.BoardVO;

public interface BoardMapper {
	public int selectTotalCount(); //�� �Խñ��� ����
	public List<BoardVO> selectList(Map<String, Integer> param); // �� �������� ������ �� ������ ��ȸ
	public BoardVO select(int articleNum); // �� ������ �ϳ��� �� ��ȸ
	public int updateReadCount(int articleNum); // ��ȸ�� ����
	public int insert(BoardVO article); // �۾���
	public int update(BoardVO article);
	public int delete(int articleNum);
}
