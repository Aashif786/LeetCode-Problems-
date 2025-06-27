// Last updated: 6/27/2025, 11:44:31 AM
import java.util.ArrayList;
import java.util.List;

class Solution{
public List<Integer>spiralOrder(int[][]m){
    List<Integer>res=new ArrayList<>();
    if(m==null||m.length==0||m[0].length==0)return res;

    int l=0,t=0,r=m[0].length,b=m.length;

    while(l<r&&t<b){
        for(int i=l;i<r;i++) res.add(m[t][i]);
        t++;

        for(int i=t;i<b;i++) res.add(m[i][r-1]);
        r--;

        if(t<b){
            for(int i=r-1;i>=l;i--) res.add(m[b-1][i]);
            b--;
        }

        if(l<r){
            for(int i=b-1;i>=t;i--) res.add(m[i][l]);
            l++;
        }
    }
    return  res;
    }
}