#include <iostream>
#include <vector>
#include <deque>
#include <cstring>
#include <algorithm>
#include <cmath>
#include "integer.h"
typedef long long int llint;
//using namespace std;
const binteger zero(0);//used for 负数
const binteger one(1);//used for judging
const binteger ten(10);//used for dividing
//here lies the defination for construction functions
/*
 *codes here have no problems 
 * 
 * used for creating a binteger
 */
using std::deque;
binteger::binteger()
{
    sign = true;
}
binteger::binteger(int p)
{
    if(p >= 0) sign = true;
    else
    {
        sign = false;
        p *= -1;
    }
    do
    {
        num.push_back((char)(p % 10 + '0'));//turn integer into binteger
        p /= 10;
    } while (p != 0);
    simplify();
}
void binteger::simplify()
{
    vector<char>::reverse_iterator it = num.rbegin();//use iterator
    while (!num.empty() && *it == '0')
    {
        num.pop_back();
        it = num.rbegin();
    }//delete all the useless zeros
    if(num.empty())
    {
        sign = true;
        num.push_back('0');
    }
    
}
binteger::binteger(string &arr)
{
    sign = true;
    for(string::reverse_iterator it = arr.rbegin(); it < arr.rend(); it++)
    {
        if(it == arr.rend() - 1)
        {
            if(*it == '+') break;
            else if(*it == '-')
            {
                sign = false;
                break;
            }//define the sign
        }
        num.push_back(*it);
    }
    simplify();
}
binteger::binteger(const binteger &number)
{
    sign = number.sign;
    num = number.num;
}//copy
/*codes here are used for overriding operator
 * 
 * these are "="
 */
binteger binteger::operator=(const binteger &number)
{
    sign = number.sign;
    num = number.num;
    return *this;
}
binteger binteger::operator=(const llint& obj)
{
    sign = (obj >= 0);
    num = binteger(obj).num;
    return *this;
}
/*codes here are used for overriding operator
 * 
 * these are bool
 */
bool operator<(const binteger& va, const binteger& vb)
{
    if(va.sign != vb.sign) return !va.sign;
    else
    {
        if(va.num.size()!=vb.num.size())
            return (va.sign && (va.num.size() < vb.num.size()))||(!va.sign && va.num.size() > vb.num.size());
        vector<char>::const_reverse_iterator it1, it2;
        it1 = va.num.rbegin();
        it2 = vb.num.rbegin();
        while(it1 != va.num.rend())
        {
            if((va.sign && *it1 < *it2) || (!va.sign && *it1 > *it2)) return true;//one is smaller for +
            if((va.sign && *it1 > *it2) || (!va.sign && *it1 < *it2)) return false;
            it1++;
            it2++;
        }
        return false;
    }
}

bool operator==(const binteger& va, const binteger& vb)
{
    if(va.sign != vb.sign || va.num.size() != vb.num.size()) return false;
    vector<char>::const_reverse_iterator it1, it2;
    it1 = va.num.rbegin();
    it2 = vb.num.rbegin();
    while(it1 != va.num.rend())
    {
        if(*it1 != *it2) return false;
        it1++;
        it2++;
    }
    return true;
}
bool operator!=(const binteger& va, const binteger& vb)
{
    return !(va == vb);
}
bool operator>=(const binteger& va, const binteger& vb)
{
    return (va > vb) || (va == vb);
}
bool operator<=(const binteger& va, const binteger& vb)
{
    return (va < vb) || (va == vb);
}
bool operator>(const binteger& va, const binteger& vb)
{
    return !(va <= vb);
}
/*codes here are used for overriding operator
 * 
 * these are + - * / % += -= etc.
 */
binteger operator+(const binteger& va, const binteger& vb)
{
    binteger bk;
    if(va.sign != vb.sign)
    {
        bk = va - (zero - vb);
        return bk;
    }
    bk.sign = va.sign;
    vector<char>::const_iterator it1, it2;
    it1 = va.num.begin();
    it2 = vb.num.begin();
    int pls = 0;
    while(it1 != va.num.end() && it2 != vb.num.end())
    {
        int tmp = pls + *it1 - '0' + *it2 - '0';
        pls = tmp / 10;
        bk.num.push_back(char(tmp%10 + '0'));
        it1++;
        it2++;
    }
    while(it1 != va.num.end())
    {
        int tmp = pls + *it1 - '0';
        pls = tmp / 10;
        bk.num.push_back(char(tmp%10 + '0'));
        it1++;
    }
    while(it2 != vb.num.end())
    {
        int tmp = pls + *it2 - '0';
        pls = tmp / 10;
        bk.num.push_back(char(tmp%10 + '0'));
        it2++;
    }
    if(pls != 0) bk.num.push_back(char(pls + '0'));
    bk.simplify();
    return bk;
}

