// MusicArchive.java
//
// ICS 21: Lab Assignment 4
//
// Originally implemented by Norman Jacobson
// Minor modifications introduced by Alex Thornton, Summer 2009
// Minor modifications for ICS 21 Fall 2009 by Norman Jacobson, September 2009
//
// This is the class to execute when you want to run the program.
// It creates a MusicManager and asks it to do its work.
//
// You will not need to modify this code.


public class MusicArchive
{
	public static void main(String[] args)
	{
		MusicManager musicManager = new MusicManager();
		musicManager.makeIndexAndDisplayCounts();
	}
}
