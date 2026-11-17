// class StockSpanner {
//     Deque<int []> st;
//        public StockSpanner() {
//        st=new ArrayDeque<>();
//     }   
//     public int next(int price) {
//         int span=1;
//         while(!st.isEmpty() && st.peek()[0]<=price){
//             span=span+st.pop()[1];
//            // st.pop();
//         }
//         st.push(new int[]{price,span});
//         return span;
//     }
// }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */


 //.... bruetforce approch....

 class StockSpanner {
    ArrayList<Integer> list= new ArrayList<>();
       public StockSpanner() {
       list=new ArrayList<>();
    }   
      public int next(int price){
        list.add(price);
        int span=0;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)<=price){
                span++;
            }
            else
                break;
        }
        return span;
        }
      }