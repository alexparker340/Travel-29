package JVM.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class FBreport {
 public static void generatingJVMReport(String json) {
	 
	 // location where that need to store
	 File file= new File("D:\\Report");
	 
	 Configuration conf= new Configuration(file,"Facebook");
	 
	 //for additional data we can add a methos add classification
	 
	 conf.addClassifications("Browser Name", "Chrome");
	 conf.addClassifications("Sprint No", "32");
	 conf.addClassifications("platform", "Window 11");
	 conf.addClassifications("Environment", "UAT");
	 
	 //creating of list 
	 List<String> list = new ArrayList<String>();
	 
	 // in list we need to ass all json files
	 list.add(json);
	 
	 //Report generation
	 ReportBuilder builder= new ReportBuilder(list, conf);
	 builder.generateReports();
	 
	 
 }
}
