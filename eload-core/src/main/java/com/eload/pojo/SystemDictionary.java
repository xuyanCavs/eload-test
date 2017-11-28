package com.eload.pojo;

public class SystemDictionary {
    private Long id;

    private String sn;

    private String title;

    public SystemDictionary(Long id, String sn, String title) {
        this.id = id;
        this.sn = sn;
        this.title = title;
    }

    public SystemDictionary() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}