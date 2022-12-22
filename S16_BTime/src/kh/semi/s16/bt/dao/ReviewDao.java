package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kh.semi.s16.bt.model.ReviewVo;
import static kh.semi.s16.bt.jdbcDriver.JdbcTemplate.*;

public class ReviewDao {
	public ReviewDao() {}
	
	public int insert(Connection conn, ReviewVo review) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO REVIEW VALUES(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, review.getRev_num());
			pstmt.setString(2, review.getRev_txt());
			pstmt.setDate(3, review.getRev_date());
			pstmt.setInt(4, review.getEach_grade());
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
				"REV_NUM=?,REV_TXT=?,REV_DATE=?,EACH_GRAD=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, review.getRev_num());
			pstmt.setString(2, review.getRev_txt());
			pstmt.setDate(3, review.getRev_date());
			pstmt.setInt(4, review.getEach_grade());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int delete(Connection conn, int rNum) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM REVIEW WHERE REV_NUM=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, rNum);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public List<ReviewVo> selectList(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ReviewVo> volist = null;
		String query = "SELECT * FROM REVIEW";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				volist = new ArrayList<ReviewVo>();
				do {
					ReviewVo vo = new ReviewVo();
					vo.setRev_num(rs.getInt("rev_num"));
					vo.setRev_txt(rs.getString("rev_txt"));
					vo.setRev_date(rs.getDate("rev_date"));
					vo.setEach_grade(rs.getInt("each_grade"));
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
	public ReviewVo selectOne(Connection conn, int rNum) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ReviewVo vo = null;
		String query = "SELECT * FROM REVIEW WHERE REV_NUM=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, rNum);
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
