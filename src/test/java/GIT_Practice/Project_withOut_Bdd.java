package GIT_Practice;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import com.genericutility.JavaUtility;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Project_withOut_Bdd {

	public static void main(String[] args) {
		JavaUtility j=new JavaUtility();
		JSONObject jOb=new JSONObject();
		jOb.put("name", "sarda"+j.getRandomNo());
		jOb.put("description", "Eclisci");
		jOb.put("designation", "On-Progree");
		jOb.put("homepage", "On-Progree");
		jOb.put("private", false);
		jOb.put("is_template", true);
		
		RequestSpecification req = RestAssured.given().body(jOb).contentType(ContentType.JSON)
				.auth().oauth2("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");
		req.post("https://api.github.com/user/repos");
		
		req.then().statusCode(201).contentType(ContentType.JSON);

	}

}
