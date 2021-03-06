package com.jax.seer2tools.dao;

import com.jax.seer2tools.entity.MonsterInfo;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface MonsterInfoMapper {
    int deleteByPrimaryKey(Short id);

    int insert(MonsterInfo record);

    MonsterInfo selectByPrimaryKey(Short id);

    List<MonsterInfo> selectAll();

    int updateByPrimaryKey(MonsterInfo record);
}