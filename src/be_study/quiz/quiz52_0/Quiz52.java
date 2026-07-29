package be_study.quiz.quiz52_0;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jsonString = ""
				+ "{"
				+ "\"id\":1,"
				+ "\"name\":\"John Doe\","
				+ "\"contacts\":["
				+ "{"
				+ "\"type\":\"email\","
				+ "\"value\":\"john.doe@example.com\""
				+ "},"
				+ "{"
				+ "\"type\":\"phone\","
				+ "\"value\":\"01023456789\""
				+ "}"
				+ "],"
				+ "\"address\":{"
				+ "\"street\":\"123 Main Street\","
				+ "\"city\":\"Seoul\","
				+ "\"zipcode\":\"12345\""
				+ "},"
				+ "\"orders\":["
				+ "{"
				+ "\"orderId\":\"ORD-001\","
				+ "\"date\":\"2024-07-09\","
				+ "\"items\":["
				+ "{"
				+ "\"id\":1,"
				+ "\"name\":\"Smartphone\","
				+ "\"quantity\":2"
				+ "},"
				+ "{"
				+ "\"id\":2,"
				+ "\"name\":\"Laptop\","
				+ "\"quantity\":1"
				+ "}"
				+ "]"
				+ "},"
				+ "{"
				+ "\"orderId\":\"ORD-002\","
				+ "\"date\":\"2024-07-10\","
				+ "\"items\":["
				+ "{"
				+ "\"id\":3,"
				+ "\"name\":\"Headphones\","
				+ "\"quantity\":1"
				+ "}"
				+ "]"
				+ "}"
				+ "]"
				+ "}";
		
		
		JSONParser parser = new JSONParser();
		try {
			JSONObject jsonObj = (JSONObject)parser.parse(jsonString);
			
			System.out.println(jsonObj.get("id"));
			System.out.println(jsonObj.get("name"));
			JSONObject address = (JSONObject) jsonObj.get("address");
			
			System.out.println(address.get("street"));
			System.out.println(address.get("city"));
			System.out.println(address.get("zipcode"));
			
			// DTO 생성
			UserDTO userDTO = new UserDTO();

			userDTO.setId(((Number) jsonObj.get("id")).intValue());
			userDTO.setName(jsonObj.get("name").toString());

			//System.out.println(userDTO);
			///userDTO.setAddress(addressDTO);이거 입력하기 전이라 null로 뜸
			
			// AddressDTO 생성
			Address addressDTO = new Address();

			addressDTO.setStreet(address.get("street").toString());
			addressDTO.setCity(address.get("city").toString());
			addressDTO.setZipcode(address.get("zipcode").toString());

			// UserDTO에 AddressDTO 저장
			userDTO.setAddress(addressDTO);

			
			
			
			//contacts
			JSONArray contacts = (JSONArray) jsonObj.get("contacts");

			List<Contact> contactList = new ArrayList<>();

			for (int i = 0; i < contacts.size(); i++) {

			    JSONObject contact = (JSONObject) contacts.get(i);

			    Contact contactDTO = new Contact();

			    contactDTO.setType(contact.get("type").toString());
			    contactDTO.setValue(contact.get("value").toString());

			    contactList.add(contactDTO);
			}

			userDTO.setContacts(contactList);
			
			JSONArray ordersArray = (JSONArray) jsonObj.get("orders");
			
			//
			
			List<Order> orders = new ArrayList<>();

			for (int i = 0; i < ordersArray.size(); i++) {

			    JSONObject orderObject = (JSONObject) ordersArray.get(i);

			    Order order = new Order();
			// 
			    order.setOrderId(orderObject.get("orderId").toString());
			    order.setDate(orderObject.get("date").toString());
			    
			    JSONArray itemsArray = (JSONArray) orderObject.get("items");
			    
			    List<Item> items = new ArrayList<>();

			    for (int j = 0; j < itemsArray.size(); j++) {

			        JSONObject itemObject = (JSONObject) itemsArray.get(j);

			        Item item = new Item();

			        item.setId(((Number) itemObject.get("id")).intValue());
			        item.setName(itemObject.get("name").toString());
			        item.setQuantity(((Number) itemObject.get("quantity")).intValue());

			        items.add(item);
			    }
			    
			    order.setItems(items);
			    orders.add(order);
			    
			    

			    
			}
			
			userDTO.setOrders(orders);
			
			System.out.println(userDTO);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}