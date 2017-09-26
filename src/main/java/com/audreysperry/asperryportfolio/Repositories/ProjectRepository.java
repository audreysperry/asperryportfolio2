package com.audreysperry.asperryportfolio.Repositories;

import com.audreysperry.asperryportfolio.models.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
