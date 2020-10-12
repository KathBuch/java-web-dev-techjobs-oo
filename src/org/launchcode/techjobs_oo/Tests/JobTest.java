package org.launchcode.techjobs_oo.Tests;
import static org.junit.Assert.*;

import org.junit.*;

import org.launchcode.techjobs_oo.*;

import java.util.Collection;


public class JobTest{
Job test_job;
Job test_job2;
Job test_job3;
Job test_job4;
 Job test_job5;
@Before
public void createJobObject(){
 test_job = new Job();
 test_job2 = new Job();
 test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
 test_job5 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
}
@Test
public void testSettingJobId(){
assertEquals(test_job.getId(), 11);
 assertEquals(test_job2.getId(), 12);
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

String x = test_job5.toString();
assertTrue(x.contains("Data not available"));

 }


}



