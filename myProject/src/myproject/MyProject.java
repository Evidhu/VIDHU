/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author vidhu
 */
public class MyProject {
    public int getGCD(int a,int b){
    int min=(a<b)?a:b;
    for(int i=min,j=1;i>=1;i=min/j++){
        System.out.println(j);
        if(a%i==0&b%i==0){
            return i;
        }
    }
    return 0;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyProject m1=new MyProject();
        System.out.println(""+m1.getGCD(1070,1076));
    }

    public MyProject() {
    }
}
