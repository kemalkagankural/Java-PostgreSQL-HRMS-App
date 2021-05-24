package coderkubra.hrms.business.abstracts;

import java.util.List;

import coderkubra.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
