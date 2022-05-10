#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> mountain(vector<int> arr){
    vector<int> mountainLengths = {};
    int peak_idx, left_idx, right_idx;

    for(int i=1; i<arr.size()-1; i++){
        if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
            peak_idx = i;
            
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[j+1]){
                    left_idx = j;
                } else{
                    break;
                }
            }

            for(int j=i+1; j<arr.size(); j++){
                if(arr[j]<arr[j-1]){
                    right_idx = j;
                } else{
                    break;
                }
            }

            int mountainLength = right_idx - left_idx + 1;
            mountainLengths.push_back(mountainLength);
        }
    }

    return mountainLengths;
}

int main() {
	vector<int> arr = {5, 6, 1, 2, 3, 4, 5, 4, 3, 2, 0, 1, 2, 3, -2, 4};
    auto mountainLengths = mountain(arr);
    cout<<"Mountain Lengths: ";
    for(int i=0; i<mountainLengths.size(); i++){
        cout<<mountainLengths[i]<<" ";
    }
    cout<<endl;
    cout<<"Max Length of Mountain: "<<*max_element(mountainLengths.begin(), mountainLengths.end());
	return 0;
}