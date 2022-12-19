package kh.s16.bt.member.model;

import java.sql.Connection;
import java.util.List;

import kh.s16.bt.jdbcDriver.JDBCTemplate;



public class MemberService {
	private MemberDao dao = new MemberDao();
//	insert - 등록
	public int insert(MemberVo vo) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = dao.insert(conn, vo);
		JDBCTemplate.close(conn);
		return result;
	}
//	update - 수정
	public int update(MemberVo vo, String mid/*주로 PK*/) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = dao.update(conn, vo, mid);
		JDBCTemplate.close(conn);
		return result;
	}
//	delete  - 삭제
	public int delete(String mid/*주로 PK*/) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = dao.delete(conn, mid);
		JDBCTemplate.close(conn);	
		return result;
	}
//	selectList  - 목록조회
	public List<MemberVo> selectList(){
		List<MemberVo> volist = null;
		Connection conn = JDBCTemplate.getConnection();
		volist = dao.selectList(conn);
		JDBCTemplate.close(conn);
		return volist;
	}
//	selectOne - 상세조회
	public MemberVo selectOne(String mid/*주로 PK*/){
		MemberVo vo = null;
		Connection conn = JDBCTemplate.getConnection();
		vo = dao.selectOne(conn, mid);
		JDBCTemplate.close(conn);
		return vo;
	}
// selectOne-Login 상세조회
	public MemberVo login(String mid, String mpwd){
		MemberVo vo = null;
		Connection conn = JDBCTemplate.getConnection();
		vo = dao.login(conn, mid, mpwd);
		JDBCTemplate.close(conn);
		return vo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
