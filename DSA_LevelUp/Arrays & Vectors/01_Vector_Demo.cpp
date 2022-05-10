
#include <iostream>
#include <vector>
using namespace std;

int main() {
    // Methods of initializing
	vector<int> arr;
    vector<int> arr1 = {1, 12, 30, 4, 5};

    // Fill Constructor
    vector<int> arr2(10, 0); // 10 elements in the vector all with value 0

    //pop_back
    arr1.pop_back();

    //push_back
    arr1.push_back(10);
    arr1.push_back(20);

    cout<<arr1.size()<<endl;  // 6
    cout<<arr1.capacity()<<endl;  // 10

    // insert() to add element in the mid of vector
    // erase() to delete element from the mid of vector

    for(int i=0; i<arr2.size(); i++){
        cout<<arr2[i]<<" ";
    }

    //inbuilt sort function
    sort(arr1.begin(), arr.end()) //For vector
    // sort(arr, arr+n) //For array

	return 0;
}