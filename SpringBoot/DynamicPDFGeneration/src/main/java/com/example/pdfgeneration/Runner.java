package com.example.pdfgeneration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.pdfgeneration.service.DynamicPDFGenerationService;

@Component
public class Runner implements ApplicationRunner {

	private DynamicPDFGenerationService pdfGenerationService;

	@Autowired
	public Runner(DynamicPDFGenerationService pdfFileService) {
		
		this.pdfGenerationService = pdfFileService;
	}
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("Application Started to Run");
		pdfGenerationService.pdfCreation();
		
		
	}

}

