#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

int calcLongestBand(vector<int> arr){
    unordered_set<int> set;
    for(int i=0; i<arr.size(); i++){
        set.insert(arr[i]);
    }
    int longestBand = 0;
    int currentBandLength = 0;
    int start;
    for(int i=0; i<arr.size(); i++){
        if(set.find(arr[i]-1) != set.end()){
            // arr[i] is not band origin
            continue;
        } else{
            // arr[i] is band origin
            start = arr[i];
            cout<<"Band Start: "<<start<<endl;
            while(set.find(start) != set.end()){
                cout<<start<<" ";
                currentBandLength++;
                start++;
            }
            cout<<endl;
            if(currentBandLength > longestBand){
                longestBand = currentBandLength;
                currentBandLength = 0;
            }
        }
    }

    return longestBand;
}

int main() {
	vector<int> arr = {1, 9, 3, 0, 18, 5, 2, 4, 10, 7, 12, 6};
    auto longestBand = calcLongestBand(arr);
    cout<<"Length of Longest band: "<<longestBand;
	return 0;
}