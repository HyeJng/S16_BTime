package kh.semi.s16.bt.model.service;

import static kh.semi.s16.bt.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.model.dao.ReadingNowDao;
import kh.semi.s16.bt.model.vo.ReadingNowVo;

public class ReadingNowService {
	private ReadingNowDao dao = new ReadingNowDao();
	
	public int insert(ReadingNowVo rn) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn, rn);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int update(ReadingNowVo rn) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, rn);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	//delete 추가
	public int delete(String id, String isbn) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, id, isbn);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public List<ReadingNowVo> selectList(String id){
		List<ReadingNowVo> volist = null;
		Connection conn = getConnection();
		volist = dao.selectList(conn, id);
		close(conn);
		return volist;
	}
	public ReadingNowVo selectOne(String id, String isbn) {
		ReadingNowVo vo = null;
		Connection conn = getConnection();
		vo = dao.selectOne(conn, id, isbn);
		close(conn);
		return vo;
	}
}
