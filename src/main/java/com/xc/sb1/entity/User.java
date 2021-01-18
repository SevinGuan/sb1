package com.xc.sb1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor  // 有参数构造
@NoArgsConstructor  // 无参构造
public class  User implements Serializable {
    @TableId(type = IdType.INPUT)
    private Long  id;
    @NotNull //数据校验
    private String name;
    private String passWord;
   // private Date date;

}
