class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int e1s = Integer.parseInt(event1[0].substring(0,2))*60 + Integer.parseInt(event1[0].substring(3));
        int e1e = Integer.parseInt(event1[1].substring(0,2))*60 + Integer.parseInt(event1[1].substring(3));
        int e2s = Integer.parseInt(event2[0].substring(0,2))*60 + Integer.parseInt(event2[0].substring(3));
        int e2e = Integer.parseInt(event2[1].substring(0,2))*60 + Integer.parseInt(event2[1].substring(3));
        
        if(e1s < e2s){
            if(e2s <= e1e){
                return true;
            }
        }
        else{
            if(e1s <= e2e){
                return true;
            }
        }
        return false;

        
        
    }
}
