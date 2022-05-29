package com.herokuapp.booker.restful.restfulBookerInfo;

import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteBookingRecord extends TestBase {
    @Test
    public void deleteTheBookingRecord(){
        Response response = given()
                .header("Cookie","token=7cf75f58d5bd173")
                .pathParam("id",1425)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
