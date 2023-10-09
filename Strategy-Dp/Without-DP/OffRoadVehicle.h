#ifndef OFFROADVEHICLE_H
#define OFFROADVEHICLE_H
#include<string>
#include "Vehicle.h"
using namespace std;

class OffRoadVehicle:public Vehicle{
    
    public:
     OffRoadVehicle();
     void drive();
};

#endif