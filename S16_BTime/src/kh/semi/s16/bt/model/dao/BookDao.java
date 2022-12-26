package kh.semi.s16.bt.model.dao;

import static kh.semi.s16.bt.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kh.semi.s16.bt.model.vo.BookVo;

public class BookDao {
	public BookDao() {
	}
	
	public int insertAll(Connection conn, List<BookVo> blist) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT ALL ";
		for(BookVo b: blist) {
			query += "  INTO BOOK VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		}
		query += " select * from dual";
		try {
			pstmt = conn.prepareStatement(query);
			int idx = 1;
			for(BookVo b: blist) {
				pstmt.setString(idx++, b.getIsbn());
				pstmt.setString(idx++, b.getThum_img());
				pstmt.setString(idx++, b.getBook_name());
				pstmt.setString(idx++, b.getAuthor());
				pstmt.setString(idx++, b.getPublisher());
				pstmt.setString(idx++, b.getCategory());
				pstmt.setString(idx++, b.getBook_intro());
				pstmt.setString(idx++, b.getAuth_intro());
				pstmt.setString(idx++, b.getPub_intro());
				pstmt.setInt(idx++, b.getBook_page());
				pstmt.setDouble(idx++, b.getTotal_grade());
				pstmt.setInt(idx++, b.getGrade_peo());
			}
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}


	public int insert(Connection conn, BookVo b) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO bOOK VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getIsbn());
			pstmt.setString(2, b.getThum_img());
			pstmt.setString(3, b.getBook_name());
			pstmt.setString(4, b.getAuthor());
			pstmt.setString(5, b.getPublisher());
			pstmt.setString(6, b.getCategory());
			pstmt.setString(7, b.getBook_intro());
			pstmt.setString(8, b.getAuth_intro());
			pstmt.setString(9, b.getPub_intro());
			pstmt.setInt(10, b.getBook_page());
			pstmt.setDouble(11, b.getTotal_grade());
			pstmt.setInt(12, b.getGrade_peo());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int update(Connection conn, BookVo b) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE BOOK SET"
				+ "thum_img=?,book_name=?,author=?,publisher=?,category=?,book_intro=?,auth_intro=?,pub_intro=?,book_page=?,total_grade=?,grade_peo=? WHERE ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getThum_img());
			pstmt.setString(2, b.getBook_name());
			pstmt.setString(3, b.getAuthor());
			pstmt.setString(4, b.getPublisher());
			pstmt.setString(5, b.getCategory());
			pstmt.setString(6, b.getBook_intro());
			pstmt.setString(7, b.getAuth_intro());
			pstmt.setString(8, b.getPub_intro());
			pstmt.setInt(9, b.getBook_page());
			pstmt.setDouble(10, b.getTotal_grade());
			pstmt.setInt(11, b.getGrade_peo());
			pstmt.setString(12, b.getIsbn());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}

	public int delete(Connection conn, String isbn) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM BOOK WHERE ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, isbn);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}

		return result;
	}

	public List<BookVo> selectList(Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookVo> volist = null;
		String query = "SELECT * FROM BOOK";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				volist = new ArrayList<BookVo>();
				do {
					BookVo vo = new BookVo();
					vo.setIsbn(rs.getString("isbn"));
					vo.setThum_img(rs.getString("thum_img"));
					vo.setBook_name(rs.getString("book_name"));
					vo.setAuthor(rs.getString("author"));
					vo.setPublisher(rs.getString("publisher"));
					vo.setCategory(rs.getString("category"));
					vo.setBook_intro(rs.getString("book_intro"));
					vo.setAuth_intro(rs.getString("auth_intro"));
					vo.setPub_intro(rs.getString("pub_intro"));
					vo.setBook_page(rs.getInt("book_page"));
					vo.setTotal_grade(rs.getDouble("total_grade"));
					vo.setGrade_peo(rs.getInt("grade_peo"));
					volist.add(vo);
				} while (rs.next());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return volist;
	}

	public BookVo selectOne(Connection conn, String isbn) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookVo vo = null;
		String query = "SELECT * FROM BOOK WHERE ISBN=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, isbn);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new BookVo();
				vo.setIsbn(rs.getString("isbn"));
				vo.setThum_img(rs.getString("thum_img"));
				vo.setBook_name(rs.getString("book_name"));
				vo.setAuthor(rs.getString("author"));
				vo.setPublisher(rs.getString("publisher"));
				vo.setCategory(rs.getString("category"));
				vo.setBook_intro(rs.getString("book_intro"));
				vo.setAuth_intro(rs.getString("auth_intro"));
				vo.setPub_intro(rs.getString("pub_intro"));
				vo.setBook_page(rs.getInt("book_page"));
				vo.setTotal_grade(rs.getDouble("total_grade"));
				vo.setGrade_peo(rs.getInt("grade_peo"));
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
