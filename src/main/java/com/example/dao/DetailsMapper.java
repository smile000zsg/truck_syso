package com.example.dao;

import com.example.pojo.Details;

public interface DetailsMapper {
    int deleteByPrimaryKey(Integer detailsid);

    int insert(Details record);

    int insertSelective(Details record);

    Details selectByPrimaryKey(Integer detailsid);

    int updateByPrimaryKeySelective(Details record);

    int updateByPrimaryKey(Details record);
}