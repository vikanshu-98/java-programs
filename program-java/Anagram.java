
public class Anagram {
	public static void main(String args[])
	{boolean anagram=true;
		String a="vika@@@s";
		String b="kisaffjv";
		//Anagram
		int []f=new int[256];
		int []s=new int[256];
	char ch[]=	a.toCharArray();
	for(char c:ch) {
	int temp=(int)c;
	f[temp]++;
	
	}
	char c[]=b.toCharArray();
	for(char se:c) {
		int temp=(int)se;
		s[temp]++;
		
		}	
for(int i=0;i<255;i++)
{
	if(f[i]!=s[i]) {
		anagram=false;
	     break;}
	}
if(anagram)System.out.println("Anagram");
else System.out.println("not anagram");
		
		
	}
}
