package kh.semi.s16.bt.model.service;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.common.jdbc.JdbcTemplate;
import kh.semi.s16.bt.model.dao.SubscribeDao;
import kh.semi.s16.bt.model.vo.SubscribeVo;

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
	public List<SubscribeVo> selectList(){
		List<SubscribeVo> volist = null;
		Connection conn = JdbcTemplate.getConnection();
		volist = dao.selectList(conn);
		JdbcTemplate.close(conn);
		return volist;
	}
	public SubscribeVo selectOne(int subType) {
		SubscribeVo vo = null;
		Connection conn = JdbcTemplate.getConnection();
		vo = dao.selectOne(conn,subType);
		JdbcTemplate.close(conn);
		return vo;
	}
}
