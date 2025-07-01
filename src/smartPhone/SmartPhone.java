package smartPhone;

import java.util.ArrayList;
import java.util.List;

import internetBrowser.InternetBrowser;
import musicPlayer.MusicPlayer;
import telephone.Telephone;
import showSmarthPhoneMenu.ShowSmartPhoneMenu;

public class SmartPhone extends ShowSmartPhoneMenu implements InternetBrowser, MusicPlayer, Telephone {
    
    public Boolean browserOpen = false;
    public Boolean musicPlayerOpen = false;
    public Boolean isPlaying = false;
    public Boolean isOnCall = false;
    public String currentPage = "";
    public int pageCount = 0;
    public List<String> pages = new ArrayList<>();
    
    @Override
    public void showPage(String url) {
        currentPage = url;
        System.out.println("Accessing page...");
        System.out.println("Showing page: " + currentPage);
        pages.add(currentPage);
    }
    
    @Override
    public void newPage() {
        System.out.println("New page requested");
        System.out.println("Blank page opened");
        pageCount++;
    }

    @Override
    public void play() {
        isPlaying = true;
        System.out.println("Playing music");
    }

    @Override
    public void call(String number) {
        isOnCall = true;
        System.out.println("Calling " + number );
        System.out.println("Beep...");
        System.out.println("Call connected");
        if(isPlaying) {
            isPlaying = false;
        }
    }

    @Override
    public void answer() {
        System.out.println("Answering call...");
        System.out.println("Beep...");
        System.out.println("Call connected");
    }

    @Override
    public void voiceMail() {
        isOnCall = false;
        System.out.println("Your call was forwarded to voice mail...");
    }

    @Override
    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Pausing music");
            System.out.println("Music paused");
        } else {
            System.out.println("No music playing");
        }
    }

    @Override
    public void selectSong(String song) {
        if (!isPlaying) {
            System.out.println("Song " + song + " selected");
            System.out.println("Playing song " + song);
            play();
        } else if (isPlaying) {
            System.out.println("Changing song to " + song);
            System.out.println("Playing song " + song);
            play();
        }
    } 


    @Override
    public void refreshPage() {
        System.out.println("Refreshing page...");
        System.out.println("Page refreshed");
    }

    public void openBrowser() {
        browserOpen = true;
    }

    public void closeBrowser() {
        browserOpen = false;
    }

    public Boolean isBrowserOpen() {
        return browserOpen;
    }

    public void openMusicPlayer() {
        musicPlayerOpen = true;
    }

    public void closeMusicPlayer() {

        musicPlayerOpen = false;
    }
    
}
