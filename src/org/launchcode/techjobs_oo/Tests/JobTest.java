package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;

import org.junit.*;

import org.launchcode.techjobs_oo.*;



public class JobTest{
Job test_job;
Job test_job2;
Job test_job3;
Job test_job4;
@Before
public void createJobObject(){
 test_job = new Job();
 test_job2 = new Job();
 test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
}
@Test
public void testSettingJobId(){
assertEquals(test_job.getId(), 9);
 assertEquals(test_job2.getId(), 10);
}


@Test
public void testJobConstructorSetsAllFields(){
 assertTrue(test_job3 instanceof Job);
}
@Test
public void testJobsForEquality(){
 assertFalse(test_job3 == test_job4);


}
@Test
 public void testString() {

 System.out.println(test_job3.toString());
 System.out.println(test_job4.toString());
 }
}


