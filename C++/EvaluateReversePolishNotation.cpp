// #include<iostream>
// #include<vector>
// #include<algorithm>
class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> st;
        for(string a: tokens){
            if(a=="+"){
                int val1,val2;
                val1=st.top();
                st.pop();
                val2=st.top();
                st.pop();
                st.push(val1+val2);
            }else if(a=="-"){

                int val1,val2;
                val1=st.top();
                st.pop();
                val2=st.top();
                st.pop();
                st.push(val2-val1);
            }else if(a=="*"){

                int val1=st.top();
                st.pop();
                int val2=st.top();
                st.pop();
                st.push(val1*val2);
            }else if(a=="/"){

                int val1,val2;
                val1=st.top();
                st.pop();
                val2=st.top();
                st.pop();
                st.push(val2/val1);
            }else{
                st.push(stoi(a));
            }
        }
        return st.top();
    }
};