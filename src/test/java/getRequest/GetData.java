package getRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.Assert;


public class GetData {

	@Test
	public void testResponsecode()
	{
		Response resp = RestAssured.get("http://127.0.0.1:8000/bucketlists/");
		
		int code = resp.getStatusCode();
		
		System.out.println("Status code is " +code);
		Assert.assertEquals(code, 200);
	}
	
	@Test
	public void testbody()
	{
		String data = RestAssured.get("http://127.0.0.1:8000/bucketlists/").asString();
		long time = RestAssured.get("http://127.0.0.1:8000/bucketlists/").getTime();
		System.out.println("Data is:" +data);
		System.out.println("Response time " +time);
	}
}
