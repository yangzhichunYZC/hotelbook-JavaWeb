package com.inks.hb.common;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.mchange.util.Base64Encoder;
import org.apache.commons.codec.binary.Base64;import org.apache.commons.codec.binary.Base64;
public class MD5 {

    /*public String getMD5(String str) {
        //确定计算方法
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
//        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String strMD5 = null;
        try {
            strMD5 = base64en.encode(md5.digest(str.getBytes("utf-8")));
            strMD5 = base64en(md5.digest(str.getBytes("utf-8")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return strMD5;
    }*/




    public String getMD5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法
     /*   MessageDigest md5 = MessageDigest.getInstance("MD5");
        String strMD5 = Base64.encodeBase64String(md5.digest(str.getBytes("UTF-8")));*/
//         strMD5 = Base64en(str.getBytes("UTF-8"));
//        strMD5 = Base64(md5.digest(str.getBytes("utf-8")));
        return "aaaaaa";
    }



    public boolean checkMD5(String newStr, String oldStr) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return getMD5(newStr).equals(oldStr);
    }

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MD5 md5 = new MD5();
        System.out.println(md5.getMD5("123456"));
    }
}
