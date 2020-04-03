package com.subledger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.subledger.dao.InventoryRepository;
import com.subledger.dao.balanceSheet.BalanceSheetRepository;
import com.subledger.dao.balanceSheet.ColdataRepository;
import com.subledger.dao.balanceSheet.ColstrRepository;
import com.subledger.dao.balanceSheet.ConfidenceRepository;
import com.subledger.dao.balanceSheet.RowDataRepository;
import com.subledger.entities.Inventory;
import com.subledger.entities.balanceSheet.BalanceSheet;
import com.subledger.entities.balanceSheet.Colstr;
import com.subledger.entities.balanceSheet.Coldata;
import com.subledger.entities.balanceSheet.Confidence;

import com.subledger.entities.balanceSheet.RowData;

import org.springframework.data.util.Pair;

@SpringBootApplication
public class SubledgerApplication implements CommandLineRunner{
	
	@Autowired
	private InventoryRepository inventoryRepository; 
	
	
	@Autowired
	private BalanceSheetRepository BalanceSheetRepository; 
	
	@Autowired
	private RowDataRepository rowDataRepository; 
	
	
	@Autowired
	private ColdataRepository colDataRepository; 
	
	@Autowired
	private ConfidenceRepository confidenceRepository; 
	
	@Autowired
	private ColstrRepository colstrRepository; 
	
	
	public static void main(String[] args) {
		SpringApplication.run(SubledgerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//	 Init inventories
	for (int i = 0; i <10; i++) {		
	Inventory inv = new Inventory(null, new Date(), "Extra Inventory Cash",(double) 580450,(double) 6750, (double)54, new Date(),
					(double) 46, "UYE77","545", "FF4", new Date(),new Date(), (double)9077, (double) 480,  new Date(),  (double)3480 ,
					 (double) 480,  (double) 480, "TT554",
					 (double) 340 , "RE",  (double) 480 , "FD", "DF", "DFL", "LDFLD", "SH", "6OI",  (double) 34880 ,
					 (double) 480, (double)459,  (double) 480 , (double) 380 ,  (double)280,  new Date(), "OO7", "ER","09II",
					 "RU",  new Date());
			inventoryRepository.save(inv);
		}
	
	//**********************
	// Init Balance Sheet Blank
	/// *******
//	BalanceSheet bs1=new BalanceSheet(null,new Date(),"db Balance Sheet Audit","db XYZ Bank",
//			"db Assets Subledger","Default","settings",
//			null, null);
//	BalanceSheetRepository.save(bs1);
	
		
	
//	create row data collection first Blank
//	RowData rd1=new RowData(null,"Residential Mortgages, Net", null,bs1);
//	rowDataRepository.save(rd1);
////	daa Cols in row data
//	Coldata col1 = new Coldata(null, "111", null,rd1);
//	Coldata col2 = new Coldata(null,"111",null,rd1);
//	Coldata col3 = new Coldata(null,"111",null,rd1);
//	Coldata col4 = new Coldata(null,"111",null,rd1);
//	colDataRepository.save(col1);
//	colDataRepository.save(col2);
//	colDataRepository.save(col3);
//	colDataRepository.save(col4);
//	Confidence cf1 = new Confidence(null,1300l,1.324f,230l,col1);
//	Confidence cf2 = new Confidence(null,100l,1.324f,230l,col2);
//	Confidence cf3 = new Confidence(null,1300l,1.324f,230l,col3);
//	Confidence cf4 = new Confidence(null,1300l,1.324f,230l,col4);
//	confidenceRepository.save(cf1);
//	confidenceRepository.save(cf2);
//	confidenceRepository.save(cf3);
//	confidenceRepository.save(cf4);
//	colstrRepository.save(new Colstr(null,"mortgages",bs1));
//	colstrRepository.save(new Colstr(null,"Consumer Loans",bs1));
//	colstrRepository.save(new Colstr(null,"Securities",bs1));
//	colstrRepository.save(new Colstr(null,"Debt & Derivatives",bs1));
//	
//	
////	create row data collection first Blank
//	RowData rd2=new RowData(null,"Federal Funds Sold", null,bs1);
//	rowDataRepository.save(rd2);
////	daa Cols in row data
//	Coldata col12 = new Coldata(null, "111", null,rd2);
//	Coldata col22 = new Coldata(null,"111",null,rd2);
//	Coldata col32 = new Coldata(null,"-111",null,rd2);
//	Coldata col42 = new Coldata(null,"-111",null,rd2);
//	colDataRepository.save(col12);
//	colDataRepository.save(col22);
//	colDataRepository.save(col32);
//	colDataRepository.save(col42);
//	
//	Confidence cf12 = new Confidence(null,140l,1.324f,230l,col12);
//	Confidence cf22 = new Confidence(null,150l,1.324f,230l,col22);
//	Confidence cf32 = new Confidence(null,130l,1.324f,230l,col32);
//	Confidence cf42 = new Confidence(null,130l,1.324f,230l,col42);
//	confidenceRepository.save(cf12);
//	confidenceRepository.save(cf22);
//	confidenceRepository.save(cf32);
//	confidenceRepository.save(cf42);
//	
//
//	
////	create row data collection first Blank
//	RowData rd3=new RowData(null,"Credit Card Receivables", null,bs1);
//	rowDataRepository.save(rd3);
////	daa Cols in row data
//	Coldata col13 = new Coldata(null, "111", null,rd3);
//	Coldata col23 = new Coldata(null,"-111",null,rd3);
//	Coldata col33 = new Coldata(null,"-111",null,rd3);
//	Coldata col43 = new Coldata(null,"-111",null,rd3);
//	colDataRepository.save(col13);
//	colDataRepository.save(col23);
//	colDataRepository.save(col33);
//	colDataRepository.save(col43);
//	Confidence cf13 = new Confidence(null,1300l,1.324f,230l,col13);
//	Confidence cf23 = new Confidence(null,100l,1.324f,230l,col23);
//	Confidence cf33 = new Confidence(null,1300l,1.324f,230l,col33);
//	Confidence cf43 = new Confidence(null,1300l,1.324f,230l,col43);
//	confidenceRepository.save(cf13);
//	confidenceRepository.save(cf23);
//	confidenceRepository.save(cf33);
//	confidenceRepository.save(cf43);
//	
	
	
	// Second balance Sheet
		/// *******
//		BalanceSheet bs2=new BalanceSheet(null,new Date(),"Second balance sheet","db testk",
//				"db test sonic","test","test",
//				null, null);
//		BalanceSheetRepository.save(bs2);
							
////		create row data collection first Blank
//		RowData rd12=new RowData(null,"Second Mortgages, Net", null,bs2);
//		rowDataRepository.save(rd12);
////		daa Cols in row data
//		Coldata col122 = new Coldata(null, "222", null,rd12);
//		Coldata col222 = new Coldata(null,"-222",null,rd12);
//		Coldata col322 = new Coldata(null,"-222",null,rd12);
//		Coldata col422 = new Coldata(null,"-222",null,rd12);
//		colDataRepository.save(col122);
//		colDataRepository.save(col222);
//		colDataRepository.save(col322);
//		colDataRepository.save(col422);
//		Confidence cf122 = new Confidence(null,1300l,1.324f,230l,col122);
//		Confidence cf222 = new Confidence(null,100l,1.324f,230l,col222);
//		Confidence cf322 = new Confidence(null,1300l,1.324f,230l,col322);
//		Confidence cf422 = new Confidence(null,1300l,1.324f,230l,col422);
//		confidenceRepository.save(cf122);
//		confidenceRepository.save(cf222);
//		confidenceRepository.save(cf322);
//		confidenceRepository.save(cf422);
//		colstrRepository.save(new Colstr(null,"Second gages",bs2));
//		colstrRepository.save(new Colstr(null,"Second Loans",bs2));
//		colstrRepository.save(new Colstr(null,"Second",bs2));
//		colstrRepository.save(new Colstr(null,"Second & Derivatives",bs2));
		
		
//		create row data collection first Blank
//		RowData rd22=new RowData(null,"Federal Funds Sold", null,bs2);
//		rowDataRepository.save(rd22);
////		daa Cols in row data
//		Coldata col1222 = new Coldata(null, "222", null,rd22);
//		Coldata col2222 = new Coldata(null,"-222",null,rd22);
//		Coldata col3222 = new Coldata(null,"-222",null,rd22);
//		Coldata col4222 = new Coldata(null,"-222",null,rd22);
//		colDataRepository.save(col1222);
//		colDataRepository.save(col2222);
//		colDataRepository.save(col3222);
//		colDataRepository.save(col4222);
//		
//		Confidence cf1222 = new Confidence(null,140l,1.324f,230l,col1222);
//		Confidence cf2222 = new Confidence(null,150l,1.324f,230l,col2222);
//		Confidence cf3222 = new Confidence(null,130l,1.324f,230l,col3222);
//		Confidence cf4222 = new Confidence(null,130l,1.324f,230l,col4222);
//		confidenceRepository.save(cf1222);
//		confidenceRepository.save(cf2222);
//		confidenceRepository.save(cf3222);
//		confidenceRepository.save(cf4222);
		

		
//		create row data collection first Blank
//		RowData rd32=new RowData(null,"Second Card Receivables", null,bs2);
//		rowDataRepository.save(rd32);
////		daa Cols in row data
//		Coldata col1322 = new Coldata(null, "222", null,rd32);
//		Coldata col2322 = new Coldata(null,"-6348",null,rd32);
//		Coldata col3322 = new Coldata(null,"-1008",null,rd32);
//		Coldata col4322 = new Coldata(null,"-1008",null,rd32);
//		colDataRepository.save(col1322);
//		colDataRepository.save(col2322);
//		colDataRepository.save(col3322);
//		colDataRepository.save(col4322);
//		Confidence cf1322 = new Confidence(null,1300l,1.324f,230l,col1322);
//		Confidence cf2322 = new Confidence(null,100l,1.324f,230l,col2322);
//		Confidence cf3322 = new Confidence(null,1300l,1.324f,230l,col3322);
//		Confidence cf4322 = new Confidence(null,1300l,1.324f,230l,col4322);
//		confidenceRepository.save(cf1322);
//		confidenceRepository.save(cf2322);
//		confidenceRepository.save(cf3322);
//		confidenceRepository.save(cf4322);


}
	

	
	
	
	

}
