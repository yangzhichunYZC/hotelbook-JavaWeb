package com.inks.hb.common;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

public class MD5Test {
    private MD5 md5 = new MD5();

    @Test
    public void checkMD5() {
        String a = null;
        try {
            a = md5.getMD5("toor");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(a);
        try {
            System.out.println(md5.checkMD5("toor",a));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}