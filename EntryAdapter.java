public class EntryAdapter implements SocialMediaEntry {
  
  YouTubeVideo yv;
  
  EntryAdapter(YouTubeVideo youTubeVideo) {
    yv = youTubeVideo;
  }
  
  
  public String getUser() {
    return yv.getAuthor();
  }
  
  public String getPostText() {
    return (yv.getTitle() + "\n" + yv.getDescription());
  }
  
}
