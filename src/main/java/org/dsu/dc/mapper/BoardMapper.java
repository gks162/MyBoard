package org.dsu.dc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.dsu.dc.domain.BoardVO;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BoardMapper {
	List<BoardVO> getList();
	
	void insert(BoardVO board);
	void insertSelectKey(BoardVO board);
	
	BoardVO read(Long bno);
	int delete(Long bno);
	int update(BoardVO board);
}