 public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer>list=new ArrayList<>();
        
        for(int i=0;i<grades.size();i++){
            int grade=grades.get(i);
            if(grade<38){
                list.add(grade);
            }else{
               int nextmultiple=((grade/5)+1)*5;
            
                if(nextmultiple-grade<3){
                list.add(nextmultiple);
            }else {
                list.add(grade);
            }}
        }
        return list;
    }
