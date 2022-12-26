package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kh.semi.s16.bt.model.LoveAddVo;
import static kh.semi.s16.bt.jdbcDriver.JdbcTemplate.*;

public class LoveAddDao {
	//CRUD //TODO
	public int insert(Connection conn, String id, String isbn) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO LOVE_ADD VALUES(?, ?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, isbn);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int update(Connection conn, LoveAddVo vo) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE LOVE_ADD SET" + 
				"ISBN=? WHERE ID=?	";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, vo.getIsbn());
			pstmt.setString(2, vo.getId());
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
		String query = "DELETE FROM LOVE_ADD WHERE ID=?";
		try {
			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, id);
//			pstmt.setString(2, isbn);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public List<LoveAddVo> selectList(Connection conn) {
		List<LoveAddVo> volist = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "INSERT INTO LOVE_ADD VALUES(?, ?)";
		try {
			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, id);
//			pstmt.setString(2, isbn);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return volist;
	}
	public LoveAddVo selectOne(Connection conn, String id) {
		LoveAddVo vo = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "INSERT INTO LOVE_ADD VALUES(?, ?)";
		try {
			pstmt = conn.prepareStatement(query);
//			pstmt.setString(1, id);
//			pstmt.setString(2, isbn);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}
}
