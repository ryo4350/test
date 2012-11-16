package com.tcial.model.user;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.tcial.model.BaseModel;

@Model(schemaVersion = 1)
public class Account extends BaseModel<Account> {

    private static final long serialVersionUID = 1L;

    // アカウントID
    private String id;

    // メール
    private String mail;

    // 役割
    private int role;

    // パスワード
    @Attribute(cipher = true)
    private String password;

    // パスワード(確認用)
    @Attribute(persistent = false)
    private String confirm_password;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id セットする id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail セットする mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }


    /**
     * @return role
     */
    public int getRole() {
        return role;
    }

    /**
     * @param role セットする role
     */
    public void setRole(int role) {
        this.role = role;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password セットする password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return confirm_password
     */
    public String getConfirm_password() {
        return confirm_password;
    }

    /**
     * @param confirm_password セットする confirm_password
     */
    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }
}
