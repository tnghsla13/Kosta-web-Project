package store.logic;

import java.util.List;

import domain.Task;
import store.facade.TaskStore;

public class TaskStoreLogic implements TaskStore{

	@Override
	public boolean insertSubmitTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSubmitTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSubmitTask(int taskId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Task> selectAllSubmitTask() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task selectBySubmitTaskId(int taskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> selectByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertAssignTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAssignTask(Task task) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAssignTask(int taskId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Task selectByAssignTaskId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Task> selectAllAssignTask() {
		// TODO Auto-generated method stub
		return null;
	}

}
