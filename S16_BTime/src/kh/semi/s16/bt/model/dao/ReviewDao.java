package kh.semi.s16.bt.model.dao;

import static kh.semi.s16.bt.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kh.semi.s16.bt.model.vo.ReviewVo;

public class ReviewDao {
	public ReviewDao() {}
	
	public int insert(Connection conn, ReviewVo review) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO REVIEW VALUES(1,?,?,SYSDATE,?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, review.getIsbn());
			pstmt.setString(2, review.getRev_txt());
			pstmt.setInt(3, review.getEach_grade());
			pstmt.setString(4, review.getId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int update(Connection conn, ReviewVo review) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE REVIEW SET" +
				"REV_NUM=?,REV_TXT=?,REV_DATE=?,EACH_GRAD=?,ID=? WHERE ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, review.getRev_num());
			pstmt.setString(2, review.getRev_txt());
			pstmt.setDate(3, review.getRev_date());
			pstmt.setInt(4, review.getEach_grade());
			pstmt.setString(5, review.getId());
			pstmt.setString(6, review.getIsbn());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int delete(Connection conn, String isbn, String id) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM REVIEW WHERE ISBN=? AND ID=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, isbn);
			pstmt.setString(1, id);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public List<ReviewVo> selectList(Connection conn, String isbn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ReviewVo> volist = null;
		String query = "SELECT * FROM REVIEW WHERE ISBN=? ORDER BY REV_DATE DESC";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, isbn);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				volist = new ArrayList<ReviewVo>();
				do {
					ReviewVo vo = new ReviewVo();
					vo.setRev_num(rs.getInt("rev_num"));
					vo.setIsbn(rs.getString("ISBN"));
					vo.setRev_txt(rs.getString("rev_txt"));
					vo.setRev_date(rs.getDate("rev_date"));
					vo.setEach_grade(rs.getInt("each_grade"));
					vo.setId(rs.getString("ID"));
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
	public ReviewVo selectOne(Connection conn, String isbn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ReviewVo vo = null;
		String query = "SELECT * FROM REVIEW WHERE ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, isbn);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new ReviewVo();
				vo.setRev_txt(rs.getString("rev_txt"));
				vo.setRev_date(rs.getDate("rev_date"));
				vo.setEach_grade(rs.getInt("each_grade"));
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
