class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ip = new StringBuilder ();
        for(char ch : address.toCharArray()){
            if(ch == '.'){
                ip.append("[.]");
            }else{
                ip.append(ch);
            }
        }
        return ip.toString();
    }
}