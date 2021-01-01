package com.toughguy.engineeringTrainingSystem.service.content.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.toughguy.engineeringTrainingSystem.model.content.Activity;
import com.toughguy.engineeringTrainingSystem.persist.content.prototype.IActivityDao;
import com.toughguy.engineeringTrainingSystem.service.content.prototype.IActivityService;
import com.toughguy.engineeringTrainingSystem.service.impl.GenericServiceImpl;


/**
 * 校园活动Service实现类
 * @author zmk
 *
 */
@Service
public class ActivityServiceImpl extends GenericServiceImpl<Activity, Integer> implements IActivityService{
	/**
	 * 查询最新的活动动态消息
	 * */
	@Override
	public Activity findNew() {
		// TODO Auto-generated method stub
		return ((IActivityDao)dao).findNew();
	}
	/**
	 * 根据标题查询
	 * */
	@Override
 	public List<Activity> findByTitle(String title) {
 		// TODO Auto-generated method stub
 		return ((IActivityDao)dao).findByTitle(title);
 	}

}
