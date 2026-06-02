class Solution {
public:
    int earliestFinishTime(vector<int>& landStartTime, vector<int>& landDuration, vector<int>& waterStartTime, vector<int>& waterDuration) {
        int n=landStartTime.size();
        int m=waterStartTime.size();
        int l=INT_MAX;
        int w = INT_MAX;
        int l_w= INT_MAX;
        int w_l=INT_MAX;

        for(int i=0;i<n;i++){
            l = min(l, landStartTime[i]+landDuration[i]);
        }
        for(int i=0;i<m;i++){
            w=min(w, waterStartTime[i]+waterDuration[i]);
            l_w = min(l_w, max(waterStartTime[i],l)+waterDuration[i]);
        }
        for(int i=0;i<n;i++){
            w_l=min(w_l, max(landStartTime[i],w)+landDuration[i]);
        }
        return min(l_w,w_l);
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna