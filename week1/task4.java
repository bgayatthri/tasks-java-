import java.util.*;
class MaxElement{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int max=sc.nextInt();

        for(int i=1;i<n;i++){
            int x=sc.nextInt();
            if(x>max)
                max=x;
        }
    System.out.println(max);
    }
}