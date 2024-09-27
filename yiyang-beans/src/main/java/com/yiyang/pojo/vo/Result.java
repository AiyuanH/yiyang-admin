package com.yiyang.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 屈博
 * @email qubome@aliyun.com
 * @Date 2024/9/27 11:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public static <Q> Result<Q> success(){
        return new Result<>(2000,"成功",null);
    }
    public static <Q> Result<Q> success(Q data){
        return new Result<>(2000,"成功",data);
    }
    public static <Q> Result<Q> success(Integer code , Q data){
        return new Result<>(code,"成功",data);
    }
    public static <Q> Result<Q> success(Integer code , String message){
        return new Result<>(code,message,null);
    }
    public static <Q> Result<Q> success(Integer code , String message , Q data){
        return new Result<>(code,message,data);
    }
    public static <Q> Result<Q> fail(){
        return new Result<>(5000,"失败",null);
    }
    public static <Q> Result<Q> fail(Q data){
        return new Result<>(5000,"失败",data);
    }
    public static <Q> Result<Q> fail(Integer code , Q data){
        return new Result<>(code,"失败",data);
    }
    public static <Q> Result<Q> fail(Integer code , String message){
        return new Result<>(code,message,null);
    }
    public static <Q> Result<Q> fail(Integer code , String message , Q data){
        return new Result<>(code,message,data);
    }
}
