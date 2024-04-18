package student;

import ManageGrades.Module;
import sysAdmin.Fees;

import java.util.ArrayList;

public abstract class Student implements IStudent {
    private String firstName;
    private String surName;
    private ArrayList<Module> modules=new ArrayList<>();
    private Fees fees;
    private boolean accomodation;
    private int years;
    private char sex;
    private int phoneNumber;




    public Student(String firstName, String surName, ArrayList<Module> modules, Fees fees, boolean accomodation, int years, char sex, int phoneNumber) {
        this.firstName = firstName;
        this.surName = surName;
        this.modules = modules;
        this.fees = fees;
        this.accomodation = accomodation;
        this.years = years;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean accomodation() {
    return accomodation;
    }

    @Override
    public void checkGrades() {
        System.out.println("----Module Name----- Module Grade");
   for (Module module:modules){
       System.out.println("----"+module.getModuleName()+"----"+module.getGrade()+"%");
   }
    }

    @Override
    public void payFees(float amount) {
    fees.payFees(amount);
    }


    @Override
    public void Login() {

    }

    @Override
    public void updatePhoneNumber() {
h
    }

    public abstract void setYears();
    public abstract int getYears();
    public abstract void add(Module module);
}
