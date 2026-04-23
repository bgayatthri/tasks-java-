class UndergroundSystem {
        Map<Integer,String> station=new HashMap<>();
        Map<Integer,Integer> time=new HashMap<>();
        Map<String, int[]> map = new HashMap<>();
    public UndergroundSystem() {
    }
    
    public void checkIn(int id, String stationName, int t) {
        station.put(id,stationName);
        time.put(id,t);
    }
    
    public void checkOut(int id, String stationName, int t) {
        String key = station.get(id) + "->" + stationName;
        
        map.putIfAbsent(key, new int[2]);
        map.get(key)[0] += t - time.get(id); 
        map.get(key)[1]++;                   
        
        station.remove(id);
        time.remove(id);
    }
    
    public double getAverageTime(String startStation, String endStation) {
         int[] d = map.get(startStation + "->" + endStation);
         return (double) d[0] / d[1];

    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */