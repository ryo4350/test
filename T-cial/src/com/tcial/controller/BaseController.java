package com.tcial.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

/**
 * 各コントローラーのAbstractクラス
 * 共通処理はここに実装する
 */
public abstract class BaseController extends Controller {
    
    protected abstract Navigation execute() throws Exception;
    
    @Override
    protected Navigation run() throws Exception {
        
        Navigation main = null;
        
        try {
            // 事前処理
            beforeFilter();
            // メイン処理
            main = execute();
            // 事後処理
            afterFilter();
            
        } catch (Exception e) {
            main = getException(e);
        }
        
        return main;
    }
    
    /**
     * 事前処理を実行する
     * 
     * 事前処理を行いたい場合に本メソッドをオーバーライドする
     * その際、super.beforeFilter()を実行する
     */
    public void beforeFilter() throws Exception {
        
    }
    
    /**
     * 事後処理を実行する
     * 
     * 事後処理を行いたい場合に本メソッドをオーバーライドする
     * その際、super.afterFilter()を実行する
     */
    public void afterFilter() throws Exception {
        
    }

    /**
     * Exception処理
     */
    protected Navigation getException(Exception e) throws Exception{
        throw e;
    }
}
