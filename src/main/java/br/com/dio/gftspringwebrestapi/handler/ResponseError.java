package br.com.dio.gftspringwebrestapi.handler;

import java.time.OffsetDateTime;

public class ResponseError {
    private OffsetDateTime timeStamp = OffsetDateTime.now();
    private String status = "error";
    private int statusCode = 400;
    private String error;

    public OffsetDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
