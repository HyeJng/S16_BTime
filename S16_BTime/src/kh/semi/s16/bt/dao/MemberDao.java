package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static kh.semi.s16.bt.jdbcDriver.JdbcTemplate.*;
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
				m.setSubstr_date(rs.getDate("SUBSTR_DATE"));
				m.setSubend_date(rs.getDate("SUBEND_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return m;
	}
	
	public int update(Connection conn, MemberVo m) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE MEMBER SET"+
				"PWD=?,NAME=?EMAIL=?ISSUB=?,SUBSTR_DATE=?,SUBEND_DATE=? WHERE ID=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getEmail());
			pstmt.setString(4, m.getIssub());
			pstmt.setDate(5, m.getSubstr_date());
			pstmt.setDate(6, m.getSubend_date());
			pstmt.setString(7, m.getId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int delete(Connection conn, String id) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM MEMBER WHERE ID=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
//	selectList  - 목록조회
	public List<MemberVo> selectList(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberVo> volist = null;
		String query = "SELECT * FROM MEMBER";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				volist = new ArrayList<MemberVo>();
				do {
					MemberVo vo = new MemberVo();
					vo.setId(rs.getString("ID"));
					vo.setPwd(rs.getString("PWD"));
					vo.setName(rs.getString("NAME"));
					vo.setEmail(rs.getString("EMAIL"));
					vo.setIssub(rs.getString("ISSUB"));
					vo.setSubstr_date(rs.getDate("SUBSTR_DATE"));
					vo.setSubend_date(rs.getDate("SUBEND_DATE"));
					volist.add(vo);
				}while(rs.next());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return volist;
	}
//	selectOne - 상세조회
	public MemberVo selectOne(Connection conn, String mid){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo vo = null;
		String query = "SELECT * FROM MEMBER WHERE ID=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "ID");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new MemberVo();
				vo.setPwd(rs.getString("PWD"));
				vo.setName(rs.getString("NAME"));
				vo.setEmail(rs.getString("EMAIL"));
				vo.setIssub(rs.getString("ISSUB"));
				vo.setSubstr_date(rs.getDate("SUBSTR_DATE"));
				vo.setSubend_date(rs.getDate("SUBEND_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}
//	selectOne - login - 상세조회
	public MemberVo login(Connection conn, String id, String pwd){
		MemberVo vo = null;

		String query = "select * from MEMBER where id=? and pwd=?";
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
				vo.setSubstr_date(rs.getDate("SUBSTR_DATE"));
				vo.setSubend_date(rs.getDate("SUBEND_DATE"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		return vo;
	}
}
