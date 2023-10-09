#ifndef SPORTSVEHICLE_H
#define SPORTSVEHICLE_H
#include<string>
#include "Vehicle.h"
using namespace std;

class SportsVehicle: public Vehicle{
    
    public:
     SportsVehicle();
     void drive();
};

#endif