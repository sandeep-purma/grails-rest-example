package com.test.myapp;

import java.util.ArrayList;

public class RestResponse {

    public final static String SUCCESS = "SUCCESS";
    public final static String ERROR = "ERROR";
    public final static String VALIDATION_ERROR = "VALIDATION ERROR";
    public final static String TOKEN = "TOKEN";
    public final static String USER_MANAGEMENT = "USER MANAGEMENT";

    String status;
	long count;
	String type;
	String message;
	ArrayList<Object> results = new ArrayList<Object>();

    public RestResponse() {

    }

    public RestResponse(String status, String type, String message, ArrayList results) {
        this.status = status;
        this.type = type;
        this.message = message;
        this.results.addAll(results);
        this.count = this.results.size();
    }

	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Object> getResults() {
        return results;
    }

    public void setResults(ArrayList<Object> results) {
        this.results = results;
    }
}
