import java.util.ArrayList;
public class Tester{
	public static void main(String[] args) throws Exception{
		// //PDFTester
		// String path="/Users/Nitesh/Myfiles/placement1/Nitesh_Vishwakarma_BIRT.pdf";

		// String path2="/Users/Nitesh/Myfiles/placement/index.html";
		// PDFFile pdf=new PDFFile(path);
		// pdf.open();

		//DataLoader Tester
		String pathdata="/Users/Nitesh/Myfiles/project/ScheduleMentor/list.txt";
		DataLoader dl=new DataLoader(pathdata);
		ArrayList<Task> taskList=dl.loadData();
		System.out.println(taskList.get(0).toString());
	}
}