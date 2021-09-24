import java.awt.Desktop;
import java.io.File;
import java.net.URL;

public class PDFFile{
	String path;
	File pdfFile;

	//Constructor
	//path -absolute path of pdf file
	public PDFFile(String path){
		this.path=path;
		pdfFile = new File(path);
	}

	public void open(){
		try {
			if (isExists()) {
				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfFile);
				} else {
					System.out.println("Awt Desktop is not supported!");
				}

			} else {
				System.out.println("File is not exists!");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public boolean isExists(){
		try{
			return pdfFile.exists();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

	public void print(String msg){
		System.out.println(msg);
	}
	
}