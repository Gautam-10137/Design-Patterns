#include "Vehicle.h"
#include<iostream>

using namespace std;

// Note :: is the scope resolution operator used to define member function in outside the class

// defaut constructor
Vehicle::Vehicle(int tyres,string name):tyres(tyres),name(name){ }

void Vehicle::drives(){ cout<<"Furious Speed"<<endl;}

string Vehicle::getName() { return name;}
int Vehicle::getTyres(){return tyres;}

