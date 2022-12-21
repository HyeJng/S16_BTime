package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kh.semi.s16.bt.jdbcDriver.JdbcTemplate;
import kh.semi.s16.bt.model.MemberVo;


public class MemberDao {
	public MemberDao() {}
	
	public MemberVo loginMember(Connection conn, String id, String pwd) {
		MemberVo m = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "SELECT * FROM MEMBER WHERE ID=? AND PWD=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				m = new MemberVo();
				m.setId(rs.getString("ID")); //받아온 ID컬럼 값을 member변수에 대입
				m.setPwd(rs.getString("PWD"));
				m.setName(rs.getString("NAME"));
				m.setEmail(rs.getString("EMAIL"));
				m.setIssub(rs.getString("ISSUB"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return m;
	}
	
	public int update(Connection conn, MemberVo m) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, String id) {
		int result = 0;
		return result;
	}
//	selectList  - 목록조회
	public List<MemberVo> selectList(Connection conn){
		List<MemberVo> volist = null;
		return volist;
	}
//	selectOne - 상세조회
	public MemberVo selectOne(Connection conn, String mid){
		MemberVo vo = null;
		return vo;
	}
//	selectOne - login - 상세조회
	public MemberVo login(Connection conn, String id, String pwd){
		MemberVo vo = null;

		String query = "select id,name,email,issub from MEMBER where id=? and pwd=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new MemberVo();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setEmail(rs.getString("email"));
				vo.setIssub(rs.getString("issub"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		
		
		return vo;
	}
}
