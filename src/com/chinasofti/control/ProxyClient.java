package com.chinasofti.control;

import java.lang.reflect.Proxy;

public class ProxyClient {
//通过网络连接服务器      获取代理对象  		 传入要代理其他类的类对象  用clazz代理别的类
	public static <T> T getClient(Class<T> clazz,String ip,int port) {
		//   		newProxyInstance的参数： 		   1.代理类的类加载器  			  2.代理类要实现的接口列表  		3.指派方法调用的调用处理程序
		//																							（必须实现了InvocationHandler接口）
		return (T) Proxy.newProxyInstance(ProxyClient.class.getClassLoader(), new Class[] {clazz}, new ClientHandler(ip, port));
	}
	
}
