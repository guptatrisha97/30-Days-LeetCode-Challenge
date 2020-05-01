/*Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.*/

class Solution {
    public boolean backspaceCompare(String S, String T) {
        int t=S.length();
        String s1="",s2="";
        Stack <Character> stacks = new Stack<Character>();
        for(int i=0;i<t;i++){
            char a = S.charAt(i);
            if(a!='#'){
                stacks.push(a);
            } else {
                if(!stacks.isEmpty()){
                    stacks.pop();
                }
            }
            }

        while(!stacks.isEmpty()){
        s1=s1+stacks.pop();}
        System.out.print("s1="+s1);

        int p=T.length();
        Stack <Character> stacks1 = new Stack<Character>();
        for(int i=0;i<p;i++){
            char a = T.charAt(i);
            if(a!='#'){
                            stacks1.push(a);
            }else{
                     if(!stacks1.isEmpty()){
                    stacks1.pop();
                }
            }
        }
    while(!stacks1.isEmpty()){
        s2=s2+stacks1.pop();
    }
        System.out.print("s2="+s2);
        if(s1.equals(s2)){
        return true;
    } else{
            return false;
        }
    }
}
