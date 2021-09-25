import java.time.LocalDateTime;

public class Model{
	
}
class Task{
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
	@Override
	public String toString(){
		String res="Task \n num= "+num+"\npath= "+path+"\ndate= "+datetime+"\ntype= "+type+" duration= "+duration;
		return res;
	}

}
