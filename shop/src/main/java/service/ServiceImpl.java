package service;

import mapper.CategoryMapper;
import mapper.CommodityMapper;
import mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enity.*;

import java.util.List;

@Service
public class ServiceImpl implements service.Service {
	@Autowired
	private CommodityMapper commodityMapper;

	@Autowired
	private ManagerMapper managerMapper;

	@Autowired
	private CategoryMapper categoryMapper;
		//登入
		public Manager login(String username, String password) {
			// TODO Auto-generated method stub
			ManagerExample example = new ManagerExample();
			example.createCriteria().andUserEqualTo(username).andPasswordEqualTo(password);
			List<Manager> list = managerMapper.selectByExample(example);
			if(list.size() != 0)
				return list.get(0);
			else
				return  null;
		}
	//插入类别
	@Override
	public boolean insertCategory(Category category) {
			try{
				categoryMapper.insertSelective(category);
				return true;
			}catch (Exception e) {
				return false;
			}
	}
	//修改类别
	@Override
	public boolean updateCategory(Category category) {
		try{
			categoryMapper.updateByPrimaryKeySelective(category);
			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}
	}
	//删除类别
	@Override
	public boolean deleteCategory(Integer id) {
		try{
			categoryMapper.deleteByPrimaryKey(id);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	//查询类别
	@Override
	public List<Category> queryCategory() {
		return categoryMapper.selectByExample(new CategoryExample());
	}
	//插入商品
	@Override
	public boolean insertCommodity(Commodity commodity) {
		try {
			commodityMapper.insertSelective(commodity);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	//修改商品
	@Override
	public boolean updateCommodity(Commodity commodity) {
		try{
			commodityMapper.updateByPrimaryKeySelective(commodity);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	//删除商品
	@Override
	public boolean deleteCommodity(Integer id) {
		try{
			commodityMapper.deleteByPrimaryKey(id);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	//查询商品
	@Override
	public List<Commodity> queryCommodity() {
		return commodityMapper.selectByExample(new CommodityExample());
	}

}
