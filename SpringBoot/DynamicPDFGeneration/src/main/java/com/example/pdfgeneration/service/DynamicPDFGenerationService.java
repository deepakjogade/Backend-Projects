package com.example.pdfgeneration.service;

import java.io.FileNotFoundException;

import org.springframework.stereotype.Service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.*;

@Service
public class DynamicPDFGenerationService {
	public void pdfCreation()
	{
		String filepath="C:\\Users\\deepa\\Desktop\\PdfFiles\\simple.pdf";
		
		try {
			PdfWriter writer=new PdfWriter(filepath);
			
			PdfDocument pdfdoc=new PdfDocument(writer);
			pdfdoc.addNewPage();
			
			Document document=new Document(pdfdoc);
			
			float [] ColumnWidths1 = {250F, 250F};
			Table table1 = new Table(ColumnWidths1);
			
			// Creating a cell
			Cell c1 = new Cell();      
			c1.add("Seller:\n\n\n\n\n");
			
			Cell c2 = new Cell();      
			c2.add("Buyer:\n\n\n\n\n");
			
			table1.addCell(c1);       
		    table1.addCell(c2);       
		    document.add(table1);
			
			//creating table2
			float [] ColumnWidths2 = {125F, 125F, 125F, 125F};
			Table table2 = new Table(ColumnWidths2);
			
			Cell c3 = new Cell();      
			c1.add("Item");  
			Cell c4 = new Cell();      
			c1.add("Quantity");
			Cell c5 = new Cell();      
			c1.add("Rate");
			Cell c6 = new Cell();      
			c1.add("Amount");
			table2.addCell(c3);       
		    table2.addCell(c4);       
		    table2.addCell(c5);       
		    table2.addCell(c6);
		    
			Cell c7 = new Cell();      
			c1.add("Product 1");  
			Cell c8 = new Cell();      
			c1.add("13 no");
			Cell c9 = new Cell();      
			c1.add("155.00");
			Cell c10 = new Cell();      
			c1.add("1800.00");
			table2.addCell(c7);       
		    table2.addCell(c8);       
		    table2.addCell(c9);       
		    table2.addCell(c10);
		    
		    document.add(table2);
		    
		    //Creating Table3
		    float [] ColumnWidths3 = {500F};
			Table table3 = new Table(ColumnWidths3);
			table3.addCell(new Cell().add("\n\n\n"));
		    document.add(table3);
			document.close();
			System.out.println("PDF file generated successfully");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File creation got interupted");
		}
	}

}
