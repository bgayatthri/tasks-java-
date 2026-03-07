class Result {

    

    public static int stringSimilarity(String s) {
        int n=s.length();
        int total=0;
        
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n-i;j++){
                if(s.charAt(j)== s.charAt(i+j)){
                    count+=1;
                }else{
                    break;
                }
            }
            total+=count;
        }
        return total;
}}