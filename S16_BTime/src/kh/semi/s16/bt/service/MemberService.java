package kh.semi.s16.bt.service;

import java.sql.Connection;
import java.util.List;

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
//	selectList  - 목록조회
	public List<MemberVo> selectList(){
		List<MemberVo> volist = null;
		Connection conn = JdbcTemplate.getConnection();
		volist = dao.selectList(conn);
		JdbcTemplate.close(conn);
		return volist;
	}
//	selectOne - 상세조회
	public MemberVo selectOne(String id){
		MemberVo vo = null;
		Connection conn = JdbcTemplate.getConnection();
		vo = dao.selectOne(conn, id);
		JdbcTemplate.close(conn);
		return vo;
	}
// selectOne-Login 상세조회
	public MemberVo login(String id, String pwd){
		MemberVo vo = null;
		Connection conn = JdbcTemplate.getConnection();
		vo = dao.loginMember(conn, id, pwd);
		JdbcTemplate.close(conn);
		return vo;
	}
}
