/*package restaurant.control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Scanner;

import restaurant.dao.view.View;
import restaurant.domain.food;
import restaurant.domain.work;
import restaurant.util.UserInput;

public class control {
	//属性
	private View v;
	private UserInput ui;
	//创建套接字对象
	private Socket client;
	//创建输入输出流
	private Scanner in;
	private PrintWriter out;
	public static final String IP="localhost";
	public static final int PORT=7348;
	public resBiz service;
	//构造方法
	public control() {
		this.v=new View();
		this.ui=new GetInput();
		//实例化套接字对象
		try {
			this.client=new Socket(IP,PORT);
			//实例化输入输出流
			in=new Scanner(client.getInputStream());
			out=new PrintWriter(client.getOutputStream());	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//创建方法 接收整数的方法 接收字符串的方法 发送字符串的方法 发送整数的方法
	private int getInt(){
		return Integer.parseInt(in.nextLine());
	}
	private String getString(){ 
		String inStr = in.nextLine();
		System.out.println(inStr);
		return inStr;
	}
	private void sendString(String msg){
		out.println(msg);
		out.flush();
	}
	private void sendInt(int i){
		out.println(i);
		out.flush();
	}
	//创建一个接收对象的方法
	private Object getObject(){
		try {
			ObjectInputStream ois=new ObjectInputStream(client.getInputStream ());
			return ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}*/
package com.chinasofti.control;
import java.util.Collections;
import java.util.List;

import com.chinasofti.View.View;
import com.chinasofti.domain.food;
import com.chinasofti.domain.work;
import com.chinasofti.resService.restaurant_service;
import com.chinasofti.util.GetInput;





public class control_client {
	private View v;
	private GetInput gi;
	private static final String ip = "10.10.49.28";
	private static final int port = 9999;
	private restaurant_service service;
	
	public control_client() {
		this.v = new View();
		this.gi = new GetInput();
		//创建代理对象 
		service = ProxyClient.getClient(restaurant_service.class, ip, port);
	}

	public void select() {
		while(true){
			System.out.println("请选择角色：1、普通员工   2、经理");
			int select=this.gi.getInt("请选择：");
			//将指令发送给服务器端
			//this.sendInt(select);
			if(select==1){
				this.start1();
			}else if(select==2){
				this.start2();
			}else{
				System.out.println("输入有误，请重新选择！");
			}
		}
	}
	//1、自定义方法-项目流程方法
	public void start1(){
		while(true){
			//调用登录界面
			//this.v.logon1();
			//调用主界面
			this.v.welcome1();
			int select=this.gi.getInt("请选择：");
			//将指令发送给服务器端
//			this.sendInt(select);
			if(select==0){
				this.v.println("系统终止");
				System.exit(0);
			}else if(select==1){
				//点菜增删改查
				this.diancai();
			}else if(select==2){
				//结账分三个等级
				this.jiezhang();
			}else if(select==3){
				this.kaika();
			}else if(select==4){
				this.guashi();
			}else if(select==5){
				this.xiaopiao();
			}else if(select==6){
				this.chongzhi();
			}
		}
	}
	//2、自定义方法-项目流程方法
		public void start2(){
			while(true){
				//调用主界面
				this.v.welcome2();
				int select=this.gi.getInt("请选择：");
				//将指令发送给服务器端
				//this.sendInt(select);
				if(select==0){
					this.v.println("系统终止");
					System.exit(0);
				}else if(select==1){
					this.yuangong();
				}else if(select==2){
					this.buka();
				}else if(select==3){
					
				}else if(select==4){
				}
				
			}
		}
		
		private void buka() {
			this.v.welcome22();
			int cid=this.gi.getInt("输入卡号");
			String cname=this.gi.getString("请输入姓名");
			int cpassword=this.gi.getInt("请输入密码");
			this.service.buka(cid, cname, cpassword);
	}

