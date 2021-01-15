package tube.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	static List<Integer> frequency(String s) {
        int[] res = new int[26];
        int len = s.length();
        int i = 0;
        while(i < len){
            int val = 0;
            if(i + 2 >= len || s.charAt(i + 2) != '#'){//single num
                val = s.charAt(i) - '0';
                res[val - 1]++;
                i++;
            }else if(s.charAt(i + 2) == '#'){//double num
                val = (s.charAt(i) - '0')*10 + (s.charAt(i + 1) - '0');
                res[val - 1]++;
                i = i + 3;
            }
            if(i < len)
            {
            if(s.charAt(i) == '(')
            {
            int freq = 0;
            i++;

            while(s.charAt(i)!=')')
            {

            freq=freq*10+(s.charAt(i) - '0');
            i++;
            }
            res[val - 1] += freq - 1;
            i++;
            }
            }
        }
        List<Integer> al = new ArrayList<Integer>();
        for(int x:res) {
        	al.add(x);
        }
        return al;
    }
	public static void main(String[] args) {
		List<Integer> ls = frequency("1226#24#");
		System.out.println(ls);
	}

}
