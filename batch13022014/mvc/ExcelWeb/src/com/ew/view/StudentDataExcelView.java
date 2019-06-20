package com.ew.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.ew.dto.StudentDTO;

public class StudentDataExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<StudentDTO> students = null;
		int row = 1;

		students = (List<StudentDTO>) model.get("students");
		HSSFSheet sheet = workbook.createSheet("student data");

		// excel header row
		HSSFRow header = sheet.createRow(0);
		HSSFCell idCell = header.createCell(0);
		idCell.setCellValue("ID");

		HSSFCell nameCell = header.createCell(1);
		nameCell.setCellValue("NAME");

		// data
		for (StudentDTO dto : students) {
			HSSFRow dataRow = sheet.createRow(row);
			HSSFCell cell0 = dataRow.createCell(0);
			cell0.setCellValue(dto.getId());

			HSSFCell cell1 = dataRow.createCell(1);
			cell1.setCellValue(dto.getName());
			row++;
		}

	}

}
