package com.cs.commom.bean;

/**
 * Created by 举 on 2016/11/30.
 */
public class ControllerResult {
    private static String RESULT_SUCCESS = "success";
    private static String RESULT_FAIL = "fail";
    private String message;
    private String result;

    public ControllerResult() {

    }

    public ControllerResult(String result, String message) {
        this.message = message;
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static ControllerResult getResultSuccess(String message) {
        return new ControllerResult(RESULT_SUCCESS, message);
    }

    public static ControllerResult getResultFail(String message) {
        return new ControllerResult(RESULT_FAIL, message);
    }
}
