package com.xc.sb1.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;

/*
返回类型类

 */
@Data
@AllArgsConstructor
public class ResultBean<T> {
 private String status;
 private T data;


}
