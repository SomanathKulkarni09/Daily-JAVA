

class AudioPlayer extends MediaPlayer {
	@Override
	public void play() {
		System.out.println("Playing audio");
	}

	public static void main(String[] args) {

		AudioPlayer audio = new AudioPlayer();

		audio.play();

	}
}