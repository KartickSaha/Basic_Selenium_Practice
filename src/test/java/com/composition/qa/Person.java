package com.composition.qa;

public class Person {

    //composition has-a relationship
    private Job job;

    public Person(){
        this.job=new Job();
        job.setSalary(120000L);
    }
    public long getSalary() {
        return job.getSalary();
    }
}
