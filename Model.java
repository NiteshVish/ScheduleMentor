import java.util.Date;

public class Model{
	
}
class Task implements Comparable<Task>{
	private int num;
	private String path;
	private String type;
	private Date date;
	private int duration;
	public Task(int num,String path,String type,Date date,int duration){
		this.num=num;
		this.path=path;
		this.date=date;
		this.type=type;
		this.duration=duration;
	}

	public Task(String path,String type,Date date,int duration){
		this.num=0;
		this.path=path;
		this.date=date;
		this.type=type;
		this.duration=duration;
	}

	public String getType(){
		return type;
	}

	public String getPath(){
		return path;
	}
	public int getDuration(){
		return duration;
	}
	public Date getDate(){
		return date;
	}

	@Override
	public String toString(){
		String res="Task \n num= "+num+"\npath= "+path+"\ndate= "+date+"\ntype= "+type+" duration= "+duration+"\n";
		return res;
	}

	@Override
	public int compareTo(Task otherTask)
    {
        return this.date.compareTo(otherTask.date);
    } 

}
