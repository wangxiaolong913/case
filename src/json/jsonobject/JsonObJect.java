package json.jsonobject;

import java.util.List;

import net.sf.json.JSONObject;

//net.sf.json.JSONObject
public class JsonObJect {
	public static void main(String[] args) {
		String str = "json格式字符串";
		//json字符串转json对象
		JSONObject jo = JSONObject.fromObject(str);
		
		//取值
		String name = (String) jo.get("name");
		
		//如果json字符串str里有list
		List list = (List) jo.get("list");
	
	}
}
