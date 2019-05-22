package member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import member.bean.MemberDTO;
import member.bean.ZipcodeDTO;

@Repository
@Transactional
public class MemberDAOMybatis implements MemberDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public MemberDTO isExistId(String id) {		
		return sqlSession.selectOne("memberSQL.isExistId", id);
	}

	@Override
	public List<ZipcodeDTO> getZipcodeList(Map<String, String> map) {
		return sqlSession.selectList("memberSQL.getZipcodeList", map);
	}
	
}