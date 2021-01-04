package adapter;


public interface MediaPlayer {
    void play(String audioType, String fileName);
}

interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}

class VlcPlayerImpl implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc on the file " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // Do nothing 

    }
    
}

class Mp4PlayerImpl implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // Do nothing

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 on the file " + fileName);
    }
    
}

class MediaApdater implements MediaPlayer {
    AdvancedMediaPlayer player;

    MediaApdater(String audioType) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            player = new VlcPlayerImpl();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            player = new Mp4PlayerImpl();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            player.playVlc(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            player.playMp4(fileName);
        }
    }
    
}

class AudioPlayer implements MediaPlayer {
    MediaApdater adapter;
    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 on the file " + fileName);
        } else if ("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)) {
            MediaApdater adapter = new MediaApdater(audioType);
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media type");
        }

    }
    
}

class Main {
    public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();

      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
    }
}