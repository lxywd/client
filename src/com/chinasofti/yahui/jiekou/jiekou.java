package com.chinasofti.yahui.jiekou;

import com.chinasofti.yahui.domain.card;
import com.chinasofti.yahui.domain.food;
import com.chinasofti.yahui.domain.foodtype;
import com.chinasofti.yahui.domain.orderr;
import com.chinasofti.yahui.domain.shop;
import com.chinasofti.yahui.domain.work;

public interface jiekou {
	 //添加职工
		public String addMan(work z);
		//删除职工
		public String removeMan(int eid);
		//修改职工
		public String updateMan(work z);
		//查询员工
		public work selectByEid(int eid);
		//员工登录
		public work findByEidAndEpassword(work h);
		//添加菜品
		public String addFood(food z);
		//删除菜品
		public String removeFood(int fid);
		//修改菜品
		public String updateFood(food z);
		//查询菜品
		public food selectByFid(int fid);
		//添加菜品类
		public String addFoodfood(foodtype z);
		//补卡
		public card bucard(int cid);
		//办卡
		public String addcard(card d);
		//挂失
		public String updatecard(int cid,String cname,int cpassword);
		//充值
		public String addMoney(int cid,int mon);
		//冻结
		public card dongCard(int cid);
		//点菜
		public shop addShop(int fid);
		//结账
		public orderr selectByosum(String uuid);
		//打印小票
		public orderr selectAll(int oid);
		
}
