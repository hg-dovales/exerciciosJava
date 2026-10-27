package exercicio129;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer("Time", 50);
        musicPlayer.increaseVolume(10);
        musicPlayer.play();
        System.out.println("Tocando: " + musicPlayer.getPlaying());
        musicPlayer.increaseVolume(10);
        musicPlayer.increaseVolume(40);
        System.out.println("Volume: " + musicPlayer.getVolume());
        musicPlayer.pause();
        System.out.println("Tocando: " + musicPlayer.getPlaying());
        musicPlayer.increaseVolume(5);
        System.out.println("Volume: " + musicPlayer.getVolume());
    }
    
}
