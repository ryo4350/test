package com.tcial.controller;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

import com.tcial.common.Utils;
import com.tcial.model.user.Account;
import com.tcial.service.AccountService;

/**
 * ログイン認証処理
 */
public class AuthenticateController extends Controller {

    /* Params */
    private String login_param;
    private String password;
    private Account currentUser;

    /* Views */
    private final String VIEW_SUCCESS = "/dashbord";

    /* Service */
    private AccountService accSrv = new AccountService();

    @Override
    public Navigation run() throws Exception {

    	login_param = asString("login_param");
        password = asString("password");

        Navigation nav = null;

            // ログイン認証処理
            currentUser = accSrv.login(login_param, password);

            if(currentUser != null){
                sessionScope("currentUser", currentUser);

                String backAuthPath = sessionScope("backAuthPath");

                if(Utils.isEmpty(backAuthPath)){
                    backAuthPath = VIEW_SUCCESS;
                }

                nav = redirect(backAuthPath);
            }else{
                // ログインエラー
                requestScope("message", "IDまたはパスワードが違います。");
                nav = forward("/login");
            }
            return nav;
    }
}
