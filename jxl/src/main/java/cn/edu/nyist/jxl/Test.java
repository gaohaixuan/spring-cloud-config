package cn.edu.nyist.jxl;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Test {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, InterruptedException {
		File file = new File("text1.xls");
		WritableWorkbook workbook = Workbook.createWorkbook(file);
		WritableSheet sheet = workbook.createSheet("软件1", 0);
		WritableCell cell = new Label(0, 2, "xiaosb");
		sheet.addCell(cell );
		workbook.write();
		workbook.close();
		
	}

}
