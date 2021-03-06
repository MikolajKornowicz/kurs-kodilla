package com.kodilla.patterns.strategy.social;

public class User {

    private String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getUsername() {
        return username;
    }

    public String post (String socialPost){
        String posted = socialPublisher.postToMedia(socialPost);
        return posted;
    }
}
