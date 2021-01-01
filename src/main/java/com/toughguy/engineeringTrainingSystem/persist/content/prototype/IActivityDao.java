package com.toughguy.engineeringTrainingSystem.persist.content.prototype;

import java.util.List;

import com.toughguy.engineeringTrainingSystem.model.content.Activity;
import com.toughguy.engineeringTrainingSystem.persist.prototype.IGenericDao;

/**
 * 校园活动Dao接口类
 * @author zmk
 *
 */
public interface IActivityDao extends IGenericDao<Activity, Integer>{
	/**
	 * 查询最新的活动动态消息
	 * */
	public Activity findNew();
	/**
 	 * 根据标题查询
 	 * */
 	public List<Activity> findByTitle(String titie);

}
