#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

vector<int> sumPair(vector<int> arr, int sum){
    vector<int> result = {};
    unordered_set<int> set;

    for(int i=0; i<arr.size(); i++){
        int x = sum - arr[i];
        if(set.find(x) != set.end()){
            result.push_back(x);
            result.push_back(arr[i]);
            return result;
        }
        set.insert(arr[i]);
    }
    return result;
}

int main() {
	vector<int> arr = {-2, 4, -5, 10, 6};
    int sum = 4;
    auto pair = sumPair(arr, sum);
    if(pair.size() != 0){
        cout<<"Pair Found: "<<pair[0]<<" "<<pair[1];
    }else{
        cout<<"Pair Not Found";
    }
	return 0;
}
