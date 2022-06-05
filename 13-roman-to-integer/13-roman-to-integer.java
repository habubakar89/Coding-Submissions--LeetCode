class Solution {
    public int romanToInt(String s) {

        int value = 0;
        
        //Declare a dictionary for storage
        HashMap<Character , Integer> dictionary = new HashMap<>();
        dictionary.put('I' , 1);
        dictionary.put('V' , 5);
        dictionary.put('X' , 10);
        dictionary.put('L' , 50);
        dictionary.put('C' , 100);
        dictionary.put('D' , 500);
        dictionary.put('M' , 1000);
        
        //Convert the roman to individual numbers in an array
        int[] values = new int[s.length()];
        for(int i = 0 ; i < values.length ; i++){
            values[i] = dictionary.get(s.charAt(i));
        }
        
        //Add or remove individual elements wrt their placements
        for(int i = 0 ; i < values.length ; i++){
           if(((i + 1) < values.length) && values[i] < values[i + 1]) value -= values[i];
            else value += values[i];
        }
        
        return value;
        
    }
}