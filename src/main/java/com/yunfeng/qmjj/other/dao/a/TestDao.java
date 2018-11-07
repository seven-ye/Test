package com.yunfeng.qmjj.other.dao.a;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.yunfeng.qmjj.other.main.a.Test;

/**
 * admin dao
 * @author rengeng
 *
 */
@Repository
public interface TestDao extends JpaRepository<Test, String>{

	
	@Query(value = "SELECT * FROM test t WHERE t.name = ?1 AND t.age = ?2",nativeQuery = true)
	Test findByNameAndage(String name,String age);
//	@Modifying
//	@Query("UPDATE test t SET t.name = ?2 WHERE t.id = ?1")
//	void updateNameByid(String id,String name);
}
