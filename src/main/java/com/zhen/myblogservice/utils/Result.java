package com.zhen.myblogservice.utils;

import lombok.Data;

@Data
public class Result {
    private int code;  //200正常 非200表示异常
    private String msg;
    private Object data;


    public static Result succ(Object data){
        return succ(200,"ok",data);
    }

    public static Result succ(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }

    //数据异常
    public static Result fail(String msg){
        return fail(400,msg,null);
    }
    //数据异常
    public static Result fail(String msg,Object data){
        Result r = new Result();
        r.setCode(400);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
    //数据异常
    public static Result fail(int code,String msg,Object data){
        Result r = new Result();
        r.setCode(code);
        r.setData(data);
        r.setMsg(msg);
        return r;
    }
}
