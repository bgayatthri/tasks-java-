class Solution{
public class NthPrime(int input1){  
     int count=0;
        int num=1;
        while(count<input1){
            num++;
        if(isPrime){
            count++;
        }
    }
    return num;
    }
    public static boolean isPrime(int num){
        if(num<=1)
        return false;
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                return false;
        }
            else {
            return true;
            }
    }
		
	
}}}
