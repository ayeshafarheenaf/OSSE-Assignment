package com.bits.osse.fileutility.model;

public class FileSearchCriteria {
	
	private String directory;
	private String fileName;
	
	
	public FileSearchCriteria(String directory, String fileName) {
		super();
		this.setDirectory(directory);
		this.setFileName(fileName);
	}


	public String getDirectory() {
		return directory;
	}


	public void setDirectory(String directory) {
		this.directory = directory;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	

}
