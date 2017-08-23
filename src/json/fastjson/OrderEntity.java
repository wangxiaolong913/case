/**
 * @FileName : case_01
 * @author : wang.xiaolong
 * @Date : 2017年8月22日 
 * @Description : 
 * @check
 */
package json.fastjson;

/**
 * @author wang.xiaolong
 *
 */
public class OrderEntity {
	private int id;
	private String orderName;
	private String type ;
	/**
	 * @param string
	 * @param string2
	 * @param i
	 */
	public OrderEntity(){
		
	}
	


	/**
	 * @param i
	 * @param string
	 * @param string2
	 */
	public OrderEntity(int id, String orderName, String type) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.orderName = orderName;
		this.type = type;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString(){
		return "[orderID="+id+",orderName"+orderName+",type="+type+"]";
		
	}
}
