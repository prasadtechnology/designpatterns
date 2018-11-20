package adapter.design.pattern;

public class VlcAdvanceMediaPlayer implements AdvanceMediaPlayer{

	@Override
	public void play(String mediaType) {
		System.out.println(" Playing :: "+mediaType);
	}

}
