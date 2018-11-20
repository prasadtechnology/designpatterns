package adapter.design.pattern;

public class Mp3Player implements MediaPlayer{

	AdvanceMediaPlayer aMediaPlayer;
	
	@Override
	public void play(String mediaType) {
		
		if(mediaType.equals("mp3")){
			System.out.println(" playing :: "+mediaType);
		}else if(mediaType.equals("mp4")){
			aMediaPlayer = new Mp4AdvanceMediaPlayer();
			aMediaPlayer.play(mediaType);
		}else if(mediaType.equals("vlc")){
			aMediaPlayer = new VlcAdvanceMediaPlayer();
			aMediaPlayer.play(mediaType);			
		}else{
			System.out.println(" this media is not supported by the any player ...");
			throw new RuntimeException(" un known media type ...");
		}
		
	}

}
