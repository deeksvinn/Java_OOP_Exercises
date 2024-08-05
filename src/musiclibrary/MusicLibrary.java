// 15. Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.  

package musiclibrary;

import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary {
	
	private ArrayList<Song> songs;
	
	// Constructor
	
	public MusicLibrary() {
		this.songs = new ArrayList<>();
	}
	
	// Get and Set methods for song
	
	public ArrayList<Song> getSongs() {
		return songs;
	}

	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	
	// Method to add song
	
	public void addSong(Song song) {
		songs.add(song);
	}
	
	// Method to remove song
	
	public void removeSong(Song song) {
		songs.remove(song);
	}
	
	// Method to play random song
	
	public void playRandomSong() {
		
		int sizeOfLibrary = songs.size();
		
		// To check if the library is empty
		
	    if (songs.isEmpty()) {
	        System.out.println("No songs available to play.");
	        return;
	    }

	    Random rand = new Random();
	    int index = rand.nextInt(sizeOfLibrary);
	    Song randomSong = songs.get(index);

	    System.out.println("\nPlaying the song randomly at position " + index + " in the list");
	    System.out.println(randomSong.getSongTitle() + " by " + randomSong.getSongArtist());
	}
	
	// Main method
	
	public static void main(String[] args) {
	
		MusicLibrary musicLibrary = new MusicLibrary();
		
		// Song list
		
		Song song1 = new Song("Waka Waka","Shakira");
		Song song2 = new Song("Revolution","Beatles");
		Song song3 = new Song("Wavin Flag", "K'naan");
		
		// Adding songs to the library
		
		musicLibrary.addSong(song1);
		musicLibrary.addSong(song2);
		musicLibrary.addSong(song3);
		
		System.out.println("The songs list in the music library:\n");
		
		// To display songs from the music library
		
		for (Song song : musicLibrary.getSongs()) {
	            System.out.println(song.getSongTitle() + " by " + song.getSongArtist());
	       }
		
		// To play random song
		
		 musicLibrary.playRandomSong();
	     System.out.println();
	     musicLibrary.playRandomSong();
	     System.out.println();
	     musicLibrary.playRandomSong();
	}
}
