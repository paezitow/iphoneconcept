import java.util.Scanner;

import smartPhone.SmartPhone;

public class App {
    public static final Scanner sc = new Scanner(System.in);

     

    public static void main(String[] args) throws Exception {
        SmartPhone smartPhone = new SmartPhone();
        Boolean running = true;
        
        while (running) {
            smartPhone.displayMenu();
            if(smartPhone.isOnCall) System.out.println("~~~~You are on a call~~~~");
            if(smartPhone.isPlaying) System.out.println("~~~~Music is playing on the background~~~~");
            var device = sc.nextInt();
            
            switch (device) {
                case 1:
                    if (!smartPhone.isBrowserOpen()) {
                        smartPhone.openBrowser();
                    }
                    while (smartPhone.isBrowserOpen()) {
                        smartPhone.displayBrowserMenu();
                        System.out.println("You are on page: " + smartPhone.currentPage);
                        System.out.println("Pages open: " + smartPhone.pageCount + " Pages:" + smartPhone.pages);
                        var browserOption = sc.nextInt();
                        switch (browserOption) {
                            case 1:
                                smartPhone.newPage();
                                System.out.println("Enter the url you want to visit: ");
                                String url = sc.next();
                                smartPhone.showPage(url);
                                continue;
                            case 2:
                                if (smartPhone.currentPage.equals("")) {
                                    System.out.println("== No page to refresh ==");
                                } else {
                                    smartPhone.refreshPage();
                                }
                                continue;
                            case 3:
                                smartPhone.closeBrowser();
                                break;
                        }
                        break;
                    }
                    continue;
                case 2:
                    if (!smartPhone.musicPlayerOpen) {
                        smartPhone.openMusicPlayer();
                    }
                    while (smartPhone.musicPlayerOpen) {
                        smartPhone.displayMusicMenu();
                        if(smartPhone.isPlaying) System.out.println("~~~~Music is playing on the background~~~~");
                        var musicOption = sc.nextInt();
                        switch (musicOption) {
                            case 1:
                                System.out.println("Choose a song to play: ");
                                String song = sc.next();
                                smartPhone.selectSong(song);
                                break;
                            case 2:
                                smartPhone.pause();
                                break;
                            case 3:
                                if(smartPhone.isPlaying) {
                                    System.out.println("Want to stop the music player?");
                                    System.out.println("1. Yes");
                                    System.out.println("2. No");
                                    var stopOption = sc.nextInt();
                                    switch (stopOption) {
                                        case 1:
                                            smartPhone.pause();
                                            smartPhone.closeMusicPlayer();
                                            break;
                                        default:
                                                smartPhone.closeMusicPlayer();
                                                break;
                                        }
                                }
                                smartPhone.closeMusicPlayer();
                                break;
                        }
                    }
                    continue;
                case 3:
                    if(smartPhone.isOnCall) {
                        while(smartPhone.isOnCall) {
                            smartPhone.displayCallMenu();
                            var callOption = sc.nextInt();
                            switch (callOption) {
                                case 1:
                                    smartPhone.voiceMail();
                                    break;
                            }
                        }
                    }
                    if(!smartPhone.isOnCall) {
                        smartPhone.displayPhoneMenu();
                        var phoneOption = sc.nextInt();
                        switch (phoneOption) {
                            case 1:
                                System.out.println("Enter the number you want to call: ");
                                String number = sc.next();
                                smartPhone.call(number);
                                break;
                            case 2:
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Turning off the device...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
