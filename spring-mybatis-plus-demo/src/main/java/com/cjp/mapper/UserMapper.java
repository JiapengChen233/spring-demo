package com.cjp.mapper;

import com.cjp.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author ronaldo
 * @since 2021-05-03
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * select by table column name
     *
     * @param column table column name
     * @param value  table column value
     * @return
     */
    List<User> findByColumn(@Param("column") String column, @Param("value") String value);

    /**
     * insert batch
     *
     * @param users User data
     * @return
     */
    int insertBatch(List<User> users);
}
