package kh.semi.s16.bt.service;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.dao.BookDao;
import static kh.semi.s16.bt.jdbcDriver.JdbcTemplate.*;
import kh.semi.s16.bt.model.BookVo;

public class BookService {
	private BookDao dao = new BookDao();
	
	public int insert(BookVo b) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn, b);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int update(BookVo b) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, b);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int delete(String isbn) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, isbn);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public List<BookVo> selectList(){
		List<BookVo> volist = null;
		Connection conn = getConnection();
		volist = dao.selectList(conn);
		close(conn);
		return volist;
	}
	public BookVo selectOne(String isbn) {
		BookVo vo = null;
		Connection conn = getConnection();
		vo = dao.selectOne(conn, isbn);
		close(conn);
		return vo;
	}
	
}
