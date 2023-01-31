class RandomizedSet {
    Map<Integer,Integer> map;
    List<Integer> list;
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int m=map.get(val);
            int a=list.get(list.size()-1);
            list.set(m,a);
           map.put(a,m);
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
        }
        return false;
    }
    
    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
