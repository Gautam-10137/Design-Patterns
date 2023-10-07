#include<iostream>
using namespace std;
#include "Vehicle.h"

int main(){
    Vehicle v(2,"Cycle");
    cout<<v.getTyres()<<endl;
    cout<<v.getName()<<endl;


    return 0;
}


// command to run 
// -> to compile  all class files together and run and store output in 1 file
//   g++ main.cpp Vehicle.cpp -o output


// to make object file  command  g++ -c  Vehicle.cpp

// to add object file of classes to main file and run main file for output
// command : g++ -o main.exe main.cpp Vehicle.o     and run command -> ./main
