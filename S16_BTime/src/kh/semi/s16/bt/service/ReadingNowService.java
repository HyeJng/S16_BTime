package kh.semi.s16.bt.service;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.dao.ReadingNowDao;
import kh.semi.s16.bt.jdbcDriver.JdbcTemplate;
import kh.semi.s16.bt.model.ReadingNowVo;

public class ReadingNowService {
	private ReadingNowDao dao = new ReadingNowDao();
	
	public int insert(ReadingNowVo rn) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.insert(conn, rn);
		JdbcTemplate.close(conn);
		return result;
	}
	public int update(ReadingNowVo rn) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.update(conn, rn);
		JdbcTemplate.close(conn);
		return result;
	}
	//delete 추가
	public int delete(String isbn) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.delete(conn, isbn);
		JdbcTemplate.close(conn);
		return result;
	}
	public List<ReadingNowVo> selectList(){
		List<ReadingNowVo> volist = null;
		Connection conn = JdbcTemplate.getConnection();
		volist = dao.selectList(conn);
		JdbcTemplate.close(conn);
		return volist;
	}
	public ReadingNowVo selectOne(String isbn) {
		ReadingNowVo vo = null;
		Connection conn = JdbcTemplate.getConnection();
		vo = dao.selectOne(conn, isbn);
		JdbcTemplate.close(conn);
		return vo;
	}
}