		private void yuangong() {
			this.v.welcome21();
			int select=this.gi.getInt("请选择：");
			//将指令发送给服务器端
//			this.sendInt(select);
			if(select==0){
				this.v.println("系统终止");
				System.exit(0);
			}else if(select==1){
				this.addMan();
			}else if(select==2){
				this.removeMan();
			}else if(select==3){
				this.updateMan();
			}else if(select==4){
				this.selectById();
			}
	}
		//根据id查询员工信息
		private void selectById() {
			
			work id = this.service.selectById(this.gi.getInt("请输入要查询的员工id"));
			
			System.out.println(id);
		}

		private void selectAllEmp() {
			List<work> list = this.service.AllMan();
			for (work w : list) {
				System.out.println(w);
			}
			
		}
		
		private void updateMan() {
			int eid = this.gi.getInt("请输入查找员工id：");
			work w = this.service.selectById(eid);
			if(w==null){
				System.out.println("员工不存在");
				return ;
			}
			String oldpass = this.gi.getString("请输入旧密码：");
			if((oldpass.equals(w.getEpassword()))){
				System.out.println(this.service.updateMan(eid, this.gi.getString("请输入密码")));
				
			}else{
				System.out.println("密码不正确");
				}
			}
		
		private void removeMan() {
			v.println(">>>员工信息删除");
			int eid = this.gi.getInt("请输入查找员工id：");
			work w = this.service.selectById(eid);
			if(w==null){
				System.out.println("员工不存在");
				return ;
			}
			else{
				System.out.println(this.service.removeMan(eid));
			}
			
		}
		private void addMan() {
			this.v.println(">>>员工信息添加");
			int eid=this.gi.getInt("请输入员工编号:");
			work w = this.service.selectById(eid);
			if(w!=null){
				System.out.println("员工已经存在");
			}else{
				int ejob=this.gi.getInt("请输入员工角色：");
				String ename=this.gi.getString("请输入员工姓名：");
				String epassword=this.gi.getString("请输入员工密码：");
				System.out.println(this.service.addMan(eid, ename, ejob, epassword));
			}
			
		}
		private void diancai(){
			this.v.welcome11();
			int select=this.gi.getInt("请选择：");
			//将指令发送给服务器端
//			this.sendInt(select);
			if(select==0){
				this.v.println("系统终止");
				System.exit(0);
			}else if(select==1){
				this.addcai();
			}else if(select==2){
				this.removecai();
			}else if(select==3){
				this.updatecai();
			}else if(select==4){
				this.selectcai();
			}
		}
		
		private void selectcai() {
			food id = this.service.findCaiById(this.gi.getInt("请输入要查询的员工id"));
			
			System.out.println(id);
		}

		private void updatecai() {
			v.println(">>>菜品信息修改");
			int fid = this.gi.getInt("请输入修改的菜品id：");
			food f = this.service.findCaiById(fid);
			if(f==null){
				System.out.println("菜品不存在");
				return ;
			}
			else{
				System.out.println(this.service.updateCaiById(fid));
			}
		}

		private void removecai() {
			v.println(">>>菜品信息删除");
			int fid = this.gi.getInt("请输入删除的菜品id：");
			food f = this.service.findCaiById(fid);
			if(f==null){
				System.out.println("菜品不存在");
				return ;
			}
			else{
				System.out.println(this.service.deleteCai(fid));
			}
			
		}

		private void addcai() {
			int fid=this.gi.getInt("请输入菜名编号:");
			food f = this.service.findCaiById(fid);
			if(f!=null){
				System.out.println("菜品已经存在");
				return ;
			}
			String fname=this.gi.getString("请输入菜名：");
			int fnum=this.gi.getInt("请输入数量:");
			double fprice=this.gi.getDouble("请输入单价：");
			//将收集的学生信息发送给服务器端
//			this.sendString(fid+"#"+fname+"#"+fnum+"#"+fprice);
			//接收服务器返回的数据
//			return this.getString();
		}
		private void jiezhang(){
			this.v.welcome12();
			
		}
		private void kaika(){
			this.v.welcome13();
			
		}
		private void guashi(){
			this.v.welcome14();
			
		}
		private void xiaopiao(){
			this.v.welcome15();
			
		}
		
		private void chongzhi(){
			this.v.welcome16();
			
		}

}





