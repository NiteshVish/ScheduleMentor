
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Collections;

public class DataLoader{
	private String path;
	public DataLoader(String path){
		this.path=path;
	}

	public ArrayList<Task> loadData() throws Exception{
		File file=new File(path);
		Scanner sc=new Scanner(file);
		ArrayList<Task> taskList=new ArrayList<>();
		SimpleDateFormat ft =new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a"); 
		while (sc.hasNextLine()){
	      	String[] data=sc.nextLine().split(",");
	      	//sNo,path,type,time,duration
	      	if(data.length==4 || data.length==5){
	      		int num=0;
	      		int iadd=0;
	      		if(data.length==5) {num=Integer.valueOf(data[0]);iadd++;}
	      		String path=data[iadd];
	      		String type=data[1+iadd];
	      		String time=data[2+iadd];
	      		Date date=ft.parse(time);
	      		int duration= Integer.valueOf(data[3+iadd]);
	      		taskList.add(new Task(num,path,type,date,duration));
	      	}
	  	}
	  	return taskList;
	}

	public ArrayList<Task> sortTask(ArrayList<Task> list){
		Collections.sort(list);
		return list;
	}
	
}