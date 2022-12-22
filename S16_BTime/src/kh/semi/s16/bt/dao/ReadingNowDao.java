package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static kh.semi.s16.bt.jdbcDriver.JdbcTemplate.*;
import kh.semi.s16.bt.model.ReadingNowVo;

public class ReadingNowDao {
	public ReadingNowDao() {}
	
	public int insert(Connection conn, ReadingNowVo rn) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO READING_NOW VALUES (?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, rn.getRead_page());
			pstmt.setDate(2, rn.getReadstr_date());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int update(Connection conn, ReadingNowVo rn) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE READING_NOW SET"+
				"READ_PAGE=?,READSTR_DATE=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, rn.getRead_page());
			pstmt.setDate(2, rn.getReadstr_date());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int delete(Connection conn, String isbn) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM READING_NOW WHERE ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, isbn);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public List<ReadingNowVo> selectList(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ReadingNowVo> volist = null;
		String query = "SELECT * FROM READING_NOW";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				volist = new ArrayList<ReadingNowVo>();
				do {
					ReadingNowVo vo = new ReadingNowVo();
					vo.setRead_page(rs.getInt("READ_PAGE"));
					vo.setReadstr_date(rs.getDate("READSTR_DATE"));
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
	public ReadingNowVo selectOne(Connection conn, String isbn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ReadingNowVo vo = null;
		String query = "SELECT * FROM READING_NOW WHERE ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, isbn);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new ReadingNowVo();
				vo.setRead_page(rs.getInt("READ_PAGE"));
				vo.setReadstr_date(rs.getDate("READSTR_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}
}
