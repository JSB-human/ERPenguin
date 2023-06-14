package com.erpenguin.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.erpenguin.project.service.SampleVo;

@Mapper
public interface SampleMapper {
	
	List<SampleVo> selectSampleList() throws Exception;

}
