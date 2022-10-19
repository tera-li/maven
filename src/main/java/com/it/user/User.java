package com.it.user;

import java.util.Date;

public class User {
    int runoob_id;
    String runoob_title;
    String runoob_author;
    Date submission_date;

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User{" +
                "runoob_id=" + runoob_id +
                ", runoob_title='" + runoob_title + '\'' +
                ", runoob_author='" + runoob_author + '\'' +
                ", submission_date=" + submission_date +
                '}';
    }

    public int getRunoob_id() {
        return runoob_id;
    }

    public void setRunoob_id(int runoob_id) {
        this.runoob_id = runoob_id;
    }

    public String getRunoob_title() {
        return runoob_title;
    }

    public void setRunoob_title(String runoob_title) {
        this.runoob_title = runoob_title;
    }

    public String getRunoob_author() {
        return runoob_author;
    }

    public void setRunoob_author(String runoob_author) {
        this.runoob_author = runoob_author;
    }

    public Date getSubmission_date() {
        return submission_date;
    }

    public void setSubmission_date(Date submission_date) {
        this.submission_date = submission_date;
    }

}
