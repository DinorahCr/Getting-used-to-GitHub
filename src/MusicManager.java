// MusicManager.java
//
// ICS 21: Lab Assignment 4
//
// Originally implemented by Norm Jacobson
// Minor modifications introduced by Alex Thornton, Summer 2009


import java.util.ArrayList;

//A MusicManager is in charge of coordinating the process of making an
//index, writing it into an index file, and displaying the final counts.

public class MusicManager
{
	// These constants specify the names of the music file and index file,
	// respectively.
	private static final String MUSIC_FILE_NAME = "music.txt";
	private static final String INDEX_FILE_NAME = "index.txt";
	
	// The music and index files
	private MusicFile musicFile;
	private IndexFile indexFile;

	// The data structure used to sort the music items by title
	private MusicList musicList;
	

	// This constructor initializes the music file, index file, and
	// music list, but does nothing else.
	public MusicManager()
	{
		 musicFile = new MusicFile();  
		 
		 indexFile =  new IndexFile(); 
		 musicList =  new MusicList();
		
	}
	

	// makeIndexAndDisplayCounts() makes the music index, writes it
	// to the index file, and displays the counts. It also writes
	// status messages to the console as needed.
	public void makeIndexAndDisplayCounts()
	{
		
		makeMusicIndex();
		writeMusicIndex();
		displayCounts();
		
	}
	
	
	// makeMusicIndex() makes the music index by opening the music file,
	// reading each item, adding each item to the music list, and finally
	// closing the music file.
	private void makeMusicIndex()
	{
		musicFile.open(MUSIC_FILE_NAME);
		
		while(musicFile.hasMoreItems())
		{
			musicList.addItem(new MusicItem(musicFile.readItem()));
		}
		
		
		musicFile.close();
		
	}
	

	// writeMusicIndex() writes the music index by opening the index file,
	// writing the items into it in title order, and finally closing the
	// index file.
	private void writeMusicIndex()
	{
		indexFile.open(INDEX_FILE_NAME);
		
		for (Bucket b : musicList.getBuckets())
		{
			for (MusicItem item : b.getItems())
				indexFile.writeItem(item);
		}
		
		indexFile.close();
	}
	

	// displayCounts() displays the counts (i.e., how many items there are
	// total, how many items of each media type there are) in a readable
	// format.
	private void displayCounts()
	{
		
		System.out.println("Total Item Count" + musicList.getTotalItemCount());
		System.out.println("Paper Item Count" + musicList.getPaperItemCount());
		System.out.println("Compact Media Item Count" + musicList.getCompactMediaItemCount());
		System.out.println("Vinyl Item Count" + musicList.getVinylItemCount());
		System.out.println("Wax Cylinder Item Count" + musicList.getWaxCylinderItemCount());
		
	}
}