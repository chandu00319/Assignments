package in.ashokit.service;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import in.ashokit.Entity.User;
import in.ashokit.repo.Userrepo;

@Service
public class UserService {
	@Autowired
	private  Userrepo repo;
	
	
	public void exportDataToPdf(String filePath) throws IOException, DocumentException {
        List<User> users = repo.findAll();

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();

        PdfPTable table = new PdfPTable(3);
        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Gender");

        for (User user : users) {
            table.addCell(user.getUid().toString());
            table.addCell(user.getName());
            table.addCell(user.getGender());
        }

        document.add(table);
        document.close();
    }
public void exportDataToExel(String filePath) throws IOException 
{
		List<User> user = repo.findAll();
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("User");
		 Row headerRow = sheet.createRow(0);
	        headerRow.createCell(0).setCellValue("Uid");
	        headerRow.createCell(1).setCellValue("Name");
	        headerRow.createCell(2).setCellValue("Gender");
	        int rowNum = 1;
	        for (User u : user) {
	            Row row = sheet.createRow(rowNum++);
	            row.createCell(0).setCellValue(u.getUid());
	            row.createCell(1).setCellValue(u.getName());   
	            row.createCell(2).setCellValue(u.getGender());
	            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
	                workbook.write(fileOut);
	            } finally {
	                workbook.close();
	            }
	        }
		}
	public void saveuser() {
		
		User u=new User();
		u.setName("raju");
		u.setGender("male");
		
		
		User u1=new User();
		
		u1.setName("hari");
		u1.setGender("male");
		User u2=new User();
		u2.setName("chandu");
		u2.setGender("male");
		List<User> asList = Arrays.asList(u,u1,u2);
		repo.saveAll(asList);
	}
	
}
