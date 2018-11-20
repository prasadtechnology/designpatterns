package adapter.design.pattern;

public class Mp4AdvanceMediaPlayer implements AdvanceMediaPlayer{

	@Override
	public void play(String mediaType) {
		System.out.println(" playing :: "+mediaType);
	}

}
