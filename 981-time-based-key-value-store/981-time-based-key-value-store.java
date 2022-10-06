class TimeMap {
    HashMap<String, HashMap<Integer, String>> keyTimeStamp;
    public TimeMap() {
        keyTimeStamp = new HashMap<String, HashMap<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!keyTimeStamp.containsKey(key)){
            keyTimeStamp.put(key, new HashMap<Integer, String>());
        }
        keyTimeStamp.get(key).put(timestamp, value);
        
    }
    
    public String get(String key, int timestamp) {
        if(!keyTimeStamp.containsKey(key)){
            return "";
        }
        
        for(int i = timestamp; i>= 1; i--){
            if(keyTimeStamp.get(key).containsKey(i)){
                return keyTimeStamp.get(key).get(i);
            }
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */