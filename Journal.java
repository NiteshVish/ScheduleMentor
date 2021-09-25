import java.awt.Desktop;
import java.io.File;
import java.net.URL;
import java.util.TimerTask;

public class Journal  extends TimerTask{
	private String path;
	private File file;
	public Journal(){
		path="/Users/Nitesh/Myfiles/project/ScheduleMentor/myJournal.txt";
		file=new File(path);
	}
	public void open(){
		try {
			if (isExists()) {
				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(file);
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
			return file.exists();
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

	public void run()
    {
        open();
    }

}