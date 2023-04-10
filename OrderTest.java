package ch08;

public class OrderTest {

	public static void main(String[] args) {
		Order order1 = new Order(180,78 , "Tomas", 37);
		order1.setOrderNum("202011020003");
		order1.setPhoneNum("01023450001");
		order1.setAddress("서울시 강남구 역삼동 111-333");
		order1.setOrderDate("20201102");
		order1.setOrderTime("130258");
		order1.setOrderPrice(35000);
		order1.setMenuNum(3);
		
		order1.showOrderInfo();
		
	}

}
