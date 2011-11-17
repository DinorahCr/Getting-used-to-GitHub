// Bucket.java
//
// ICS 21: Lab Assignment 4
//
//
// Originally implemented by Norman Jacobson
// Minor modifications introduced by Alex Thornton, Summer 2009
// Minor modifications for ICS 21 Fall 2009 by Norman Jacobson, September 2009


import java.util.ArrayList;

//A Bucket is one of the sublists that make up a music list.  Each bucket
//contains a list of music items whose titles begin with the same letter,
//with the items in that bucket sorted in ascending order by title.

public class Bucket
{
	// The items in this bucket
	private ArrayList<MusicItem> items;
	
	
	// This constructor initializes the bucket to be empty
	public Bucket()
	{
		items = new ArrayList<MusicItem>();
	}
	

	// addItem() places an item into a bucket in its proper (sorted) place.
	// 
	// Note that the solution to this problem revolves around the fact that
	// the bucket is, at any given time, sorted already.  So, the goal is to
	// find the appropriate place to insert the new item.  The
	// following algorithm (there are others) will accomplish that task:
	//
	// * Go through the list until you find an item whose title is greater
	//   than the title of the item you want to add.
	// * When you find such an item, add the new item just before the item
	//   where you stopped searching.
	// * If you get all the way through the list and don't find an item whose
	//   title is greater than the title of the item you want to add, add the
	//   new item to the end of the list.
	public void addItem(MusicItem itemToAdd)
	{

		for (int i = 0; i < items.size(); i++)
		{
			if(items.get(i).getTitle().compareTo(itemToAdd.getTitle()) > 0)
			{
				items.add(i, itemToAdd);
				return;
			}
		}
		
		items.add(itemToAdd);
	}
	

	// getItems() returns the list of items in this bucket.
	public ArrayList<MusicItem> getItems()
	{
		return items;
	}
}

