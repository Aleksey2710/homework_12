package com.skypro.homework_12;

public class Main {
    public static void main(String[] args) {
        Author aleksandrPushkin = new Author("Александр","Пушкин");
        //aleksandrPushkin.getFullName();

        Author ivanTurgenev = new Author("Иван", "Тургенев");
        //ivanTurgenev.getFullName();

        Book onegin = new Book("Евгений Онегин",aleksandrPushkin, 1852);
        Book zapiskiOhotnika = new Book("Записки охотника", ivanTurgenev, 1831);


//        System.out.println(zapiskiOhotnika.getNameBook() + ", " + zapiskiOhotnika.getAuthor().getFirstName() + " " + zapiskiOhotnika.getAuthor().getLastName() + ", " + zapiskiOhotnika.getStartAge());
//        System.out.println(onegin.getNameBook() + ", " + onegin.getAuthor().getFirstName() + " " + onegin.getAuthor().getLastName() + ", " + onegin.getStartAge());

        onegin.setStartAge(1831);
        zapiskiOhotnika.setStartAge(1852);

//        System.out.println(zapiskiOhotnika.getNameBook() + ", " + zapiskiOhotnika.getAuthor().getFirstName() + " " + zapiskiOhotnika.getAuthor().getLastName() + ", " + zapiskiOhotnika.getStartAge());
//        System.out.println(onegin.getNameBook() + ", " + onegin.getAuthor().getFirstName() + " " + onegin.getAuthor().getLastName() + ", " + onegin.getStartAge());

        System.out.println(onegin);
        System.out.println(zapiskiOhotnika);
    }
}
