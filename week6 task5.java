   public static int marsExploration(String s) {
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
        if (i % 3 == 0 || i % 3 == 2) {
            if (s.charAt(i) != 'S') {
                count++;
            }
        } else {
            if (s.charAt(i) != 'O') {
                count++;
            }
        }
    
    }
    return count;
}
    }