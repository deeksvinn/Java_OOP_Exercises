// 15. MusicLibrary.java: Thi is subclass for MusicLibrary class which has song details

package musiclibrary;

public class Song {
	private String songTitle;
	private String songArtist;
	
	// Constructor

	public Song(String songTitle, String songArtist) {
	
		this.songTitle = songTitle;
		this.songArtist = songArtist;
	}
	
	// Get and set methods for song title and song artist
	
	public String getSongTitle() {
		return songTitle;
	}

	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public String getSongArtist() {
		return songArtist;
	}

	public void setSongArtist(String songArtist) {
		this.songArtist = songArtist;
	}
}

