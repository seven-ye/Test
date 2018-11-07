package com.yunfeng.qmjj.other.dao.b;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yunfeng.qmjj.other.main.b.Test2;


/**
 * admin dao
 * @author rengeng
 *
 */
@Repository
public interface Test2Dao extends JpaRepository<Test2, String>{
	
	@Query(value = "SELECT * FROM test2 t WHERE t.name = ?1 AND t.pwd = ?2",nativeQuery = true)
	Test2 findByNameAndPwd(String name,String pwd);
//	@Modifying
//	@Query("UPDATE test2 t SET t.name = ?2 WHERE t.id = ?1")
//	void updateNameByid(String id,String name);
}
