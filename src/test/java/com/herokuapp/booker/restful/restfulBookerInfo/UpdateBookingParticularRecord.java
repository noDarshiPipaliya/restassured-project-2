package com.herokuapp.booker.restful.restfulBookerInfo;

import com.herokuapp.booker.restful.model.BookingPojoForPatch;
import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateBookingParticularRecord extends TestBase {
    @Test
    public void updateBookingRecord(){
        BookingPojoForPatch bookingPojo = new BookingPojoForPatch();
        bookingPojo.setFirstname("john");
        bookingPojo.setLastname("smit");

        Response response = given()
                .header("Cookie","token=7cf75f58d5bd173")
                .header("Authorization","Bearer 7cf75f58d5bd173")
                .header("Content-Type","application/json")
                .pathParam("id",1045)
                .body(bookingPojo)
                .when()
                .patch("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
