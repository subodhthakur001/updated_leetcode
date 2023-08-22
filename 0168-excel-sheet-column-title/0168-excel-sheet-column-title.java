class Solution {
    public String convertToTitle(int columnNumber) {
        String result = "";
        while(columnNumber>0){
            int ch = 'A' + (columnNumber-1) % 26;
            char c= (char)ch;
            result = c + result;
            columnNumber = (columnNumber-1)/26;
        }
        return result;
    }
}