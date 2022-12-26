package kh.semi.s16.bt.model.service;

import static kh.semi.s16.bt.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.model.dao.LoveAddDao;
import kh.semi.s16.bt.model.vo.LoveAddVo;

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
	public int delete(String id, String isbn) {
		int result = 0;
		Connection conn = null;
		result = dao.delete(conn, id, isbn);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public List<LoveAddVo> selectList(String id) {
		List<LoveAddVo> result = null;
		Connection conn = null;
		result = dao.selectList(conn, id);
		close(conn);
		return result;
	}
	public LoveAddVo selectOne(String id, String isbn) {
		LoveAddVo result = null;
		Connection conn = null;
		result = dao.selectOne(conn, id, isbn);
		close(conn);
		return result;
	}
}
