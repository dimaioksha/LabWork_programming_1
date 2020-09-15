import java.util.*;
public class Laba1 {
    
    public static double calculate(double base, double n) {
        return Math.pow(Math.E, Math.log(Math.abs(base))/n);
    }
    
    public static void main(String[] args){
    // Задача 1: //   
    short[] d = new short[8];
    short count = 0;
    for(int i = 2; i <= 16; i++){
        if (i % 2 == 0)
        {
            d[count] = (short)i;
            //System.out.println(d[count]);
            count++;        
        }
    } 
    // Конец //
    //Задача 2://
    double min = -13.0;
    double max = 12.0;
    double[] x = new double[13];
    
    double random_numb = 0; 
    
    
    for(int i = 0; i< 13; i++)
    {
        random_numb = Math.random() * (max - min + 1) + min;
        x[i] = random_numb;
        //System.out.println(x[i]);
        
    }
    // Конец //
    
    // Задача 3 //
    double[][] M  = new double[d.length][x.length];
    
    for(int i = 0; i < d.length; i++)
    {
            for(int j = 0; j < x.length; j++){
                if (d[i] == 14)
                {
                    M[i][j] = Math.tan(calculate(Math.asin((x[j] - 0.5)/25),3));
                }
                else if(d[i] == 2 || d[i] == 4 || d[i] == 6 || d[i] == 10){
                    M[i][j] = Math.pow((2 * Math.log(Math.abs(x[j]))), 3);
                }
                else 
                {
                    M[i][j] = Math.sin(Math.pow(Math.E, Math.atan(Math.sin(x[j]))));
                }
            
                            
            }
    }
    
    // Задача 4 // 
    for(int i = 0; i < d.length; i++)
    {
     for(int j = 0; j < x.length; j++){
        System.out.printf("%.3f ", M[i][j]);
     }
    System.out.printf("\n");
    }
    }
}
