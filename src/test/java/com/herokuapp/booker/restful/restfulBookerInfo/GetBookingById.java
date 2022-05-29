package com.herokuapp.booker.restful.restfulBookerInfo;

import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetBookingById extends TestBase {
    @Test
    public void getBookingRecordByGivenId(){
        Response response = given()
                .header("Authorization","Bearer 7cf75f58d5bd173")
                .pathParam("id",1199)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
