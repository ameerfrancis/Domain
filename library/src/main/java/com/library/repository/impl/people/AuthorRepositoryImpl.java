package com.library.repository.impl.people;

import com.library.domain.people.Author;
import com.library.domain.publisher.Publisher;

import java.util.ArrayList;

public class AuthorRepositoryImpl {


        private static AuthorRepositoryImpl repository = null;
        private ArrayList<Author> authors;

        private AuthorRepositoryImpl(){

            this.authors = new ArrayList<Author>();
        }

        public static AuthorRepositoryImpl getRepository(){
            if (repository == null) repository = new AuthorRepositoryImpl();
            return repository;
        }


        public Author create(Author author){
            this.authors.add(author);
            return author;
        }

        public Author read(String authorID){
            Author auth = null;

            for(int i = 0; i < authors.size(); i++)
            {
                if(authors.get(i).getAuthID().equalsIgnoreCase(authorID))
                {
                    auth = authors.get(i);
                }
            }

            // find the course that matches the id and return it if exist
            return auth;
        }

        public Author update(Author author){
            Author auth  = null;

            for(int i = 0; i < authors.size();i++)
            {
                if(authors.get(i).getAuthID().equalsIgnoreCase(author.getAuthID()))
                {
                    authors.set(i,author);
                    auth = authors.get(i);
                }
            }
            // find the course, update it and delete it if it exists
            return auth;
        }

        public void delete(String authorID) {
            // find the course, delete it if it exist
            for(int i = 0; i < authors.size(); i++)
            {
                if(authors.get(i).getAuthID().equalsIgnoreCase(authorID))
                {
                    authors.remove(i);
                }
            }
        }


        public ArrayList<Author> getAll() {
            return authors;
        }

    /*public Set<Author> getAll(Author author){
        return this.author;
    }*/
}
