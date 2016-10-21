package service.facade;
import java.util.List;

import domain.Task;

public interface TaskService {
	public boolean registerSubmitTask(Task submitTask);
	public boolean  modifySubmitTask(Task submitTask);
	public boolean removeSubmitTask(int submitTaskId);
	public List<Task> searchAllSubmitTask(); 
	public Task searchByMemberId(int memberId);
	public Task searchBySubmitTaskId(int submitTaskId);
	public boolean registerAssignTask(Task assignTask);
	public boolean modifyAssignTask(Task assignTask);
	public boolean removeAssignTask(int assignTaskId);
	public List<Task> searchAllAssignTask();
	
}
