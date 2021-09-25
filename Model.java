import java.time.LocalDateTime;

public class Model{
	
}
class Task implements Comparable<Task>{
	private int num;
	private String path;
	private String type;
	private LocalDateTime datetime;
	private int duration;
	public Task(int num,String path,String type,LocalDateTime datetime,int duration){
		this.num=num;
		this.path=path;
		this.datetime=datetime;
		this.type=type;
		this.duration=duration;
	}

	public Task(String path,String type,LocalDateTime datetime,int duration){
		this.num=0;
		this.path=path;
		this.datetime=datetime;
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
	public LocalDateTime getDateTime(){
		return datetime;
	}

	@Override
	public String toString(){
		String res="Task \n num= "+num+"\npath= "+path+"\ndate= "+datetime+"\ntype= "+type+" duration= "+duration+"\n";
		return res;
	}

	@Override
	public int compareTo(Task otherTask)
    {
        return this.datetime.compareTo(otherTask.datetime);
    } 

}
