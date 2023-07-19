package board.dao;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO {
	
	private SqlSession session;
	
	public BoardDAO() {
		session = new MyConfig().getInstance();
	}
	
	public void insert() {
		
		String title = "µÉ±î????";
		
		int cnt = session.insert("board.dao.BoardDAO.insert", title);
		session.commit();
		System.out.println("ÃÑ " + cnt + "°³ Çà »ðÀÔ...");
	}
	
	public void work() {
		insert();
	}

}
