package service;

import java.util.List;

import enity.Category;
import enity.Commodity;
import enity.Manager;

public interface Service {
	// 登陆服务
	Manager login(String  username , String password) ;

	//增加商品类别

	boolean insertCategory(Category category);

	//修改商品类别
	boolean updateCategory(Category category);

	//删除商品类别
	boolean deleteCategory(Integer id);

	//查询类别列表
	List<Category> queryCategory();

	//添加商品
	boolean insertCommodity(Commodity commodity);

	//修改商品
	boolean updateCommodity(Commodity commodity);

	//删除商品
	boolean deleteCommodity(Integer id);

	//查询商品列表
	List<Commodity> queryCommodity();
}
