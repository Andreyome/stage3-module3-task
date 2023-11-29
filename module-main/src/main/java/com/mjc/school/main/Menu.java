//package com.mjc.school.main;
//
//import java.util.Scanner;
//
//public class Menu {
//
//
//
//
//
//
//
//    public void execute() {
//        Scanner scanner1 = new Scanner(System.in);
//        while (true) {
//            System.out.println();
//            int numberOfCommand = scanner1.nextInt();
//            switch (numberOfCommand) {
//                case 1 -> new GetAllAuthors(authorController).execute();
//                case 2 -> new GetAllNews(newsController).execute();
//                case 3 -> new CreateAuthor(authorController).execute();
//                case 4 -> new CreateNews(newsController).execute();
//                case 5 -> new DeleteAuthor(authorController).execute();
//                case 6 -> new DeleteNews(newsController).execute();
//                case 7 -> new GetAuthorById(authorController).execute();
//                case 8 -> new GetNewsById(newsController).execute();
//                case 9 -> new UpdateAuthor(authorController).execute();
//                case 10 -> new UpdateNews(newsController).execute();
//                case 0 -> System.exit(0);
//            }
//        }
//}
