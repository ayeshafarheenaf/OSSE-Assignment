package com.bits.osse.fileutility.service;

import java.io.File;

import com.bits.osse.fileutility.model.FileSearchCriteria;

public class SearchServiceImpl implements SearchService {
	
	
	@Override
	public boolean searchFile(FileSearchCriteria criteria) {
		
		File dir=new File(criteria.getDirectory());

		String fileName=criteria.getFileName();
		
		String[] files=dir.list();
		
		for (String tempFileName : files) {
			if(tempFileName.equals(fileName)) {
				System.out.println(String.format("Found file:{} in directory:{}", fileName,dir));
				return true;
			}
		}
		return false;
	}

}
