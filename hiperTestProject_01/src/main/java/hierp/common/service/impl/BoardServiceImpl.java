package hierp.common.service.impl;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import hierp.common.domain.vo.BoardDTO;
import hierp.common.domain.vo.BoardVO;
import hierp.common.domain.vo.Criteria;
import hierp.common.domain.vo.FileVO;
import hierp.common.service.BoardService;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {
	
	@Resource(name="BoardDAO")
	private BoardDAO boardDAO;
	
	@Resource(name="FileDAO")
	private FileDAO fileDAO;

//	추가
	@Override
	public void register(BoardDTO boardDTO) {
		boardDAO.save(boardDTO);
		List<FileVO> files = boardDTO.getFiles();
        Optional.ofNullable(files).ifPresent(fileList -> {
            fileList.forEach(file -> {
                file.setBoardNum(boardDTO.getBoardNum());
                fileDAO.save(file);
            });
        });
	}
//	수정
	@Override
	public void modify(BoardDTO boardDTO) {
		boardDAO.setBoardVO(boardDTO);
		fileDAO.remove(boardDTO.getBoardNum());
        List<FileVO> files = boardDTO.getFiles();
        Optional.ofNullable(files).ifPresent(fileList -> {
            fileList.forEach(file -> {
                file.setBoardNum(boardDTO.getBoardNum());
                fileDAO.save(file);
            });
        });
	}
//	삭제
	@Override
	public void remove(Long boardNum) {
		fileDAO.remove(boardNum);
		boardDAO.remove(boardNum);
	}
//	조회
	@Override
	public BoardDTO show(Long boardNum) {
		 BoardDTO boardDTO = new BoardDTO();
	     boardDTO.create(boardDAO.findById(boardNum));
	     boardDTO.setFiles(fileDAO.selectAll(boardNum));
		return boardDTO;
	}
//	전체조회
	@Override
	public List<BoardVO> showAll(Criteria criteria) {
		return boardDAO.findAll(criteria);
	}
	
//	전체개수
	public int getTotal() {
		return boardDAO.findCounAll();
	}
}
