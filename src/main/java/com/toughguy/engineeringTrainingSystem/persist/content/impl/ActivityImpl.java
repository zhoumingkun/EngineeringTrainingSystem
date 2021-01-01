package com.toughguy.engineeringTrainingSystem.persist.content.impl;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.toughguy.engineeringTrainingSystem.model.content.Activity;
import com.toughguy.engineeringTrainingSystem.persist.content.prototype.IActivityDao;
import com.toughguy.engineeringTrainingSystem.persist.impl.GenericDaoImpl;
/**
 * 校园活动Dao实现类
 * @author zmk
 *
 */
@Repository
public class ActivityImpl extends GenericDaoImpl<Activity, Integer> implements IActivityDao{
	/**
	 * 查询最新的活动动态消息
	 * 
	 * */
	@Override
	public Activity findNew() {
		return sqlSessionTemplate.selectOne(typeNameSpace + ".findNew");
	}
	/**
	 * 根据标题查询
	 * 
	 * */
	@Override
 	public List<Activity> findByTitle(String title) {
 		// TODO Auto-generated method stub
 		return sqlSessionTemplate.selectList(typeNameSpace + ".findByTitle", title);
 	}
	

}
