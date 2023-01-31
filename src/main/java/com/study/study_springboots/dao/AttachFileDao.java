package com.study.study_springboots.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AttachFileDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public Object getList(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.selectList(sqlMapId, dataMap);

        return result;
    }

    public Object getOne(String sqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.selectOne(sqlMapId, dataMap);

        return result;
    }

    public Object update(String SqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.update(SqlMapId, dataMap);

        return result;
    }

    public Object delete(String SqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.delete(SqlMapId, dataMap);

        return result;
    }

    public Object insert(String SqlMapId, Object dataMap) {
        Object result = sqlSessionTemplate.insert(SqlMapId, dataMap);

        return result;
    }
}
