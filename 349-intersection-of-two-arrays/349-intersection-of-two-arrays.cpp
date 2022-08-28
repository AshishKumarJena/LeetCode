class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> res;
        std::unordered_map<int, int> mp1, mp2;
        
        for (int n1 : nums1) {
            mp1[n1]++;
        }
        
        for (int n2 : nums2) {
            mp2[n2]++;
        }
        
        for (auto element : mp1){
            if (mp2.count(element.first))
                res.push_back(element.first);
        }
        
        return res;
    }
};