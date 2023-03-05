// Project4.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<string>
using namespace std;
void getUserInfo(string& username, string& usergender, int& userage)
{
	cout << "Personal Fitness Application\n";
	cout << "Name: ";
	getline(cin, username);
	cout << "Gender: ";
	cin >> usergender;
	cout << "Age: ";
	cin >> userage;
	while (cin.fail())
	{
		cout << "Input is not valid! Enter only numeric values!" << endl;
		cout << "Age:";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> userage;
	}
}
void printMenu()
{
	cout << "Use the menu below:" << endl;
	cout << "1: to enter your information" << endl;
	cout << "2: to print your information" << endl;
	cout << "3: to exit" << endl;
}
int getUserChoice()
{
	int options;
	bool invalidInput = true;
	do {
		cout << "Press 1, 2 or 3"<<endl;
		cin >> options;
		if (cin.fail() || options < 1 || options>3) 
		{
			cout << "Option 1 is not selected. Please choose 1, 2 or 3" << endl;
			cin.clear();
			cin.ignore(10000, '\n');
		}
		else
		{ 
			invalidInput = false;
		}
	} while (invalidInput);
	return options;
}
void input(double& userweight, double& exercisetime, string& exercisetype)
{
	cout << "Weight in kg: ";
	cin >> userweight;
	while (cin.fail())
	{
		cout << "Enter only numeric values!" << endl;
		cout << "Weight in kg: ";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> userweight;
	}
	cout << "Exercise type: ";
	cin.ignore();
	getline(cin, exercisetype);
	cout << "Exercise time: ";
	cin >> exercisetime;
	while (cin.fail())
	{
		cout << "Input is not valid! Enter only numeric values!" << endl;
		cout << "Exercise time: ";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> exercisetime;
	}
}
void print(const string& username,const string& usergender, const int& userage,  const double& userweight,
 const double& exercisetime, const string& exercisetype) 
{
	cout << "   " << username << "(" << usergender << "," << userage << ")" << endl;;
	cout << "Weight: " << userweight << "kg" << endl;
	cout << "Exercise: " << exercisetype << " " << "(" << exercisetime << " minutes" << ")" << endl;
}

int main()
{
	string username;
	string usergender;
	int userage;
	getUserInfo(username, usergender, userage);
	double userweight = 0.0;
	double exercisetime = 0.0;
	string exercisetype;

	int options = 0;
	do {
		printMenu();
		options = getUserChoice();
		switch (options) {
		case 1:
			input(userweight, exercisetime, exercisetype);
			break;
		case 2:
			if (exercisetime != 0.0) {
				print(username, usergender, userage, userweight, exercisetime, exercisetype);
			}
			else
			{
				cout << "Data not entered" << endl;
			}
			break;
		}
	} 
	while (options==1||options==2);
	}


	