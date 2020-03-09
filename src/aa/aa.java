package aa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class aa {
public static void main(String[] args) {
	HashMap<Integer, User> users = new HashMap<>();
	users.put(1, new User("张三", 25));
	users.put(1, new User("张三", 25));
	users.put(1, new User("张三", 25));
	users.put(1, new User("张三", 25));
	users.put(1, new User("张三", 25));
	users.put(1, new User("张三", 25));
	 users.put(3, new User("李四", 22));
	users.put(2, new User("王五", 28));
	users.put(2, new User("王五", 28));
	users.put(2, new User("王五", 28));
	users.put(2, new User("王五", 28));

	System.out.println(tolinkMap(users));
}
public static LinkedHashMap<Integer, User>   tolinkMap(HashMap<Integer, User> map){
	LinkedHashMap<Integer,User> likeMap =  new LinkedHashMap<Integer, User>();
	Set<Entry<Integer, User>> entrySet = map.entrySet();
	 List<Entry<Integer, User>> list = new ArrayList<Entry<Integer, User>>(entrySet);
	 Collections.sort(list,new Comparator<Entry<Integer, User>>() {

		@Override
		public int compare(Entry<Integer, User> o1, Entry<Integer, User> o2) {
			return o1.getValue().getAge()-o2.getValue().getAge();
		}
	});
	for (Entry<Integer, User> entry : list) {
		likeMap.put(entry.getKey(),entry.getValue());


	}
	return likeMap;
}

}
