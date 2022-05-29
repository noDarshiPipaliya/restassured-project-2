package com.herokuapp.booker.restful.restfulBookerInfo;

import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAllBooking extends TestBase {
    @Test
    public void getAllBookingRecord(){
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
