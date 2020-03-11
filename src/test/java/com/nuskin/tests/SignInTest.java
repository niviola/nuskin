package com.nuskin.tests;

import com.nuskin.pages.PageSignIn;
import org.junit.Test;

public class SignInTest extends BaseTest{
    PageSignIn pageSignIn;

    @Test
    public void signInLocal(){
        pageSignIn.open();
        pageSignIn.signIn();
    }
}
