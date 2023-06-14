package com.erpenguin.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erpenguin.project.mapper.SampleMapper;

@Service
public class SampleServiceImpl implements SampleService{
	
	@Autowired
	private SampleMapper sampleMapper;
	
	@Override
	public List<SampleVo> selectSampleList() throws Exception {
		List<SampleVo> vo = null;
		try {
			vo = sampleMapper.selectSampleList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
}
