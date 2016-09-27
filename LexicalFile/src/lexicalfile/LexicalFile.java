/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalfile;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Maynard
 */
public class LexicalFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Inputs: ");
       try
       {
           reader = new Scanner(new File("input.txt"));
       }
       catch(Exception e)
       {
           System.out.println("no file found");
       }
        String input = "";
        while(reader.hasNext())
        {
            input += reader.next();    
        }
        System.out.println(input);
        reader.close();
       // String input= reader.next();
        for(int i =0 ; i<input.length(); i++)
        {
           if(input.charAt(i)== '+')
           {
               System.out.println("Token = +");
               System.out.println("Type = Add");
           }
           else if(input.charAt(i)== '-')
           {
               System.out.println("Token = -");
               System.out.println("Type = Subtract");
           }
           else if(input.charAt(i)== '*')
           {
               System.out.println("Token = *");
               System.out.println("Type = Multiply");               
           }
           else if(input.charAt(i)== '/')
           {
               System.out.println("Token = /");
               System.out.println("Type = Divide");               
           }
           else if(input.charAt(i)== '=')
           {
               System.out.println("Token =");
               System.out.println("Type = Assign");               
           }
           else if(input.charAt(i)== '(')
           {
               System.out.println("Token = (");
               System.out.println("Type = LParen");               
           }
           else if(input.charAt(i)== ')')
           {
               System.out.println("Token = )");
               System.out.println("Type = RParen");               
           } 
           
           else if(input.charAt(i)>='0' && input.charAt(i)<='9')
            {
                System.out.print("Token = ");
                for(int a= 0; a<input.length();a++)
                {
                   
                    System.out.print(input.charAt(i));
                    if(i==input.length()-1||(!Character.isDigit(input.charAt(i+1))))
                        {
                            break;
                        }
                    if(Character.isDigit(input.charAt(i+1))||Character.isLetter(input.charAt(i+1)))
                        {
                            i++;
                        }
                }

                    System.out.println("");
                    System.out.println("Type: Number");
            }
           else if(Character.isLetter(input.charAt(i))||Character.isDigit(input.charAt(i)))
           {
               System.out.print("Token = ");
               for(int a= 0; a<input.length(); a++)
               {
                   System.out.print(input.charAt(i));  
                if(i==input.length()-1||(!Character.isDigit(input.charAt(i+1))&&!Character.isLetter(input.charAt(i+1))))
                    {
                        break;
                    }
                if(Character.isDigit(input.charAt(i+1))||Character.isLetter(input.charAt(i+1)))
                    {
                        i++;
                    }
               }
                System.out.println("");
                System.out.println("Type: Identifier");
            }
        }
    }
}
