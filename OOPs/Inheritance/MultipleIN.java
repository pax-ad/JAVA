package OOPs;

public class MultipleIN {
    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.click();
        m.playMusic();
    }
}

interface Camera {

    void click();
}

interface MusicPlayer {

    void playMusic();
}

class Mobile implements Camera, MusicPlayer {

    public void click() {
        System.out.println("Photo Clicked");
    }

    public void playMusic() {
        System.out.println("Playing Music");
    }
}
