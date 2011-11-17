// MusicList.java
//
// ICS 21: Lab Assignment 4
//
// Originally implemented by Norm Jacobson
// Minor modifications introduced by Alex Thornton, Summer 2009


import java.util.ArrayList;


//A MusicList contains a collection of music items, sorted by their
//titles.  Each music item is placed into one of 26 buckets (one
//corresponding to each letter of the alphabet), so that all items
//with titles beginning with "A" are placed into the first bucket,
//all items with titles beginning with "B" are placed into the
//second bucket, and so on.  (Note that the specification states
//that the first letter of the title will always be an uppercase
//letter.)
//
//Also stored is the total number of items, along with the numbers
//of items of each media type.

public class MusicList
{
	// The number of buckets contained in a music list, one corresponding
	// to each uppercase letter
	private static final int NUMBER_OF_BUCKETS = 26;

	// The media types
	private static final String PAPER = "P";
	private static final String COMPACT_MEDIA = "C";
	private static final String VINYL = "V";
	private static final String WAX_CYLINDER = "W";
	
	// The buckets used to store items
	private ArrayList<Bucket> buckets;

	// The various counts
	private int totalItemCount;
	private int paperItemCount;
	private int compactMediaItemCount;
	private int vinylItemCount;
	private int waxCylinderItemCount;
	
	
	// This constructor creates an ArrayList of 26 empty buckets and also
	// initializes the counts.
	public MusicList()
	{
		buckets = new ArrayList<Bucket>();
		for (int i = 0;i < NUMBER_OF_BUCKETS; i++)
			buckets.add(new Bucket());
		
		totalItemCount = 0;
		paperItemCount = 0;
		compactMediaItemCount = 0;
		vinylItemCount = 0;
		waxCylinderItemCount = 0; 
		
		
	}
	

	// addItem() adds an item to the music list, by finding the correct
	// bucket for it and adding it to that bucket.  It also updates the
	// necessary counts based on its media type.
	//
	// Note that finding the appropriate bucket will require taking the
	// first character of the title (say, 'A') and converting it to an
	// ArrayList index (say, 0).  That will require the use of the following
	// formula...
	//
	//     title.charAt(0) - 'A'
	//
	// ...which will return 0 if the first character of the title is 'A',
	// 1 if the first character of the title is 'B', and so on.
	public void addItem(MusicItem item)
	{
		//finds correct bucket for the item and then adds it 
		 // updates the necessary counts based on its media type 
		
	int bucket_no = item.getTitle().charAt(0) - 'A';
	buckets.get(bucket_no).addItem(item);
	
	updateCounts(item.getMediaType());
	
	}
	
		

	// updateCounts() updates the appropriate counts, given one of the
	// media types specified by the constants PAPER, COMPACT_MEDIA,
	// VINYL, and WAX_CYLINDER.
	private void updateCounts(String mediaType)
	{
		
		totalItemCount++;
		if(mediaType.equals(COMPACT_MEDIA))
			compactMediaItemCount++;
		
		if(mediaType.equals(PAPER))
			paperItemCount++; 
		
		if(mediaType.equals(VINYL))
			vinylItemCount++; 
	
		if(mediaType.equals(WAX_CYLINDER))
			waxCylinderItemCount++;

	}
	
	
	
	
	// Accessor methods
	
	public ArrayList<Bucket> getBuckets()
	{
		return buckets;
	}
	
	
	public int getTotalItemCount()
	{
		return totalItemCount;
	}
	
	
	public int getPaperItemCount()
	{
		return paperItemCount;
	}
	
	
	public int getCompactMediaItemCount()
	{
		return compactMediaItemCount;
	}
	
	
	public int getVinylItemCount()
	{
		return vinylItemCount;
	}
	
	
	public int getWaxCylinderItemCount()
	{
		return waxCylinderItemCount;
	}
}
