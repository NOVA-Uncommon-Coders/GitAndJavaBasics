package com.theironyard.novauc;

import java.nio.channels.Channel;

/**
 * Created by peter on 2/7/17.
 */
public class tvShows {
    boolean isComedy;
    boolean News;
    double lengthMins;
    private int channel;
    String network;

    public boolean isComedy() {
        return isComedy;
    }

    void setisComedy(boolean isComedy) {
        this.isComedy = isComedy;
    }


    public boolean isNews() {
        return News;
    }

    void setNews(boolean News) {
        this.News = News;
    }

    int getChannel() {
        return channel;
    }

    void setChannel(int channel) {
        this.channel = channel;
    }


}
