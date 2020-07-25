package com.vnrvjiet.Preethi.Junit_epam;

public class CheckFirst2Chars {
	public String Check(String string)
	{
		String result="";
		int Length=string.length();
		char First=string.charAt(0);
		char Second=string.charAt(1);
		if(First!='A')
			result=result+First;
		if(Second!='A')
			result=result+Second;
		result=result+string.substring(2,Length);
		return result;
	}
}
