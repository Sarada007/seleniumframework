package GIT_Practice;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import com.genericutility.JavaUtility;

import io.restassured.http.ContentType;

public class Project_with_Bdd {

	public static void main(String[] args) {
		JavaUtility j=new JavaUtility();
		JSONObject jOb=new JSONObject();
		jOb.put("name", "sarda"+j.getRandomNo());
		jOb.put("description", "Eclisci");
		jOb.put("designation", "On-Progree");
		jOb.put("homepage", "On-Progree");
		jOb.put("private", false);
		jOb.put("is_template", true);
		
		given().body(jOb).contentType(ContentType.JSON).auth().oauth2("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")
		.when().post("https://api.github.com/user/repos")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON);
	}

}
