package com.herokuapp.booker.restful.restfulBookerInfo;

import com.herokuapp.booker.restful.model.BookingPojo;
import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class UpdateBookingRecord extends TestBase {
    @Test
    public void UpdateTheBookingRecord(){
         HashMap<String,String> dates= new HashMap<>();
        dates.put("checkin","2021-09-11");
        dates.put("checkout","2022-05-11");
        BookingPojo bookingPojo = new BookingPojo();
        bookingPojo.setFirstname("john");
        bookingPojo.setLastname("male");
        bookingPojo.setTotalprice(20000);
        bookingPojo.setDepositpaid(true);
        bookingPojo.setBookingdates(dates);
        bookingPojo.setAdditionalneeds("any");

        Response response = given()
                .header("Cookie","token=7cf75f58d5bd173")
                .header("Content-Type","application/json")
                .pathParam("id",1362)
                .body(bookingPojo)
                .when()
                .put("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
