class Solution {
    public int reverse(int x) {
        boolean negative = false;
long reverse = 0;
if(x < 0){
x = -1 * x;
negative = true;
} else if (x == 0) {
return 0;
}
while (x > 0){
int pop = x % 10;
reverse = reverse * 10 + pop;
x = x / 10;
}
if(reverse > Integer.MAX_VALUE){
return 0;
}
if(negative == true){
return (int)(-1 * reverse);
}else {
return (int)reverse;
}


    }
}