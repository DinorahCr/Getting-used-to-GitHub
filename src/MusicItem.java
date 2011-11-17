// MusicItem.java
//
// ICS 21: Lab Assignment 4
//
// Originally implemented by Norm Jacobson
// Minor modifications introduced by Alex Thornton, Summer 2009
// Minor modifications for ICS 21 Fall 2009 by Norman Jacobson, September 2009

import java.util.ArrayList;

//A MusicItem stores the three pieces of information that the program
//knows about a music item: its accession number, its title, and its
//media type.

public class MusicItem 

{
	private String accessionNumber;
	private String title;
	private String mediaType;
	

	// This constructor initializes a MusicItem using an ArrayList of
	// Strings, where the first element in the ArrayList is assumed to
	// be the accession number, the second element is the title, and
	// the third element is the media type.
	public MusicItem(ArrayList<String> itemFields)
	{
		accessionNumber = itemFields.get(0);
		
		title = itemFields.get(1);
		
		mediaType = itemFields.get(2);
	}
	

	// Accessor methods
	
	public String getAccessionNumber()
	{
		return accessionNumber;
	}
	
	
	public String getTitle()
	{
		return title;
	}
	
	
	public String getMediaType()
	{
		return mediaType;
	}
}
