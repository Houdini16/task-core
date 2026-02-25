package sn.isi.l3gl.core.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;
    
    // Version 0.0.1-SNAPSHOT
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
    
    // Version 0.1.0-SNAPSHOT
    public List<Task> listTasks() {
        return taskRepository.findAll();
    }
    
    // Version 0.2.0-SNAPSHOT (sera implémenté plus tard)
    // public Task updateStatus(Long id, TaskStatus status) {
    //     Optional<Task> taskOptional = taskRepository.findById(id);
    //     if (taskOptional.isPresent()) {
    //         Task task = taskOptional.get();
    //         task.setStatus(status);
    //         return taskRepository.save(task);
    //     }
    //     return null;
    // }
    
    // Version 0.3.0-SNAPSHOT (sera implémenté plus tard)
    // public long countCompletedTasks() {
    //     return taskRepository.countByStatus(TaskStatus.DONE);
    // }
}
