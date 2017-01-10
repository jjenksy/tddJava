package com.logicode.person;

/**
 * Created by jjenkins on 1/10/2017.
 */
public class Person {

    private int age;
    public Person(int initialAge) {
        this.age= initialAgeCheck(initialAge);
    }

    private int initialAgeCheck(int initialAge) {
        if(initialAge<0){
            initialAge = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        return initialAge;
    }

    public void yearPasses(){
        this.age++;
    }

    public void amIOld(){
        if(this.age<13){
            System.out.println("You are young.");
        }else if(this.age>=13 && this.age <18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are old.");
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
