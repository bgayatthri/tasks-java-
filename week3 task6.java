class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        Integer[] a=new Integer[n];
        for(int i=0;i<n;i++){
            a[i]=i;
        }
        Arrays.sort(a,(x,y)->heights[y]-heights[x]);

    String[] res=new String[n];
    for(int j=0;j<n;j++){
        res[j]=names[a[j]];
    }
    return res;
}
}
