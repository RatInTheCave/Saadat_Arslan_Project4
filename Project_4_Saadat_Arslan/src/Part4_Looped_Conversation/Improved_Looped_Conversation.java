package Part4_Looped_Conversation;

import java.util.Scanner;

public class Improved_Looped_Conversation {
    public static void main(String[] args) {
        Boolean RepeatFlag = false;
        while (!RepeatFlag){
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Hi! What is your name? ");
        String name = UserInput.nextLine();
        boolean answerFlag = false;
        int PreferredFilmsFlag = 0;
        while (!answerFlag) {
            System.out.println(name + ", do you prefer animated movies or live-action films?");
            String PreferredFilms = UserInput.nextLine();
            if (PreferredFilms.toLowerCase().contains("anim")) {
                answerFlag = true;
                System.out.println("Great you prefer animated movies, I like them too");
                PreferredFilmsFlag = 1;
            } else if (PreferredFilms.toLowerCase().contains("live")) {
                answerFlag = true;
                System.out.println("Okay, let's talk about Live-action movies");
            } else if (PreferredFilms.toLowerCase().contains("action")) {
                answerFlag = true;
                System.out.println("Okay, let's talk about Live-action movies");
            } else {
                System.out.println("I don't understand");
            }
        }
        String recommendation = "";
        switch (PreferredFilmsFlag) {
            case 0 -> recommendation = "Animated films";
            case 1 -> recommendation = "Live-Action";
        }
        System.out.println("Okay, and what is your age?");
        int age = UserInput.nextInt();
        if (age < 1) {
            System.out.println("Your age is impossible");
            System.exit(0);
        }
        System.out.println("So you are " + age + " years old. I will use this when recommending a movie");
        int PreferredGenreFlag = 99;
        UserInput.nextLine(); //just for clearing the buffer
        boolean answerFlag2 = false;
        while (!answerFlag2) {
            System.out.println("What is your favorite genre? Horror, historical, fantasy, detective, SciFi or maybe comedy?");
            String genre = UserInput.nextLine();
            if (genre.toLowerCase().contains("hor")) {
                answerFlag2 = true;
                System.out.println("So you like horror movies?");
                if (age > 13) {
                    System.out.println();
                    PreferredGenreFlag = 0;
                } else {
                    System.out.println("Why are you watching horror movies if you are so young?");
                }
            } else if (genre.toLowerCase().contains("hist")) {
                answerFlag2 = true;
                System.out.println("So you like historical movies?");
                PreferredGenreFlag = 1;
            } else if (genre.toLowerCase().contains("fant")) {
                answerFlag2 = true;
                System.out.println("So you like Fantasy movies?");
                PreferredGenreFlag = 2;
            } else if (genre.toLowerCase().contains("det")) {
                answerFlag2 = true;
                System.out.println("So you like detective movies?");
                PreferredGenreFlag = 3;
            } else if (genre.toLowerCase().contains("sci")) {
                answerFlag2 = true;
                PreferredGenreFlag = 4;
                System.out.println("So you like science fiction movies?");
            } else if (genre.toLowerCase().contains("com")) {
                answerFlag2 = true;
                PreferredGenreFlag = 5;
                System.out.println("So you like comedy?");
            } else {
                System.out.println("I don't know this genre");
            }

        }
        if (recommendation.equals("Animated films")) {
            if (PreferredGenreFlag == 0) {
                System.out.println(name + " since you like live-action films, and you like horror movies, I would recommend ''The Thing (1982)''");
            } else if (PreferredGenreFlag == 1) {
                System.out.println(name + " since you like live-action films, and you like history movies, I would recommend ''The Founder''");
            } else if (PreferredGenreFlag == 2) {
                if (age < 16) {
                    System.out.println(name + " since you like live-action films, and you like fantasy movies, I would recommend ''Pinocchio (1940)''");
                } else {
                    System.out.println(name + " since you like live-action films, and you like fantasy movies, I would recommend ''The Lord of the Rings: The Fellowship of the Ring''");
                }
            } else if (PreferredGenreFlag == 3) {
                if (age < 16) {
                    System.out.println(name + " since you like live-action films, and you like detective movies, I would recommend ''Knives Out'");
                }
            } else if (PreferredGenreFlag == 4) {
                if (age < 16) {
                    System.out.println(name + " since you like live-action films, and you like Science Fiction, I would recommend ''Guardians of the Galaxy'");
                } else {
                    System.out.println(name + " since you like live-action films, and you like Science Fiction, I would recommend ''Inception''");
                }
            } else if (PreferredGenreFlag == 5) {
                System.out.println(name + " since you like live-action films, and you like comedy, I would recommend ''The Mask (1994)''");

            }
        }
        else {

            if (PreferredGenreFlag == 0) {
                System.out.println(name + " since you like animated films, and you like horror movies, I would recommend ''Caroline(2009)''");
            } else if (PreferredGenreFlag == 1) {
                System.out.println(name + " since you like animated films, and you like history movies, I would recommend ''Mr. Peabody & Sherman''");
            } else if (PreferredGenreFlag == 2) {
                if (age < 16) {
                    System.out.println(name + " since you like animated films, and you like fantasy movies, I would recommend ''Tangled''");
                } else {
                    System.out.println(name + " since you like animated films, and you like fantasy movies, I would recommend ''Shrek (2001)''");
                }
            } else if (PreferredGenreFlag == 3) {
                if (age < 16) {
                    System.out.println(name + " since you like animated films, and you like detective movies, I would recommend ''The Great Mouse Detective''");
                }
            } else if (PreferredGenreFlag == 4) {
                if (age < 16) {
                    System.out.println(name + " since you like animated films, and you like Science Fiction, I would recommend ''WALL-E''");
                } else {
                    System.out.println(name + " since you like animated films, and you like Science Fiction, I would recommend ''Spider Man: Into the Spider-Verse''");
                }
            } else if (PreferredGenreFlag == 5) {
                System.out.println(name + " since you like animated films, and you like comedy, I would recommend ''Puss in Boots: The Last Wish ''");
            }
            }
            System.out.println("Would you like to repeat this conversation? Answer with Y or N");
            String answer = UserInput.nextLine();
            if (answer.contains("y")){
                RepeatFlag = false;
            }
            else {
                RepeatFlag = true;
            }

        }
    }
}
