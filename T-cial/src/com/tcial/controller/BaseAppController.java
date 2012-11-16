package com.tcial.controller;

import org.slim3.controller.Navigation;

import com.tcial.common.Utils;
import com.tcial.exception.AuthenticateException;
import com.tcial.model.user.Account;

/**
 * 画面遷移用の各コントローラーのAbstractクラス
 */
public abstract class BaseAppController extends BaseController {

    protected String layout;

    /*
     * 認証済みAccount情報
     * nullの場合は未認証
     * コントローラーの実行前にセッションより取得する
     */
    public Account currentUser = null;

    /**
     * 事前処理を実行する
     *
     * 事前処理を行いたい場合に本メソッドをオーバーライドする
     * その際、super.beforeFilter()を実行する
     */
    public void beforeFilter() throws Exception {
        super.beforeFilter();

        // ログイン中のアカウント情報を取得
        currentUser = (Account)sessionScope("currentUser");

        // ユーザー認証確認
        if(currentUser == null) {
        	AuthenticateException authErr = new AuthenticateException();

            String backAuthPath = request.getRequestURI();
            String query = request.getQueryString();
            if(!Utils.isEmpty(query)){
                backAuthPath += "?" + query;
            }

            sessionScope("backAuthPath", backAuthPath);

            throw authErr;
        }
    }

    /**
     * Exception処理
     *
     * AuthenticateException：ユーザー認証エラー
     */
    protected Navigation getException(Exception e){
        if(e instanceof AuthenticateException){
            return redirect("/login");
        }else{
            return null;
        }
    }

    /**
     * 事後処理を実行する
     *
     * 事後処理を行いたい場合に本メソッドをオーバーライドする
     * その際、super.afterFilter()を実行する
     */
    public void afterFilter() throws Exception {
        super.afterFilter();
    }
}
