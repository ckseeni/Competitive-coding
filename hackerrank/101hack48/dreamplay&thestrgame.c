#include <bits/stdc++.h>

using namespace std;

signed main()
{
    //freopen("input.txt", "r", stdin);
    ios::sync_with_stdio(0);
    cin.tie(0);
    int t;
    cin >> t;
    cin.ignore();
    while(t--)
    {
        string s, p;
        getline(cin, s);
        getline(cin, p);
        int n = s.size();
        int m = p.size();
        int k = n - m;
        if(k < 0)
        {
            cout << "Steven" << endl;
        }
        else if(k % 2 == 1)
        {
            if(s.substr(k / 2, m) == p && s.substr(k / 2 + 1, m) == p)
                cout << "Amanda" << endl;
            else
                cout << "Steven" << endl;
        }
        else
        {
            if(s.substr(k / 2, m) == p || k > 0 && s.substr(k / 2 - 1, m) == p && s.substr(k / 2 + 1, m) == p)
                cout << "Amanda" << endl;
            else
                cout << "Steven" << endl;
        }

    }

}
