package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 属性&属性分组关联
 * 
 * @author Bohua
 * @email 2662940084@gmail.com
 * @date 2021-05-28 11:36:07
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {
	void deleteBatchRelation(@Param("entities") List<AttrAttrgroupRelationEntity> entities);
}
