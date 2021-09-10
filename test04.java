package execl;

public class test04 {

public static void main(String[] args) {
		HSSFWorkbook book;
		try {
			book = new HSSFWorkbook(new FileInputStream("E:/axls/blogs.xls"));
			HSSFSheet sheet=book.getSheet("表");
			//得到表格的第一行
			HSSFRow row=sheet.getRow(0);
			Iterator<Cell> ite=row.cellIterator();
			while(ite.hasNext()){
				HSSFCell cell=(HSSFCell)ite.next();
				String cname=cell.getStringCellValue();
				System.out.print(cname);
				System.out.print(",");
			}
			System.out.println("\n");
			System.out.println("---------------------------------------");
			//得到表格的其他行，即不包括第一行
			Iterator<Row> it= sheet.rowIterator();
			while(it.hasNext()){//遍历所有行
				row=(HSSFRow)it.next();
				ite=row.cellIterator();
				while(ite.hasNext()){//遍历当前行的所有列
					HSSFCell cell=(HSSFCell)ite.next();
					String cname=cell.getStringCellValue();
					System.out.print(cname);
					System.out.print(",");
				}
				System.out.println("\n");
			}
			book.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
