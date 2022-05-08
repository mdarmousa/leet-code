/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    class Node {
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    Node head;
    public NestedIterator(List<NestedInteger> nestedList) {
        head = createLL(nestedList);
    }
    
      private Node createLL(List<NestedInteger> nestedList){
        Node dummy = new Node(0);
        Node temp = dummy;
        
        for(NestedInteger x: nestedList){
            if(x.isInteger()){
                temp.next = new Node(x.getInteger());
                temp = temp.next;
            }
            else{
                temp.next = createLL(x.getList());
                while(temp.next != null){
                    temp = temp.next;
                }
            }
        }
        
        return dummy.next;
    }

    @Override
    public Integer next() {
        int val = head.data;
        head = head.next;
        return val;
    }

    @Override
    public boolean hasNext() {
        return head != null;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */