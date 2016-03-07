package top.latfat.blogback.dao;

import java.io.Serializable;  
import java.util.List;  
  
/** 
 * BaseDAO 
 *  
 * @author sean 
 */  
public interface BaseDao<T> {  
  
    public void save(T entity);  
  
    public void update(T entity);  
  
    public void delete(Serializable id);  
  
    public T findById(Serializable id);  
  
    public List<T> findByHQL(String hql, Object... params);  
  
} 