#include <iostream>
#include <vector>
#include <cstring>
#include <deque>

//using namespace std;
typedef long long int llint;
#ifndef _integer_h
#define _integer_h
using std::ostream;
using std::vector;
using std::string;
using std::istream;
class binteger
{
    friend binteger operator+(const binteger&, const binteger&);
    friend binteger operator-(const binteger&, const binteger&);
    friend binteger operator*(const binteger&, const binteger&);
    friend binteger operator/(const binteger&, const binteger&);
    friend binteger operator%(const binteger&, const binteger&);
    friend binteger operator+=(binteger&, const binteger&);
    friend binteger operator-=(binteger&, const binteger&);
    friend binteger operator*=(binteger&, const binteger&);
    friend binteger operator/=(binteger&, const binteger&);
    friend binteger operator%=(binteger&, const binteger&);
    friend bool operator==(const binteger&, const binteger&);
    friend bool operator<=(const binteger&, const binteger&);
    friend bool operator>=(const binteger&, const binteger&);
    friend bool operator<(const binteger&, const binteger&);
    friend bool operator>(const binteger&, const binteger&);
    friend bool operator!=(const binteger&, const binteger&);
    friend ostream& operator<<(ostream&, const binteger&);
    friend istream& operator>>(istream&, binteger&);//operator overrides are upper here

private:
    vector<char> num;//save numbers as char
    bool sign;//sign + or -
    void simplify();//deal with numbers that begin with zero
public:
    binteger(int p);
    binteger(string &arr);
    binteger(const binteger &number);
    binteger();//construction formula

    binteger operator=(const binteger &number);//override for =
    binteger operator=(const llint&);//override partII
    operator double () const
    {
        double bk = 0;
        for(int i = num.size() - 1; i >= 0; i--)
        {
			bk *= 10;
            bk += double(num[i] - '0');
        }
        if(!sign) bk = -bk;
        return bk;
    }
    operator int () const
    {
        int bk = 0;
        for(int i = num.size() - 1; i >= 0; i--)
        {
			bk *= 10;
            bk += int(num[i] - '0');
        }
        if(!sign) bk = -bk;
        return bk;
    }
    operator bool () const
    {
        return !(num.size() == 1 && num[0] == '0');
    }
    operator string () const
    {
        char ob[num.size()];
        int i = 0;
        //string bk;
        vector<char>::const_reverse_iterator it;
        for(it = num.rbegin(); it < num.rend(); it++)
        {
            ob[i] = *it;
            i++;
        }
        string bk(ob, 0, num.size());
        if(!sign) bk = '-' + bk;

        return bk;
    }
    /*void print()//test code
    {
        vector<char>::reverse_iterator it;
        for(it = num.rbegin(); it < num.rend(); it++) cout << double(*it - '0');
    }
    bool signf()
    {
        return sign;
    }*/

};
/*
 *
 *
 */

#endif
