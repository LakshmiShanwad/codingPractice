package codingpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ashutoshksingh
 *
 */
/*
 * Coding Question: Given a list of urls in standard format
 * (protocol://hostname:port/path?query#hash). Check if all the urls are using
 * the same port.
 * 
 * Input: A list of maxium 100 urls in below format. [url1,url2,url3...url100]
 * Note: If port is not specified in the url then the standard port as per the
 * protocol should be taken into consideration. Example, Port for
 * https://google.com & https://facebook.com should be considered 443 as
 * protocol is https. Hence, output is YES.
 * 
 * Output: Print YES if all the urls are using the same port otherwise NO.
 * 
 * Example: Input:
 * [https://foo.com:8080,http://bar.co.in:8080,ftp://domain.xyz.abc:8080]
 * Output: YES
 * 
 * Example: Input:
 * [http://example.com:8181,https://foo.xyz:9090,http://www.domain.test/admin?
 * user=admin] Output: NO // [^[0-9]]
 * 
 * //http://example.com:9090/user
 * 
 */

public class PortNuminArrayofUrl {

	static Set<String> tempSet = new HashSet<String>();

	public static void portNum1(String inputUrl[], int len)

	{
		
		//  http://example.com:8181", "https://foo.xyz:9090","http://www.domain.test/admin?user=admin"
		String tempPort = "";
		String port = "";
		char[] charArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		for (int i = 0; i < len; i++) {
			String temp[] = inputUrl[i].split(":");
			String extract = temp[2];
			char ch[] = extract.toCharArray(); // 9 0 9 0
			for (int j = 0; j < ch.length; j++) {
				for (int k = 0; k < charArray.length; k++) {
					if (ch[j] == charArray[k]) {
						tempPort += ch[j];
						port = tempPort;
					}
				}
			}
			tempSet.add(port);
			tempPort = "";

		}
		tempSet.add(port);
		System.out.println(tempSet);
		if (tempSet.size() > 1) {
			System.out.println("Port are Not same");
		} else {
			System.out.println("ports are same");
		}

	}

	//correct logic
	public static void portNum(String inputUrl[], int len) {
		String splitStr = null;
		for (int i = 0; i < len; i++) {
			try {
				splitStr = inputUrl[i].split(":")[2];
			} catch (Exception e) {
				splitStr = "";
		        //e.printStackTrace();
			}
			if (!(splitStr.contains("/"))) {
				tempSet.add(splitStr);
			} else {
				splitStr = splitStr.split("/")[0];
				tempSet.add(splitStr);
			}
		}
		if (tempSet.size() > 1)
			System.out.println("NOT SAME PORT" + " <<>> " + tempSet);
		else
			System.out.println("Same PORT" + " <<>> " + tempSet);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputUrl1[] = { "https://foo.com:8080", "http://bar.co.in:8080/user", "ftp://domain.xyz.abc:8080" };
		String inputUrl2[] = { "https://foo.com:8080", "http://bar.co.in:8080", "ftp://domain.xyz.abc:8080" };
		String inputUrl3[] = { "http://example.com:8181", "http://bar.co.in:8080", "ftp://domain.xyz.abc:8080" };
		String inputUrl4[] = { "https://foo.com", "http://bar.co.in:8080/user", "ftp://domain.xyz.abc:8080" };
		String inputUrl5[] = { "https://foo.com", "http://bar.co.in:8080/user", "ftp://domain.xyz.abc:8080",
				"https://foo.com" };
		String inputUrl6[] = { "https://foo.com", "http://bar.co.in:8080/user", "ftp://domain.xyz.abc:8080",
				"https://foo.com", "http://bar.co.in:8080/user" };
		String inputUrl7[] = { "http://example.com:8181", "https://foo.xyz:9090",
				"http://www.domain.test/admin?user=admin" };
		String inputUrl8[] = { "https://foo.com","https://fooew.com","https://foo.com"};
		portNum(inputUrl8, inputUrl8.length);
		
		//portNum1(inputUrl7, inputUrl7.length);

	}

}
