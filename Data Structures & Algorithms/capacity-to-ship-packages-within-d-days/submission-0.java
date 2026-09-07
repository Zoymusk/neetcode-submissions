class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,h=0;
        for(int w: weights){
            l= Math.max(l,w);
            h += w;
        }
        while(l<h){
            int m= l+(h-l)/2;
            if(dn(weights,m)<=days){
                h=m;
            }else{
                l=m+1;
            }
        }
        return l;
    }
    private int dn(int[] weights,int c){
        int days=1;
        int cl=0;
        for(int w:weights){
            if(cl+w>c){
                days++;
                cl=0;
            }
            cl +=w;
        }
        return days;
    }
}