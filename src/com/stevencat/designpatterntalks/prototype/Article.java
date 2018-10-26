package com.stevencat.designpatterntalks.prototype;

import java.util.ArrayList;
import java.util.List;

public class Article implements Cloneable {

    private String title;
    private List<String> writers;
    private String body;
    private long createTime;

    public Article(String title, List<String> writers, String body, long createTime) {
        this.title = title;
        this.writers = writers;
        this.body = body;
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Article clone() throws CloneNotSupportedException {
        // 实现深复制，需要自行实现属性对象的clone方法
        Article newArticle = (Article) super.clone();
        List<String> newWriters = new ArrayList<>(writers);
        newArticle.setWriters(newWriters);
        return newArticle;
    }
}
