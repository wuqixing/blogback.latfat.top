package top.latfat.blogback.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import top.latfat.blogback.dao.BaseDao;
import top.latfat.blogback.entity.Result;
import top.latfat.blogback.service.BaseService;
  
/** 
 * BaseServiceImpl 
 *  
 * @author sean 
 */  
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {  
      
	@Resource  
    private BaseDao<T> dao;
	
	protected Result result = new Result(0, "Faild", null);
  
    public void save(T entity) {  
        dao.save(entity);  
    }  
  
    public void update(T entity) {  
        dao.update(entity);  
    }  
  
    public void delete(Serializable id) {  
        dao.delete(id);  
    }  
  
    public T getById(Serializable id) {  
        return dao.findById(id);  
    }  
  
    public List<T> getByHQL(String hql, Object... params) {  
        return dao.findByHQL(hql, params);  
    }  
}  