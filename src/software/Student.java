/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package software;

/**
 *
 * @author gkauj gurleen Kaur
  22nd May 2019
 */
class Student {
    private String name;
    private int age;
    private int Maxjhnm;

    public int getMaxjhnm() {
        return Maxjhnm;
    }

    public void setMaxjhnm(int Maxjhnm) {
        this.Maxjhnm = Maxjhnm;
    }
    
    public Student(){
    
    }
    public  Student(String n,int a,int i){
          this.name=n;
          this.age = a;
          this.id = i;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
      return "Name : "+ getName()+" Age : "+ getAge() + " ID :"+getId();
}
}
