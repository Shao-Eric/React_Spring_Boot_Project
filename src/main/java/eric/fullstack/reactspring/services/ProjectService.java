package eric.fullstack.reactspring.services;

import eric.fullstack.reactspring.domain.Project;
import eric.fullstack.reactspring.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {

        //logic
        return projectRepository.save(project);
    }
}
