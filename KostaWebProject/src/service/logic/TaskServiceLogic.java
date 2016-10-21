package service.logic;

import java.util.List;

import domain.Task;
import service.facade.TaskService;

public class TaskServiceLogic implements TaskService{

	@Override
	public boolean registerSubmitTask(Task submitTask) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifySubmitTask(Task submitTask) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeSubmitTask(int submitTaskId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Task> searchAllSubmitTask() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task searchByMemberId(int memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task searchBySubmitTaskId(int submitTaskId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerAssignTask(Task assignTask) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifyAssignTask(Task assignTask) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAssignTask(int assignTaskId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Task> searchAllAssignTask() {
		// TODO Auto-generated method stub
		return null;
	}

}
