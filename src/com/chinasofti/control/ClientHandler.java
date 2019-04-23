package com.chinasofti.control;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.Socket;

public class ClientHandler implements InvocationHandler {
	private String ip;
	private int port;

	public ClientHandler(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Socket client = new Socket(ip, port);
		//获取输出流
		ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
		//具体要实现的代理操作    +  传输
		//将代理的方法名发送给服务器
		oos.writeUTF(method.getName());
		oos.flush();
		//发送参数类型列表
		oos.writeObject(method.getParameterTypes());
		oos.flush();
		//发送参数列表
		oos.writeObject(args);
		oos.flush();
		//接受服务器返回的结果
		ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
		return ois.readObject();
	}

}
