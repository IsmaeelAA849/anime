package anime;

import java.util.HashMap;

public class Individual {
	public String name;
	public HashMap<String,String> properties;
	public String path;
	public Individual(String a, String b){
		name = a;
		path = b;
		properties = new HashMap<String,String>();
		for(String c:PropertyList.propertyList) {
			properties.put(c,"no");
		}
		
	}
}
