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
		String query = "INSERT INTO READING_NOW VALUES (?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, rn.getRead_page());
			pstmt.setDate(2, rn.getReadstr_date());
			pstmt.setString(3, rn.getId());
			pstmt.setString(4, rn.getIsbn());
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
				"READ_PAGE=?,READSTR_DATE=?,ID=?,ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, rn.getRead_page());
			pstmt.setDate(2, rn.getReadstr_date());
			pstmt.setString(3, rn.getId());
			pstmt.setString(4, rn.getIsbn());
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
		String query = "DELETE FROM READING_NOW WHERE ID=? AND ISBN=?";
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
	public List<ReadingNowVo> selectList(Connection conn, String id){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ReadingNowVo> volist = null;
		String query = "SELECT * FROM READING_NOW R RIGHT OUTER JOIN MEMBER M ON R.ID=M.ID WHERE M.ID=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				volist = new ArrayList<ReadingNowVo>();
				do {
					ReadingNowVo vo = new ReadingNowVo();
					vo.setRead_page(rs.getInt("READ_PAGE"));
					vo.setReadstr_date(rs.getDate("READSTR_DATE"));
					vo.setId(rs.getString("ID"));
					vo.setIsbn(rs.getString("ISBN"));
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
	public ReadingNowVo selectOne(Connection conn, String id, String isbn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ReadingNowVo vo = null;
		String query = "SELECT * FROM READING_NOW WHERE ID=? AND ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, isbn);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new ReadingNowVo();
				vo.setRead_page(rs.getInt("READ_PAGE"));
				vo.setReadstr_date(rs.getDate("READSTR_DATE"));
				vo.setId(rs.getString("ID"));
				vo.setIsbn(rs.getString("ISBN"));
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
