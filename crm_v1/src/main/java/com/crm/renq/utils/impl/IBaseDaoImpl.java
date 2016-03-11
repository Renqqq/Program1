package com.crm.renq.utils.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.crm.renq.utils.IBaseDao;

/**
 * 公共的Dao接口实现类
 * @author Renq
 *
 */
public class IBaseDaoImpl implements IBaseDao {

	private SessionFactory sessionFactory;
	
	public void add(Object entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
	
	public void delete(Object entity) {
		sessionFactory.getCurrentSession().delete(entity);
	}
	
	public List getList(String sql, Object[] params) {
		Query query = sessionFactory.getCurrentSession().createQuery(sql);//创建查询对象
		if(params!=null&&params.length>0){
			for(int i=0;i<params.length;i++){
				query.setParameter(i, params[i]);
			}
		}
		return query.list();
	}
	
	public void update(Object entity) {
		sessionFactory.getCurrentSession().update(entity);
	}
}
