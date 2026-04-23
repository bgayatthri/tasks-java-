import java.util.Scanner;
class BinarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of elements:");
        int n= sc.nextInt();


        int[] arr=new int[n];
        System.out.print("Enter the array elements:");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }

        System.out.print("Enter the search key:");
        int key=sc.nextInt();

        int low=0; int high=n-1;
        boolean found = false;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==key){
                System.out.print("Element found at" + mid);
                found=true;
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else {
               high=mid-1;
            }
        }
        

    }
}