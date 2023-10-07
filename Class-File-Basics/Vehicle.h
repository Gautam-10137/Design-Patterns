#ifndef VEHICLE_H
#define VEHICLE_H
#include<string>
using namespace std;

class Vehicle{
    private:
      int tyres;
      string name;
    public:
     Vehicle(int tyres=4,string name="car");
     int getTyres();
     string getName();
     void drives();
};

#endif