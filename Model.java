import java.time.LocalDateTime;

public class Model{
	
}
class Task{
	private int num;
	private String path;
	private String type;
	private LocalDateTime datetime;
	public Task(int num,String path,String type,LocalDateTime datetime){
		this.num=num;
		this.path=path;
		this.datetime=datetime;
		this.type=type;
	}
	public Task(String path,String type,LocalDateTime datetime){
		this.num=0;
		this.path=path;
		this.datetime=datetime;
		this.type=type;
	}
	@Override
	public String toString(){
		String res="Task \n num= "+num+"\npath= "+path+"\ndate= "+datetime+"\ntype= "+type;
		return res;
	}

}
