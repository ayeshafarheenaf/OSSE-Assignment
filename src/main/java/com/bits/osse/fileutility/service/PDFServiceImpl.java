package com.bits.osse.fileutility.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

public class PDFServiceImpl implements PDFService {

	@Override
	public void mergePDFs(String[] fileStr, String destinationPath, String mergedFileName) {

		// Instantiating PDFMergerUtility class
		PDFMergerUtility obj = new PDFMergerUtility();

		for (String fileStrTemp : fileStr) {
			try {
				obj.addSource((new File(fileStrTemp)));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// Setting the destination file path
		String path = destinationPath + "/" + mergedFileName;
		obj.setDestinationFileName(path);
		// Merging documents
		try {
			obj.mergeDocuments(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("PDF Documents merged to a single file:" + path);
	}

}