class Solution {
    public boolean hasAlternatingBits(int n) {
        
        n = n ^ (n >>> 1);
        return (n & (n+1)) ==0 ;
        
//         int cur =0; 
//         int per = -1;
//         while(n!=0){
//             cur = n&1;
//             if(cur == per) return false;
            
//             n >>>=1;
//             per = cur ;
//         }
//         return true;
                
        
    }
}
