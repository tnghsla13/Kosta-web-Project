package store.mapper;

import java.util.List;

import domain.Task;

public interface TaskMapper {

	public boolean insertSubmitTask(Task task);
	public boolean updateSubmitTask(Task task);
	public boolean deleteSubmitTask(int taskId);
	public List<Task> selectAllSubmitTask();
	public Task selectBySubmitTaskId(int taskId);
	public List<Task> selectByMemberId(String memberId);
	public boolean insertAssignTask(Task task);
	public boolean updateAssignTask(Task task);
	public boolean deleteAssignTask(int taskId);
	public Task selectByAssignTaskId(int id);
	public List<Task> selectAllAssignTask();
	
}
