package com.bits.osse.fileutility.client;

import com.bits.osse.fileutility.handler.InputHandler;
import com.bits.osse.fileutility.model.FileSearchCriteria;
import com.bits.osse.fileutility.service.PDFService;
import com.bits.osse.fileutility.service.PDFServiceImpl;
import com.bits.osse.fileutility.service.SearchService;
import com.bits.osse.fileutility.service.SearchServiceImpl;

public class Client {

	public static void main(String[] args) {

		boolean exit = false;
		while (!exit) {

			System.out.println("What do you want to do ? Select options from below");
			System.out.println("1. Search file/directory");
			System.out.println("2. Merge pdf");
			System.out.println("0: To exit");

			String option = InputHandler.getConsoleInput();

			if (option.equals("1")) {

				System.out.println("Enter the directory to search in:");
				String dir = InputHandler.getConsoleInput();
				System.out.println("Enter the file to search in:");
				String fileName = InputHandler.getConsoleInput();
				System.out.println("Sarching....");
				FileSearchCriteria criteria = new FileSearchCriteria(dir, fileName);
				SearchService searchService = new SearchServiceImpl();
				searchService.searchFile(criteria);
			}

			else if (option.equals("2")) {

				System.out.println("Number of pdfs to merge:");
				int noOfPdfs = Integer.parseInt(InputHandler.getConsoleInput());
				String[] files = new String[noOfPdfs];
				for (int i = 0; i < noOfPdfs; i++) {
					System.out.println(String.format("Enter full path of source pdf:{}", i));
					files[i] = InputHandler.getConsoleInput();
				}
				System.out.println("Enter the source directory:");
				String sourceDir = InputHandler.getConsoleInput();
				System.out.println("Enter the merged filename:");
				String mergedFileName = InputHandler.getConsoleInput();
				System.out.println("Merging....");
				PDFService service = new PDFServiceImpl();
				service.mergePDFs(files, sourceDir, mergedFileName);
			}

			else if (option.equals("0")) {
				exit = true;
			}
		}

	}
}