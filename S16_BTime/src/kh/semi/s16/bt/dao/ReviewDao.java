package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.model.ReviewVo;

public class ReviewDao {
	public ReviewDao() {}
	
	public int insert(Connection conn, ReviewVo review) {
		int result = 0;
		return result;
	}
	public int update(Connection conn, ReviewVo review) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, int rNum) {
		int result = 0;
		return result;
	}
	public List<ReviewVo> selectList(Connection conn){
		List<ReviewVo> volist = null;
		return volist;
	}
	public ReviewVo selectOne(Connection conn, int rNum) {
		ReviewVo vo = null;
		return vo;
	}
}
