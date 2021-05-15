package GroupID.readJasonPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Driver extends PracticeJason {
	static List<Object> idList;

	static void parseJson(JSONObject json, String key) {
		System.out.println(key + " key exists and value is " + json.get(key));
		idList.add(json.get(key));

	}

	static void getKey(JSONObject json, String key) {

		boolean exists = json.has(key);
		Iterator<?> keys;
		String nextKeys;

		if (!exists) {
			keys = json.keys();
			while (keys.hasNext()) {
				nextKeys = (String) keys.next();
				try {

					if (json.get(nextKeys) instanceof JSONObject) {

						if (exists == false) {
							getKey(json.getJSONObject(nextKeys), key);
						}

					} else if (json.get(nextKeys) instanceof JSONArray) {
						JSONArray jsonarray = json.getJSONArray(nextKeys);
						for (int i = 0; i < jsonarray.length(); i++) {
							String jsonarrayString = jsonarray.get(i).toString();
							JSONObject innerJSOn = new JSONObject(jsonarrayString);

							if (exists == false) {

								getKey(innerJSOn, key);
							}

						}

					}

				} catch (Exception e) {
					// TODO: handle exception
				}

			}

		} else {
			parseJson(json, key);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject js = new JSONObject(PracticeJason.inputMethod());
		getKey(js, "url");

	}

}
