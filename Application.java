import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;



public class Application{
	public static void main(String[] args) throws Exception{

		String[] types=new String[]{"pdf","img","video","link","mail"};
		//DataLoading
		String pathdata="/Users/Nitesh/Myfiles/project/ScheduleMentor/list.txt";
		DataLoader dl=new DataLoader(pathdata);
		ArrayList<Task> taskList=dl.loadData();
		dl.sortTask(taskList);

		//Now create the time and schedule it
    	Timer timer = new Timer();

    	for(Task task:taskList){
    		if(task.getType().compareTo(types[0])==0){
    			TimerTask ttask=new PDFFile(task.getPath());

    			Date taskDate=task.getDate();
    			// Date taskDate=Date.from(time.toInstant(Util.getZoneOffset()));

    			timer.schedule(ttask,taskDate);

    			//After completion of task open journal 
    			// LocalDateTime afterTaskTime=task.getDateTime().plusMinutes(task.getDuration());
    			taskDate.setMinutes(taskDate.getMinutes()+task.getDuration());
    			TimerTask afterTTask=new Journal();
    			timer.schedule(afterTTask,taskDate);


    		// }else if(task.getType().compareTo(types[1])){

    		// }else if(task.getType().compareTo(types[2])){

    		// }else if(task.getType().compareTo(types[3])){

    		// }else if(task.getType().compareTo(types[4])){

    		}else{
    			System.out.println("will implement soon :)");
    		}
    	}

	}
}