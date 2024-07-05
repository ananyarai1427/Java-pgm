package Stack;
import java.util.*;
import java.util.Stack;
class StackImpl
{
public String infixToPostfix(String s)
{
Stack<Character> st=new Stack<Character>();
String postfix="";
char ch[]=s.toCharArray();
for(char c :ch)
{
if(c!='+'&&c!='-'&&c!='*'&&c!='/'&&c!='('&&c!=')')
postfix=postfix+c;
else if(c=='(')
st.push(c);
else if(c==')')
{
while(!st.isEmpty())
{
char t=st.pop();
if(t!='(')
postfix=postfix+t;
else
break;
}}
else if(c=='+'||c=='-'||c=='*'||c=='/')
{
if(st.isEmpty())
st.push(c);
else
{
while(!st.isEmpty())
{
char t=st.pop();
if(t=='(')
{
st.push(t);
break;
}
else if(t=='+'||t=='-'||t=='*'||t=='/')
{
if(getPriority(t)<getPriority(c))
{
st.push(t);
break;
}
else
postfix=postfix+t;
}
}
st.push(c);
}
}
}
while(!st.isEmpty())
postfix=postfix+st.pop();
return postfix;
}
public int getPriority(char c)
{
if(c=='+'||c=='-')
return 1;
else
return 2;
}
public class StackApp
{
public void main(String[] args)
{
Scanner sc=new Scanner(System.in);
StackImpl a=new StackImpl();
String s1="";
s1=s1+a;
String ss=sc.next();
infixToPostfix(ss);
System.out.println(s1);
}
}
}