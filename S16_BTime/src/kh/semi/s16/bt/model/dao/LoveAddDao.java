package kh.semi.s16.bt.model.dao;

import static kh.semi.s16.bt.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kh.semi.s16.bt.model.vo.LoveAddVo;

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
				"ISBN=? WHERE ID=?";
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
	public int delete(Connection conn, String id, String isbn) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM LOVE_ADD WHERE ID=? AND ISBN=?";
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
	public List<LoveAddVo> selectList(Connection conn, String id) {
		List<LoveAddVo> volist = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "SELECT * FROM LOVE_ADD L JOIN BOOK K ON L.ISBN=B.ISBN WHERE L.ID=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return volist;
	}
	public LoveAddVo selectOne(Connection conn, String id, String isbn) {
		LoveAddVo vo = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "SELECT * FROM LOVE_ADD L JOIN BOOK B ON L.ISBN=B.ISBN WHERE ID=? AND ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, isbn);
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
