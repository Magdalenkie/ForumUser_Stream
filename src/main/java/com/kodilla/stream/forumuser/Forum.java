package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1, "Dorota", 'F', LocalDate.of(1988, 10, 22), 7));
        forumUserList.add(new ForumUser(2, "Witek", 'M', LocalDate.of(2000, 1, 22), 1));
        forumUserList.add(new ForumUser(3, "Gabi", 'F', LocalDate.of(1974, 06, 30), 3));
        forumUserList.add(new ForumUser(4, "Franek", 'M', LocalDate.of(1999, 2, 16), 0));
        forumUserList.add(new ForumUser(5, "Czarek", 'M', LocalDate.of(1989, 9, 18), 8));
        forumUserList.add(new ForumUser(6, "Hanka", 'F', LocalDate.of(1991, 7, 4), 5));
        forumUserList.add(new ForumUser(7, "Bartek", 'M', LocalDate.of(2004, 3, 1), 4));
        forumUserList.add(new ForumUser(8, "Ola", 'F', LocalDate.of(2001, 10, 11), 0));

    }

    public List<ForumUser> getForumUserList(){
        return new ArrayList<>(forumUserList);
    }
}
