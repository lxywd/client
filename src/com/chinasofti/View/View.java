package com.chinasofti.View;

import java.util.List;

public class View {
	public void logon1(){
		System.out.println("请输入员工编号：");
		System.out.println("请输入员工姓名：");
		System.out.println("请输入密码：");
	}
	public void welcome1(){
		System.out.println("欢迎进入员工管理界面");
		System.out.println("----------------------");
		System.out.println("1、点菜");
		System.out.println("2、结账");
		System.out.println("3、开卡");
		System.out.println("4、挂失");
		System.out.println("5、打印小票");
		System.out.println("6、充值");
		System.out.println("0、退出系统");
		System.out.println("---------------------");
	}
	public void welcome11(){
		System.out.println(">>>点菜:");
		System.out.println("---------------------");
		System.out.println("1、添加菜品");
		System.out.println("2、删除菜品");
		System.out.println("3、修改菜品");
		System.out.println("4、查询菜品");
	}
	public void welcome12(){
		System.out.println(">>>结账:");
		System.out.println("---------------------");
		System.out.println("1、普通顾客");
		System.out.println("2、普通会员");
		System.out.println("3、超级会员");
	}
	public void welcome13(){
		System.out.println(">>>开卡:");
		System.out.println("---------------------");
		System.out.println("1、请输入您的姓名");
		System.out.println("2、请输入您的密码");
		System.out.println("0、退出系统");
		System.out.println("---------------------");
	}
	public void welcome14(){
		System.out.println(">>>挂失");
		System.out.println("---------------------");
		System.out.println("1、请输入您的姓名");
		System.out.println("2、请输入您的密码");
		System.out.println("0、退出系统");
		System.out.println("---------------------");
	}
	public void welcome15(){
		System.out.println(">>>打印小票");
		System.out.println("---------------------");
		System.out.println("1、请输入您的姓名");
		System.out.println("2、请输入您的密码");
		System.out.println("0、退出系统");
		System.out.println("---------------------");
	}
	public void welcome16(){
		System.out.println(">>>充值");
		System.out.println("---------------------");
		System.out.println("1、请输入您的姓名");
		System.out.println("2、请输入您的密码");
		System.out.println("0、退出系统");
		System.out.println("---------------------");
	}
	public void println(String msg){ 
		System.out.println(msg);
	}
	public void welcome2(){
		System.out.println("欢迎进入经理管理界面");
		System.out.println("---------------------");
		System.out.println("1、管理员工");
		System.out.println("2、补卡");
		System.out.println("3、客户冻结");
		System.out.println("4、菜品管理");
		System.out.println("5、统计月销量");
		System.out.println("6、统计客户喜欢的菜品");
		System.out.println("7、设置特价菜");
		System.out.println("8、设置优惠额度");
		System.out.println("0、退出系统");
		System.out.println("---------------------");
	}
	public void welcome21(){
		System.out.println(">>>管理员工");
		System.out.println("---------------------");
		System.out.println("1、增加员工");
		System.out.println("2、删除员工");
		System.out.println("3、修改员工");
		System.out.println("4、查询员工");
		System.out.println("0、退出系统");
		System.out.println("---------------------");
	}
	public void welcome22(){
		System.out.println(">>>补卡");
		System.out.println("---------------------");
		System.out.println("1、请输入您的卡号");
		System.out.println("2、请输入您的姓名");
		System.out.println("3、请输入您的密码");
		System.out.println("0、退出系统");
		System.out.println("---------------------");
	}
	public void welcome23(){
		System.out.println(">>>客户冻结");
		System.out.println("---------------------");
		System.out.println("1、请输入您要冻结的卡号");
		System.out.println("2、请输入您要冻结卡的持卡人姓名");
		System.out.println("3、请输入您要冻结卡的密码");
		System.out.println("0、退出系统");
		System.out.println("---------------------");
	}
	public void welcome24(){
		System.out.println(">>>菜品管理:");
		System.out.println("---------------------");
		System.out.println("1、添加菜品");
		System.out.println("2、删除菜品");
		System.out.println("3、修改菜品");
		System.out.println("4、查询菜品");
	}
	
	
}


