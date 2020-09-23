package org.launchcode.techjobs_oo.Tests;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.*;

import org.launchcode.techjobs_oo.*;



public class JobTest{
Job test_job;
Job test_job2;
@Before
public void createJobObject(){
 test_job = new Job();
 test_job2 = new Job();
}
@Test
public void testSettingJobId(){
assertEquals(test_job.getId(), test_job2.getId());

}


@Test
public void testJobConstructorSetsAllFields(){
 test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 assertTrue(test_job instanceof Job);
}
@Test
public void testJobsForEquality(){
 test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 System.out.println(test_job.getId() + " " + test_job2.getId());
 test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 assertEquals(test_job, test_job2);


}
@Test
 public void testString() {
 test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 System.out.println(test_job.toString());
 System.out.println(test_job2.toString());
 }
}


