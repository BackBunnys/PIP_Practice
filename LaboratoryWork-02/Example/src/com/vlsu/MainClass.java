package com.vlsu;

import com.vlsu.util.UtilClass;

public class MainClass
{
	public static void main(String[] args)
	{
		System.out.println("The main class started successfully");
		UtilClass uc = new UtilClass();
		System.out.println("The answer to all questions of life is: " +
						   uc.getAnswer());
	}
}