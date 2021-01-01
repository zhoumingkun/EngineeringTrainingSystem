package com.toughguy.engineeringTrainingSystem.service.content.prototype;

import java.util.List;

import com.toughguy.engineeringTrainingSystem.model.content.Activity;
import com.toughguy.engineeringTrainingSystem.model.content.Guizhangzhidu;
import com.toughguy.engineeringTrainingSystem.service.prototype.IGenericService;

/**
 * 规章制度Service层接口类
 * @author zmk
 *
 */
public interface IGuizhangzhiduService extends IGenericService<Guizhangzhidu, Integer>{
	/**
 	 * 根据标题查询
 	 * */
 	public List<Guizhangzhidu> findByTitle(String title);

}
