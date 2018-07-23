package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){

        Forum theForum = new Forum();

        // odfiltruje tylko tych użytkowników, którzy są mężczyznami
        Map<String, ForumUser> theResultMapOfForum = theForum.getForumUserList().stream()
                .filter(forum -> forum.getSex() == 'M')
                .collect(Collectors.toMap(ForumUser::getName, forum -> forum));

        System.out.println("# elements: " + theResultMapOfForum.size());
        theResultMapOfForum.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue()).forEach(System.out::println);


       // odfiltruje tylko tych użytkowników, którzy mają co najmniej 20 lat
        Map<String, ForumUser> theResultMapOfForum1 = theForum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .collect(Collectors.toMap(ForumUser::getName, forum -> forum));

        System.out.println("# elements: " + theResultMapOfForum1.size());
        theResultMapOfForum1.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue()).forEach(System.out::println);


       // odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post
        Map<String, ForumUser> theResultMapOfForum2 = theForum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getName, forum -> forum));

        System.out.println("# elements: " + theResultMapOfForum2.size());
        theResultMapOfForum2.entrySet().stream().map(entry -> entry.getKey() + ": " + entry.getValue()).forEach(System.out::println);
    }

}
