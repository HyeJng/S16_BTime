package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.model.ReadingNowVo;

public class ReadingNowDao {
	public ReadingNowDao() {}
	
	public int insert(Connection conn, ReadingNowVo rn) {
		int result = 0;
		return result;
	}
	public int update(Connection conn, ReadingNowVo rn) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, String isbn) {
		int result = 0;
		return result;
	}
	public List<ReadingNowVo> selectList(Connection conn){
		List<ReadingNowVo> volist = null;
		return volist;
	}
	public ReadingNowVo selectOne(Connection conn, String isbn) {
		ReadingNowVo vo = null;
		return vo;
	}
}
