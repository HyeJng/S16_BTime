package kh.semi.s16.bt.service;

import java.sql.Connection;

import kh.semi.s16.bt.dao.MemberDao;
import kh.semi.s16.bt.jdbcDriver.JdbcTemplate;
import kh.semi.s16.bt.model.MemberVo;

public class MemberService {
	private MemberDao dao = new MemberDao();
	
	public int update(MemberVo m) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.update(conn, m);
		JdbcTemplate.close(conn);
		return result;
	}
	public int delete(String id) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.delete(conn, id);
		JdbcTemplate.close(conn);
		return result;
	}
}
