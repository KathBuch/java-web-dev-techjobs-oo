package org.launchcode.techjobs_oo.Tests;
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
assertEquals(test_job.getId(), 1);
 assertEquals(test_job2.getId(), 2);
}


@Test
public void testJobConstructorSetsAllFields(){
 Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 assertTrue(test_job instanceof Job);
}
@Test
public void testJobsForEquality(){

}
}


