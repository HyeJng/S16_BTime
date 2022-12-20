package kh.semi.s16.bt.service;

import java.sql.Connection;

import kh.semi.s16.bt.dao.ReviewDao;
import kh.semi.s16.bt.jdbcDriver.JdbcTemplate;
import kh.semi.s16.bt.model.ReviewVo;

public class ReviewService {
	private ReviewDao dao = new ReviewDao();
	
	public int insert(ReviewVo review) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.insert(conn, review);
		JdbcTemplate.close(conn);
		return result;
	}
	public int update(ReviewVo review) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.update(conn, review);
		JdbcTemplate.close(conn);
		return result;
	}
	public int delete(int rNum) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.delete(conn, rNum);
		JdbcTemplate.close(conn);
		return result;
	}
}
