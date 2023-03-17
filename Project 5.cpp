// Project5.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include<string>
using namespace std;
const int maxSize = 7;
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
	cout << "3: to print your fitness history" << endl;
	cout << "4: to exit" << endl;

}
int getUserChoice()
{
	int options;
	bool invalidInput = true;
	do {
		cout << "Press 1, 2 or 3" << endl;
		cin >> options;
		if (cin.fail() || options < 1 || options>4)
		{
			cout << "Option 1, 2, 3, 4 is not selected. Please choose 1, 2, 3 or 4" << endl;
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
void input(double userweight[], double exercisetime[], string exercisetype[], int& count)
{
	if (count == maxSize)
	{
		for (int i = 1; i < maxSize; i++)
		{
			userweight[i - 1] = userweight[i];
			exercisetime[i - 1] = exercisetime[i];
			exercisetype[i - 1] = exercisetype[i];
		}
	count--;
}
	cout << "Weight in kg: ";
	cin >> userweight[count];
	while (cin.fail())
	{
		cout << "Enter only numeric values!" << endl;
		cout << "Weight in kg: ";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> userweight[count];
	}
	cout << "Exercise type: ";
	cin.ignore();
	getline(cin, exercisetype[count]);
	cout << "Exercise time: ";
	cin >> exercisetime[count];
	while (cin.fail())
	{
		cout << "Input is not valid! Enter only numeric values!" << endl;
		cout << "Exercise time: ";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> exercisetime[count];
	}
	count++;
}
void print(const string& username, const string& usergender, const int& userage, const double userweight,
	const double exercisetime, const string exercisetype, const int& index)
{
	cout << "   " << username << "(" << usergender << "," << userage << ")" << endl;;
	cout << "Weight: " << userweight << "kg" << endl;
	cout << "Exercise: " << exercisetype << " " << "(" << exercisetime << " minutes" << ")" << endl;
}
void printHistory(const string& username, const string& usergender, const int& userage, const double userweight[], const double exercisetime[], const string exercisetype[], const int& count)
{
	cout << "Fitness History: " << username << "(" << usergender << "," << userage << ")" << endl;
	int index =  max(count - maxSize,0);
	int index2 = count;
	if (index < count)
	for (int i = index; i < index2; i++)
	{
		print(username, usergender, userage, userweight[i], exercisetime[i], exercisetype[i], i);
	}
}

int main()
{
	string username;
	string usergender;
	int userage;
	getUserInfo(username, usergender, userage);
	double userweight[maxSize];
	double exercisetime[maxSize];
	string exercisetype[maxSize];
	int count = 0;
	int options = 0;
	do {
		printMenu();
		options = getUserChoice();
		switch (options) {
		case 1:
			input(userweight, exercisetime, exercisetype, count);
			break;
		case 2:
			if (exercisetime[0] != 0.0) {
				print(username, usergender, userage, userweight[0], exercisetime[0], exercisetype[0], count);
			}
			else
			{
				cout << "Data not entered" << endl;
			}
			break;
		case 3:
			printHistory(username, usergender, userage, userweight, exercisetime, exercisetype, count);
			break;
		}
	} while (options == 1 || options == 2 || options == 3);
	return 0;
}

