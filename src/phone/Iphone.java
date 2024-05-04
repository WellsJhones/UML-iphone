package phone;

import functions.MusicPlayer;
import functions.PhoneCaller;
import functions.WebBrowser;

public class Iphone implements MusicPlayer, PhoneCaller, WebBrowser {

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        System.out.println("Pause music");

    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Play music");

    }

    @Override
    public void selecionarMusica() {
        // TODO Auto-generated method stub
        System.out.println("Select music");

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Stop music");

    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        System.out.println("Answer call");

    }

    @Override
    public void call(String number) {
        // TODO Auto-generated method stub
        System.out.println("Call " + number);

    }

    @Override
    public void hangUp() {
        // TODO Auto-generated method stub
        System.out.println("Hang up");

    }

    @Override
    public void voiceMail() {
        // TODO Auto-generated method stub
        System.out.println("Voice mail");

    }

    @Override
    public void newTab() {
        // TODO Auto-generated method stub
        System.out.println("Opening new tab");

    }

    @Override
    public void open() {
        // TODO Auto-generated method stub
        System.out.println("Opening browser");

    }

    @Override
    public void reloadPage() {
        // TODO Auto-generated method stub
        System.out.println("Reloading page");

    }

}
