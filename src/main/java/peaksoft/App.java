package peaksoft;

import peaksoft.model.Employee;
import peaksoft.model.Job;
import peaksoft.service.EmployeeService;
import peaksoft.service.JobService;
import peaksoft.service.serviceImpl.EmployeeServiceImpl;
import peaksoft.service.serviceImpl.JobServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        JobService jobService = new JobServiceImpl();
//        jobService.createJobTable();
        Job job = new Job();
        job.setPosition("Mentor");
        job.setProfession("Java");
        job.setDescription("Krasivaya");
        job.setExperience(5);
        jobService.addJob(job);
//            System.out.println(jobService.getJobById(1L));
//        System.out.println(jobService.sortByExperience("asc"));
//        System.out.println(jobService.getJobByEmployeeId(1L));
//        jobService.deleteDescriptionColumn();

        // task 2
//        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//        employeeService.createEmployee();
//        employeeService.addEmployee(new Employee("Eldiyar","Avazbekov",18,"eldiyar@gmail.com",1L));
//         employeeService.dropTable();
//        employeeService.cleanTable();
//        Employee e = new Employee();
//        e.setFirstName("Eldiyar");
//        e.setLastName("Avazbekov");
//        e.setAge(18);
//        e.setEmail("eldiyar@gmail.com");
//        employeeService.updateEmployee(1L,e);
    }
}
