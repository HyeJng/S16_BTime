package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.model.BookVo;

public class BookDao {
	public BookDao() {}
	
	public int insert(Connection conn, BookVo b) {
		int result = 0;
		return result;
	}
	public int update(Connection conn, BookVo b) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, String isbn) {
		int result = 0;
		return result;
	}
	public List<BookVo> selectList(Connection conn){
		List<BookVo> volist = null;
		return volist;
	}
	public BookVo selectOne(Connection conn, String isbn) {
		BookVo vo = null;
		return vo;
	}
}
