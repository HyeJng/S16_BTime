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
				pstmt.setInt(idx++, b.getAccum_grade());
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
		String query = "INSERT INTO BOOK VALUES(?,?,?,?,?  ,?,TO_CLOB(?),?,TO_CLOB(?),0,0,0)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, b.getIsbn());
			pstmt.setString(2, b.getThum_img());
			pstmt.setString(3, b.getBook_name());
			pstmt.setString(4, b.getAuthor());
			pstmt.setString(5, b.getPublisher());
			pstmt.setString(6, b.getCategory());
			pstmt.setString(7, b.getBook_intro());  // clob
			pstmt.setString(8, b.getAuth_intro());
			pstmt.setString(9, b.getPub_intro());  // clob
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
		String query = "UPDATE BOOK SET "
				+ "accum_grade=?,total_grade=?,grade_peo=? WHERE ISBN=?";
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, b.getAccum_grade());
			pstmt.setDouble(2, b.getTotal_grade());
			pstmt.setInt(3, b.getGrade_peo());
			pstmt.setString(4, b.getIsbn());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	public int updateGrade(Connection conn, BookVo b, String isbn, int grade) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE BOOK SET "
				+ "accum_grade=?,total_grade=?,grade_peo=? WHERE ISBN=?";
		
		int accum = b.getAccum_grade() + grade;
		int peo = b.getGrade_peo() + 1;
		double total = accum/(double)peo;
		
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, accum);
			pstmt.setDouble(2, total);
			pstmt.setInt(3, peo);
			pstmt.setString(4, b.getIsbn());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		System.out.println(isbn+"별점 업데이트 완료!! total:"+total);
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
					vo.setAccum_grade(rs.getInt("getAccum_grade"));
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
	public List<BookVo> selectListBook(Connection conn, String id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookVo> volist = null;
		String query = "SELECT B.ISBN, B.BOOK_NAME, B.THUM_IMG, B.AUTHOR, B.PUBLISHER, B.CATEGORY, B.TOTAL_GRADE, B.GRADE_PEO"
				+ " FROM (SELECT ISBN FROM READING_NOW R RIGHT OUTER JOIN MEMBER M ON R.ID=M.ID WHERE M.ID=?) RN JOIN BOOK B"
				+ " ON RN.ISBN=B.ISBN";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
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
	
	public List<BookVo> selectListLove(Connection conn, String id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookVo> volist = null;
		int cnt = 0;
		String query = "SELECT * FROM LOVE_ADD L JOIN BOOK B ON L.ISBN=B.ISBN WHERE L.ID=? ORDER BY BOOK_NAME";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
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
					vo.setAccum_grade(rs.getInt("accum_grade"));
					vo.setTotal_grade(rs.getDouble("total_grade"));
					vo.setGrade_peo(rs.getInt("grade_peo"));
					volist.add(vo);
					cnt++;
				} while (rs.next());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		System.out.println("조회개수:"+cnt);
		return volist;
	}
	
	public List<BookVo> selectListBest(Connection conn, int max) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookVo> volist = null;
		String query = "SELECT * FROM BOOK WHERE ROWNUM <= ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, max);
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
					vo.setAccum_grade(rs.getInt("accum_grade"));
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
	
	public List<BookVo> selectListEssay(Connection conn, int max) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookVo> volist = null;
		String query = "SELECT * FROM (SELECT * FROM BOOK WHERE CATEGORY LIKE '%에세이%') WHERE ROWNUM <= ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, max);
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
					vo.setAccum_grade(rs.getInt("accum_grade"));
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
				vo.setAccum_grade(rs.getInt("accum_grade"));
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
