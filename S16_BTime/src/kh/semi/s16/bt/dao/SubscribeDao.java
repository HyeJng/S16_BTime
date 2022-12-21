package kh.semi.s16.bt.dao;

import java.sql.Connection;
import java.util.List;

import kh.semi.s16.bt.model.SubscribeVo;

public class SubscribeDao {
	public SubscribeDao() {}
	
	public int insert(Connection conn, SubscribeVo sub) {
		int result = 0;
		return result;
	}
	public int update(Connection conn, SubscribeVo sub) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, int subType) {
		int result = 0;
		return result;
	}
	public List<SubscribeVo> selectList(){
		List<SubscribeVo> volist = null;
		return volist;
	}
	public SubscribeVo selectOne(int subType) {
		SubscribeVo vo = null;
		return vo;
	}
}
