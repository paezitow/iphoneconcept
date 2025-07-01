package showSmarthPhoneMenu;

public abstract class ShowSmartPhoneMenu {
    

    public void displayMenu() {
        System.out.println("================================================");
        System.out.println("Enter the number of the application you want to use: ");
        System.out.println("1. Internet Browser");
        System.out.println("2. Music Player");
        System.out.println("3. Telephone");
        System.out.println("4. Turn off the device");
    }

    public void displayBrowserMenu() {
        System.out.println("================================================");
        System.out.println("You are using the internet browser");
        System.out.println("1. open a new page");
        System.out.println("2. refresh the page");
        System.out.println("3. Go back to the main menu");
    }

    public void displayCallMenu() {
        System.out.println("================================================");
        System.out.println("You are on a call");
        System.out.println("1. Finish call");
        System.out.println("~~~~You are on a call~~~~");
    }

    public void displayPhoneMenu() {
        System.out.println("================================================");
        System.out.println("You are using the phone");
        System.out.println("1. Call a number");
        System.out.println("2. Go back to the main menu");
    }

    public void displayMusicMenu() {
        System.out.println("================================================");
        System.out.println("You are using the music player");
        System.out.println("1. play song");
        System.out.println("2. pause song");
        System.out.println("3. go back to the main menu");
    } 
    
}
