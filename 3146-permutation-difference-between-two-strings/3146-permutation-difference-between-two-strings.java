class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character , Integer> ss = new HashMap <> ();
        //HashMap<String , Integer> st = new HashMap <> (); 
        for(int i=0; i<s.length(); i++) {
            ss.put(s.charAt(i) , i);
        }
        int per=0;
        for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            per = per+Math.abs(i - ss.get(ch));
        }
        return per;
    }
}