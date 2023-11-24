package Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class JsonFile {
	@Test

	public void file() throws JsonGenerationException, JsonMappingException, IOException {

		PomPages.EmployeeDetails employee = new PomPages.EmployeeDetails("suman_kumar", "chennai",
				"romisuman@gmail.com");
		ObjectMapper objm = new ObjectMapper();
		objm.writerWithDefaultPrettyPrinter().writeValue(new File("./employee.json"), employee);

	}

	@Test
	public void method2() throws IOException {
		baseURI = "https://reqres.in/";
		Response res = given().contentType(ContentType.JSON).when().get("/api/users/2");
		// res.then().log().all();
		String fis = res.getBody().asString();
		System.out.println(fis);
		FileWriter fi = new FileWriter(new File(".\\suman.json"));
		fi.write(fis);
		fi.flush();
		// fi.close();

	}
	@Test
	public void petStore() {
		File uploadFile=new File("C:\\Users\\ujjwa\\OneDrive\\Pictures\\Screenshots");
		baseURI="https://petstore.swagger.io/v2/swagger.json";
		Response resp = given().multiPart(uploadFile).when().post("/pet/{petId}/uploadImage}");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
		
	}
	
	
	
	
	
	
	
	
	
}
