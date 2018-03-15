package ca.ualberta.cs.lonelytwitter;


import java.util.Date;
//(5)Declaration access can be weaker
interface Tweetable {
    public String getMessage();

    public Date getDate();

}
