package kh.semi.s16.bt.service;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.dao.ReviewDao;
import static kh.semi.s16.bt.jdbcDriver.JdbcTemplate.*;
import kh.semi.s16.bt.model.ReviewVo;

public class ReviewService {
	private ReviewDao dao = new ReviewDao();
	
	public int insert(ReviewVo review) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn, review);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int update(ReviewVo review) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, review);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int delete(String isbn, String id) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, isbn, id);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public List<ReviewVo> selectList(){
		List<ReviewVo> volist = null;
		Connection conn = getConnection();
		volist = dao.selectList(conn);
		close(conn);
		return volist;
	}
	public ReviewVo selectOne(String isbn) {
		ReviewVo vo = null;
		Connection conn = getConnection();
		vo = dao.selectOne(conn, isbn);
		close(conn);
		return vo;
	}
}
