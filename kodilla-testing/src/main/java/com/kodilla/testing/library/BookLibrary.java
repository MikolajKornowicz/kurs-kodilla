package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }


    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (resultList.size() > 0)
        return resultList;
        if (resultList.size() < 1)
            System.out.println("User: " + libraryUser.getFirstName() + " " + libraryUser.getLastName() + " has no books.");
        return resultList;
        }
}
