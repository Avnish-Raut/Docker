class Exp1b{
    public static void main(String args[]){
              int num = 4334;
              int n = num;
              int r,sum=0;
              while(num!=0){
                   r=num%10;
                   sum=sum*10+r;
                   num=num/10;                   
                    }
               if(sum==n)
                {
               System.out.println(n+" Is a palindrome!!"); 
                }
               else
                 {
                  System.out.println(n+" Is not a palindrome!!");
                 }        
         } 
       }

