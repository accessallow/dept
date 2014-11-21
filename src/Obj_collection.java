
import java.sql.Struct;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GhostMachine
 */
public class Obj_collection {
    
    
   public  String subject_1;
   public  float att1;
    
   public  String subject_2;
   public  float att2;
    
   public  String subject_3;
   public  float att3;
    
   public  String subject_4;
   public  float att4;
    
   public  String subject_5;
   public  float att5;
    
    public Obj_collection(){
        subject_1="None";
        subject_2="None";
        subject_3="None";
        subject_4="None";
        subject_5="None";
        
        att1=50;
        att2=50;
        att3=50;
        att4=50;
        att5=50;
    }
    
    public Obj_collection(String s1,float f1,String s2,float f2,String s3,float f3,String s4,float f4,String s5,float f5){
        
        subject_1=s1;att1=f1;  subject_2=s2;att2=f2;  subject_3=s3;att3=f3;
        subject_4=s4;att4=f4;  subject_5=s5;att5=f5;
    }
    
}
