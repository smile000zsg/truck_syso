package com.example.dao;

import com.example.pojo.Supplier_Linkman;

public interface Supplier_LinkmanMapper {
    int deleteByPrimaryKey(Integer supplierLinkmanid);

    int insert(Supplier_Linkman record);

    int insertSelective(Supplier_Linkman record);

    Supplier_Linkman selectByPrimaryKey(Integer supplierLinkmanid);

    int updateByPrimaryKeySelective(Supplier_Linkman record);

    int updateByPrimaryKey(Supplier_Linkman record);
}