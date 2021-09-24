
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DataLoader{
	private String path;
	public DataLoader(String path){
		this.path=path;
	}

	public ArrayList<Task> loadData() throws Exception{
		File file=new File(path);
		Scanner sc=new Scanner(file);
		ArrayList<Task> taskList=new ArrayList<>();
		DateTimeFormatter ft = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a"); 
		while (sc.hasNextLine()){
	      	String[] data=sc.nextLine().split(",");
	      	if(data.length==4 || data.length==3){
	      		int num=0;
	      		int iadd=0;
	      		if(data.length==4) {num=Integer.valueOf(data[0]);iadd++;}
	      		String t=data[2+iadd];
	      		LocalDateTime date=LocalDateTime.parse(t,ft);
	      		taskList.add(new Task(num,data[iadd],data[1+iadd],date));
	      	}
	  	}
	  	return taskList;
	}

	public ArrayList<Task> sortTask(ArrayList<Task> list){
		return null;
	}
	
}