#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

vector<vector<int>> sumTriplet(vector<int> arr, int sum){
    vector<vector<int>> result = {};
    
    for(int i=0; i<arr.size()-2; i++){
        int first_idx = i;
        int second_idx = i+1;
        int third_idx = arr.size()-1;

        // Two pointer approach

        while(second_idx < third_idx){
            if(arr[first_idx] + arr[second_idx] + arr[third_idx] == sum){
                vector<int> triplet;
                triplet.push_back(arr[first_idx]);
                triplet.push_back(arr[second_idx]);
                triplet.push_back(arr[third_idx]);
                result.push_back(triplet);
                second_idx++;
                third_idx--;
            } else if(arr[first_idx] + arr[second_idx] + arr[third_idx] < sum){
                second_idx++;
            } else if(arr[first_idx] + arr[second_idx] + arr[third_idx] > sum){
                third_idx--;
            }
        }
    }
    return result;
}

int main() {
	vector<int> arr = {2, 4, 1, 7, 6, 3, 5, 8, 15, 9};
    int targetSum = 18;
    sort(arr.begin(), arr.end());
    auto triplet = sumTriplet(arr, targetSum);
    if(triplet.size() != 0){
        cout<<"Triplet Found"<<endl;
        for(int i=0; i<triplet.size(); i++){
            for(int number: triplet[i]){
                cout<<number<<" ";
            }
            cout<<endl;
        }
    }else{
        cout<<"Triplet Not Found";
    }
	return 0;
}