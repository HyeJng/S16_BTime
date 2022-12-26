package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.model.LoveAddVo;

import static kh.semi.s16.bt.jdbcDriver.JdbcTemplate.*;

public class LoveAddService {
	private LoveAddDao dao = new LoveAddDao();
	
	public int insert(String id, String isbn) {
		int result = 0;
		Connection conn = null;
		result = dao.insert(conn, id, isbn);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int update(LoveAddVo vo) {
		int result = 0;
		Connection conn = null;
		result = dao.update(conn, vo);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int delete(String id) {
		int result = 0;
		Connection conn = null;
		result = dao.delete(conn, id);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public List<LoveAddVo> selectList() {
		List<LoveAddVo> result = null;
		Connection conn = null;
		result = dao.selectList(conn);
		close(conn);
		return result;
	}
	public LoveAddVo selectOne(String id) {
		LoveAddVo result = null;
		Connection conn = null;
		result = dao.selectOne(conn, id);
		close(conn);
		return result;
	}
}
