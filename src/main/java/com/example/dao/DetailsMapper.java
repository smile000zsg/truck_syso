package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.pojo.Details;

public interface DetailsMapper {
    int deleteByPrimaryKey(Integer detailsid);

    int insert(Details record);

    int insertSelective(Details record);

    Details selectByPrimaryKey(Integer detailsid);

    int updateByPrimaryKeySelective(Details record);

    int updateByPrimaryKey(Details record);
    
    //查询站内维修项目结果集
    @Select("SELECT * FROM details WHERE oid=#{oid}")
    List<Details> queryByoid(String oid);
    
    
    
    @Select("SELECT * FROM details WHERE oid=#{oid} and detailsdate=1")
    List<Details> queryByoidstate(String oid);
    
    @Delete("DELETE FROM `trucksystem`.`details` WHERE `detailsId` = #{detailsId}")
    int deldeta(int detailsId);
    
    @Select("SELECT * FROM details WHERE oid=#{oid} AND detailsname=#{detailsname} ")
    Details queryBys(@Param("oid")String oid,@Param("detailsname")String detailsname);
    
    @Update("UPDATE `trucksystem`.`details` SET `detailsdate` = 0 WHERE `oid` = #{oid}")
    int updatedetailsdate(String oid);
}