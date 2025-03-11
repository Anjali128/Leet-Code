class Solution {
    public String defangIPaddr(String address) {
        String mo ="";
        mo = address.replace("." , "[.]");
        return mo;
    }
}