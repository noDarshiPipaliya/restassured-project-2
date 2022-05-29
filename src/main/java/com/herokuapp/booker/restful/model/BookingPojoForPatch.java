package com.herokuapp.booker.restful.model;

/**
 *    firstname" : "Jim",
 *     "lastname" : "Brown",
 *     "totalprice" : 111,
 *     "depositpaid" : true,
 *     "bookingdates" : {
 *         "checkin" : "2018-01-01",
 *         "checkout" : "2019-01-01"
 *     },
 *     "additionalneeds" : "Breakfast"
 */
public class BookingPojoForPatch {

    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}

