class Solution {
public double solution(int[] arr) {
double park = 0;
double jin = 0;
for(int i = 0; i<arr.length; i++){
jin += arr[i];
}
park = jin /arr.length;
return park;
}
}