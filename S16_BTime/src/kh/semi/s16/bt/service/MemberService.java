package kh.semi.s16.bt.service;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.dao.MemberDao;
import static kh.semi.s16.bt.jdbcDriver.JdbcTemplate.*;
import kh.semi.s16.bt.model.MemberVo;

public class MemberService {
	private MemberDao dao = new MemberDao();
	
	public int update(MemberVo m) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, m);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int delete(String id) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, id);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
//	selectList  - 목록조회
	public List<MemberVo> selectList(){
		List<MemberVo> volist = null;
		Connection conn = getConnection();
		volist = dao.selectList(conn);
		close(conn);
		return volist;
	}
//	selectOne - 상세조회
	public MemberVo selectOne(String id){
		MemberVo vo = null;
		Connection conn = getConnection();
		vo = dao.selectOne(conn, id);
		close(conn);
		return vo;
	}
// selectOne-Login 상세조회
	public MemberVo login(String id, String pwd){
		MemberVo vo = null;
		Connection conn = getConnection();
		vo = dao.loginMember(conn, id, pwd);
		close(conn);
		return vo;
	}
}
