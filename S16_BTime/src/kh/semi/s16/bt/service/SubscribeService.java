package kh.semi.s16.bt.service;

import java.sql.Connection;

import kh.semi.s16.bt.dao.SubscribeDao;
import kh.semi.s16.bt.jdbcDriver.JdbcTemplate;
import kh.semi.s16.bt.model.SubscribeVo;

public class SubscribeService {
	private SubscribeDao dao = new SubscribeDao();
	
	public int insert(SubscribeVo sub) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.insert(conn, sub);
		JdbcTemplate.close(conn);
		return result;
	}
	public int update(SubscribeVo sub) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.update(conn, sub);
		JdbcTemplate.close(conn);
		return result;
	}
	public int delete(int subType) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.delete(conn, subType);
		JdbcTemplate.close(conn);
		return result;
	}
}
