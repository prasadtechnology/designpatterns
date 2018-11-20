package adapter.design.pattern;

public class Client {

	public static void main(String[] args) {
		
		MediaPlayer mediaPlayer = new Mp3Player();
		
		mediaPlayer.play("mp3");
		mediaPlayer.play("mp4");
		mediaPlayer.play("vlc");
		
		mediaPlayer.play("avi");
		
	}

}
