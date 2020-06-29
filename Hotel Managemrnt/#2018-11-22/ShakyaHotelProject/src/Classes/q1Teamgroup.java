/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class q1Teamgroup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String[] vals=s.split(" ");
       int  t,n,g;
        
        t=Integer.parseInt(vals[0]);
        n=Integer.parseInt(vals[1]);
        g=Integer.parseInt(vals[2]);
    
      //  System.out.println(t+" "+n+" "+g+" ");
     String x;
     char[] cArr=new char[n];
     int[] nArr=new int[n];
     String[] in=new String[t];
     String[] out=new String[t];
     int outCount=0;
        for(int i=0;i<t;i++){
          x=scan.nextLine();
          String[] cdd=x.split(" ");
          for(int d=0;d<n;d++){
            nArr[d]=Integer.parseInt(cdd[d]);
               
          }
          out[i]=checksafe(nArr,n,g);
        
        }
        
        for(int i=0;i<t;i++){
            System.out.println(out[i]);
        }

        
    }
    static String checksafe(int[] cArr,int n,int g){
       
        int count=0;
        int count2=0;
           for(int h=0;h<n;h++){ 
             int curr=cArr[h];  
               for(int k=h+1; k<n;k++){
                   System.out.println(curr+" "+cArr[k]);
                    if(curr==cArr[k])count2++;
                    if(count2>1){
                        
                        return "UNSAFE";
                      }
                    
               }
               if(count2==1){
                      count++;
                    }
                    if(count2>2){
                    
                        return "UNSAFE";
                    }
       count2=0;         
    }
    if(count==g)return "SAFE";
    else return"UNSAFE";
        
}
}