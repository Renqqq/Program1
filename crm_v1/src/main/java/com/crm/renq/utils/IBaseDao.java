package com.crm.renq.utils;

import java.util.List;
/**
 * 公共的Dao接口，封装基本的增删改查方法
 * @author Renq
 *
 */
public interface IBaseDao {
	
	/**
	 * 通用的添加方法
	 * @param entity 
	 */
	public void add(Object entity);
	
	/**
	 * 通用的更新方法
	 * @param entity
	 */
	public void update(Object entity);
	
	/**
	 * 通用的删除方法
	 * @param entity
	 */
	public void delete(Object entity);
	
	/**
	 * 通用的查询方法
	 * @param sql
	 * @param params
	 * @return 结果集
	 */
	public List getList(String sql,Object[]params);
}
