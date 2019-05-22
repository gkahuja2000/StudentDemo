/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

/**
 *
 * @author gkauj
 */
public class StudentTester {
     public static void main(String args[]){
             int x;
             Student std1 = new Student();
             std1.setName("fvfjd");
             System.out.println(std1.getName());
             Student std2 = new Student(" nnkkkn mehak",12,13);
             Student std3 = new Student(" juhjnnm ehak",2,3);
             Student[] list = new Student[3];
             list[0]= std1;
             list[1]= std2;
             list[2]= std3;
             for(int i=0 ; i<list.length;i++){
             System.out.println(list[i].getName());
             System.out.println(list[i].getAge());
             System.out.println(list[i].getId());
                   }
             System.out.println("fvbgfgsf");
     }
}
       
