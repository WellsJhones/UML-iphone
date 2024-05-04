import functions.MusicPlayer;
import functions.PhoneCaller;
import functions.WebBrowser;
import phone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone cell = new Iphone();
        cell.call("123456789");

        MusicPlayer music = cell;
        music.play();
        music.pause();
        music.selecionarMusica();
        WebBrowser web = cell;
        web.open();
        web.newTab();
        web.reloadPage();
        PhoneCaller phone = cell;
        phone.answer();
        phone.hangUp();
        phone.voiceMail();

    }
}
