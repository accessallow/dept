
import java.sql.Struct;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GhostMachine
 */
public class Obj_collection_mid1{
    
    
   public  String subject_1;
   public  float perc_1;
    
   public  String subject_2;
   public  float perc_2;
    
   public  String subject_3;
   public  float perc_3;
    
   public  String subject_4;
   public  float perc_4;
    
   public  String subject_5;
   public  float perc_5;
   
   int total;
   float perc_all;
    
    public Obj_collection_mid1(){
        subject_1="Sub-1";
        subject_2="Sub-2";
        subject_3="Sub-3";
        subject_4="Sub-4";
        subject_5="Sub-5";
        
        perc_1=50;
        perc_2=50;
        perc_3=50;
        perc_4=50;
        perc_5=50;
    }
    
    public Obj_collection_mid1(String s1,float f1,String s2,float f2,String s3,float f3,String s4,float f4,String s5,float f5){
        
        subject_1=s1;perc_1=f1;  subject_2=s2;perc_2=f2;  subject_3=s3;perc_3=f3;
        subject_4=s4;perc_4=f4;  subject_5=s5;perc_5=f5;
    }
    
}
