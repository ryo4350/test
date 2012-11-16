package com.tcial.model.common;

import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Message extends BaseModel<Message> {

    private static final long serialVersionUID = 1L;

    // 送信者ID
    @Attribute(unindexed = true)
    private String sender;

    // メッセージ関係者のID
    private List<String> members;

    // 本文
    @Attribute(unindexed = true)
    private String body;

    // 既読者リスト
    @Attribute(unindexed = true)
    private List<String> readers;


    /**
     * @return sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * @param sender セットする sender
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * @return members
     */
    public List<String> getMembers() {
        return members;
    }

    /**
     * @param members セットする members
     */
    public void setMembers(List<String> members) {
        this.members = members;
    }

    /**
     * @return body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body セットする body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return readers
     */
    public List<String> getReaders() {
        return readers;
    }

    /**
     * @param readers セットする readers
     */
    public void setReaders(List<String> readers) {
        this.readers = readers;
    }
}
