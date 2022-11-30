package com.javaexample;

public class Orders {

	private int orderId;
	private String orderName;
	private double orderCost;

	public Orders() {
		System.out.println("Default Constructor execution");

	}

	public Orders(int orderId) {
		this();
		System.out.println("Parameterized constructor with one parameter");
		this.orderId = orderId;
	}

	public Orders(int orderId, String orderName) {
		this(orderId);
		System.out.println("Parameterized constructor with two parameters");
		this.orderId = orderId;
		this.orderName = orderName;
	}

	public Orders(int orderId, String orderName, double orderCost) {
		this(orderId, orderName);
		System.out.println("Parameterized constructor all parameters");
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderCost = orderCost;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

}
