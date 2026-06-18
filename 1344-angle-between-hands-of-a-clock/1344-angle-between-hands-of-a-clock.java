class Solution {
    public double angleClock(int hour, int minutes) {
        int val1=30*hour;
        double val2 = (11.0*minutes)/2;
        double res= Math.abs(val1-val2);
        if(res<=180){
            return res;
        }
        else{
            return 360-res;
        }
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna