#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int trappedRainwater(vector<int> arr){
    int waterTrapped = 0;
    vector<int> leftHigh(arr.size(), 0);
    vector<int> rightHigh(arr.size(), 0);
    int maxHeight = 0;
    for(int i=0; i<arr.size(); i++){
        if(arr[i] > maxHeight){
            maxHeight = arr[i];
        }
        leftHigh[i] = maxHeight;
    }
    maxHeight = 0;
    for(int i=arr.size()-1; i>=0; i--){
        if(arr[i] > maxHeight){
            maxHeight = arr[i];
        }
        rightHigh[i] = maxHeight;
    }
    cout<<"Highest from Left: ";
    for(int i = 0; i<leftHigh.size(); i++){
        cout<<leftHigh[i]<<" ";
    }
    cout<<endl;
    cout<<"Highest from Right: ";
    for(int i = 0; i<rightHigh.size(); i++){
        cout<<rightHigh[i]<<" ";
    }
    for(int i=0; i<arr.size(); i++){
        waterTrapped += min(leftHigh[i], rightHigh[i]) - arr[i];
    }

    return waterTrapped;
}

int main() {
	vector<int> arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    auto trappedWater = trappedRainwater(arr);
    cout<<endl<<"Rainwater Trapped: "<<trappedWater<<" Units";
	return 0;
}