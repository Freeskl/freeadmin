package com.freeskl.freeadmin.core;

import com.freeskl.freeadmin.enums.ResponseCode;

/**
 * @ClassName ResponseResult
 * @Description TODO
 * @Author freeskl
 * @Date 2021/5/7
 */
public class ResponseResult extends  Result {
private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public  ResponseResult(){
        super();
    }

    public  ResponseResult(int code,String msg){
        super(code, msg);
    }

    public ResponseResult(Object data) {
        super(ResponseCode.OK);
        this.data = data;
    }

    public ResponseResult(int code, String msg, Object data) {
        super(code, msg);
        this.data = data;
    }

    public ResponseResult(ResponseCode httpCode, Object data) {
        super(httpCode);
        this.data = data;
    }

}
