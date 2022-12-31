package kh.semi.s16.bt.model.dao;

import static kh.semi.s16.bt.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kh.semi.s16.bt.model.vo.SubscribeVo;

public class SubscribeDao {
	public SubscribeDao() {}
	
	public int insert(Connection conn, SubscribeVo sub) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO SUBSCRIBE VALUES(?,?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, sub.getSutbype());
			pstmt.setInt(2, sub.getSubterm());
			pstmt.setInt(3, sub.getSubprice());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int update(Connection conn, SubscribeVo sub) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE REVIEW SET" +
			"SUBTYPE=?,SUBTERM=?,SUBPRICE=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, sub.getSutbype());
			pstmt.setInt(2, sub.getSubterm());
			pstmt.setInt(3, sub.getSubprice());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public int delete(Connection conn, int subType) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM SUBSCRIBE WHERE SUBTYPE=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, subType);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	public List<SubscribeVo> selectList(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<SubscribeVo> volist = null;
		String query = "SELECT * FROM REVIEW";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				volist = new ArrayList<SubscribeVo>();
				do {
					SubscribeVo vo = new SubscribeVo();
					vo.setSutbype(rs.getInt("SUBTYPE"));
					vo.setSubterm(rs.getInt("SUBTERM"));
					vo.setSubprice(rs.getInt("SUBPRICE"));
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
	public SubscribeVo selectOne(Connection conn, int subType) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SubscribeVo vo = null;
		String query = "SELECT * FROM SUBSCRIBE WHERE SUBTYPE=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, subType);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new SubscribeVo();
				vo.setSubterm(rs.getInt("SUBTERM"));
				vo.setSubprice(rs.getInt("SUBPRICE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return vo;
	}
	public SubscribeVo selectInfo(Connection conn, String id) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SubscribeVo vo = null;
		String query = "SELECT * FROM SUBSCRIBE WHERE SUBTYPE=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new SubscribeVo();
				vo.setSubterm(rs.getInt("SUBTERM"));
				vo.setSubprice(rs.getInt("SUBPRICE"));
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
