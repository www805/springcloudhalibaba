package com.atguigu.springcloud.entities;
import com.sun.xml.internal.ws.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {  //泛型：如果装的payment 返回payment,装的order 返回order

    private Integer code = 400;
    private String message = "请求失败!";
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

    public void toSuccess(){
        this.code = 200;
        this.message = "请求成功!";
    }

    public void toSuccess(T data){
        this.code = 200;
        this.message = "请求成功!";
        this.data = data;
    }

    public void toSuccess(T data, String message){
        this.code = 200;
        if(null != message && !"".equals(message.trim())){
            this.message = message;
        }else{
            this.message = "请求成功!";
        }
        this.data = data;
    }


}