package com.chinasofti.resService;

import java.util.List;

import com.chinasofti.domain.food;
import com.chinasofti.domain.work;

public interface restaurant_service {
	//添加员工
	public String addMan(int id,String name,int job,String password);
	//通过id查找员工
	public work selectById(int eid);
	//查看所有员工
	public List<work> AllMan();
	//删除员工
	public String removeMan(int eid);
	//修改员工信息
	public String updateMan(int eid,String password);
	//通过id查找菜品
	public food findCaiById(int fid);
	//查看所有菜品
	public List<food> Allfood();
	//修改菜品
	public String updateCaiById(int fid);
	//删除菜品
	public String deleteCai(int fid);
	//补卡
	public String buka(int cid,String cname,int cpassword);
	
}
