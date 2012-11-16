package com.tcial.exception;

/**
 * 認証系例外処理クラス
 * ログイン認証に使用
 */
public class AuthenticateException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public AuthenticateException() {
        
    }
    
    public AuthenticateException(Exception e) {
        super(e);
    }
    
    public AuthenticateException(String message) {
        super(message);
    }
}
