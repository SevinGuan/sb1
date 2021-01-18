package com.xc.sb1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xc.sb1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<User>  {

}
