package com.toughguy.engineeringTrainingSystem.persist.content.impl;
import org.springframework.stereotype.Repository;

import com.toughguy.engineeringTrainingSystem.model.content.Notice;
import com.toughguy.engineeringTrainingSystem.persist.content.prototype.INoticeDao;
import com.toughguy.engineeringTrainingSystem.persist.impl.GenericDaoImpl;
/**
 * 校园互动Dao实现类
 * @author zmk
 *
 */
@Repository
public class NoticeImpl extends GenericDaoImpl<Notice, Integer> implements INoticeDao{
	
	

}
