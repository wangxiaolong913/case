/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月22日 
 * @Description : 
 * @check
 */
package json.fastjson;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

/**
 * @author wang.xiaolong
 *
 */
public class FastJson {
	// javabean
	public static void beanToJson() {
		OrderEntity order = new OrderEntity(10017, "BaiDuVm", "实例");
		// javabean转json字符串
		String jsonStr = JSON.toJSONString(order);
		// System.out.println(jsonStr);

		// json字符串转化为javabean对象
		order = JSON.parseObject(jsonStr, OrderEntity.class);
		System.out.println(order.getOrderName());
	}

	// list
	public static void listToJson() {
		// list<javabean>转json
		OrderEntity order1 = new OrderEntity(1002001, "BaiDuYunVM", "实例");
//		OrderEntity order2 = new OrderEntity(1002002, "ALiYunVM", "资源");
		//List<OrderEntity> order = new ArrayList<OrderEntity>();
	//	order.add(order1);
//		order.add(order2);
	//	System.out.println(order1.getOrderName());
//		String orderString = JSON.toJSONString(order);
//		// System.out.println(order);
//
//		// 解析json字符串
//		List<OrderEntity> orderlist = JSON.parseArray(orderString,
//				OrderEntity.class);
//		System.out.println(orderlist.get(0).getId());
//		System.out.println(orderlist.get(1).getOrderName());
	}
	

	public static void main(String[] args) {
		 beanToJson();
		//listToJson();
/*		
 * 	遍历json
 * 	parameter={"k1":"v1","k2","v2","k3","v3"}
		JSONObject json = new JSONObject(parameter);
        Iterator it = json.keys();
        while(it.hasNext()){
          String  key = String.valueOf(it.next());
          System.out.println(key);
          String value = json.getString(key);
          System.out.println(value);
          if(!value.equals("0")){
        	
        	
          }
        }	*/
	

	}
}
