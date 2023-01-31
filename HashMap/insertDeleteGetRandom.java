class RandomizedSet {
    Set<Integer> set;
    public RandomizedSet() {
        set=new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(set.add(val)==false)return false;
        return true;
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
         Integer[] numbers = set.toArray(new Integer[set.size()]);
        Random random = new Random();
        int randomNumber = random.nextInt(set.size());
        return numbers[randomNumber];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
