package kh.s16.bt.member.model;

import java.sql.Connection;
import java.util.List;

import kh.s16.bt.jdbcDriver.JDBCTemplate;

public class BusinessInfoService {
	private BusinessInfoDao dao = new BusinessInfoDao();
//	insert - 등록
	public int insert(BusinessInfoVo vo) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = dao.insert(conn, vo);
		JDBCTemplate.close(conn);
		return result;
	}
//	update - 수정
	public int update(BusinessInfoVo vo, String busno/*주로 PK*/) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = dao.update(conn, vo, busno);
		JDBCTemplate.close(conn);
		return result;
	}
//	delete  - 삭제
	public int delete(String busno/*주로 PK*/) {
		int result = 0;
		Connection conn = JDBCTemplate.getConnection();
		result = dao.delete(conn, busno);
		JDBCTemplate.close(conn);	
		return result;
	}
//	selectList  - 목록조회
	public List<BusinessInfoVo> selectList(){
		List<BusinessInfoVo> volist = null;
		Connection conn = JDBCTemplate.getConnection();
		volist = dao.selectList(conn);
		JDBCTemplate.close(conn);
		return volist;
	}
//	selectOne - 상세조회
	public BusinessInfoVo selectOne(String busno/*주로 PK*/){
		BusinessInfoVo vo = null;
		Connection conn = JDBCTemplate.getConnection();
		vo = dao.selectOne(conn, busno);
		JDBCTemplate.close(conn);
		return vo;
	}
}
