package ch08;

public class Order {
	private int height;
	private int weight;
	private String name;
	private int age;
	
	private String orderNum;
	private String phoneNum;
	private String address;
	private String orderDate;
	private String orderTime;
	private int orderPrice;
	private int menuNum;
	
	//constructor
	public Order(int height, int weight, String name, int age) {
		this.height=height;
		this.weight=weight;
		this.name=name;
		this.age=age;
	}
	
	//getter setter
	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public int getMenuNum() {
		return menuNum;
	}

	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum++;
	}

	//print
	public void showOrderInfo() {
		System.out.println("주문 접수 번호 : "+orderNum+"\n"+
							"주문 핸드폰 번호 : "+phoneNum+"\n"+
							"주문 집 주소 : "+ address+"\n"+
							"주문 날짜 : "+orderDate+"\n"+
							"주문 시간 : "+orderTime+"\n"+
							"주문 가격 : "+orderPrice+"\n"+
							"메뉴 번호 : "+menuNum);
	}
	
	
}
