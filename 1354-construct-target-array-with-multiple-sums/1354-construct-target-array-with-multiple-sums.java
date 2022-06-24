class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            return b-a;
        }); 
        long sum=0;
        for(int val:target){
            sum+=val;
            pq.add(val);
        }
        while(pq.peek()!=1){
            int max=pq.remove();
            long diff=sum-max;
            if(diff==1) return true;
            if(diff==0 || diff>max || max%diff==0) return false;
            max%=diff;
            sum=max+diff;
            pq.add(max);
        }
        return true;
    }
}