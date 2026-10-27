package exercicio129;

public class MusicPlayer{
    private String songName;
    private int volume;
    private boolean playing;
    public MusicPlayer(String songName, int volume){
        this.songName = songName;
        playing = false;
        if(volume < 0 || volume > 100){
            System.out.println("Volume inicial invalido.");
            this.volume = 50;
        } else{
            this.volume = volume;
        }
    }
    String getSongName(){
        return songName;
    }
    int getVolume(){
        return volume;
    }
    boolean getPlaying(){
        return playing;
    }
    void play(){
        playing = true;
    }
    void pause(){
        playing = false;
    }
    boolean increaseVolume(int amount){
        if(amount <= 0){
            System.out.println("Quantidade de aumento invalido.");
            return false;
        }
        if(!playing){
            System.out.println("O player nao esta tocando.");
            return false;
        }
        if(amount + volume > 100){
            System.out.println("Esse valor excede o valor do volume maximo.");
            return false;
        }
        volume += amount;
        return true;
    }
}