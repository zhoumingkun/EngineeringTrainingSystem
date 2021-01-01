package com.toughguy.engineeringTrainingSystem.persist.content.prototype;

import java.util.List;
import java.util.Map;

import com.toughguy.engineeringTrainingSystem.model.content.Account;
import com.toughguy.engineeringTrainingSystem.pagination.PagerModel;
import com.toughguy.engineeringTrainingSystem.persist.prototype.IGenericDao;

/**
 *账户Dao接口类
 *
 */
public interface IAccountDao extends IGenericDao<Account, Integer>{
	
	/**
	 * 查询某题的危险学生列表
	 * @return
	 */
	public PagerModel<Account> findAllByRisk(Map<String, Object> params);
	
	public Account findByOpenId(String openId);
	/**
	 * 根据account查询学生
	 * @param account
	 * @return
	 */
	public Account findByAccount(String account);
}
