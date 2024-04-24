package peaksoft.service.serviceImpl;

import peaksoft.dao.DaoJob;
import peaksoft.dao.daoImpl.JobDaoImpl;
import peaksoft.model.Job;
import peaksoft.service.JobService;

import java.util.List;

public class JobServiceImpl implements JobService {
    DaoJob daoJob = new JobDaoImpl();
    @Override
    public void createJobTable() {
    daoJob.createJobTable();
    }

    @Override
    public void addJob(Job job) {
    daoJob.addJob(job);
    }

    @Override
    public Job getJobById(Long jobId) {
        return daoJob.getJobById(jobId);
    }

    @Override
    public List<Job> sortByExperience(String ascOrDesc) {
        return daoJob.sortByExperience(ascOrDesc);
    }

    @Override
    public Job getJobByEmployeeId(Long employeeId) {
        return daoJob.getJobByEmployeeId(employeeId);
    }

    @Override
    public void deleteDescriptionColumn() {
       daoJob.deleteDescriptionColumn();
    }
}
