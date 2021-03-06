package com.bingzhilanmo.base.mapper;

import java.util.List;
import java.util.Map;

import com.bingzhilanmo.base.model.PageInfo;

/**
 * 通用Mapper接口
 * 
 * @author desheng.tu
 * @date 2015年12月1日 下午4:15:29 
 * 
 * @param <T> 实体类型
 * @param <K> 主键类型
 */
public interface BaseMapper<T, K> {

	/**
	 * 根据主键查找记录, 返回对应记录
	 */
	public T getById(K id);

	/**
	 * 根据主键批量查找对应的记录, 返回对应记录
	 */
	public List<T> getByIds(List<K> ids);

	/**
	 * 根据pojo熟悉查找记录, 返回对应记录
	 */
	public List<T> getByPojo(T pojo);
	
	/**
	 * 根据条件查找记录, 返回对应记录
	 */
	public List<T> getByCondition(Map<String, String> map);

	/**
	 * 分页查询, 返回分页列表
	 */
	public <M> List<M> getByPageList(PageInfo<M> page);

	/**
	 * 分页查询, 返回总记录数
	 */
	public <M> Integer getByPageCount(PageInfo<M> page);

	/**
	 * 查询所有记录
	 */
	public List<T> getAll();

	/**
	 * 查询总记录数
	 */
	public Integer getAllCount();

	/**
	 * 修改记录, 返回修改的记录数
	 */
	public Integer modify(T record);

	/**
	 * 选择性的修改记录, 返回修改的记录数
	 */
	public Integer modifySelective(T record);

	/**
	 * 插入记录, 返回插入记录数(0 or 1)
	 */
	public Integer save(T record);

	/**
	 * mysql批量插入记录, 返回插入记录条数.
	 */
	public Integer saveBatch(List<T> records);

	/**
	 * 根据主键删除, 返回删除记录数
	 */
	public Integer delById(K id);

	/**
	 * 根据主键批量删除, 返回删除记录数, 注意: 联合主键, 不支持该操作
	 */
	public Integer delByIds(List<K> ids);

}
