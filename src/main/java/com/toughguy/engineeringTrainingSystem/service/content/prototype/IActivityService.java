package com.toughguy.engineeringTrainingSystem.service.content.prototype;

import java.util.List;

import com.toughguy.engineeringTrainingSystem.model.content.Activity;
import com.toughguy.engineeringTrainingSystem.service.prototype.IGenericService;

/**
 * 校园活动Service层接口类
 * @author zmk
 *
 */
public interface IActivityService extends IGenericService<Activity, Integer>{
	/**
	 * 查询最新的活动动态消息
	 * */
	public Activity findNew();
	/**
 	 * 根据标题查询
 	 * */
 	public List<Activity> findByTitle(String title);
}
