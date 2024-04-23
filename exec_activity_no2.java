/*Christian Kenneth F. Gonzales
 * BSIT 1B
 * LEARNING ACTIVITY NO.1
 * Instruction:
 * 
 * 1) PROMPT THE USER TO ENTER A STRING REPRESENTING AN INTEGER.
 * USE  THE Integer.parseInt() METHOD TO PARSE THE INPUT STRING INTO AN INTEGER.
 * HANDLE THE NumberFormatException THAT MAY OCCUR IF THE INPUT STRING CANNOT BE PARSED AS AN NTEGER
 * 
 * 2) DECLARE A REFERENCE VARIABLE OF TYPE STRING AND ASSIGN IT THE VALUE NULL. 
 * ATTEMPT TO CALL A METHOD ON THIS REFERENCE VARIABLE(E.G., length())). 
 * USE A try-catch BLOCK TO CATCH THE NullPointerException THAT MAY OCCUR.
 * 
 * 3) USE THE SCANNER CLASS TO READ AN INTEGER FROM THE USER'S INPUT. 
 * HANDLE THE InputMismatchException THAT MAY OCCUR IF THE INPUT PROVIDED BY THE USER IS NOT AN INTEGER.
 */

 import java.util.Scanner;




public class exec_activity_no2 {
    public static void main(String[] args){

        try{
            String num = null;
            System.out.println(num.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Thank you!");
        }


    

   
    }
 
}