binteger operator-(const binteger& va, const binteger& vb)
{
    binteger bk;
    if(va == zero)
    {
        if(vb == zero) return zero;
        bk.num = vb.num;
        bk.sign = !vb.sign;
    }
    else if(vb == zero)
    {
        bk = va;
    }
    else if(va.sign != vb.sign)
    {
        bk = va + (zero - vb);
    }
    else if(va == vb)
    {
        bk = zero;
    }
    else
    {
        if((va.sign && va > vb) || (!va.sign && va < vb))
        {
            bk.sign = va.sign;
            vector<char>::const_iterator it1, it2;
            it1 = va.num.begin();
            it2 = vb.num.begin();
            int minus = 0;
            while (it1 != va.num.end() && it2 != vb.num.end())
            {
                int tmp = *it1 - *it2 -minus;
                minus = 0;
                if(tmp < 0)
                {
                    tmp += 10;
                    minus = 1;
                }
                bk.num.push_back(char(tmp + '0'));
                it1++;
                it2++;
            }
            while (it1 != va.num.end())
            {
                int tmp = *it1 -'0' - minus;
                minus = 0;
                if(tmp < 0)
                {
                    tmp += 10;
                    minus = 1;
                }
                bk.num.push_back(char(tmp + '0'));
                it1++;
            }
            bk.simplify();  
        }
        else
        {
            bk = zero - (vb - va);
        } 
    }
    return bk;
}
/*
 *this is the end of plus and minus
 * 
 * in the later section, the problem is to deal with multiply and divide
 * 
 * 
 */
binteger operator*(const binteger& va, const binteger& vb)
{
    binteger bk;
    if(va == zero || vb == zero) bk = zero;
    else
    {
        bk.sign = (va.sign == vb.sign);
        int i, j, ansij, len;
        bool size = ((*va.num.end() - '0') * (*vb.num.end() - '0') >= 10);
        len = va.num.size() + vb.num.size() + (int)size;
        vector<char> ans(len, '0');
        for(i = 0; i < va.num.size(); i++)
        {
            for(j = 0; j < vb.num.size(); j++)
            {
                ansij = (va.num[i] - '0') * (vb.num[j] - '0') + ans[i+j] - '0';
                ans[i+j+1] += ansij/10;
                ans[i+j] = ansij%10 + '0';
            }
        }//codes here copied from my earlier homework, so its function may be a little lower
       bk.num = ans;
       bk.simplify();
        
    }
    return bk;
}
binteger operator/(const binteger& va, const binteger& vb)
{
    if(vb == zero) return zero;
    binteger bk;
    if(va.num == vb.num)
    {
        bk = one;
        bk.sign = (va.sign == vb.sign);
    }
    else if(va.sign != vb.sign)
    {
        binteger tmp = vb;
        tmp.sign = !vb.sign;
        if(va - (va / tmp) * tmp == zero)
        {
            bk = va / tmp;
        }
        else bk = va / tmp + one;
        bk.sign = 0;
    }
    else
    {
        if(va.num.size() < vb.num.size())
        {
            bk = zero;
        }
        else
        {
            bk.sign = true;
            deque<char> ans;
            vector<char>::const_reverse_iterator it = va.num.rbegin();
            binteger part = zero;
            binteger div = vb;
            div.sign = 1;
            while (it != va.num.rend())
            {
                part = part * ten + binteger(int(*it - '0'));//ican'tusec
                int divide = 0;
                while(part >= div)
                {
                    part = part - div;
                    divide++;
                }//for regulation of integer, divide won't be more than 10
                ans.push_front(divide + '0');
                it++;
            }
            vector<char> ret(ans.begin(), ans.end());
            bk.num = ret;
            bk.simplify();
        }
        
    }
    return bk;

}
binteger operator%(const binteger& va, const binteger& vb)
{
    if(vb == zero) return zero;
    return (va -(va / vb) * vb);
}
binteger operator+=(binteger& va, const binteger& vb)
{
    va = va + vb;
    return va;
}
binteger operator-=(binteger& va, const binteger& vb)
{
    return va = va - vb;
}
binteger operator*=(binteger& va, const binteger& vb)
{
    return va = va * vb;
}
binteger operator/=(binteger& va, const binteger& vb)
{
    return va = va / vb;
}
binteger operator%=(binteger& va, const binteger& vb)
{
    return va = va % vb;
}
/* this it the end of caculation part
 *
 * 
 * now it goes input and output
 */
istream& operator>>(istream& is, binteger& number)
{
    string str;
    is >> str;
    number = binteger(str);
    return is;
}
ostream& operator<<(ostream& os, const binteger& number)
{
    if(!number.sign) os << '-';
    vector<char>::const_reverse_iterator it;
    for(it = number.num.rbegin(); it != number.num.rend(); it++)
    {
        os << *it;
    }
    return os;
}